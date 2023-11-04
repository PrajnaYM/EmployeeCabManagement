package com.bits.dbms.dao;

import com.bits.dbms.entity.Cab;

public interface CabDao {
	
	public void addCab(Cab cab);

	public int getCabId();
	
	public void changeCabStatus(int cabId, boolean i);
}
