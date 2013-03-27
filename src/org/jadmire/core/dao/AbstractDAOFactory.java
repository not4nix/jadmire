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

import org.jadmire.core.user.dao.UserDAO;

public abstract class AbstractDAOFactory {

    private static final int MYSQL = 1;

    protected abstract UserDAO getUserDAO();

    public static AbstractDAOFactory getFactory(int factory){
        switch (factory){
            case MYSQL:
                return new MySQLDaoFactory();
            default:
                throw new UnsupportedOperationException("Unknown database type");
        }
    }
}
