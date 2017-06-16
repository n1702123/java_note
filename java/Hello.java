package com.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List; 
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

public class Hello {

	public static void main(String[] args) {

		Employee sezinKarli = new Employee(4, "Sezin Karli", 4 , 100);
		Employee darthVader = new Employee(3, "Darth Vader", 5, 100);
		Employee hanSolo = new Employee(2, "Han Solo", 10, 100);
		Employee aaa = new Employee(5, "aaa", 1, 100);
		Employee bbb = new Employee(6, "bbb", 2, 200);
		Employee ccc = new Employee(4, "ccc", 2, 300);
		Employee ddd = new Employee(4, "ddd", 4, 500);
		
		
		List<Employee> employeeList = Lists.newArrayList(sezinKarli, hanSolo,darthVader,aaa , bbb , ccc , ddd);
		System.out.println("employee list: " + employeeList);

		Comparator<Employee> yearsComparator = new Comparator<Employee>() {
			public int compare(Employee employee1, Employee employee2) {
				int aa = (employee1.getId() - employee2.getId());
				int bb =  (employee1.getYearsOfService() - employee2.getYearsOfService());
				return aa - bb ;
			}
		};
 
		
		
		 
		// Create an Ordering from a Comparator
		Ordering<Employee> orderUsingYearsComparator = Ordering.from(yearsComparator); 
		 
		
		
		// Sort the employee list using years comparator
		List<Employee> sortedCopy = orderUsingYearsComparator.sortedCopy(employeeList);
		System.out.println("sorted copy based on years of service comparator: "+ sortedCopy);
		
		
		List<Employee> tempList = new ArrayList<Employee>();
		
		for(int i = 0 ; i < sortedCopy.size() ; i++ ){
			System.out.println(""+sortedCopy.get(i)); 
			
			Employee employee = sortedCopy.get(i);
			
			if(tempList.contains(employee)){
				
				Integer employeeMoney = employee.getMoney();
				
				Integer idx = tempList.indexOf(employee);
				 
				Employee temp = tempList.get(idx);
				Integer tmepMoeny = temp.getMoney();
				
				temp.setMoney(employeeMoney + tmepMoeny); 
				tempList.set(idx, temp);
				 
			}else{ 
				tempList.add(employee);
			} 
		}
		 
		
		for(Employee list : tempList){
			System.out.println("list :"+list); 
		}
		 

	}

}
