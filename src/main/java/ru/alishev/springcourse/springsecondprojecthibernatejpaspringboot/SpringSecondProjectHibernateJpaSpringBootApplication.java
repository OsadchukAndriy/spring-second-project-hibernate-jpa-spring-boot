package ru.alishev.springcourse.springsecondprojecthibernatejpaspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.alishev.springcourse.springsecondprojecthibernatejpaspringboot.controllers.BooksController;
import ru.alishev.springcourse.springsecondprojecthibernatejpaspringboot.controllers.PeopleController;

@SpringBootApplication()
public class SpringSecondProjectHibernateJpaSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecondProjectHibernateJpaSpringBootApplication.class, args);
	}

}
