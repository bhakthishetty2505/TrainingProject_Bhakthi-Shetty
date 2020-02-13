package com.tyss.service;

import java.util.Arrays;
import java.util.List;

//Sample Implementation/ dummy
public class TodoServiceStub implements TodoService {

	public List<String> retrieveTodos(String user) {
		
		return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn Java");
	}

}
