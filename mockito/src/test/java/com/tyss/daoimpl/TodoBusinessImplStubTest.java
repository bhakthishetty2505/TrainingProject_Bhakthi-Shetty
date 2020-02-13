package com.tyss.daoimpl;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.tyss.service.TodoService;
import com.tyss.service.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetriveTodoRelatedToSpring_usingAStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = 
				new TodoBusinessImpl(todoServiceStub);
		
		List<String> filteredTodos = 
				todoBusinessImpl.retriveTodoRelatedToSpring("Dummy");
		
		assertEquals(2, filteredTodos.size());
	}

}
