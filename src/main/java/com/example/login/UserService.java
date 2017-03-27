package com.example.login;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
	public void saveUser(User user,String role);
}
