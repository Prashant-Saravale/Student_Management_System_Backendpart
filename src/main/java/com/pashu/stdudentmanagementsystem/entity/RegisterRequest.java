package com.pashu.stdudentmanagementsystem.entity;

public class RegisterRequest {
	
	private String username;
   	private String password;
    
    public RegisterRequest() {
		// TODO Auto-generated constructor stub
	}
    
    
    
	
	    public RegisterRequest(String username, String email, String password) {
		super();
		this.username = username;

		this.password = password;
	}




		public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}



	@Override
   	public String toString() {
   		return "RegisterRequest [username=" + username + ", password=" + password + "]";
   	}

	

	
	
}
