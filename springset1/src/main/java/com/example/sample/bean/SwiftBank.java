package com.example.sample.bean;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Swift_codes")
public class SwiftBank {
	@Id
	@Pattern(regexp="^[A-Za-z0-9]{8}([A-Za-z0-9]{3})?$")
	private String SwiftCode;
	
	@Size(min =4 ,max=4,message="it should be 4 letters")
	@Pattern(regexp="[A-za-z]{4}")
	@NotEmpty(message="it should not be empty")
	private String bbbb;
	
	@Size(min =2 ,max=2,message="it should be 2 letters")
	@Pattern(regexp="[A-za-z]{2}")
	@NotEmpty(message="it should not be empty")
	private String cc;
	
	@Size(min =2, max=2,message="it should be 2 letters")
	@Pattern(regexp="[A-za-z0-9]{2}")
	@NotEmpty(message="it should not be empty")
	private String ll;
	
	@Size(min=3 ,max=3,message="it should be 3letters")
	@Pattern(regexp="[A-za-z0-9]{3}")
	@NotEmpty(message="it should not be empty")
	private String ttt;

	public String getSwiftCode() {
		return SwiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		SwiftCode = swiftCode;
	}

	public String getBbbb() {
		return bbbb;
	}

	public void setBbbb(String bbbb) {
		this.bbbb = bbbb;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getLl() {
		return ll;
	}

	public void setLl(String ll) {
		this.ll = ll;
	}

	public String getTtt() {
		return ttt;
	}

	public void setTtt(String ttt) {
		this.ttt = ttt;
	}
}

	
		
	
	

	


