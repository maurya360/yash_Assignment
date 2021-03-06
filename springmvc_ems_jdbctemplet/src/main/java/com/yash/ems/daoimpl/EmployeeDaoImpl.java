package com.yash.ems.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.ems.dao.EmployeeDao;
import com.yash.ems.model.Employee;


public class EmployeeDaoImpl implements EmployeeDao {


	private JdbcTemplate jdbcTemplate;
	public EmployeeDaoImpl(DataSource dataSource) {
		// TODO Auto-generated constructor stub
		jdbcTemplate = new JdbcTemplate(dataSource);
	}


	@Override
	public int save(Employee employee) {
		String sql = "INSERT INTO employee (id,name,designation,salary,department,address)"
				+ " VALUES (?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,employee.getId(),employee.getName(),employee.getDesignation()
				,employee.getSalary(),employee.getDepartment(),employee.getAddress());


	}

	@Override
	public List<Employee> findAll() {
		String sql = "SELECT * FROM employee";
		List<Employee> listEmployee = jdbcTemplate.query(sql, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee employee = new Employee();

				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				employee.setDesignation(rs.getString("designation"));
				employee.setSalary(rs.getDouble("salary"));
				employee.setDepartment(rs.getString("department"));
				employee.setAddress(rs.getString("address"));

				return employee;
			}
		});

		return listEmployee;

	}

	@Override
	public void update(Employee employee) {
		String query = "UPDATE employee SET name=?,designation=?,salary=?,department=?,address=? WHERE id=?";
		jdbcTemplate.update(query,
		new Object[] {
		employee.getName(),employee.getDesignation(),employee.getSalary(),employee.getDepartment(),employee.getAddress() ,employee.getId()
		});
	}

	@Override
	public int delete(int id) {
		String sql = "DELETE FROM employee WHERE id=?";
		return jdbcTemplate.update(sql, id);

	}
}
