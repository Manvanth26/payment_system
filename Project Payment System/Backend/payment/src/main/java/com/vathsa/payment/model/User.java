package com.vathsa.payment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;


@Setter
@Getter
@AllArgsConstructor
@ToString
@Document(collection = "user")
public class  User {

	private String email;
	private String password;

	private String biller;
	private String autopay;
	private long accNo ;
	public User(String email, String password, String biller, String autopay, long accNo) {
		super();
		this.email = email;
		this.password = password;
		this.biller = biller;
		this.autopay = autopay;
		this.accNo = accNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBiller() {
		return biller;
	}
	public void setBiller(String biller) {
		this.biller = biller;
	}
	public String getAutopay() {
		return autopay;
	}
	public void setAutopay(String autopay) {
		this.autopay = autopay;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}


}
