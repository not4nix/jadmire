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
