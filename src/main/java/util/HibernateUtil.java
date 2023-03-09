package main.java.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static HibernateUtil hu;

    private HibernateUtil(){
        try {
            sessionFactory = new Configuration()
                    .configure("/hibernate.cfg.xml")
                    .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println(ex.getMessage());
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory(){
        if(hu == null) {
            hu = new HibernateUtil();
        }
        return hu.sessionFactory;
    }
}