package com.example.demo;

class EmployeeNotFoundException extends RuntimeException {
	EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
	/*
	 * o super se refere a superclasse do RuntimeException
	 */
}