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
@Document(collection = "account")
public class Account
{
    private long accNo;
    private String email;
    private long balance;
	public Account(long accNo, String email, long balance) {
		super();
		this.accNo = accNo;
		this.email = email;
		this.balance = balance;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}

}
