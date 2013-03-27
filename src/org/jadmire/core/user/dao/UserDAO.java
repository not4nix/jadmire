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
