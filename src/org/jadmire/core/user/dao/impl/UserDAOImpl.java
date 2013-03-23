package org.jadmire.core.user.dao.impl;

import org.hibernate.HibernateException;
import org.jadmire.core.user.dao.UserDAO;
import org.jadmire.core.user.domain.User;

import java.util.List;

public class UserDAOImpl implements UserDAO {
    @Override
    public void delete(Integer entityId) throws HibernateException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public User read(Integer id) throws HibernateException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<User> readAll() throws HibernateException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Integer save(String name) throws HibernateException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void update(Integer entityId, String entityName) throws HibernateException {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
