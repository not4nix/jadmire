package org.jadmire.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory mSessionFactory;

    static {
        try {
            buildSessionFactory();
        } catch (Throwable throwable){
            System.err.println("Initial SessionFactory creation failed." + throwable);
            throw new ExceptionInInitializerError(throwable);
        }
    }

    private static void buildSessionFactory(){
        mSessionFactory = new Configuration().configure().buildSessionFactory();
    }


    public static SessionFactory getSessionFactory() {
        return mSessionFactory;
    }
}
