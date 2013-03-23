package org.jadmire.core.user.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jadmire.core.user.dao.UserDAO;
import org.jadmire.core.user.domain.User;
import org.jadmire.util.HibernateUtil;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class UserDAOImpl implements UserDAO {

    private Session mSession;
    private Transaction mTransaction;
    private Query mQuery;

    @SuppressWarnings("unchecked")
    @Override
    public User read(Integer id){
        final User user = new User();
        mSession = HibernateUtil.getSessionFactory().openSession();
        try {
            mTransaction = mSession.beginTransaction();
            mQuery = mSession.createQuery("from User as u where u.id = :id ");
            List<User> users = mQuery.list();

            for(Iterator<User> it = users.iterator(); it.hasNext();){
                User userObject = it.next();
                String userName = userObject.getUserName();
                user.setUserName(userName);
            }

            mTransaction.commit();

        } catch (HibernateException e){
            mTransaction.rollback();
            e.printStackTrace();
        } finally {
            mSession.close();
        }
        return user;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> readAll() throws HibernateException {
        List<User> userList = new CopyOnWriteArrayList<User>();
        mSession = HibernateUtil.getSessionFactory().openSession();
        try {
            mTransaction = mSession.beginTransaction();
            userList = mSession.createQuery("from User").list();

            for(Iterator<User> it = userList.iterator(); it.hasNext();){
                User users = it.next();
                String userName = users.getUserName();
                User user = new User();
                user.setUserName(userName);
                userList.add(user);
            }

            mTransaction.commit();

        } catch (HibernateException ex){
            mTransaction.rollback();
            ex.printStackTrace();
        } finally {
            mSession.close();
        }
        return userList;
    }

    @Override
    public void delete(Integer entityId) {
        mSession = HibernateUtil.getSessionFactory().openSession();
        try {
            mTransaction = mSession.beginTransaction();
            mQuery = mSession.createQuery("delete User where id = :entityId");
            final Integer result = mQuery.executeUpdate();
            if(result != null){
                mTransaction.commit();
            }
        } catch (HibernateException e){
            mTransaction.rollback();
            e.printStackTrace();
        } finally {
            mSession.close();
        }
    }

    @Override
    public void update(Integer entityId, String entityName) throws HibernateException {
        mSession = HibernateUtil.getSessionFactory().openSession();
        try {
            mTransaction = mSession.beginTransaction();
            mQuery = mSession.createQuery("update User set userName = :entityName where id = :entityId");
            final Integer result = mQuery.executeUpdate();

            if(result != null){
                mTransaction.commit();
            }
        } catch (HibernateException ex){
            mTransaction.rollback();
            ex.printStackTrace();
        }  finally {
            mSession.close();
        }
    }

    @Override
    public Integer save(String name) throws HibernateException {
        mSession = HibernateUtil.getSessionFactory().openSession();
        Integer userId = null;
        try {
            mTransaction = mSession.beginTransaction();
            User user = new User();
            user.setUserName(name);
            userId = (Integer) mSession.save(user);
            mTransaction.commit();
        } catch (HibernateException ex){
            mTransaction.rollback();
            ex.printStackTrace();
        } finally {
            mSession.close();
        }
        return userId;
    }
}
