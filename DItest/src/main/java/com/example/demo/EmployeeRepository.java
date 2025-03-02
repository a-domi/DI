package com.example.demo;

public interface EmployeeRepository {

	// 社員番号で社員を取得
	String selectByNo(String number);
}
