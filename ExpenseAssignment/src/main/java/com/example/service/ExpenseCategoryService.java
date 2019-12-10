package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.ExpenseCategory;
import com.example.model.ExpenseCategoryModel;
import com.example.repository.ExpenceCategoryRepository;



@Service
public class ExpenseCategoryService {
	@Autowired
	private ExpenceCategoryRepository expenceCategoryRepository;

	public ExpenseCategory save(ExpenseCategoryModel expenseCategoryDto) {
		ExpenseCategory ec = new ExpenseCategory();
		ec.setCategoryName(expenseCategoryDto.getCategoryName());
		expenceCategoryRepository.save(ec);
		return ec;
	}

	public List<ExpenseCategory> getAllExpensesCategory() throws ExpenseCategoryServiceException{
		return expenceCategoryRepository.findAll();
	}

	public ExpenseCategory getByName(String name) {
		return expenceCategoryRepository.findByCategoryName(name);
	}

	public ExpenseCategory deleteByName(String name) {
		return expenceCategoryRepository.deleteByCategoryName(name);
	}
	
	public void deleteExpenseCategoryById(Long id) {
		Optional<ExpenseCategory> expenseCategory = expenceCategoryRepository.findById(id);

		if (expenseCategory.isPresent()) {
			expenceCategoryRepository.deleteById(id);
		} else {
			System.out.println("Record not found");
		}
	}
	

	public void deleteExpensesCategory() {
		expenceCategoryRepository.deleteAll();

	}
	public ExpenseCategory getExpenseCategoryException() throws ExpenseCategoryServiceException {

		throw new ExpenseCategoryServiceException();
	}
	public ExpenseCategory getExpenseCategoryNull() throws ExpenseCategoryServiceException {

		return null;
	}

}
