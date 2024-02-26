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

import java.util.Scanner;
import java.math.BigDecimal; 
public class PatientDriverApp {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter patient name: ");
       String patientName = sc.nextLine();

       System.out.println("Enter address: ");
       String address = sc.nextLine();

       System.out.println("Enter emergency contact information: ");
       String contact = sc.nextLine();

       //1st Procedure
       System.out.println("Enter the 1st Procedure name: ");
       String procedureName1 = sc.nextLine();
       
       System.out.println("Enter the 1st Procedure date: ");
       String procedureDate1 = sc.nextLine();

       System.out.println("Enter the 1st Procedure practitioner: ");
       String practitioner1 = sc.nextLine();

       System.out.println("Enter the 1st Procedure charge: ");
       BigDecimal procedureCharge1 = sc.nextBigDecimal();
       sc.nextLine(); 

       // 2nd Procedure
       System.out.println("Enter the 2nd Procedure name: ");
       String procedureName2 = sc.nextLine();
       
       System.out.println("Enter the 2nd Procedure date: ");
       String procedureDate2 = sc.nextLine();

       System.out.println("Enter the 2nd Procedure practitioner: ");
       String practitioner2 = sc.nextLine();

       System.out.println("Enter the 2nd Procedure charge: ");
       BigDecimal procedureCharge2 = sc.nextBigDecimal();
       sc.nextLine(); 

       // 3rd Procedure
       System.out.println("Enter the 3rd Procedure name: ");
       String procedureName3 = sc.nextLine();
       
       System.out.println("Enter the 3rd Procedure date: ");
       String procedureDate3 = sc.nextLine();

       System.out.println("Enter the 3rd Procedure practitioner: ");
       String practitioner3 = sc.nextLine();

       System.out.println("Enter the 3rd Procedure charge: ");
       BigDecimal procedureCharge3 = sc.nextBigDecimal();
       sc.nextLine(); 

       Patient patient = new Patient(patientName, address, contact);
       Procedure procedure1 = new Procedure(procedureName1, procedureDate1, practitioner1, procedureCharge1);
       Procedure procedure2 = new Procedure(procedureName2, procedureDate2, practitioner2, procedureCharge2);
       Procedure procedure3 = new Procedure(procedureName3, procedureDate3, practitioner3, procedureCharge3);

       // Print patient info
       System.out.println("\n\nPatient info:");
       System.out.println("  Name: " + patient.getName() + 
    		   "\n  Address: " + patient.getaddress() + 
    		   "\n  Emergency Contact: " + patient.getcontact() + "\n");

       // Print the 3 procedures
       System.out.println(procedureToString(procedure1));
       System.out.println(procedureToString(procedure2));
       System.out.println(procedureToString(procedure3));

       // Total Charge
       BigDecimal totalCharge = procedure1.getCost().add(procedure2.getCost()).add(procedure3.getCost());
       System.out.println("\nTotal Charges: $" + totalCharge + "\n");

       System.out.println("Student Name: Kyle Yee "
       		+ "\nMC#: M21144885 "
       		+ "\nDue Date: 2/26/2024");
       sc.close();
   }

   private static String procedureToString(Procedure procedure) {
       return "        Procedure: " + procedure.getProcedureName() + 
    		  "\n        Procedure Date: " + procedure.getProcedureDate() + 
    		  "\n        Practitioner: " + procedure.getDoctorName() + 
    		  "\n        Charge: " + procedure.getCost() + "\n";
   }
}
