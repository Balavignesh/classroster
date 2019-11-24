/**
 * 
 */
package edu.franklin.comp645.rpmdb.resources;

import java.net.URISyntaxException;

import edu.franklin.comp645.rpmdb.entity.Student;
import edu.franklin.comp645.rpmdb.services.StudentService;

/**
 * @author BalaVignesh
 *
 */
public class StudentResourse {
	

public StudentService studentService = new StudentService();
	
@RequestMapping(path="/addStudent",method=RequestMethod.POST)
public ResponseEntity<Void> create(@RequestBody Student student) throws URISyntaxException {
	 try {
		 boolean success = studentService.addStudent(student);
	  return ResponseEntity.created(sucess).build();
	 } catch (ResourceAlreadyExistException e) {
	  return ResponseEntity.status(HttpStatus.CONFLICT).build();
	 }
}

}
