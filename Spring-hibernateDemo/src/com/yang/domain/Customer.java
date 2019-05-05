package com.yang.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * �ͻ�ʵ����
 * @author yang
 *
 */
@Entity
@Table(name="cust_customer")
public class Customer implements Serializable {
	@Id
	@Column(name="cust_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long cust_id;
	@Column(name="cust_name")
	private String cust_name;
	@Column(name="cust_source")
	private String cust_source;
	@Column(name="cust_industry")
	private String cust_industry;
	@Column(name="cust_level")
	private String cust_level;
	@Column(name="cust_address")
	private String cust_address;
	@Column(name="cust_phone")
	private String cust_phone;
	public Customer() {
		
	}
	public Long getCust_id() {
		return cust_id;
	}
	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_source() {
		return cust_source;
	}
	public void setCust_source(String cust_source) {
		this.cust_source = cust_source;
	}
	public String getCust_industry() {
		return cust_industry;
	}
	public void setCust_industry(String cust_industry) {
		this.cust_industry = cust_industry;
	}
	public String getCust_level() {
		return cust_level;
	}
	public void setCust_level(String cust_level) {
		this.cust_level = cust_level;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_source=" + cust_source
				+ ", cust_industry=" + cust_industry + ", cust_level=" + cust_level + ", cust_address=" + cust_address
				+ ", cust_phone=" + cust_phone + "]";
	}
	
}
