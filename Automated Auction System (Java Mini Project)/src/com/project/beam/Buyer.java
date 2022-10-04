package com.project.beam;

public class Buyer {

	private int buyerId;
	private String buyerName;
	private String buyerEmail;
	private long buyerPhone;
	private String buyerAddress;
	
	
	public Buyer() {
		super();
	}
	
	public Buyer(int buyerId, String buyerName, String buyerEmail, long buyerPhone, String buyerAddress) {
		super();
		this.buyerId = buyerId;
		this.buyerName = buyerName;
		this.buyerEmail = buyerEmail;
		this.buyerPhone = buyerPhone;
		this.buyerAddress = buyerAddress;
	}

	public int getBuyerId() {
		return buyerId;
	}


	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}


	public String getBuyerName() {
		return buyerName;
	}


	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}


	public String getBuyerEmail() {
		return buyerEmail;
	}


	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}


	public long getBuyerPhone() {
		return buyerPhone;
	}


	public void setBuyerPhone(long buyerPhone) {
		this.buyerPhone = buyerPhone;
	}


	public String getBuyerAddress() {
		return buyerAddress;
	}


	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}
	
	
	
	
	
	
}
