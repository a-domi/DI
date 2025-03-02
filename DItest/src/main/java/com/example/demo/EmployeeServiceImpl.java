package com.example.demo;

import org.springframework.stereotype.Service;

@Service //Bean化
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public String findByEmployee(String number) {
		// リポジトリから社員を取得
		String name = employeeRepository.selectByNo(number);
		return name;
	}

}
