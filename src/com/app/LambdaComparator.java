package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaComparator {
	
	
	
	public static List<Employee> getAllEmployess(){
		
		
		List<Employee> emplist=new ArrayList<Employee>();
		
		emplist.add(new Employee(61,"ABC","3.2","BCA"));
		emplist.add(new Employee(12,"BBC","3.2","BCA"));

		emplist.add(new Employee(13,"CBC","3.2","BCA"));

		emplist.add(new Employee(14,"DBC","3.2","BCA"));
		emplist.add(new Employee(15,"EBC","3.2","BCA"));

		emplist.add(new Employee(16,"FBC","3.2","BCA"));
		emplist.add(new Employee(17,"GBC","3.2","BCA"));
		emplist.add(new Employee(18,"TBC","3.2","BCA"));
		emplist.add(new Employee(19,"XBC","3.2","BCA"));
		emplist.add(new Employee(21,"YBC","3.2","BCA"));
		emplist.add(new Employee(31,"ZBC","3.2","BCA"));
		emplist.add(new Employee(41,"PBC","3.2","BCA"));
		emplist.add(new Employee(51,"MBC","3.2","BCA"));

		return emplist;
	}
		
	public static void main(String[] args) {
		
		
		List<Employee> emplist=getAllEmployess();
		
		Collections.sort(emplist,(e1,e2)->e1.getEmpName().compareTo(e2.getEmpName()));
		
		emplist.forEach(System.out::println);
		
		/*emplist.forEach(e->{
			
			String name=e.getEmpName();
			switch(name) {
			
				case "ABC" : e.setEmpName(e.getEmpName()+" Mahndra");
				break;
			}
		});*/
		
		
		List<String> empName=emplist.stream().filter(e->e.getEmpName().equalsIgnoreCase("ABC")).map(e->e.getEmpName()+" Mahindra").collect(Collectors.toList());
		
		System.out.println(emplist);
		System.out.println(empName);
	}
	

}
