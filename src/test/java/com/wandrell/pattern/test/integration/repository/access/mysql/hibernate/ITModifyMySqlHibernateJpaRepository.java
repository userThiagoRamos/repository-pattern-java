/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2015 the original author or authors.
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.wandrell.pattern.test.integration.repository.access.mysql.hibernate;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import com.wandrell.pattern.test.util.config.context.PersistenceContextPaths;
import com.wandrell.pattern.test.util.config.context.RepositoryContextPaths;
import com.wandrell.pattern.test.util.config.context.TestContextPaths;
import com.wandrell.pattern.test.util.config.properties.DatabaseScriptsPropertiesPaths;
import com.wandrell.pattern.test.util.config.properties.HibernateDialectPropertiesPaths;
import com.wandrell.pattern.test.util.config.properties.JdbcPropertiesPaths;
import com.wandrell.pattern.test.util.config.properties.JpaPropertiesPaths;
import com.wandrell.pattern.test.util.config.properties.PersistenceProviderPropertiesPaths;
import com.wandrell.pattern.test.util.config.properties.QueryPropertiesPaths;
import com.wandrell.pattern.test.util.config.properties.RepositoryPropertiesPaths;
import com.wandrell.pattern.test.util.config.properties.TestPropertiesPaths;
import com.wandrell.pattern.test.util.config.properties.UserPropertiesPaths;
import com.wandrell.pattern.test.util.test.integration.repository.access.AbstractITModify;

/**
 * Integration tests for
 * {@link com.wandrell.pattern.repository.jpa.JpaRepository JPARepository}
 * implementing {@code AbstractITQuery}, using a MySQL database and
 * Hibernate-based JPA.
 *
 * @author Bernardo Martínez Garrido
 * @see com.wandrell.pattern.repository.jpa.JpaRepository JPARepository
 */
@ContextConfiguration(locations = { TestContextPaths.DEFAULT,
        TestContextPaths.ENTITY_MODIFIABLE, PersistenceContextPaths.HIBERNATE,
        RepositoryContextPaths.JPA })
@TestPropertySource(locations = { QueryPropertiesPaths.JPA_QUERY,
        RepositoryPropertiesPaths.JPA, TestPropertiesPaths.ENTITY_JPA,
        PersistenceProviderPropertiesPaths.HIBERNATE, UserPropertiesPaths.MYSQL,
        DatabaseScriptsPropertiesPaths.MYSQL, JdbcPropertiesPaths.MYSQL,
        JpaPropertiesPaths.MYSQL,
        HibernateDialectPropertiesPaths.MYSQL }, properties = {
                "jpa.persistenceUnitName=test_model_jpa_hibernate_mysql_modify",
                "jdbc.url=jdbc:mysql://localhost:3306/test_jpa_hibernate_modify" })
public final class ITModifyMySqlHibernateJpaRepository
        extends AbstractITModify {

    /**
     * Default constructor.
     */
    public ITModifyMySqlHibernateJpaRepository() {
        super();
    }

}
