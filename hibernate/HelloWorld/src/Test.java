import data.Department;
import data.Employee;
import org.hibernate.Session;
import util.SessionFactoryUtil;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ravindra
 * Date: Jan 6, 2010
 * Time: 6:34:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        Session session = SessionFactoryUtil.getInstance().openSession();
        session.beginTransaction();


        List<Employee> empList = session.createQuery("select e from Employee as e").list();
        for (Employee e : empList) {
            System.out.println(e.getId() + " : " + e.getName() + "," + e.getAge() + "," + e.getSalary());
        }

        //create a department
        Department accounts = new Department();
//        accounts.setId(23);
        accounts.setName("Accounts");
        accounts.setBudget(290);
        session.persist(accounts);
        List<Department> departments = session.createQuery("select d from Department as d").list();
        for (Department d : departments) {
            System.out.println(d.getId() + " : " + d.getName() + " , budget " + d.getBudget());
        }

        int deptId = 1;
        Department d = (Department)session.load(Department.class,deptId);
        System.out.println("Department with the ID "+ deptId+" is " + d.toString());

        session.close();

    }
}
