package org.jadmire.core.dao;

import org.jadmire.core.user.dao.UserDAO;
import org.jadmire.core.user.dao.impl.UserDAOImpl;

public class MySQLDaoFactory extends AbstractDAOFactory {
    @Override
    protected UserDAO getUserDAO() {
        return new UserDAOImpl();
    }
}
