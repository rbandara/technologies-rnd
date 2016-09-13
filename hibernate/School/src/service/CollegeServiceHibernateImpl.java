package service;

import beans.Course;
import beans.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ravindra
 * Date: Jan 22, 2010
 * Time: 11:19:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class CollegeServiceHibernateImpl implements CollegeService{
    
    public List<Student> getAllStudents() {
        Transaction tx = null;
        Session session = HibernateUtil.getInstance().getCurrentSession();

        tx = session.beginTransaction();

        List studentList = session.createQuery("select s from student as s").list();

        tx.commit();
        
        return studentList;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<Student> getAllStudentsWithoutCourses() {
        Session session = HibernateUtil.getInstance().getCurrentSession();
        List students = session.createSQLQuery("select * from student").list();
        return students;
    }

    public void enrolStudentToCourse(Student s, Course c) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<Course> getAllCourses() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void deleteStudent(Student s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void deleteCourse(Course c) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
