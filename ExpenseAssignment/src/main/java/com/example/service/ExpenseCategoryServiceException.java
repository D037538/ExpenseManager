package com.example.service;

public class ExpenseCategoryServiceException extends Exception  {
	private static final long serialVersionUID = -470180507998010368L;

	public ExpenseCategoryServiceException() {
		super();
	}

	public ExpenseCategoryServiceException(final String message) {
		super(message);
	}
}
