package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.ApiService;



@RestController

public class ApiController {
	
	
	@Autowired
	ApiService sser;
	
	
	@PostMapping("addingbook")
	
	public Book add(@RequestBody Book bb)
	{
		return sser.saveinfo(bb);
		
	}
	
	@PostMapping("addnbooks")
	
	public List<Book> addndetails(@RequestBody List<Book> bb)
	{
		return sser.savedetails(bb);
	}

	@GetMapping("showbooks")
	
	public List<Book> show()
	{
		return sser.showinfo();
	}
	
	@PutMapping("updatebooks")
	public Book modify(@RequestBody Book bb)
	{
		return sser.changeinfo(bb);
	}
	
	@DeleteMapping("deletebooks")
	public String del(@RequestBody Book bb)
	{
		sser.deleteinfo(bb);
		return "Deleted successfully";
	}
	
	@DeleteMapping("deleteid/{id}")
	public void deletemyid(@PathVariable int id)
	{
		sser.deleteId(id);
		
	}
	@DeleteMapping("delparamid")
	
	public void deletemyparamid(@RequestParam int id)
	{
		sser.deletepId(id);
		
	}
}
	
