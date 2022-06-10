package database.jdbc;

import java.util.List;

public interface EmployeeDAO {


  
  /** 
     * This is the method to be used to create
     * a record in the employee table.
  */
  public void create(String firstName, String lastName, Integer empID);
  
  /** 
     * This is the method to be used to list down
     * a record from the employee table corresponding
     * to a passed employee id.
  */
  public Employee getEmployee(Integer id);
  
  /** 
     * This is the method to be used to list down
     * all the records from the employee table.
  */
  public List<Employee> listEmployees();
  
  /** 
     * This is the method to be used to delete
     * a record from the employee table corresponding
     * to a passed employee id.
  */
  public void delete(Integer id);
  
  /** 
     * This is the method to be used to update
     * a record into the employee table.
  */
  public void update(Integer id, String firstName);
}