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
 * @Purpose To assist teachers in managing their student's courseworks/assignments.
 * It allows teachers to see which assignments are assigned to the students.
 */
import java.util.*;
import java.io.*;

public class LinkedLists extends Node {

    Node head = null;
    Node tail = null;
    public int counter_s = 0;
    public int counter_a = 0; //Starts from 1 because 0 is reserved for the event when there is no assignments assigned to student.
    String when_Found = "Found the following...";
    String when_notFound = "Did not find any students. ";

    // DateFormat df = new SimpleDateFormat("dd MM YY");
    Date date;
    Calendar cal_assign = new GregorianCalendar();

    public void add(String assignment_Name, int Day, int Month, int Year) {

        Node newNode = new Node();
        Node current = new Node();

        current = head;

        if (head == null) {

            head = newNode;
            tail = newNode;

            newNode.id = counter_a;
            newNode.assignment_name = assignment_Name;
            newNode.day = Day;
            newNode.month = Month;
            newNode.year_A = Year;
            newNode.next = null;

            counter_a++;


        } else if (counter_a < head.id) {

            newNode.id = counter_a;
            newNode.assignment_name = assignment_Name;
            newNode.day = Day;
            newNode.month = Month;
            newNode.year_A = Year;
            newNode.next = head;
            head = newNode;

            counter_a++;

        } else if (counter_a > tail.id) {

            newNode.id = counter_a;
            newNode.assignment_name = assignment_Name;
            newNode.day = Day;
            newNode.month = Month;
            newNode.year_A = Year;
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;

            counter_a++;


        } else {

            while (current != tail) {

                if (counter_a > current.id && counter_a < current.next.id) {

                    newNode.id = counter_a;
                    newNode.assignment_name = assignment_Name;
                    newNode.day = Day;
                    newNode.month = Month;
                    newNode.year_A = Year;
                    newNode.next = current.next;
                    current.next = newNode;
                    current = tail;
                    counter_a++;


                } else {

                    current = current.next;
                    System.out.println("Done.");

                }



            }



        }



    }

    public void add(String F_Name, String L_Name, int year, String yr_grp, String Supervisor_N, String assignmentID_1, String assignmentID_2, String assignmentID_3) {

        Node newNode = new Node();
        Node current = new Node();

        current = head;

        if (head == null) {

            head = newNode;
            tail = newNode;

            newNode.id = counter_s;
            //WHERE I LEFT OFF.
            newNode.f_name = F_Name;
            newNode.l_name = L_Name;
            newNode.year = year;
            newNode.yr_group = yr_grp;
            newNode.Supervisor = Supervisor_N;
            newNode.Assignment1 = assignmentID_1;
            newNode.Assignment2 = assignmentID_2;
            newNode.Assignment3 = assignmentID_3;
            newNode.next = null;

            counter_s++;


        } else if (counter_s < head.id) {

            newNode.id = counter_s;
            newNode.f_name = F_Name;
            newNode.l_name = L_Name;
            newNode.year = year;
            newNode.yr_group = yr_grp;
            newNode.Supervisor = Supervisor_N;
            newNode.Assignment1 = assignmentID_1;
            newNode.Assignment2 = assignmentID_2;
            newNode.Assignment3 = assignmentID_3;
            newNode.next = head;
            head = newNode;

            counter_s++;

        } else if (counter_s > tail.id) {

            newNode.id = counter_s;
            newNode.f_name = F_Name;
            newNode.l_name = L_Name;
            newNode.year = year;
            newNode.yr_group = yr_grp;
            newNode.Supervisor = Supervisor_N;
            newNode.Assignment1 = assignmentID_1;
            newNode.Assignment2 = assignmentID_2;
            newNode.Assignment3 = assignmentID_3;
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;

            counter_s++;


        } else {

            while (current != tail) {

                if (counter_s > current.id && counter_s < current.next.id) {

                    newNode.id = counter_s;
                    newNode.f_name = F_Name;
                    newNode.l_name = L_Name;
                    newNode.year = year;
                    newNode.yr_group = yr_grp;
                    newNode.Supervisor = Supervisor_N;
                    newNode.Assignment1 = assignmentID_1;
                    newNode.Assignment2 = assignmentID_2;
                    newNode.Assignment3 = assignmentID_3;
                    newNode.next = current.next;
                    current.next = newNode;
                    current = tail;

                    counter_s++;


                } else {

                    current = current.next;


                }



            }



        }



    }


    
    /*public int Search(String name){
        boolean found = false;
        Node current = new Node();
        Node tempMember = new Node();
        tempMember = null;
        current = head;
        System.out.println(name);
        while(!found && current.next != null){
        String delName = current.name +current.name();
        if(delName.trim().equalsIgnoreCase(name.trim())){
        found = true;
        return current.id;
        }else{
        tempMember = current;
        current = current.next;
        }
        }
        if((current.name+current.getLastName()).trim().equalsIgnoreCase(name.trim())&&(current == head&&current == tail)){
        return current.getID(); //only one in the list
        }else if ((current.getName()+current.getLastName()).trim().equalsIgnoreCase(name)&& current == tail){
        return current.getID();
        }else if(found&&current == head){
        return current.getID();
        }
        return -1;
        }*/
    
    
    
    public void delete_S(int d){
        
        boolean found = false;
        Node current = new Node();
        
        Node temp = new Node();
        temp = null;
        
        current = head;
        while(!found && current.next != null){
            if(current.id == d){
                found = true;
            }else{
                temp = current;
                current = current.next;
            }
        }
        
        if(current.id == d && (current == head && current == tail)){
            
            head = null;
            tail = null;
            counter_s--;
            
        }else if(current.id == d && (current == tail)){
            
            tail = temp;
            temp.next = null;
            counter_s--;

        }else if(found && current == head){
            
            head = current.next;
            counter_s--;
            
        }else if(found){
            
            temp.next = current.next;
            counter_s--;
            
        }else{
            
            System.out.println("Unable to find the requested ID.");
            
        }
    }
    
    public void delete_A(int d){
        
        boolean found = false;
        Node current = new Node();
        
        Node temp = new Node();
        
        temp = null;
        current = head;
        
        while(!found && current.next != null){
            if(current.id == d){
                found = true;
            }else{
                temp = current;
                current = current.next;
            }
        }
        if(current.id == d && (current == head && current == tail)){
            
            head = null;
            tail = null;
            counter_a--;
            
        }else if(current.id == d && (current == tail)){
            
            tail = temp;
            temp.next = null;
            counter_a--;
            
        }else if(found && current == head){
            
            head = current.next;
            counter_a--;
            
        }else if(found){
            
            temp.next = current.next;
            counter_a--;
            
        }else{
            System.out.println("Unable to find the requested ID.");
        }
    } 


//Search methods for the Student Linked List. (By first name, year, supervisor, assignments)

    public String studentSearch_fName(String input_FNAME) { //This will produce a sequential search of the list, looking for the correct names and returning the ID of the student.

        Node current = new Node();
        current = head;

        int counter_Search = 0;
        String temp_results = "";

        boolean continuity = true;
        
        while (continuity == true) {

            if (current.f_name.equalsIgnoreCase(input_FNAME)) {

                System.out.println("Found at ID: " + current.id);
                temp_results = temp_results + "ID: " + current.id + " | First Name: " + current.f_name + " | Last Name: " + current.l_name + " | Year: " + current.year + " | Year Group: " + current.yr_group + " | Supervisor: " + current.Supervisor + "| Assignments: " + current.Assignment1 + current.Assignment2 + current.Assignment3 + "\n";
                

                counter_Search++;
                current = current.next;

            } else if (counter_Search == counter_s) {

                continuity = false;

            } else {

                counter_Search++;
                current = current.next;



            }

        }
        
        return null;
        
    }
    
    
    public String studentSearch_Year(int input_Year) { //Produce a sequential search by looking at the year of the student. Displaying the students who fall under the criteria.
        
        Node current = new Node();
        current = head;
        
        String temp_results = "";

        int counter_Search = 0;

        boolean continuity = true;

        while (continuity == true) {

            if (current.year == input_Year) {

                System.out.println("Found at ID: " + current.id);
                temp_results = temp_results + "ID: " + current.id + " | First Name: " + current.f_name + " | Last Name: " + current.l_name + " | Year: " + current.year + " | Year Group: " + current.yr_group + " | Supervisor: " + current.Supervisor + "| Assignments: " + current.Assignment1 + current.Assignment2 + current.Assignment3 + "\n";
                

                counter_Search++;
                current = current.next;

            } else if (counter_Search == counter_s) {

                continuity = false;

            } else {

                counter_Search++;
                current = current.next;



            }

        }  
        
        return temp_results;
        
    }
    
    
    public String studentSearch_Supervisor(String supervisor_name) { //Performs a sequential search on the students linked list by looking at the supervisor field and displaying the students who have a specific supervisor.
        
        Node current = new Node();
        current = head;
        
        String temp_results = "";
        int counter_Search = 0;

        boolean continuity = true;

        while (continuity == true) {

            if (current.Supervisor.equalsIgnoreCase(supervisor_name)) {

                System.out.println("Found at ID: " + current.id);
                temp_results = temp_results + "ID: " + current.id + " | First Name: " + current.f_name + " | Last Name: " + current.l_name + " | Year: " + current.year + " | Year Group: " + current.yr_group + " | Supervisor: " + current.Supervisor + "| Assignments: " + current.Assignment1 + current.Assignment2 + current.Assignment3 + "\n";
                

                counter_Search++;
                current = current.next;

            } else if (counter_Search == counter_s) {

                continuity = false;

            } else {

                counter_Search++;
                current = current.next;



            }

        }
        
        return temp_results;
        
    }
    

    
    public String studentSearch_ASSIGNID(String ID) {
        
        Node current = new Node();
        current = head;
        
        int counter_Search = 0;
        String temp_results = "";
        boolean continuity = true;

        while (continuity == true) {

            if ((current.Assignment1.equalsIgnoreCase(ID)) || (current.Assignment2.equalsIgnoreCase(ID)) || (current.Assignment3.equalsIgnoreCase(ID))) {

                System.out.println("Found at ID: " + current.id);
                temp_results = temp_results + "ID: " + current.id + " | First Name: " + current.f_name + " | Last Name: " + current.l_name + " | Year: " + current.year + " | Year Group: " + current.yr_group + " | Supervisor: " + current.Supervisor + "| Assignments: " + current.Assignment1 + current.Assignment2 + current.Assignment3 + "\n";
                
                continuity = false;
                
            } else if (counter_Search == counter_s) {

                continuity = false;

            } else {

                counter_Search++;
                current = current.next;



            }

        }  
        return temp_results;
        
    }
    
    public String studentSearch_ID(String ID) {
        
        Node current = new Node();
        current = head;
        
        String unable = "Not found.";
        String temp_Item = "";
        
        int counter_Search = 0;

        boolean continuity = true;

        while (continuity == true) {

            if (current.id == Integer.parseInt(ID)) {

                System.out.println("Found at ID: " + current.id);
                temp_Item = ("ID: " + current.id + " | First Name: " + current.f_name + " | Last Name: " + current.l_name + " | Year: " + current.year + " | Year Group: " + current.yr_group + " | Supervisor: " + current.Supervisor + "| Assignments: " + current.Assignment1 + current.Assignment2 + current.Assignment3);
                
                continuity = false;

            } else if (counter_Search == counter_s) {

                continuity = false;

            } else {

                counter_Search++;
                current = current.next;



            }

        }  
        
        return temp_Item;
        
    }
    
    public String assignmentSearch_ID(String ID) {
        
        Node current = new Node();
        current = head;
        
        String unable = "Not found.";
        String temp_Item = "";
        
        int counter_Search = 0;

        boolean continuity = true;

        while (continuity == true) {

            if (current.id == Integer.parseInt(ID)) {

                System.out.println("Found at ID: " + current.id);
                temp_Item = current.assignment_name;
                
                continuity = false;

            } else if (counter_Search == counter_s) {

                continuity = false;

            } else {

                counter_Search++;
                current = current.next;



            }

        }  
        
        return temp_Item;
        
    }
        
    
    public String assignmentSearch_NAME(String NAME) {
        
        Node current = new Node();
        current = head;
        
        String unable = "Not found.";
        String temp_Item = "";
        
        int counter_Search = 0;

        boolean continuity = true;

        while (continuity == true) {

            if (current.assignment_name.equalsIgnoreCase(NAME)) {

                System.out.println("Found at ID: " + current.id);
                temp_Item = ("ID: " + current.id + " | Assignment Name: " + current.assignment_name + " | Assignment Due Date: " + current.day + "/" + current.month + "/" + current.year_A + "\n");
                
                continuity = false;

            } else if (counter_Search == counter_s) {

                continuity = false;

            } else {

                counter_Search++;
                current = current.next;



            }

        }  
        
        return temp_Item;
        
    }    


    public void saveAll_Assignments(String input_FileNameA) {

        try {

            FileWriter newFile = new FileWriter(input_FileNameA);
            BufferedWriter output = new BufferedWriter(newFile);

            Node current = new Node();
            current = head;

            for (int loop_A = 1; loop_A < counter_a; loop_A++) {

                output.write(current.assignment_name + "\n");
                output.write(current.day + "\n");
                output.write(current.month + "\n");
                output.write(current.year_A + "\n");


                current = current.next;

            }
            output.close();

        } catch (Exception e) {
            
            System.out.println("Something went wrong!");
            
        }

    }
    
    public void saveAll_Students(String input_FileNameS) {

        try {

            FileWriter newFile = new FileWriter(input_FileNameS);
            BufferedWriter output = new BufferedWriter(newFile);

            Node current = new Node();
            current = head;

            for (int loop_S = 0; loop_S < counter_s; loop_S++) {

                output.write(current.f_name + "\n");
                output.write(current.l_name + "\n");
                output.write(current.year + "\n");
                output.write(current.yr_group + "\n");
                output.write(current.Supervisor + "\n");
                output.write(current.Assignment1 + "\n");
                output.write(current.Assignment2 + "\n");
                output.write(current.Assignment3 + "\n");
                current = current.next;

            }
            output.close();
        } catch (Exception e) {
        }

    }
    
    public void readAll_Students() {
        
        try {
            
            BufferedReader in_student = new BufferedReader(new FileReader("students.dat"));
        
            while(in_student.ready()) { //Reading in the students data from students.dat file. (Sequentially)
            
            String student_fname_temp;
            String student_lname_temp;
            String student_yrgrp_temp;
            String student_supervisor_temp;
            int student_year_temp;
            String student_assignments_1, student_assignments_2, student_assignments_3;
            
            

            student_fname_temp = (in_student.readLine());
            student_lname_temp = (in_student.readLine());
            student_year_temp = Integer.parseInt(in_student.readLine());
            student_yrgrp_temp = (in_student.readLine());
            student_supervisor_temp = (in_student.readLine());
            student_assignments_1 = (in_student.readLine());
            student_assignments_2 = (in_student.readLine());
            student_assignments_3 = (in_student.readLine());
            
            
            add(student_fname_temp, student_lname_temp, student_year_temp, student_yrgrp_temp, student_supervisor_temp, student_assignments_1, student_assignments_2, student_assignments_3);
            
            }
            
            
            
        } catch(Exception e) {
            
            System.out.println(e.getStackTrace());
            
        }
        
    }
    
    public void readAll_Assignments() {
        
        try {
            
            BufferedReader in_assign = new BufferedReader(new FileReader("assignments.dat"));
            
            
            while(in_assign.ready()) {
                
            
            String assignment_name_temp;
            int assignment_month_temp;
            int assignment_day_temp;
            int assignment_year_temp;
            
            
            assignment_name_temp = in_assign.readLine();
            assignment_month_temp = Integer.parseInt(in_assign.readLine());
            assignment_day_temp = Integer.parseInt(in_assign.readLine());
            assignment_year_temp = Integer.parseInt(in_assign.readLine());
            
            add(assignment_name_temp, assignment_day_temp, assignment_month_temp, assignment_year_temp);
            
            
            }
            
        } catch(Exception e) {
            
            System.out.println(e.getStackTrace());
            
        }
        
        
    }
    
    
    public void displayStudents() {

        Node current = new Node();
        current = head;

        while (current != null) {

            System.out.print("ID: " + current.id + " | First Name: " + current.f_name + " | Last Name: " + current.l_name + " | Year: " + current.year + " | YearGroup: " + current.yr_group + " | Supervisor: " + current.Supervisor + "\n");
            current = current.next;
        }

        System.out.println("\nEnd of List.");

    }

    public void displayAssignments() {

        Node current = new Node();
        current = head;

        while (current != null) {

            System.out.print("ID: " + current.id + " | Assignment Name: " + current.assignment_name + " | Due Date: " + current.day + "/" + current.month + "/" + current.year_A + "\n");
            current = current.next;
        }

        System.out.println("\nEnd of list.");
    }
}
