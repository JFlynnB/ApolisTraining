package database.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setFirstName(rs.getString("firstName"));
		employee.setLastName(rs.getString("lastName"));
		employee.setEmpID(rs.getInt("empID"));
		
		return employee;
	}
	

}
