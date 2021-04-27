package com.example.demo.compensation;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Compensation 
{
	@Id
	private int eid;
	private String type;
	private int amount;
	private String description;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date dt;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDt() {
		return dt;
	}
	public void setDt(Date dt) {
		this.dt = dt;
	}
	@Override
	public String toString() {
		return "Compensation [eid=" + eid + ", type=" + type + ", amount=" + amount + ", description=" + description
				+ ", dt=" + dt + "]";
	}
	
	

}
