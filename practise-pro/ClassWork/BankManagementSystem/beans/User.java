package beans;

import util.Constants.type;

public class User {
	//Fields - Class Variables
	private String userName;
	private String address;
	private int mobileNumber;
	private BankAccount account;
	
	public User() {
		
	}
	public User(String userName, BankAccount account) {
		this.userName = userName;
		this.account = account;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public BankAccount getAccount() {
		return account;
	}
	
