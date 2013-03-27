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
package org.jadmire.core.dao;

import org.hibernate.HibernateException;

import java.io.Serializable;
import java.util.List;

public interface Dao<T extends Serializable> {

    /**
     * Read entity by id
     * @param id entity id
     * @return entity
     */
    public T read(Integer id) throws HibernateException;

    /**
     * Read all entities
     * @return entity list
     */
    public List<T> readAll() throws HibernateException;

    /**
     * Save entity by entity name
     * @param name entity name
     * @return int code
     */
    public Integer save(String name) throws HibernateException;

    /**
     * Update entity
     * @param entityId entity id
     * @param entityName entity name
     */
    public void update(Integer entityId, String entityName) throws HibernateException;

    /**
     * Delete entity by id
     * @param entityId entity id
     */
    public void delete(Integer entityId) throws HibernateException;
}
