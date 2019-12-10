package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.model.ExpenseCategory;
import com.example.model.ExpenseCategoryModel;
import com.example.service.ExpenseCategoryService;
import com.example.service.ExpenseCategoryServiceException;

import junit.framework.Assert;
@RunWith(SpringRunner.class)
@SpringBootTest
class TestExample {
@Autowired
private ExpenseCategoryService expenseCategoryService;
	@Test
	public void testSaveCategories() throws ExpenseCategoryServiceException {

		ExpenseCategoryModel ec1 = new ExpenseCategoryModel();
		ec1.setCategoryName("internet");
		expenseCategoryService.save(ec1);
		String name = ec1.getCategoryName();
      	List<ExpenseCategory> members = expenseCategoryService.getAllExpensesCategory();
     	 Assert.assertEquals(2, expenseCategoryService.getAllExpensesCategory().size());
     	ExpenseCategory newMember = expenseCategoryService.getByName(name);
		Assert.assertEquals("internet",newMember.getCategoryName());
    	//expenseCategoryService.deleteExpensesCategory();

	}
}
