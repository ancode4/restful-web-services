package com.rest.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rest.beans.User;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	private static int usersCount = 3;
	static {
		users.add(new User(1,"Jon",new Date()));
		users.add(new User(2,"Jane",new Date()));
		users.add(new User(3,"James",new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save (User u) {
		if(u.getId()==null) {
			u.setId(++usersCount);
		}
		users.add(u);
		
		return u;
	}
	
	public User findOne(int id) {
		for(User u: users) {
			if(u.getId()==id) {
				return u;
			}
		}
		return null;
	}
}
