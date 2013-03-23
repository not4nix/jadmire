package org.jadmire.core.user.service.impl;

import org.jadmire.core.user.dao.UserDAO;
import org.jadmire.core.user.domain.User;
import org.jadmire.core.user.service.UserService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDAO mUserDAO;

    @Override
    public User findUserById(Integer userId) {
        return mUserDAO.read(userId);
    }

    @Override
    public List<User> findAllUsers() {
        List<User> users = new ArrayList<User>();
        users = mUserDAO.readAll();
        Collections.sort(users);
        return Collections.unmodifiableList(users);
    }

    @Override
    public void removeUser(Integer userId) {
        mUserDAO.delete(userId);
    }

    @Override
    public void updateUser(Integer entityId, String entityName) {
        mUserDAO.update(entityId,entityName);
    }

    @Override
    public Integer saveUser(String name) {
        return mUserDAO.save(name);
    }
}
