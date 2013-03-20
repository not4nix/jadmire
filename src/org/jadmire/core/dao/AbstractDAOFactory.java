package org.jadmire.core.dao;

import org.jadmire.core.user.dao.UserDAO;

public abstract class AbstractDAOFactory {

    private static final int MYSQL = 1;

    protected abstract UserDAO getUserDAO();

    public static AbstractDAOFactory getFactory(int factory){
        switch (factory){
            case MYSQL:
                return new MySQLDaoFactory();
            default:
                throw new UnsupportedOperationException("Unknown database type");
        }
    }
}
