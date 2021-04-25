package com.b2tech.onlinebookstore;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.b2tech.onlinebookstore.entities.Book;
import com.b2tech.onlinebookstore.entities.BookCategory;
@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer{
	@Autowired
	private EntityManager enitityManager;
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		//config.exposeIdsFor(Book.class);
		//config.exposeIdsFor(BookCategory.class);
		config.exposeIdsFor(enitityManager.getMetamodel().getEntities().stream()
				.map(Type::getJavaType)
				.toArray(Class[]::new));
	}

}
