package com.libraryapp.LibraryManagementApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libraryapp.LibraryManagementApp.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
