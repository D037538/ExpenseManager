package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exceptionhandling.ResourceNotFoundException;
import com.example.model.ExpenseModel;
import com.example.model.Expenses;
import com.example.repository.ExpensesRepository;
import com.example.service.ExpenseService;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

import org.apache.tomcat.util.file.ConfigurationSource.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
/**
 * 
 * @author Anushree
 *
 */
public class ExpenseController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ExpenseService expenseService;
	@Autowired
	private ExpensesRepository expensesRepository;

	/**
	 * method for get all expenses
	 * 
	 * @return Expenses
	 */
	@GetMapping("/expenses")
	public List<Expenses> getAllExpenses() {

		logger.debug("Debug message");
		logger.info("Info message");
		logger.warn("Warn message");
		logger.error("Error message");
		return expenseService.getAllExpenses();
	}

	/**
	 * method for show expenses month wise
	 * 
	 * @return
	 */
	@GetMapping("/showmonthwise")
	public List<Object[]> getMOnthWiseExpenses() {

		return expenseService.getListOfExpensesmonthWise();
	}

	/**
	 * method for save expenses
	 * 
	 * @param expenseModel
	 * @return
	 */
	@PostMapping("/addExpenses")
	public Expenses createExpenses(@RequestBody ExpenseModel expenseModel) {
		System.out.print("Category name:" + expenseModel.getEc_id());
		return expenseService.save(expenseModel);
	}

	/**
	 * method for show expenses by id
	 * 
	 * @param id
	 * @return
	 * @throws ResourceNotFoundException
	 */
	@GetMapping("/expenses/{id}")
	public java.util.Optional<Expenses> retrieveExpense(@PathVariable long id) throws ResourceNotFoundException {
		java.util.Optional<Expenses> expense = expenseService.getExpensesById(id);

		if (!expense.isPresent()) {
			throw new ResourceNotFoundException("Expense not found");

		}

		return expense;
	}
}
