package com.model;

import com.money.Money;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Athul Ravindran  on 9/15/2017.
 */
@Data
@Builder
@ToString(exclude = "data")
public class EmployeePayRoll implements Serializable {
	private static final long serialVersionUID = -2141230049167664121L;

	private String clientName;
	private String employeeName;
	private String employeeId;
	private String payRollMonth;
	private String transactionId;
	private String uploadedFileName;
	private String designation;
	private String uan;
	private String insuranceNumber;
	private String aadharNumber;
	private Money basicPay;
	private Money dearnessAllow;
	private Money allowance;
	private int numberOfWorkingDays;
	private double actualWorkingDays;
	private Money earnedBasic;
	private Money earnedDearnessAllowance;
	private Money earnedAllowance;
	private Money earnedBasicPlusDa;
	private Money earnedGross;
	private Money employeePf;
	private Money employeeEsi;
	private Money employerEpf;
	private Money employerEps;
	private Money totalDeductions;
	private Money netPay;
	private Money wage;
	private Money hra;
	private Money earnedHRA;
	private Money earnedConveyance;
	private Money conveyance;
	private double otHours;
	private Money otMoney;
	private String jobDescriptionId;
	private String pmrpy;


}
