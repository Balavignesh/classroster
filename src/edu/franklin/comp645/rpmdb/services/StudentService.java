/**
 * 
 */
package edu.franklin.comp645.rpmdb.services;

import edu.franklin.comp645.rpmdb.dao.StudentDao;
import edu.franklin.comp645.rpmdb.entity.Student;

/**
 * @author BalaVignesh
 *
 */
public class StudentService {
	
public StudentDao  studentDao = new StudentDao();
	
public boolean addStudent(Student student) {
	return studentDao.addStudent(student);
}

}
