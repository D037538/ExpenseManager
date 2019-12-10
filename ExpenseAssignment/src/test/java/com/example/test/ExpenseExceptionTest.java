
package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.exceptionhandling.ExceptionResponse;
import com.example.exceptionhandling.ResourceNotFoundException;
import com.example.service.ExpenseService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)

@SpringBootTest
class ExpenseExceptionTest {
	private String requestedURI = "/api/expenses/6";
	private String errorMessage = "Expense not found";

	@Autowired
	private ExpenseService expenseService;
	

	@Autowired
	private ExceptionResponse exceptionResponse;

	@Test
	public void testhandleBanNotNumericException() {
		ExceptionResponse exceptionResponse=new ExceptionResponse();
		exceptionResponse.setErrorMessage(errorMessage);
		Assert.assertEquals("Expense not found", exceptionResponse.getErrorMessage());
	}
}
