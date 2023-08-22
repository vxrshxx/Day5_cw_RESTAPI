package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepo;




@Service

public class ApiService {

	@Autowired
	BookRepo br;
	
	public Book saveinfo(Book bb)
	{
		return br.save(bb);  //saving the data from repository into the database
		
	}
	
	public List<Book> savedetails(List<Book> bb)
	{
		return (List<Book>) br.saveAll(bb);
	}
	
	
	public List<Book> showinfo()
	{
		return br.findAll(); //retrieving the data that has been store in the database
	}
	
	public Book changeinfo(Book bb)
	{
		return br.saveAndFlush(bb);
	}
	
	public void deleteinfo(Book bb)
	{
		br.delete(bb);
	}
	
	//delete using path variable 
	public void deleteId(int id)
	{
		br.deleteById(id);
	}
	
	//delete using request param is done
	
	public void deletepId(int id)
	{
		br.deleteById(id);
	}
}

