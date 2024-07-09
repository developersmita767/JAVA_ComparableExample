package Abacus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		Employee e1=new Employee("NH1", "Vijay", 10000, 32);
		Employee e2=new Employee("NH2", "Santosh", 20000, 34);
		Employee e3=new Employee("NH3", "Sweta", 15000, 26);
		Employee e4=new Employee("NH4", "Srini", 40000, 40);
		Employee e5=new Employee("NH5", "Pratik", 30000, 31);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		System.out.println("Emp details before sorting:");
		Iterator<Employee> empIter1=empList.iterator();
		while(empIter1.hasNext()) {
			Employee emp=empIter1.next();
			System.out.println(emp.getName()+","+emp.getAge());
		}
		System.out.println("==================================");
		Collections.sort(empList);
		Iterator<Employee> empIter2=empList.iterator();
		while(empIter2.hasNext()) {
			Employee emp=empIter2.next();
			System.out.println(emp.getName()+","+emp.getAge());
		}

	}

}
