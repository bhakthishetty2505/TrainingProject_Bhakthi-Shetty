package com.tyss.service;

import java.util.List;

//Create TodoServiceStub
//Test TodoBusinessImpl using TodoServiceStub
public interface TodoService {

	public List<String> retrieveTodos(String user);
}
