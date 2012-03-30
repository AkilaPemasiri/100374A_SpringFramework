/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sms;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author 100374A
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("smsContext.xml");
        StudentRepository stuRepo = new SimpleStudentRepository();
        StudentManagementSystem sms = new StudentManagementSystem(stuRepo);
        stuRepo.saveStudent((Student)context.getBean("stu1"));
        stuRepo.saveStudent((Student)context.getBean("stu2"));
        stuRepo.saveStudent((Student)context.getBean("stu3"));
        stuRepo.saveStudent((Student)context.getBean("stu4"));
        stuRepo.saveStudent((Student)context.getBean("stu5"));
        stuRepo.saveStudent((Student)context.getBean("stu6"));
        stuRepo.saveStudent((Student)context.getBean("stu7"));
        stuRepo.saveStudent((Student)context.getBean("stu8"));
        sms.listAllStudents();

    }

}
