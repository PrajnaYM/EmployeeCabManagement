package com.bits.dbms.entity;

public class Employee {
	
		private int customerId;
		private String customerName;
		
		
		public Employee(int customerId, String customerName) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
		}
		
		
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}


		public String getName() {
			// TODO Auto-generated method stub
			return customerName;
		}
		
		
		
		
}
