package service;
import java.util.Hashtable;
import model.person;
import org.springframework.stereotype.Service;
@Service
public class personservice {
Hashtable<String,person> persons=new Hashtable<String,person>();
public personservice() {
 person h=new person();
 h.setId("123");
 h.setAge(25);
 h.setFirstName("vennam");
 h.setLastName("deva");
 persons.put("1", h); 
}
public Hashtable<String,person> getall(){
	return persons;
}
public person getperson(String id) {
	return null;
}
}
