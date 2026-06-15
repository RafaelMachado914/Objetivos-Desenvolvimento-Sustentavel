package br.com.ifsc_plus.dao;

import br.com.ifsc_plus.model.Matricula;
import br.com.ifsc_plus.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;


public class MatriculaDAO {
   
    public void salvar(Matricula matricula){
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction transacao = em.getTransaction();

        try {
            transacao.begin();
            em.persist(matricula);
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

    public List<Matricula> listarTodos() {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            return em.createQuery("SELECT m FROM Matricula m ORDER BY m.id",
                    Matricula.class
            ).getResultList();
        } finally {
            em.close();
        }
    }
    
    public void atualizar(Matricula matricula) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction transacao = em.getTransaction();

        try {
            transacao.begin();
            em.merge(matricula);
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

            Matricula matricula = em.find(Matricula.class, id);

            if (matricula != null) {
                em.remove(matricula);
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
