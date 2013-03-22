package org.jadmire.core.user.dao;

import org.hibernate.HibernateException;
import org.jadmire.core.dao.Dao;
import org.jadmire.core.user.domain.User;

import java.util.List;

public interface UserDAO extends Dao<User> {

    @Override
    void delete(Integer entityId) throws HibernateException;

    @Override
    User read(Integer id) throws HibernateException;

    @Override
    List<User> readAll() throws HibernateException;

    @Override
    Integer save(String name) throws HibernateException;

    @Override
    void update(Integer entityId, String entityName) throws HibernateException;
}
