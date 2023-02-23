package EmpManagment.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "addemp", method = RequestMethod.GET)
	public Employee addEmp(@RequestParam("name") String name,@RequestParam("age") int age1,@RequestParam("salary") int salary1 ,@RequestParam("deptid") int deptid1,@RequestParam("empid") int empid1) {
        
		
		return employeeService.createEmployee(name, age1,salary1,deptid1,empid1);
	}
	@RequestMapping("home")
	public void home() {
        
		
		System.out.println("hi");

	}	
	
}
