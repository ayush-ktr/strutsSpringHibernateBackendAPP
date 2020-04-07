package com.highradius.model;

import java.util.Date;
public class CustomerInvoice {
	int id;
	int acct_doc_header_id;
	int account_id;
	int document_number;
	int document_number_norm;
	String company_code;
	String fiscal_year;
	int document_line_number;
	String doctype;
	int customer_number;
	int customer_number_norm;
	int fk_customer_map_id;
	String customer_name;
	String division;
	Date document_date;
	Date document_date_norm;
	Date posting_date;
	Date posting_date_norm;
	String posting_key;
	Date due_date;
	Date due_date_norm;
	Date order_date;
	Date order_date_norm;
	int invoice_number;
	int invoice_number_norm;
	Date invoice_date;
	Date invoice_date_norm;
	float open_amount;
	float open_amount_norm;
	int payment_terms;
	String business_area;
	Date ship_date;
	String ship_to;
	Date clearing_date;
	Date clearing_date_norm;
	String reason_code;
	int isOpen;
	Date discount_due_date_norm;
	String debit_credit_indicator;
	String payment_method;
	Date document_creation_date;
	float invoice_amount_doc_currency;
	int document_id;
	float actual_open_amount;
	float paid_amount;
	int dayspast_due;
	int invoice_age;
	float disputed_amount;
	
	
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getAcct_doc_header_id() {
		return acct_doc_header_id;
	}
	public void setAcct_doc_header_id(int acct_doc_header_id) {
		this.acct_doc_header_id = acct_doc_header_id;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public int getDocument_number() {
		return document_number;
	}
	public void setDocument_number(int document_number) {
		this.document_number = document_number;
	}
	public int getDocument_number_norm() {
		return document_number_norm;
	}
	public void setDocument_number_norm(int document_number_norm) {
		this.document_number_norm = document_number_norm;
	}
	public String getCompany_code() {
		return company_code;
	}
	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}
	public String getFiscal_year() {
		return fiscal_year;
	}
	public void setFiscal_year(String fiscal_year) {
		this.fiscal_year = fiscal_year;
	}
	public int getDocument_line_number() {
		return document_line_number;
	}
	public void setDocument_line_number(int document_line_number) {
		this.document_line_number = document_line_number;
	}
	public String getDoctype() {
		return doctype;
	}
	public void setDoctype(String doctype) {
		this.doctype = doctype;
	}
	public int getCustomer_number() {
		return customer_number;
	}
	public void setCustomer_number(int customer_number) {
		this.customer_number = customer_number;
	}
	public int getCustomer_number_norm() {
		return customer_number_norm;
	}
	public void setCustomer_number_norm(int customer_number_norm) {
		this.customer_number_norm = customer_number_norm;
	}
	public int getFk_customer_map_id() {
		return fk_customer_map_id;
	}
	public void setFk_customer_map_id(int fk_customer_map_id) {
		this.fk_customer_map_id = fk_customer_map_id;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public Date getDocument_date() {
		return document_date;
	}
	public void setDocument_date(Date document_date) {
		this.document_date = document_date;
	}
	public Date getDocument_date_norm() {
		return document_date_norm;
	}
	public void setDocument_date_norm(Date document_date_norm) {
		this.document_date_norm = document_date_norm;
	}
	public Date getPosting_date() {
		return posting_date;
	}
	public void setPosting_date(Date posting_date) {
		this.posting_date = posting_date;
	}
	public Date getPosting_date_norm() {
		return posting_date_norm;
	}
	public void setPosting_date_norm(Date posting_date_norm) {
		this.posting_date_norm = posting_date_norm;
	}
	public String getPosting_key() {
		return posting_key;
	}
	public void setPosting_key(String posting_key) {
		this.posting_key = posting_key;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public Date getDue_date_norm() {
		return due_date_norm;
	}
	public void setDue_date_norm(Date due_date_norm) {
		this.due_date_norm = due_date_norm;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public Date getOrder_date_norm() {
		return order_date_norm;
	}
	public void setOrder_date_norm(Date order_date_norm) {
		this.order_date_norm = order_date_norm;
	}
	public int getInvoice_number() {
		return invoice_number;
	}
	public void setInvoice_number(int invoice_number) {
		this.invoice_number = invoice_number;
	}
	public int getInvoice_number_norm() {
		return invoice_number_norm;
	}
	public void setInvoice_number_norm(int invoice_number_norm) {
		this.invoice_number_norm = invoice_number_norm;
	}
	public Date getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(Date invoice_date) {
		this.invoice_date = invoice_date;
	}
	public Date getInvoice_date_norm() {
		return invoice_date_norm;
	}
	public void setInvoice_date_norm(Date invoice_date_norm) {
		this.invoice_date_norm = invoice_date_norm;
	}
	public float getOpen_amount() {
		return open_amount;
	}
	public void setOpen_amount(float open_amount) {
		this.open_amount = open_amount;
	}
	public float getOpen_amount_norm() {
		return open_amount_norm;
	}
	public void setOpen_amount_norm(float open_amount_norm) {
		this.open_amount_norm = open_amount_norm;
	}
	public int getPayment_terms() {
		return payment_terms;
	}
	public void setPayment_terms(int payment_terms) {
		this.payment_terms = payment_terms;
	}
	public String getBusiness_area() {
		return business_area;
	}
	public void setBusiness_area(String business_area) {
		this.business_area = business_area;
	}
	public Date getShip_date() {
		return ship_date;
	}
	public void setShip_date(Date ship_date) {
		this.ship_date = ship_date;
	}
	public String getShip_to() {
		return ship_to;
	}
	public void setShip_to(String ship_to) {
		this.ship_to = ship_to;
	}
	public Date getClearing_date() {
		return clearing_date;
	}
	public void setClearing_date(Date clearing_date) {
		this.clearing_date = clearing_date;
	}
	public Date getClearing_date_norm() {
		return clearing_date_norm;
	}
	public void setClearing_date_norm(Date clearing_date_norm) {
		this.clearing_date_norm = clearing_date_norm;
	}
	public String getReason_code() {
		return reason_code;
	}
	public void setReason_code(String reason_code) {
		this.reason_code = reason_code;
	}
	public int getIsOpen() {
		return isOpen;
	}
	public void setIsOpen(int isOpen) {
		this.isOpen = isOpen;
	}
	public Date getDiscount_due_date_norm() {
		return discount_due_date_norm;
	}
	public void setDiscount_due_date_norm(Date discount_due_date_norm) {
		this.discount_due_date_norm = discount_due_date_norm;
	}
	public String getDebit_credit_indicator() {
		return debit_credit_indicator;
	}
	public void setDebit_credit_indicator(String debit_credit_indicator) {
		this.debit_credit_indicator = debit_credit_indicator;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public Date getDocument_creation_date() {
		return document_creation_date;
	}
	public void setDocument_creation_date(Date document_creation_date) {
		this.document_creation_date = document_creation_date;
	}
	public float getInvoice_amount_doc_currency() {
		return invoice_amount_doc_currency;
	}
	public void setInvoice_amount_doc_currency(float invoice_amount_doc_currency) {
		this.invoice_amount_doc_currency = invoice_amount_doc_currency;
	}
	public int getDocument_id() {
		return document_id;
	}
	public void setDocument_id(int document_id) {
		this.document_id = document_id;
	}
	public float getActual_open_amount() {
		return actual_open_amount;
	}
	public void setActual_open_amount(float actual_open_amount) {
		this.actual_open_amount = actual_open_amount;
	}
	public float getPaid_amount() {
		return paid_amount;
	}
	public void setPaid_amount(float paid_amount) {
		this.paid_amount = paid_amount;
	}
	public int getDayspast_due() {
		return dayspast_due;
	}
	public void setDayspast_due(int dayspast_due) {
		this.dayspast_due = dayspast_due;
	}
	public int getInvoice_age() {
		return invoice_age;
	}
	public void setInvoice_age(int invoice_age) {
		this.invoice_age = invoice_age;
	}
	public float getDisputed_amount() {
		return disputed_amount;
	}
	public void setDisputed_amount(float disputed_amount) {
		this.disputed_amount = disputed_amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "CustomerInvoice [acct_doc_header_id=" + acct_doc_header_id + ", account_id=" + account_id
				+ ", document_number=" + document_number + ", document_number_norm=" + document_number_norm
				+ ", company_code=" + company_code + ", fiscal_year=" + fiscal_year + ", document_line_number="
				+ document_line_number + ", doctype=" + doctype + ", customer_number=" + customer_number
				+ ", customer_number_norm=" + customer_number_norm + ", fk_customer_map_id=" + fk_customer_map_id
				+ ", division=" + division + ", document_date=" + document_date + ", document_date_norm="
				+ document_date_norm + ", posting_date=" + posting_date + ", posting_date_norm=" + posting_date_norm
				+ ", posting_key=" + posting_key + ", due_date=" + due_date + ", due_date_norm=" + due_date_norm
				+ ", order_date=" + order_date + ", order_date_norm=" + order_date_norm + ", invoice_number="
				+ invoice_number + ", invoice_number_norm=" + invoice_number_norm + ", invoice_date=" + invoice_date
				+ ", invoice_date_norm=" + invoice_date_norm + ", open_amount=" + open_amount + ", open_amount_norm="
				+ open_amount_norm + ", payment_terms=" + payment_terms + ", business_area=" + business_area
				+ ", ship_date=" + ship_date + ", ship_to=" + ship_to + ", clearing_date=" + clearing_date
				+ ", clearing_date_norm=" + clearing_date_norm + ", reason_code=" + reason_code + ", isOpen=" + isOpen
				+ ", discount_due_date_norm=" + discount_due_date_norm + ", debit_credit_indicator="
				+ debit_credit_indicator + ", payment_method=" + payment_method + ", document_creation_date="
				+ document_creation_date + ", invoice_amount_doc_currency=" + invoice_amount_doc_currency
				+ ", document_id=" + document_id + ", actual_open_amount=" + actual_open_amount + ", paid_amount="
				+ paid_amount + ", dayspast_due=" + dayspast_due + ", invoice_age=" + invoice_age + ", disputed_amount="
				+ disputed_amount + "]";
	}
	
	/*
	 * protected void finalize() { System.out.println("Object Destroyed...!!"); }
	 */
	
	
	
}
