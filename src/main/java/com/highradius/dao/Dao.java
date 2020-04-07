package com.highradius.dao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.highradius.model.CustomerInvoice;

public class Dao {
	
	HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	  
	public void updateCustomerInvoice(CustomerInvoice invoice){  
	    template.update(invoice);  
	}  
	  
	public void deleteCustomerInvoice(CustomerInvoice invoice){  
	    template.delete(invoice);  
	}  
	  
	public CustomerInvoice getById(int id){  
		CustomerInvoice invoice=(CustomerInvoice)template.get(CustomerInvoice.class,id);  
	    return invoice;  
	}
	
	@SuppressWarnings("unchecked")
	public List<CustomerInvoice> getAllCustomerInvoice(){  
	    List<CustomerInvoice> list=new ArrayList<CustomerInvoice>();  
	    list=template.loadAll(CustomerInvoice.class);  
	    return list;  
	}
}
