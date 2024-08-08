package com.libraryapp.LibraryManagementApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libraryapp.LibraryManagementApp.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
