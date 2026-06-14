package br.com.ifsc_plus.dao;

import  br.com.ifsc_plus.model.Curso;
import org.hibernate.Session;
import org.hibernate.Transaction;
import br.com.ifsc_plus.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

public class CursoDao {
    
    public void salvar(Curso curso){
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction transacao = em.getTransaction();

        try {
            transacao.begin();
            em.persist(curso);
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
    
    public List<Curso> listarTodos() {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            return em.createQuery("SELECT c FROM Curso c ORDER BY c.id",
                    Curso.class
            ).getResultList();
        } finally {
            em.close();
        }
    }
    
    public void atualizar(Curso curso) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction transacao = em.getTransaction();

        try {
            transacao.begin();
            em.merge(curso);
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

            Curso curso = em.find(Curso.class, id);

            if (curso != null) {
                em.remove(curso);
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
