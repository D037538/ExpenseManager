package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.ExpenseCategory;
import com.example.model.Expenses;

@Repository
public interface ExpensesRepository extends JpaRepository<Expenses, Long> {

	// @Query(value = "SELECT
	// MONTHNAME(e.create_date_time),YEAR(e.create_date_time), SUM(e.e_amount) FROM
	// expenses e GROUP BY MONTHNAME(e.create_date_time)", nativeQuery = true)
	@Query("select monthname(e.createDateTime),year(e.createDateTime), sum(e.e_amount) from Expenses e group by monthname(e.createDateTime)")
	public List<Object[]> findByMonth();

}
