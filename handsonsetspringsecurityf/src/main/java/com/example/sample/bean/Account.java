package com.example.sample.bean;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
@Entity
@Table(name="account")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accNum;
	
	
	 
	//@Min(value = 10000, message = "Account number must be at least 1000000")
    //@Max(value = 1000000, message = "Account number must be at most 1000000")
	
	
	//@Size(min = 5, max = 20, message = "Account name must be between 5 and 20 characters")
    //@NotEmpty(message = "Account name cannot be empty")
	private String accName;
	
	//@Positive(message = "Balance must be positive")
	private int balance;
	
	//@Size(min = 10, message = "Branch ID must have at least 10 characters")
	private String branchId;
	 //@NotEmpty(message = "Area cannot be empty")
	private String area;
	 
	 //@Email(message = "Invalid email format")
	 //@NotEmpty(message = "Email cannot be empty")
	private String email;
	 
	 
	
	public int getAccNum() {
		return accNum;
		
		
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}