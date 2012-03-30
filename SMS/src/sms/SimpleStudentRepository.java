/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 100374A
 */
public class SimpleStudentRepository implements StudentRepository {

    private Map<Long, Student> studentsDb = new HashMap<Long, Student>();

    public Map<Long, Student> getStudentsDb() {
        return studentsDb;
    }

    @Override
    public void saveStudent(Student stu) {
        studentsDb.put(stu.getRegNumber(), stu);
    }

    @Override
    public void deleteStudent(Student stu) {

        studentsDb.remove(stu.getRegNumber());
    }

    @Override
    public Student findStudent(long regNumber) {
        Student st = studentsDb.get(regNumber);

        return st;

    }

    @Override
    public void updateStudent(Student stu) {
        studentsDb.put(stu.getRegNumber(), stu);

    }

    @Override
    public List<Student> findAllStudents() {
        List<Student> ls = new ArrayList<Student>();


        Iterator it = studentsDb.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry) it.next();
            ls.add((Student) pairs.getValue());
        }
        return ls;
    }

//    public static void main(String[] args) {
//        SimpleStudentRepository sr = new SimpleStudentRepository();
//
//        Student s1 = new Student();
//        s1.setRegNumber(1000);
//        s1.setFirstName("vidda");
//
//        Student s2 = new Student();
//        s2.setRegNumber(1001);
//        s2.setFirstName("dodda");
//
//        sr.saveStudent(s2);
//        sr.saveStudent(s1);
//
//        List<Student> l = (List<Student>) sr.findAllStudents();
//
//        System.out.println(l.get(0).getFirstName());
//        System.out.println(l.get(1).getFirstName());
//
//    }
}
