package data;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ravindra
 * Date: Jan 6, 2010
 * Time: 6:30:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Department {
    int id;
    String name;
    int budget;
    List<Employee> empList = null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public String toString(){
        return getId() + " : " + getName() + " , budget " + getBudget() ;
    }
}

