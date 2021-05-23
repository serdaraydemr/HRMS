package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employees  {
	@Id
	@GeneratedValue
	@Column(name = "employee_id")
	private int employeesId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "department_id")
	private int departmentId;
	
	public Employees() {}

	public Employees(int employeesId, String firstName, String lastName, int departmentId) {
		super();
		this.employeesId = employeesId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentId = departmentId;
	}

	public int getEmployeesId() {
		return employeesId;
	}

	public void setEmployeesId(int employeesId) {
		this.employeesId = employeesId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	
	

}
