package com.employmentcrud.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp_details")
public class EmpDetails {
	@Id
	private Long empId;
	private String empName;
	private String empAddress;
	private Long empSalary;
	private Long empMobileNo;
	private String empEmail;
}
