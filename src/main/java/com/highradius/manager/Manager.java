package com.highradius.manager;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import com.highradius.dao.Dao;
import com.highradius.model.CustomerInvoice;


public class Manager {
	public List<CustomerInvoice> getAllInvoices(){
		System.out.println("Manager GetAllInvoives...!!");
		Resource r=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	    Dao dao=(Dao)factory.getBean("customerInvoice");
	    List<CustomerInvoice> list=dao.getAllCustomerInvoice();
	    System.out.println(list.size());
	    return list;
	}
}
