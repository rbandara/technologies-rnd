package com.wrox.beginspring.persistance;

import data.Department;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;


/**
 * Created by IntelliJ IDEA.
 * User: ravindra
 * Date: Jan 6, 2010
 * Time: 7:04:41 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue
    int id;


    List<Department> departmentList = null;

    String name;
    int age;
    int salary;
    String location;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }
}