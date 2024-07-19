package crud.configuration;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan("crud")
@Configuration
public class MyConfiguration {
	
	@Bean
	EntityManager getEM() {
		return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}
	
	@Bean
	ViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("frontend/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
