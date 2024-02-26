package assignments;

/*
 *Class: CMSC203 CRN 34473
 *Program: Assignment 2
 *Instructor: Khandan Monshi
 *Summary of Description: Build interface showing a patients procedures and cost
 *Due Date: 02/26/2024 
 *Integrity Pledge: I pledge that I have completed the programming assignment independently.
 *I have not copied the code from a student or any source.
*/

import java.math.BigDecimal;

public class Procedure {
	
	private String procedureName;
	private String procedureDate;
	private String doctorName;
	private BigDecimal cost;

	public Procedure(String procedureName, String procedureDate, String doctorName, BigDecimal procedureCharge1)
	{
	this.procedureName = procedureName;
	this.procedureDate = procedureDate;
	this.doctorName = doctorName;
	this.cost = procedureCharge1;
	}

	public String getProcedureName()
	{
	return procedureName;
	}
	public String getProcedureDate()
	{
	return procedureDate;
	}
	public String getDoctorName()
	{
	return doctorName;
	}
	public BigDecimal getCost()
	{
	return cost;
	}

	public void setProcedureName(String procedureName)
	{
	this.procedureName = procedureName;
	}
	public void setProcedureDate(String procedureDate)
	{
	this.procedureDate = procedureDate;
	}
	public void setDoctorName(String doctorName)
	{
	this.doctorName = doctorName;
	}
	public void setCost(BigDecimal cost)
	{
	this.cost = cost;
	}
}