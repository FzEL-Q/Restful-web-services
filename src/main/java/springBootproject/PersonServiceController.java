package springBootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springBootproject.repository.PersonRepository;

@RestController
public class PersonServiceController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping(value = "/persons/{id}", method = RequestMethod.DELETE)
	   public ResponseEntity<Object> delete(@PathVariable("id") Long id) { 
		personRepository.deleteById(id);
	      return new ResponseEntity<>("Person is deleted successsfully", HttpStatus.OK);
	   }
	
	@RequestMapping(value = "/persons/{id}", method = RequestMethod.PUT)
	   public ResponseEntity<Object> updatePerson(@PathVariable("id") Long id, @RequestBody Person person) { 
		personRepository.save(person);
	      return new ResponseEntity<>("Person is updated successsfully", HttpStatus.OK);
	   }
	
	@RequestMapping(value = "/persons", method = RequestMethod.POST)
	   public ResponseEntity<Object> createPerson(@RequestBody Person person) {
		personRepository.save(person);
	      return new ResponseEntity<>("Person is created successfully", HttpStatus.CREATED);
	   }
	
	@RequestMapping(value = "/persons")
	   public ResponseEntity<Object> getPerson() {
	      return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
	   }
}
