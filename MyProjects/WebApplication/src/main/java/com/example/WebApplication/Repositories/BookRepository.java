package com.example.WebApplication.Repositories;

import com.example.WebApplication.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
