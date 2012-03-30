/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sms;

import java.util.List;

/**
 *
 * @author 100374A
 */
public interface StudentRepository {
void saveStudent(Student stu);

	void deleteStudent(Student stu);

	Student findStudent(long regNumber);

	void updateStudent(Student stu);

	List<Student> findAllStudents();

}
