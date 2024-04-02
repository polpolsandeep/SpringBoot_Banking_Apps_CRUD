package com.sandeep.demojwt.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.sandeep.demojwt.model.User;

@Service
public class UserService {
	
	private List<User> store = new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(), "Sandeep Kumar", "gupta@skg.in"));
		store.add(new User(UUID.randomUUID().toString(), "Ankit Kumar","ankit@skg.in"));
		store.add(new User(UUID.randomUUID().toString(), "Ramesh Kumar", "ramesh@skg.in"));
		store.add(new User(UUID.randomUUID().toString(), "vijay Kumar", "vijay@skg.in"));
	}
	public List<User> getUsers(){
		return this.store;
	}

}
