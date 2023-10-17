package com.sungjuk;

public class AccountDto {
	private String account;
	private String id;
	private String password;
	public AccountDto() {}
	
	
	public AccountDto(String account, String id, String password) {
		this.account = account; this.id = id; this.password = password; // insert 생성자
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}