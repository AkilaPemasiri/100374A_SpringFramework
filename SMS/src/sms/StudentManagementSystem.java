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
public class StudentManagementSystem {

    private StudentRepository repo;

    public StudentManagementSystem(StudentRepository repo) {
        this.repo = repo;
    }

    StudentManagementSystem() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

   

    public void listAllStudents() {
        
        List<Student> list = (List<Student>) repo.findAllStudents();
        System.out.println("There are "+list.size()+" student records\nTheir registration numbers are as follows");
        for (int i = 0; i < list.size(); i++) {

            System.out.println(i+1 + ". " + list.get(i).getRegNumber());
        }
    }

    public void registerStudent(Student stu) {

        repo.saveStudent(stu);
    }
}
