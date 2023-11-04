package com.bits.dbms.service;

import com.bits.dbms.dao.CabDao;
import com.bits.dbms.dao.CabDaoImpl;

public class ChangeStatus {

	public void updateStatus(int cabId, boolean toChange) {
		
		CabDao cabDao = new CabDaoImpl();
		cabDao.changeCabStatus(cabId, toChange);
		
		
	}
	
	
}
