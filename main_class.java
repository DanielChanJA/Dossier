/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dossier;

/**
 * @CandidateName Chan Jian Ann Daniel
 * @school Dulwich College Beijing
 * @Date 01/03/2013 (DD/MM/YYYY)
 * @CandidateNumber 003434-004
 * @ComputerUsed Macbook Pro Retina 15 Inch Mid 2012, Mac OSX 10.8.2, Windows 7 Ultimate 64Bit, Windows 8 Professional 64Bit
 * @IDE Netbeans IDE 7.2
 * @Program Coursework Management System (CMS)
 * @Purpose To assist teachers in managing their student's courseworks.
 * It allows teachers to see which assignments are assigned to the students.
 */
import java.util.*;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main_class {
            
    
    
    public static void main(String[] args) {
        
        int selection, age, supervisor, subject;
        
        boolean continuity;
        
        int input = 0;
        String placeholder_fname, placeholder_lname, placeholder_yeargrp, placeholder_supervisor;
        int placeholder_year, placeholder_studentID;
        
        String placeholder_assignmentName;
        String placeholder_date;
        
        String filename_S, filename_A;
        
        filename_S = "students.dat";
        filename_A = "assignments.dat";
        
        int day = 0, month = 0, year = 0, placeholder_assignID;
        
        LinkedLists listS = new LinkedLists();
        LinkedLists listA = new LinkedLists();
        
        selection = 0;
        continuity = true;        
        Scanner scanner = new Scanner(System.in);
        
        
        try {
            
            BufferedReader in_student = new BufferedReader(new FileReader("students.dat"));
            BufferedReader in_assign = new BufferedReader(new FileReader("assignments.dat"));
            String temp_record;
            System.out.println("We are currently reading in the existing data.");
        
        while(in_student.ready()) {
            
            String student_fname_temp;
            String student_lname_temp;
            String student_yrgrp_temp;
            String student_supervisor_temp;
            int student_year_temp;

            student_fname_temp = (in_student.readLine());
            student_lname_temp = (in_student.readLine());
            student_year_temp = Integer.parseInt(in_student.readLine());
            student_yrgrp_temp = (in_student.readLine());
            student_supervisor_temp = (in_student.readLine());
            
            listS.add(student_fname_temp, student_lname_temp, student_year_temp, student_yrgrp_temp, student_supervisor_temp);
            
            
        }  
        
        while(in_assign.ready()) {
            
            String assignment_name_temp;
            int assignment_month_temp;
            int assignment_day_temp;
            int assignment_year_temp;
            
            Date assignment_date_temp = new Date();
            
            
            assignment_name_temp = in_assign.readLine();
            
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            try {
                
                assignment_date_temp = df.parse(in_assign.readLine());
                                    
                
                } catch (ParseException ex) {
                    
                    System.out.println("Something went wrong. It seems like the input was not formatted correctly. Please make sure it is DD/MM/YYYY");
                    
                }            
            

            
            listA.add(assignment_name_temp, assignment_date_temp);
            
            
        }
            
        } catch(FileNotFoundException e) {
             
            System.out.println("Unable to find the files. Perhaps they aren't created?");
            
        } catch(IOException e) {
            
            System.out.println("The system encountered an error, please contact the coder.");
            
        }
        
        
        
        
        
        System.out.print("Welcome to the Student Manager Utility!\n");
        
        while(continuity == true) {
            
        System.out.print("Please select one of the following options by entering the digit that is assigned.\n\n");
        System.out.println("1 - Create a new student.");
        System.out.println("2 - Delete a student.");
        System.out.println("3 - Search for a student.");
        System.out.println("4 - List all Students.");
        System.out.println("--------ASSIGNMENTS--------");
        System.out.println("5 - Create a new assignment.");
        System.out.println("6 - Delete a assignment.");
        System.out.println("7 - Search for a assignment.");
        System.out.println("8 - List all Assignments.");
        System.out.println("9 - Save all progress.");
        System.out.println("0 - Exit Program.");
        
        
        
        System.out.print("\nYour choice: ");
        selection = scanner.nextInt();
        
        
        // From this point to the next comment line, these are all related to student objects.
        
        if(selection == 1) {
            
            System.out.println("You have selected to create a new Student.");
            
            System.out.print("\n\nWhat is the first name of the student? ");
            placeholder_fname = scanner.next();
                
            System.out.print("What is the last name of the student? ");
            placeholder_lname = scanner.next();
                
            System.out.print("What is the year of the student? ");
            placeholder_year = scanner.nextInt();
                
            System.out.print("What is the year group of the year? ");
            placeholder_yeargrp = scanner.next();
                
            System.out.print("What is the supervisor of the student? ");
            placeholder_supervisor = scanner.next();
                
            listS.add(placeholder_fname, placeholder_lname, placeholder_year, placeholder_yeargrp, placeholder_supervisor);
                
            listS.displayStudents();
            
            
            
        }
        
        if(selection == 2) {
            
            System.out.println("Which student would you like to delete? ");
            
            listS.displayStudents();
            
            System.out.print("\nStudent ID: ");
            placeholder_studentID = scanner.nextInt();
            
            listS.delete_S(placeholder_studentID);
            //TO BE COMPLETED, STUDENT DELETION METHOD.
            
            System.out.println("\n\nWe have deleted the student.");
            
        }
        
        if(selection == 3) {
            
            System.out.println("You have selected to search for a student.");
            
            System.out.println("Please enter the first name of the student of which you are searching for.");
            String search_Input = scanner.next();

            listS.studentSearch_fName(search_Input);
            
            
        }
        
        if(selection == 4) {
            
            System.out.println("Here's the list of students that you have...");
            listS.displayStudents();
            
        }
        
        //From this point onwards, the selection methods are for assignment objects.
        
        if(selection == 5) {
            
            System.out.println("You have selected to create a new assignment.");
            
            System.out.print("\nWhat is the assignment name? ");
            placeholder_assignmentName = scanner.next();
            
            System.out.print("\nWhen would you like to set the due date to? (DD/MM/YY) ");
            placeholder_date = scanner.next();
            String delimeter = "/";
            
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();

                try {
                    date = df.parse(placeholder_date);
                    
                    System.out.println(df.format(date));
                    System.out.println(date);
                    
                } catch (ParseException ex) {
                    System.out.println("Something went wrong.");
                }
            
            
            listA.add(placeholder_assignmentName, date);
            

            
            
            System.out.println("We have added the assignment into the database.");
            
        }
        
        if(selection == 6) {
            
            System.out.println("Which assignment would you like to delete? ");
            
            listA.displayAssignments();
            
            System.out.print("\nAssignment ID: ");
            placeholder_assignID = scanner.nextInt();
            
            //TO BE COMPLETED, ASSIGNMENT DELETION.
            
            System.out.println("\nWe have deleted the assignment.");
            
            
        }

        if(selection == 8) {
            
            System.out.println("Here's the list of assignments that you have added into the database...");
            listA.displayAssignments();
        }
        
        if(selection == 9) {
           
            listA.saveAll_Assignments(filename_A);
            listS.saveAll_Students(filename_S);
            
            System.out.println("We are saving the files... Please give us a few seconds...");
            System.out.println("Saving complete.");
            
        }
         
        if(selection == 0) {
            
            System.out.println("Goodbye.");
            continuity = false;
            System.exit(0);
            
        }
        
    
        System.out.print("Would you like to continue? (Y/N)");
        String input_continue = scanner.next();
        
        if(input_continue.equalsIgnoreCase("y")) {
            
            continuity = true;
            
        }
        
        if(input_continue.equalsIgnoreCase("n")) {
            
            continuity = false;
            
        } else {
            
            System.out.println("Error.");
            
        }
     
        
    }
        
        
    }
    
}
