package com.example.demo;

import java.util.List;

public interface UserService {

	User create(User user);

	User delete(int s);

	List findAll();

	User findById(int id);

	User update(User user);

}
