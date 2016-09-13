package client;

import beans.Student;
import service.CollegeService;
import service.CollegeServiceHibernateImpl;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ravindra
 * Date: Jan 22, 2010
 * Time: 1:13:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class DannyCollegeRecruiters {
    public static void main(String[] args) {
        CollegeService service = new CollegeServiceHibernateImpl();
        List<Student> list = service.getAllStudents();
        for(Student s: list){
            System.out.println(s.toString());
        }
    }
}
