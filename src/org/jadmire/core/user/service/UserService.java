package org.jadmire.core.user.service;

import org.jadmire.core.user.domain.User;

import java.util.List;

public interface UserService {

    public User findUserById(Integer userId);

    public List<User> findAllUsers();

    public void removeUser(Integer userId);

    public void updateUser(Integer entityId, String entityName);

    public Integer saveUser(String name);
}
