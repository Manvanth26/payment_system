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
@Document(collection = "biller")
public class Biller
{
    private int id;
    private String name;
    private long consumerNumber;
    private int billAmt;
	public Biller(int id, String name, long consumerNumber, int billAmt) {
		super();
		this.id = id;
		this.name = name;
		this.consumerNumber = consumerNumber;
		this.billAmt = billAmt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getConsumerNumber() {
		return consumerNumber;
	}
	public void setConsumerNumber(long consumerNumber) {
		this.consumerNumber = consumerNumber;
	}
	public int getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(int billAmt) {
		this.billAmt = billAmt;
	}
    
    
}
