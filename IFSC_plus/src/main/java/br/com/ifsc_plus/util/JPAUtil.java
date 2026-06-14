
package br.com.ifsc_plus.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

    private static final EntityManagerFactory emf
            = Persistence.createEntityManagerFactory("crudPU");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public static void fechar() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}
