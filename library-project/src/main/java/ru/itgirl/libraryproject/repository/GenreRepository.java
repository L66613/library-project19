package ru.itgirl.libraryproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itgirl.libraryproject.model.Author;

public interface GenreRepository extends JpaRepository<Author, Long> {
}
