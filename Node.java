/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dossier;

import java.util.Date;

/**
 * @CandidateName Chan Jian Ann Daniel
 * @school Dulwich College Beijing
 * @Date 01/03/2013 (DD/MM/YYYY)
 * @CandidateNumber 003434-004
 * @ComputerUsed Macbook Pro Retina 15 Inch Mid 2012, Mac OSX 10.8.2
 * @ComputerUsed Windows 7 Ultimate 64 Bit, Windows 8 Professional 64 Bit
 * @IDE Netbeans IDE 7.2
 * @Program Coursework Management System (CMS)
 * @Purpose To assist teachers in managing their student's courseworks.
 * It allows teachers to see which assignments are assigned to the students.
 */
public class Node {
    
    
    // The following is for the Student LIST.
    int id;
    String f_name;
    String l_name;
    int year;
    String yr_group;
    String Supervisor;
    String Assignment1;
    String Assignment2;
    String Assignment3;    
    
    //The following is for the Assignments LIST.
    String assignment_name;
    int day;
    int month;
    int year_A;    
    
    
    
    //Jumping to the next node on the LinkedList.
    Node next;
    
    
}
