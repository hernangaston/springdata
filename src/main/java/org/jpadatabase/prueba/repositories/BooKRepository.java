package org.jpadatabase.prueba.repositories;

import org.jpadatabase.prueba.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooKRepository extends JpaRepository<Book, Long> {

}
