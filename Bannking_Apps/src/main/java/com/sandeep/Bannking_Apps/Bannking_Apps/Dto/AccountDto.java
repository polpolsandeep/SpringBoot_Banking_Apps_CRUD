package com.sandeep.Bannking_Apps.Bannking_Apps.Dto;

public class AccountDto {
	
	private Long Id;
	
	private String AccountHolderName;
	
	private double Balance;
	
	

	public AccountDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountDto(Long id, String accountHolderName, double balance) {
		super();
		Id = id;
		AccountHolderName = accountHolderName;
		Balance = balance;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getAccountHolderName() {
		return AccountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}
	
	

}
