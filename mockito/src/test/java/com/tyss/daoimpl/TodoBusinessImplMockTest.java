package com.tyss.daoimpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.tyss.service.TodoService;

public class TodoBusinessImplMockTest {

	@Test
	public void testRetriveTodoRelatedToSpring_usingAMock() {
		
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn Java");
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = 
				new TodoBusinessImpl(todoServiceMock);
		
		List<String> filteredTodos = 
				todoBusinessImpl.retriveTodoRelatedToSpring("Dummy");
		
		assertEquals(2, filteredTodos.size());
	}

	@Test
	public void testRetriveTodoRelatedToSpring_withEmptyList() {
		
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList();
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = 
				new TodoBusinessImpl(todoServiceMock);
		
		List<String> filteredTodos = 
				todoBusinessImpl.retriveTodoRelatedToSpring("Dummy");
		
		assertEquals(0, filteredTodos.size());
	}
}
  