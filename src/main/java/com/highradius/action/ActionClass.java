package com.highradius.action;

import java.util.List;
import com.highradius.manager.Manager;
import com.highradius.model.CustomerInvoice;
import com.opensymphony.xwork2.Action;

public class ActionClass{
	
	List<CustomerInvoice> list;
	
	public List<CustomerInvoice> getList() {
		return list;
	}

	public String returnAll()
	
	{
	   System.out.println("Hello !getAll() method...!!!");
	   list = new Manager().getAllInvoices();
	   System.out.println(list.size());
	   return Action.SUCCESS;
	}	
}
