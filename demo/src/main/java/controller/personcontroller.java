package controller;
import java.util.Hashtable;
import service.personservice;
import model.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/persons")
public class personcontroller {
	@Autowired
	personservice ps;
	@RequestMapping("/all")
	public Hashtable<String,person>getAll(){
	return ps.getall();	
	}
@RequestMapping("{id}")
public person getPerson(@PathVariable("id") String id) {
	return ps.getperson(id);
}
}
