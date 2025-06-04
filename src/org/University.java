package org;

public class University {
	
	static class Department{
		
		private String departmentName;
		private int facultyCount;
		
		public Department( String departmentName, int facultyCount ) {
		this.departmentName = departmentName;
		this.facultyCount = facultyCount;
		
		}
		
		
		public void displayInfo() {
			
			System.out.println("departmentName :" + departmentName);
			System.out.println("facultyCount :" + facultyCount);
			System.out.println("Hello");
			
			
			
			
		}
		
		
		
		
	}

}
