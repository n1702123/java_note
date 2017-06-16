package com.hello;
 

public class Employee  implements Comparable<Employee> {
 
		private int id;
		private String name;
		private int yearsOfService;

		private int money;
		
		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}

		public Employee(int id, String name, int yearsOfService, int money) {
			this.id = id;
			this.name = name;
			this.yearsOfService = yearsOfService;
			this.money = money;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getYearsOfService() {
			return yearsOfService;
		}

		public void setYearsOfService(int yearsOfService) {
			this.yearsOfService = yearsOfService;
		}

		public int compareTo(Employee employee) {
			return this.getName().compareTo(employee.getName());
		}

		@Override
		public String toString() {
			String toString = "id=" + id + "-name=" + name+ "-years of service=" + yearsOfService + "$$$"+money;

			return toString;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + yearsOfService;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (id != other.id)
				return false;
			if (yearsOfService != other.yearsOfService)
				return false;
			return true;
		}

		 

	 
}
