package org.jpadatabase.prueba;

import org.jpadatabase.prueba.entities.Book;
import org.jpadatabase.prueba.entities.Laptop;
import org.jpadatabase.prueba.repositories.BooKRepository;
import org.jpadatabase.prueba.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class PruebaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PruebaApplication.class, args);
		BooKRepository bookRepository = context.getBean(BooKRepository.class);
		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);
		//CRUD
		//1. Crear Libro
		Book book1 = new Book(null, "Lord of the rings", "The best of adventures history",
				"J.R.R. Tolkien", "The planet", 45.95, 650,
				true, LocalDate.of(2014,12,1));

		Book book2 = new Book(null, "The Hobbit", "The first best of adventures history",
				"J.R.R. Tolkien", "The planet", 55.95, 450,
				true, LocalDate.of(2017,12,1));

		Book book3 = new Book(null, "The Hobbit, the battle of five armys", "The last of the best of adventures history",
				"J.R.R. Tolkien", "The planet", 105.95, 650,
				true, LocalDate.of(2019,12,1));

		Laptop laptop1 = new Laptop(null, "Laptop dell", "Dell", 1,true,699.99);
		Laptop laptop2 = new Laptop(null, "Laptop samsung", "Samsung", 500,true,499.99);
		Laptop laptop3 = new Laptop(null, "Laptop sony", "Sony", 256,true,399.99);

		bookRepository.save(book1);
		bookRepository.save(book2);
		bookRepository.save(book3);

		laptopRepository.save(laptop1);
		laptopRepository.save(laptop2);
		laptopRepository.save(laptop3);

	}

}
