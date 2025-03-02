package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository //Bean化
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public String selectByNo(String number) {
		// 固定値を返却する、本来はDBに接続して値を返す
		String name = "田中";
		return name;
	}

}
