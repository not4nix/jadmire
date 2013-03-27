/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
