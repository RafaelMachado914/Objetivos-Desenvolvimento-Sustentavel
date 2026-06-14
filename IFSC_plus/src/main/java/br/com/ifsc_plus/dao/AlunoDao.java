package br.com.ifsc_plus.dao;

import br.com.ifsc_plus.model.Aluno;
import br.com.ifsc_plus.model.Curso;
import br.com.ifsc_plus.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class AlunoDao {
    
    public void salvar(Aluno aluno){
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction transacao = em.getTransaction();

        try {
            transacao.begin();
            em.persist(aluno);
            transacao.commit();
        } catch (RuntimeException erro) {
            if (transacao.isActive()) {
                transacao.rollback();
            }
            throw erro;
        } finally {
            em.close();
        }
    }
    
    public List<Aluno> listarTodos() {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            return em.createQuery("SELECT a FROM Aluno a ORDER BY a.id",Aluno.class).getResultList();
        } finally {
            em.close();
        }
    }
    
    public void atualizar(Aluno aluno) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction transacao = em.getTransaction();

        try {
            transacao.begin();
            em.merge(aluno);
            transacao.commit();
        } catch (RuntimeException erro) {
            if (transacao.isActive()) {
                transacao.rollback();
            }
            throw erro;
        } finally {
            em.close();
        }
    }
    
    public void excluir(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction transacao = em.getTransaction();

        try {
            transacao.begin();

            Aluno aluno = em.find(Aluno.class, id);

            if (aluno != null) {
                em.remove(aluno);
            }

            transacao.commit();
        } catch (RuntimeException erro) {
            if (transacao.isActive()) {
                transacao.rollback();
            }
            throw erro;
        } finally {
            em.close();
        }
    }
    
        
}
