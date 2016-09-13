package service;

import beans.Course;
import beans.Student;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ravindra
 * Date: Jan 22, 2010
 * Time: 11:15:37 AM
 * To change this template use File | Settings | File Templates.
 */
public interface CollegeService {

    public List<Student> getAllStudents();

    public List<Student> getAllStudentsWithoutCourses();

    public void enrolStudentToCourse(Student s, Course c);

    public List<Course> getAllCourses();

    public void deleteStudent(Student s);
    
    public void deleteCourse(Course c);

}
