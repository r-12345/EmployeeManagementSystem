package com.cg.ems.dao;

import java.util.HashSet;

import com.cg.ems.dto.Employee;

public class CollectionUtil {


	    private static HashSet<Employee> empSet = new HashSet<Employee>();
	    
	    static
	    {
	        empSet.add(new Employee(112081,"Abhinav",5000.0f));
	        empSet.add(new Employee(112082,"Ajay",4000.0f));
	        empSet.add(new Employee(112083,"Atul",5900.0f));
	        empSet.add(new Employee(112084,"Anuj",6000.0f));
	        empSet.add(new Employee(112085,"YAsh",8900.0f));  
	    }
	    
	    public static void addEmp(Employee emp)
	    {
	        empSet.add(emp);
	    }
	    
	    public static void removeEmp(Employee emp)
	    {
	        empSet.remove(emp);
	    }
	    
	    
	    public static HashSet<Employee> getAllEmp()
	    {
	        return empSet;
	    }

		public static void deleteEmp(Employee ee) {
			// TODO Auto-generated method stub
			
		}
	    
	   
	    
	    
	    
	    
	    


}
