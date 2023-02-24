package EmpManagment.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmpServiceAspect {

	@Before("execution (* EmpManagment.demo.EmployeeService.createEmployee.*{..})&&args(name,age,salary,deptid,empid)")
	public void beforeAdvice() {
		System.out.println("Before creation.");
	}
}
