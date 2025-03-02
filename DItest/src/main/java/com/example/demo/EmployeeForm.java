package com.example.demo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class EmployeeForm {

	@NotEmpty(message="社員番号を入力してください。")
	@Pattern(regexp = "\\d{3}", message = "入力は半角数字3桁である必要があります")
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}
