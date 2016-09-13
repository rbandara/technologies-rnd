package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * User: ravindra
 * Date: Jan 22, 2010
 * Time: 11:09:36 AM
 * To change this template use File | Settings | File Templates.
 */

@Entity                 
public class Student {
    @Id
    int id;
    @Column(name="fname")
    String fName;
    @Column(name="lname")
    String lName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String toString(){
        return this.id + " : " + this.fName + " : " + this.lName;
    }
}
