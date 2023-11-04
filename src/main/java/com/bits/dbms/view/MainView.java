package com.bits.dbms.view;

import com.bits.dbms.service.BookCab;


public class MainView {

	public static void main(String[] args) {
	
	/*	--- Unit Testing of Employee
		//Employee customer1 = new Employee(691736, "Prashant Chaubey");
		Employee customer1 = new Employee(691740, "Deepak Bisht");
		CustomerDao customerDao = new CustomerDaoImpl();
		customerDao.addCustomer(customer1);
		
		
		--- Unit Testing of Cab
		Cab cab1 = new Cab(103,"Aman Hooda");
		CabDao cabDao = new CabDaoImpl();
		cabDao.addCab(cab1);
		
		*/
		
		//Booking book1 = new Booking();
		//BookCab bookCab = new BookCab();
		//bookCab.bookCab(book1, 8, 691736);
		/* 
		
	        
	    
		
			ChangeStatus changeStatus = new ChangeStatus();
			changeStatus.updateStatus(101, true);
			changeStatus.updateStatus(102, true);
			changeStatus.updateStatus(103, true);
			
			
			
			BookingHelperDao bookinghelper = new BookingHelperDaoImpl();
		System.out.println(bookinghelper.getBookingId());
*/
			
		
	        BookCab bookcab = new BookCab();
	       
	        bookcab.bookCab(9, 691740);
	        bookcab.bookCab(4, 691743);
	        bookcab.bookCab(3, 691732);
	        

		
	}
}


