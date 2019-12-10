package com.example.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
@Component

public class ExpenseModel {
	  private int e_id;
	    private String e_amount;
	    private LocalDateTime createDateTime;
	    private int ec_id;
		public int getEc_id() {
			return ec_id;
		}
		public void setEc_id(int ec_id) { 
			this.ec_id = ec_id;
		}
		public int getE_id() {
			return e_id;
		}
		public void setE_id(int e_id) {
			this.e_id = e_id;
		}
		public String getE_amount() {
			return e_amount;
		}
		public void setE_amount(String e_amount) {
			this.e_amount = e_amount;
		}
		public LocalDateTime getCreateDateTime() {
			return createDateTime;
		}
		public void setCreateDateTime(LocalDateTime createDateTime) {
			this.createDateTime = createDateTime;
		}
	 

}
