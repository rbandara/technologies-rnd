package beans;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Entity;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * User: ravindra
 * Date: Jan 22, 2010
 * Time: 11:09:43 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Course {
    @Id
    int id;

    @Column(name = "cname")
    String courseName;

    @Column(name = "chours")
    int courseHours;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseHours() {
        return courseHours;
    }

    public void setCourseHours(int courseHours) {
        this.courseHours = courseHours;
    }
}
