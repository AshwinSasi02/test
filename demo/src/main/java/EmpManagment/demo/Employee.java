package EmpManagment.demo;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private String name;
	private int age, salary,deptid,empid;
	
	public Employee(String name, int age, int salary, int deptid, int empid) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.deptid = deptid;
		this.empid = empid;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
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
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
}
