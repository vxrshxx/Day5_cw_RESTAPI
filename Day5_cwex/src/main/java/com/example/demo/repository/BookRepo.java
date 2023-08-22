package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Book;





public interface BookRepo extends JpaRepository<Book, Integer>{

}