package com.tyss.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.tyss.service.TodoService;

//TodoBusinessImpl -> SUT
//TodoService -> Dependency
public class TodoBusinessImpl {

	private TodoService todoService; 

	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}
	
	public List<String> retriveTodoRelatedToSpring(String user){
		
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = todoService.retrieveTodos(user);
		for(String todo: todos) {
			if(todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
	
}
