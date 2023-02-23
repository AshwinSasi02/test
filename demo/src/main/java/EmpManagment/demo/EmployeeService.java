package EmpManagment.demo;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public Employee createEmployee(String name, int age, int salary, int deptid,int empid) {
		Employee emp=new Employee();
		
		emp.setName(name);
		emp.setAge(age);
		emp.setSalary(salary);
		emp.setDeptid(deptid);
		emp.setEmpid(empid);
		return emp;
	}




	
}
