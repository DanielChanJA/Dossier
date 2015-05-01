/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dossier;

/**
 *
 * @CandidateName Chan Jian Ann Daniel
 * @school Dulwich College Beijing
 * @Date 01/03/2013 (DD/MM/YYYY)
 * @CandidateNumber 003434-004
 * @ComputerUsed Macbook Pro Retina 15 Inch Mid 2012
 * @IDE Netbeans IDE 7.2
 * @Program Coursework Management System (CMS)
 * @Purpose To assist teachers in managing their student's courseworks.
 * It allows teachers to see which assignments are assigned to the students.
 * 
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class gui_main extends javax.swing.JFrame {
    
    //Variable Declaration
    private JButton ADD_ASSIGNMENT_BUTTON;
    private JButton ADD_ASSIGNMENT_DIALOG_BUTTON;
    private JButton ADD_STUDENT_DIALOG;
    private JLabel ASSIGNMENTNAME_LABEL;
    private JLabel ASSIGNMENT_NAME_LABEL_DIALOG;
    private JTextField ASSIGNMENT_NAME_TXTFIELD_DIALOG;
    private JButton ASSIGNMENT_SEARCH_BUTTON_DIALOG;
    private JTextField ASSIGNMENT_TXTFIELD_DIALOG;
    private JLabel ASSIGN_LABEL_1;
    private JLabel ASSIGN_LABEL_2;
    private JLabel ASSIGN_LABEL_3;
    private JTextField ASSIGN_TXT_1;
    private JTextField ASSIGN_TXT_2;
    private JTextField ASSIGN_TXT_3;
    private JMenu About;
    private JButton Add_Student_Button;
    private JDialog Assignment_ADD_DIALOG;
    private JTable Assignments_Table;
    private JPanel BUTTONS;
    private JPanel Buttons_Add_Remove_Section;
    private JButton CLEAR_ALL_DIALOG;
    private JLabel COPYRIGHT_LABEL;
    private JLabel ConfirmationExitUIMessage;
    private JLabel ConfirmationLabel_Assignment;
    private JLabel ConfirmationLabel_S;
    private JDialog Confirmation_Assignment;
    private JDialog Confirmation_CloseProgram;
    private JDialog Confirmation_Student;
    private JMenuItem Contact_MI;
    private JButton Continue_SuccessDialog;
    private JLabel DATEDUE_LABEL;
    private JTextField DDMMYYYY_TXTFIELD;
    private JLabel DELETE_ASSIGNMENTNAME_LABEL;
    private JDialog DELETE_ASSIGNMENT_DIALOG;
    private JButton DELETE_ASSIGNMENT_DIALOG_BUTTON;
    private JButton DELETE_BUTTON_STUDENT_DIALOG;
    private JDialog DELETE_STUDENT_DIALOG;
    private JButton Delete_ASSIGNMENT_BUTTON;
    private JButton Delete_Student_Function;
    private JMenuItem ExitButton;
    private JLabel F_NAME_LABEL_DIALOG;
    private JTextField F_NAME_TXTFIELD_DIALOG;
    private JLabel FailedUEDialogMessage;
    private JDialog Failed_Dialog_UE;
    private JMenu File_MenuBar;
    private JTextField ID_DELETE_STUDENT;
    private javax.swing.JTextField INPUT_ASSIGNMENT_DELETE_ID;
    private JPanel IO;
    private JTabbedPane JTable_Panel;
    private JLabel L_NAME_LABEL_DIALOG;
    private JTextField L_NAME_TXT_FIELD_DIALOG;
    private JMenuBar MenuBar;
    private JButton NO_OPTION_DIALOG_A;
    private JButton NO_OPTION_DIALOG_S;
    private JButton No_ExitProgram;
    private JComboBox Options_SS;
    private JTextArea Results_Assignment_Field;
    private JLabel Results_Assignment_Label;
    private JLabel Results_Label;
    private JTextArea Results_Student_Field;
    private JDialog SEARCH_ASSIGNMENTS_RESULTS;
    private JDialog SEARCH_ASSIGNMENT_DIALOG;
    private JButton SEARCH_BUTTON_DIALOG;
    private JDialog SEARCH_STUDENT_DIALOG;
    private JDialog SEARCH_STUDENT_RESULTS;
    private JLabel STUDENT_LABEL_DELETE_DIALOG;
    private JLabel STUDENT_NAME_LABEL_SEARCH;
    private JLabel SUPERVISOR_DIALOG;
    private JTextField SUPERVISOR_TXTFIELD_DIALOG;
    private JMenuItem SaveButton;
    private JLabel Save_All_Success;
    private JButton Search_Assignment_JF;
    private JTextField Search_Item;
    private JLabel Search_Item_Label;
    private JButton Search_Student_JF;
    private JDialog Student_ADD_DIALOG;
    private JTable Student_Table;
    private JDialog Success_Dialog;
    private JLabel VERSION_LABEL;
    private JLabel WELCOME_LABEL_;
    private JLabel YEAR_LABEL_DIALOG;
    private JButton YES_OPTION_DIALOG_A;
    private JButton YES_OPTION_DIALOG_S;
    private JTextField YRGRP_TXTFIELD_DIALOG;
    private JLabel YR_GROUP_LABEL_DIALOG;
    private JTextField YR_TXTFIELD_DIALOG;
    private JButton Yes_ExitProgram;
    private JPanel jPanel5;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    //End of Variable Declaration
    
    
    //Initialization on the variables used in this specific class.
    int selection, age, supervisor, subject;
        
    boolean continuity;
        
    int input = 0;
    String placeholder_fname, placeholder_lname, placeholder_yeargrp, placeholder_supervisor;
    int placeholder_year, placeholder_studentID;
        
    String placeholder_assignmentName;
    String placeholder_date;
    
    int globalcounter_ID_S = 0, globalcounter_ID_A = 0;
        
        
    String filename_S = "students.dat";
    String filename_A = "assignments.dat";
        
    int day = 0, month = 0, year = 0, placeholder_assignID, counter = 0;
        
    public static LinkedLists listS = new LinkedLists();// Initializing the linkedlists.
    public static LinkedLists listA = new LinkedLists();// Initializing the linkedlists.
    
    public static DefaultTableModel tablemodel;
            
    
    DefaultTableModel table_S = new DefaultTableModel();
    DefaultTableModel table_A = new DefaultTableModel();
    
    Scanner scanner = new Scanner(System.in);
    //End of initialization.
    
    
    public gui_main() {
        
        
        initComponents();
        
  
        Student_Table.setModel(table_S);
        Assignments_Table.setModel(table_A);
        
        //Initializing the Column Headers for Students Table
        table_S.addColumn((Object) "ID");
        table_S.addColumn((Object) "First Name");
        table_S.addColumn((Object) "Last Name");
        table_S.addColumn((Object) "Year");
        table_S.addColumn((Object) "Year Group");
        table_S.addColumn((Object) "Supervisor");
        table_S.addColumn((Object) "Assignment #1");
        table_S.addColumn((Object) "Assignment #2");
        table_S.addColumn((Object) "Assignment #3");
        
        //Initializing the Column Headers for Assignments Table
        table_A.addColumn((Object) "ID");
        table_A.addColumn((Object) "Assignment Name");
        table_A.addColumn((Object) "Due Date (MONTH)");
        table_A.addColumn((Object) "Due Date (DAY)  ");
        table_A.addColumn((Object) "Due Date (YEAR) ");
        
        //Initializing the Combo Box Items
        Options_SS.addItem((Object) "Search by Student ID.");
        Options_SS.addItem((Object) "Search by Student First Name.");
        Options_SS.addItem((Object) "Search by Assignment ID.");
        Options_SS.addItem((Object) "Search by Year.");
        
        //Any other amendments that need to be made to the fields/labels.
        ASSIGN_TXT_1.setText("-1");
        ASSIGN_TXT_2.setText("-1");
        ASSIGN_TXT_3.setText("-1");
        
        
        //Reading in the pre-existing data. As well as populating the tables.
        for(int i = 0; i <= counter; i++) {
            
        try {
            
            BufferedReader in_student = new BufferedReader(new FileReader("students.dat"));
            BufferedReader in_assign = new BufferedReader(new FileReader("assignments.dat"));
            
            System.out.println("We are currently reading in the existing data.");
        
        while(in_student.ready()) { //Reading in the students data from students.dat file. (Sequentially)
            
            String student_fname_temp;
            String student_lname_temp;
            String student_yrgrp_temp;
            String student_supervisor_temp, student_assignment_1, student_assignment_2, student_assignment_3;
            
            
            int student_year_temp;
            
            

            student_fname_temp = (in_student.readLine());
            student_lname_temp = (in_student.readLine());
            student_year_temp = Integer.parseInt(in_student.readLine());
            student_yrgrp_temp = (in_student.readLine());
            student_supervisor_temp = (in_student.readLine());
            student_assignment_1 = (in_student.readLine());
            student_assignment_2 = (in_student.readLine());
            student_assignment_3 = (in_student.readLine());
            
            table_S.addRow(new Object[] {globalcounter_ID_S, student_fname_temp, student_lname_temp, student_year_temp, student_yrgrp_temp, student_supervisor_temp});
            listS.add(student_fname_temp, student_lname_temp, student_year_temp, student_yrgrp_temp, student_supervisor_temp, student_assignment_1, student_assignment_2, student_assignment_3);            
            globalcounter_ID_S++;
        }  
        
        
        while(in_assign.ready()) { //Reading in the assignments data from assignments.dat file. (Sequentially)
            
            String assignment_name_temp;
            int assignment_month_temp;
            int assignment_day_temp;
            int assignment_year_temp;
            
            
            assignment_name_temp = in_assign.readLine();
            assignment_month_temp = Integer.parseInt(in_assign.readLine());
            assignment_day_temp = Integer.parseInt(in_assign.readLine());
            assignment_year_temp = Integer.parseInt(in_assign.readLine());
            
            table_A.addRow(new Object[] {globalcounter_ID_A, assignment_name_temp, assignment_month_temp, assignment_day_temp, assignment_year_temp});
            listA.add(assignment_name_temp, assignment_day_temp, assignment_month_temp, assignment_year_temp);
            globalcounter_ID_A++;
        }
            
        } catch(FileNotFoundException e) { //Error Handling for File not found
             
            System.out.println("Unable to find the files. Perhaps they aren't created?");
            System.out.println("We are creating fresh new files for use!");
            
            listA.saveAll_Assignments(filename_A);
            listS.saveAll_Students(filename_S);
            
        } catch(IOException e) { //Error handling for IO.
            
            System.out.println("The system encountered an error, please contact the coder.");
            
        }
            
            
            
            
            
        }


        

    } 
    
    
    
    
    
//Start of Generated Code from Netbeans 7.2 IDE
    private void initComponents() {

        Student_ADD_DIALOG = new javax.swing.JDialog();
        IO = new javax.swing.JPanel();
        F_NAME_LABEL_DIALOG = new javax.swing.JLabel();
        L_NAME_LABEL_DIALOG = new javax.swing.JLabel();
        YEAR_LABEL_DIALOG = new javax.swing.JLabel();
        YR_GROUP_LABEL_DIALOG = new javax.swing.JLabel();
        SUPERVISOR_DIALOG = new javax.swing.JLabel();
        F_NAME_TXTFIELD_DIALOG = new javax.swing.JTextField();
        L_NAME_TXT_FIELD_DIALOG = new javax.swing.JTextField();
        YR_TXTFIELD_DIALOG = new javax.swing.JTextField();
        YRGRP_TXTFIELD_DIALOG = new javax.swing.JTextField();
        SUPERVISOR_TXTFIELD_DIALOG = new javax.swing.JTextField();
        ASSIGN_LABEL_1 = new javax.swing.JLabel();
        ASSIGN_TXT_1 = new javax.swing.JTextField();
        ASSIGN_LABEL_2 = new javax.swing.JLabel();
        ASSIGN_TXT_2 = new javax.swing.JTextField();
        ASSIGN_LABEL_3 = new javax.swing.JLabel();
        ASSIGN_TXT_3 = new javax.swing.JTextField();
        BUTTONS = new javax.swing.JPanel();
        ADD_STUDENT_DIALOG = new javax.swing.JButton();
        CLEAR_ALL_DIALOG = new javax.swing.JButton();
        Assignment_ADD_DIALOG = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        ASSIGNMENTNAME_LABEL = new javax.swing.JLabel();
        DATEDUE_LABEL = new javax.swing.JLabel();
        ASSIGNMENT_TXTFIELD_DIALOG = new javax.swing.JTextField();
        DDMMYYYY_TXTFIELD = new javax.swing.JTextField();
        ADD_ASSIGNMENT_DIALOG_BUTTON = new javax.swing.JButton();
        SEARCH_STUDENT_DIALOG = new javax.swing.JDialog();
        STUDENT_NAME_LABEL_SEARCH = new javax.swing.JLabel();
        SEARCH_BUTTON_DIALOG = new javax.swing.JButton();
        Options_SS = new javax.swing.JComboBox();
        Search_Item_Label = new javax.swing.JLabel();
        Search_Item = new javax.swing.JTextField();
        SEARCH_ASSIGNMENT_DIALOG = new javax.swing.JDialog();
        ASSIGNMENT_NAME_LABEL_DIALOG = new javax.swing.JLabel();
        ASSIGNMENT_SEARCH_BUTTON_DIALOG = new javax.swing.JButton();
        ASSIGNMENT_NAME_TXTFIELD_DIALOG = new javax.swing.JTextField();
        DELETE_STUDENT_DIALOG = new javax.swing.JDialog();
        STUDENT_LABEL_DELETE_DIALOG = new javax.swing.JLabel();
        DELETE_BUTTON_STUDENT_DIALOG = new javax.swing.JButton();
        ID_DELETE_STUDENT = new javax.swing.JTextField();
        DELETE_ASSIGNMENT_DIALOG = new javax.swing.JDialog();
        DELETE_ASSIGNMENTNAME_LABEL = new javax.swing.JLabel();
        DELETE_ASSIGNMENT_DIALOG_BUTTON = new javax.swing.JButton();
        INPUT_ASSIGNMENT_DELETE_ID = new javax.swing.JTextField();
        Confirmation_Student = new javax.swing.JDialog();
        ConfirmationLabel_S = new javax.swing.JLabel();
        YES_OPTION_DIALOG_S = new javax.swing.JButton();
        NO_OPTION_DIALOG_S = new javax.swing.JButton();
        Confirmation_Assignment = new javax.swing.JDialog();
        ConfirmationLabel_Assignment = new javax.swing.JLabel();
        YES_OPTION_DIALOG_A = new javax.swing.JButton();
        NO_OPTION_DIALOG_A = new javax.swing.JButton();
        Success_Dialog = new javax.swing.JDialog();
        Save_All_Success = new javax.swing.JLabel();
        Continue_SuccessDialog = new javax.swing.JButton();
        Failed_Dialog_UE = new javax.swing.JDialog();
        FailedUEDialogMessage = new javax.swing.JLabel();
        Confirmation_CloseProgram = new javax.swing.JDialog();
        ConfirmationExitUIMessage = new javax.swing.JLabel();
        Yes_ExitProgram = new javax.swing.JButton();
        No_ExitProgram = new javax.swing.JButton();
        SEARCH_STUDENT_RESULTS = new javax.swing.JDialog();
        Results_Label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Results_Student_Field = new javax.swing.JTextArea();
        SEARCH_ASSIGNMENTS_RESULTS = new javax.swing.JDialog();
        Results_Assignment_Label = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Results_Assignment_Field = new javax.swing.JTextArea();
        COPYRIGHT_LABEL = new javax.swing.JLabel();
        VERSION_LABEL = new javax.swing.JLabel();
        JTable_Panel = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        Assignments_Table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Student_Table = new javax.swing.JTable();
        Buttons_Add_Remove_Section = new javax.swing.JPanel();
        Add_Student_Button = new javax.swing.JButton();
        Delete_Student_Function = new javax.swing.JButton();
        Delete_ASSIGNMENT_BUTTON = new javax.swing.JButton();
        ADD_ASSIGNMENT_BUTTON = new javax.swing.JButton();
        Search_Student_JF = new javax.swing.JButton();
        Search_Assignment_JF = new javax.swing.JButton();
        WELCOME_LABEL_ = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        File_MenuBar = new javax.swing.JMenu();
        SaveButton = new javax.swing.JMenuItem();
        ExitButton = new javax.swing.JMenuItem();
        About = new javax.swing.JMenu();
        Contact_MI = new javax.swing.JMenuItem();

        IO.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        F_NAME_LABEL_DIALOG.setText("First Name:");

        L_NAME_LABEL_DIALOG.setText("Last Name:");

        YEAR_LABEL_DIALOG.setText("Year:");

        YR_GROUP_LABEL_DIALOG.setText("Year Group:");

        SUPERVISOR_DIALOG.setText("Supervisor:");

        YRGRP_TXTFIELD_DIALOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YRGRP_TXTFIELD_DIALOGActionPerformed(evt);
            }
        });

        ASSIGN_LABEL_1.setText("Assignment 1:");

        ASSIGN_LABEL_2.setText("Assignment 2:");

        ASSIGN_LABEL_3.setText("Assignment 3:");

        org.jdesktop.layout.GroupLayout IOLayout = new org.jdesktop.layout.GroupLayout(IO);
        IO.setLayout(IOLayout);
        IOLayout.setHorizontalGroup(
            IOLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(IOLayout.createSequentialGroup()
                .add(IOLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(IOLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(IOLayout.createSequentialGroup()
                            .add(3, 3, 3)
                            .add(F_NAME_LABEL_DIALOG)
                            .add(18, 18, 18)
                            .add(F_NAME_TXTFIELD_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(IOLayout.createSequentialGroup()
                            .addContainerGap()
                            .add(L_NAME_LABEL_DIALOG)
                            .add(18, 18, 18)
                            .add(L_NAME_TXT_FIELD_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(IOLayout.createSequentialGroup()
                            .addContainerGap()
                            .add(IOLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(SUPERVISOR_DIALOG)
                                .add(YR_GROUP_LABEL_DIALOG))
                            .add(18, 18, 18)
                            .add(IOLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(YRGRP_TXTFIELD_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(SUPERVISOR_TXTFIELD_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(IOLayout.createSequentialGroup()
                            .add(IOLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(ASSIGN_LABEL_2)
                                .add(ASSIGN_LABEL_1)
                                .add(ASSIGN_LABEL_3))
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(IOLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(ASSIGN_TXT_1)
                                .add(ASSIGN_TXT_2)
                                .add(ASSIGN_TXT_3))))
                    .add(IOLayout.createSequentialGroup()
                        .add(45, 45, 45)
                        .add(YEAR_LABEL_DIALOG)
                        .add(18, 18, 18)
                        .add(YR_TXTFIELD_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(0, 0, Short.MAX_VALUE))
        );

        IOLayout.linkSize(new java.awt.Component[] {F_NAME_TXTFIELD_DIALOG, L_NAME_TXT_FIELD_DIALOG, SUPERVISOR_TXTFIELD_DIALOG, YRGRP_TXTFIELD_DIALOG, YR_TXTFIELD_DIALOG}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        IOLayout.setVerticalGroup(
            IOLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(IOLayout.createSequentialGroup()
                .add(6, 6, 6)
                .add(IOLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(F_NAME_LABEL_DIALOG)
                    .add(F_NAME_TXTFIELD_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(9, 9, 9)
                .add(IOLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(L_NAME_LABEL_DIALOG)
                    .add(L_NAME_TXT_FIELD_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(8, 8, 8)
                .add(IOLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(YR_TXTFIELD_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(YEAR_LABEL_DIALOG))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(IOLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(YRGRP_TXTFIELD_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(YR_GROUP_LABEL_DIALOG))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(IOLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(SUPERVISOR_TXTFIELD_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(SUPERVISOR_DIALOG))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(IOLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ASSIGN_LABEL_1)
                    .add(ASSIGN_TXT_1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(6, 6, 6)
                .add(IOLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ASSIGN_LABEL_2)
                    .add(ASSIGN_TXT_2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(IOLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ASSIGN_LABEL_3)
                    .add(ASSIGN_TXT_3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        BUTTONS.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        ADD_STUDENT_DIALOG.setText("Add");
        ADD_STUDENT_DIALOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_STUDENT_DIALOGActionPerformed(evt);
            }
        });

        CLEAR_ALL_DIALOG.setText("Clear All");
        CLEAR_ALL_DIALOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEAR_ALL_DIALOGActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout BUTTONSLayout = new org.jdesktop.layout.GroupLayout(BUTTONS);
        BUTTONS.setLayout(BUTTONSLayout);
        BUTTONSLayout.setHorizontalGroup(
            BUTTONSLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(BUTTONSLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(BUTTONSLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, CLEAR_ALL_DIALOG)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, ADD_STUDENT_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        BUTTONSLayout.linkSize(new java.awt.Component[] {ADD_STUDENT_DIALOG, CLEAR_ALL_DIALOG}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        BUTTONSLayout.setVerticalGroup(
            BUTTONSLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(BUTTONSLayout.createSequentialGroup()
                .add(15, 15, 15)
                .add(ADD_STUDENT_DIALOG)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(CLEAR_ALL_DIALOG)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout Student_ADD_DIALOGLayout = new org.jdesktop.layout.GroupLayout(Student_ADD_DIALOG.getContentPane());
        Student_ADD_DIALOG.getContentPane().setLayout(Student_ADD_DIALOGLayout);
        Student_ADD_DIALOGLayout.setHorizontalGroup(
            Student_ADD_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Student_ADD_DIALOGLayout.createSequentialGroup()
                .add(17, 17, 17)
                .add(IO, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(BUTTONS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Student_ADD_DIALOGLayout.setVerticalGroup(
            Student_ADD_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Student_ADD_DIALOGLayout.createSequentialGroup()
                .addContainerGap()
                .add(IO, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, Student_ADD_DIALOGLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(BUTTONS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(103, 103, 103))
        );

        ASSIGNMENTNAME_LABEL.setText("Assignment Name:");

        DATEDUE_LABEL.setText("Date Due:");

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(ASSIGNMENTNAME_LABEL)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(DATEDUE_LABEL)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(ASSIGNMENTNAME_LABEL)
                .add(18, 18, 18)
                .add(DATEDUE_LABEL)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        ASSIGNMENT_TXTFIELD_DIALOG.setText("Assignment Name");
        ASSIGNMENT_TXTFIELD_DIALOG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ASSIGNMENT_TXTFIELD_DIALOGMouseClicked(evt);
            }
        });


        DDMMYYYY_TXTFIELD.setText("MM/DD/YYYY");

        ADD_ASSIGNMENT_DIALOG_BUTTON.setText("Add Assignment");
        ADD_ASSIGNMENT_DIALOG_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_ASSIGNMENT_DIALOG_BUTTONActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout Assignment_ADD_DIALOGLayout = new org.jdesktop.layout.GroupLayout(Assignment_ADD_DIALOG.getContentPane());
        Assignment_ADD_DIALOG.getContentPane().setLayout(Assignment_ADD_DIALOGLayout);
        Assignment_ADD_DIALOGLayout.setHorizontalGroup(
            Assignment_ADD_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Assignment_ADD_DIALOGLayout.createSequentialGroup()
                .add(Assignment_ADD_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Assignment_ADD_DIALOGLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(Assignment_ADD_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(ASSIGNMENT_TXTFIELD_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(DDMMYYYY_TXTFIELD, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(Assignment_ADD_DIALOGLayout.createSequentialGroup()
                        .add(74, 74, 74)
                        .add(ADD_ASSIGNMENT_DIALOG_BUTTON)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Assignment_ADD_DIALOGLayout.linkSize(new java.awt.Component[] {ASSIGNMENT_TXTFIELD_DIALOG, DDMMYYYY_TXTFIELD}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        Assignment_ADD_DIALOGLayout.setVerticalGroup(
            Assignment_ADD_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Assignment_ADD_DIALOGLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .add(Assignment_ADD_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Assignment_ADD_DIALOGLayout.createSequentialGroup()
                        .add(ASSIGNMENT_TXTFIELD_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(DDMMYYYY_TXTFIELD, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(ADD_ASSIGNMENT_DIALOG_BUTTON)
                .add(12, 12, 12))
        );

        STUDENT_NAME_LABEL_SEARCH.setText("Student Search Type:");

        SEARCH_BUTTON_DIALOG.setText("Search");
        SEARCH_BUTTON_DIALOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCH_BUTTON_DIALOGActionPerformed(evt);
            }
        });

        Options_SS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        Options_SS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Options_SSActionPerformed(evt);
            }
        });

        Search_Item_Label.setText("Search Item:");

        Search_Item.setText("Type what you'd like to search for.");

        org.jdesktop.layout.GroupLayout SEARCH_STUDENT_DIALOGLayout = new org.jdesktop.layout.GroupLayout(SEARCH_STUDENT_DIALOG.getContentPane());
        SEARCH_STUDENT_DIALOG.getContentPane().setLayout(SEARCH_STUDENT_DIALOGLayout);
        SEARCH_STUDENT_DIALOGLayout.setHorizontalGroup(
            SEARCH_STUDENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(SEARCH_STUDENT_DIALOGLayout.createSequentialGroup()
                .add(12, 12, 12)
                .add(SEARCH_STUDENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(Search_Item_Label)
                    .add(STUDENT_NAME_LABEL_SEARCH))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(SEARCH_STUDENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(SEARCH_STUDENT_DIALOGLayout.createSequentialGroup()
                        .add(SEARCH_STUDENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(Options_SS, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(SEARCH_STUDENT_DIALOGLayout.createSequentialGroup()
                                .add(Search_Item, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, Short.MAX_VALUE)))
                        .add(12, 12, 12))
                    .add(SEARCH_STUDENT_DIALOGLayout.createSequentialGroup()
                        .add(11, 11, 11)
                        .add(SEARCH_BUTTON_DIALOG)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        SEARCH_STUDENT_DIALOGLayout.setVerticalGroup(
            SEARCH_STUDENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(SEARCH_STUDENT_DIALOGLayout.createSequentialGroup()
                .add(28, 28, 28)
                .add(SEARCH_STUDENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(STUDENT_NAME_LABEL_SEARCH)
                    .add(Options_SS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(SEARCH_STUDENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Search_Item_Label)
                    .add(Search_Item, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(45, 45, 45)
                .add(SEARCH_BUTTON_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        ASSIGNMENT_NAME_LABEL_DIALOG.setText("Assignment Name:");

        ASSIGNMENT_SEARCH_BUTTON_DIALOG.setText("Search");
        ASSIGNMENT_SEARCH_BUTTON_DIALOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASSIGNMENT_SEARCH_BUTTON_DIALOGActionPerformed(evt);
            }
        });

        ASSIGNMENT_NAME_TXTFIELD_DIALOG.setText("Assignment Name");

        org.jdesktop.layout.GroupLayout SEARCH_ASSIGNMENT_DIALOGLayout = new org.jdesktop.layout.GroupLayout(SEARCH_ASSIGNMENT_DIALOG.getContentPane());
        SEARCH_ASSIGNMENT_DIALOG.getContentPane().setLayout(SEARCH_ASSIGNMENT_DIALOGLayout);
        SEARCH_ASSIGNMENT_DIALOGLayout.setHorizontalGroup(
            SEARCH_ASSIGNMENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(SEARCH_ASSIGNMENT_DIALOGLayout.createSequentialGroup()
                .add(SEARCH_ASSIGNMENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(SEARCH_ASSIGNMENT_DIALOGLayout.createSequentialGroup()
                        .add(83, 83, 83)
                        .add(ASSIGNMENT_SEARCH_BUTTON_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 156, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(SEARCH_ASSIGNMENT_DIALOGLayout.createSequentialGroup()
                        .add(23, 23, 23)
                        .add(ASSIGNMENT_NAME_LABEL_DIALOG)
                        .add(18, 18, 18)
                        .add(ASSIGNMENT_NAME_TXTFIELD_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        SEARCH_ASSIGNMENT_DIALOGLayout.setVerticalGroup(
            SEARCH_ASSIGNMENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(SEARCH_ASSIGNMENT_DIALOGLayout.createSequentialGroup()
                .add(48, 48, 48)
                .add(SEARCH_ASSIGNMENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ASSIGNMENT_NAME_LABEL_DIALOG)
                    .add(ASSIGNMENT_NAME_TXTFIELD_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(ASSIGNMENT_SEARCH_BUTTON_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        STUDENT_LABEL_DELETE_DIALOG.setText("Student: ");

        DELETE_BUTTON_STUDENT_DIALOG.setText("Delete");
        DELETE_BUTTON_STUDENT_DIALOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    DELETE_BUTTON_STUDENT_DIALOGActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(gui_main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        ID_DELETE_STUDENT.setText("Insert ID of Student");
        ID_DELETE_STUDENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ID_DELETE_STUDENTMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout DELETE_STUDENT_DIALOGLayout = new org.jdesktop.layout.GroupLayout(DELETE_STUDENT_DIALOG.getContentPane());
        DELETE_STUDENT_DIALOG.getContentPane().setLayout(DELETE_STUDENT_DIALOGLayout);
        DELETE_STUDENT_DIALOGLayout.setHorizontalGroup(
            DELETE_STUDENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(DELETE_STUDENT_DIALOGLayout.createSequentialGroup()
                .add(DELETE_STUDENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(DELETE_STUDENT_DIALOGLayout.createSequentialGroup()
                        .add(35, 35, 35)
                        .add(STUDENT_LABEL_DELETE_DIALOG)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(ID_DELETE_STUDENT, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(DELETE_STUDENT_DIALOGLayout.createSequentialGroup()
                        .add(110, 110, 110)
                        .add(DELETE_BUTTON_STUDENT_DIALOG)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        DELETE_STUDENT_DIALOGLayout.setVerticalGroup(
            DELETE_STUDENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(DELETE_STUDENT_DIALOGLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .add(DELETE_STUDENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(STUDENT_LABEL_DELETE_DIALOG)
                    .add(ID_DELETE_STUDENT, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(29, 29, 29)
                .add(DELETE_BUTTON_STUDENT_DIALOG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18))
        );

        DELETE_ASSIGNMENTNAME_LABEL.setText("Assignment Name:");

        DELETE_ASSIGNMENT_DIALOG_BUTTON.setText("Delete");
        DELETE_ASSIGNMENT_DIALOG_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    DELETE_ASSIGNMENT_DIALOG_BUTTONActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(gui_main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        INPUT_ASSIGNMENT_DELETE_ID.setText("ID of Assignment");
        INPUT_ASSIGNMENT_DELETE_ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                INPUT_ASSIGNMENT_DELETE_IDMouseClicked(evt);
            }
        });


        org.jdesktop.layout.GroupLayout DELETE_ASSIGNMENT_DIALOGLayout = new org.jdesktop.layout.GroupLayout(DELETE_ASSIGNMENT_DIALOG.getContentPane());
        DELETE_ASSIGNMENT_DIALOG.getContentPane().setLayout(DELETE_ASSIGNMENT_DIALOGLayout);
        DELETE_ASSIGNMENT_DIALOGLayout.setHorizontalGroup(
            DELETE_ASSIGNMENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(DELETE_ASSIGNMENT_DIALOGLayout.createSequentialGroup()
                .add(17, 17, 17)
                .add(DELETE_ASSIGNMENTNAME_LABEL)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(INPUT_ASSIGNMENT_DELETE_ID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, DELETE_ASSIGNMENT_DIALOGLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .add(DELETE_ASSIGNMENT_DIALOG_BUTTON, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 139, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(84, 84, 84))
        );
        DELETE_ASSIGNMENT_DIALOGLayout.setVerticalGroup(
            DELETE_ASSIGNMENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(DELETE_ASSIGNMENT_DIALOGLayout.createSequentialGroup()
                .add(41, 41, 41)
                .add(DELETE_ASSIGNMENT_DIALOGLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(DELETE_ASSIGNMENTNAME_LABEL)
                    .add(INPUT_ASSIGNMENT_DELETE_ID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 35, Short.MAX_VALUE)
                .add(DELETE_ASSIGNMENT_DIALOG_BUTTON, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(36, 36, 36))
        );

        ConfirmationLabel_S.setText("Are you sure you want to proceed?");

        YES_OPTION_DIALOG_S.setText("Yes");
        YES_OPTION_DIALOG_S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YES_OPTION_DIALOG_SActionPerformed(evt);
            }
        });

        NO_OPTION_DIALOG_S.setText("No");
        NO_OPTION_DIALOG_S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO_OPTION_DIALOG_SActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout Confirmation_StudentLayout = new org.jdesktop.layout.GroupLayout(Confirmation_Student.getContentPane());
        Confirmation_Student.getContentPane().setLayout(Confirmation_StudentLayout);
        Confirmation_StudentLayout.setHorizontalGroup(
            Confirmation_StudentLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Confirmation_StudentLayout.createSequentialGroup()
                .add(60, 60, 60)
                .add(YES_OPTION_DIALOG_S)
                .add(47, 47, 47)
                .add(NO_OPTION_DIALOG_S)
                .addContainerGap(48, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, Confirmation_StudentLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(ConfirmationLabel_S)
                .add(38, 38, 38))
        );
        Confirmation_StudentLayout.setVerticalGroup(
            Confirmation_StudentLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Confirmation_StudentLayout.createSequentialGroup()
                .add(24, 24, 24)
                .add(ConfirmationLabel_S)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(Confirmation_StudentLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(NO_OPTION_DIALOG_S)
                    .add(YES_OPTION_DIALOG_S))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        ConfirmationLabel_Assignment.setText("Are you sure you want to proceed?");

        YES_OPTION_DIALOG_A.setText("Yes");
        YES_OPTION_DIALOG_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YES_OPTION_DIALOG_AActionPerformed(evt);
            }
        });

        NO_OPTION_DIALOG_A.setText("No");
        NO_OPTION_DIALOG_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO_OPTION_DIALOG_AActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout Confirmation_AssignmentLayout = new org.jdesktop.layout.GroupLayout(Confirmation_Assignment.getContentPane());
        Confirmation_Assignment.getContentPane().setLayout(Confirmation_AssignmentLayout);
        Confirmation_AssignmentLayout.setHorizontalGroup(
            Confirmation_AssignmentLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Confirmation_AssignmentLayout.createSequentialGroup()
                .add(60, 60, 60)
                .add(YES_OPTION_DIALOG_A)
                .add(47, 47, 47)
                .add(NO_OPTION_DIALOG_A)
                .addContainerGap(48, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, Confirmation_AssignmentLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(ConfirmationLabel_Assignment)
                .add(38, 38, 38))
        );
        Confirmation_AssignmentLayout.setVerticalGroup(
            Confirmation_AssignmentLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Confirmation_AssignmentLayout.createSequentialGroup()
                .add(24, 24, 24)
                .add(ConfirmationLabel_Assignment)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(Confirmation_AssignmentLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(NO_OPTION_DIALOG_A)
                    .add(YES_OPTION_DIALOG_A))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        Save_All_Success.setText("Saved Students and Assignments");

        Continue_SuccessDialog.setText("Continue");
        Continue_SuccessDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Continue_SuccessDialogActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout Success_DialogLayout = new org.jdesktop.layout.GroupLayout(Success_Dialog.getContentPane());
        Success_Dialog.getContentPane().setLayout(Success_DialogLayout);
        Success_DialogLayout.setHorizontalGroup(
            Success_DialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Success_DialogLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .add(Success_DialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, Success_DialogLayout.createSequentialGroup()
                        .add(Save_All_Success)
                        .add(29, 29, 29))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, Success_DialogLayout.createSequentialGroup()
                        .add(Continue_SuccessDialog)
                        .add(83, 83, 83))))
        );
        Success_DialogLayout.setVerticalGroup(
            Success_DialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Success_DialogLayout.createSequentialGroup()
                .add(16, 16, 16)
                .add(Save_All_Success)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(Continue_SuccessDialog)
                .addContainerGap())
        );

        FailedUEDialogMessage.setText("Something went terribly wrong!");

        org.jdesktop.layout.GroupLayout Failed_Dialog_UELayout = new org.jdesktop.layout.GroupLayout(Failed_Dialog_UE.getContentPane());
        Failed_Dialog_UE.getContentPane().setLayout(Failed_Dialog_UELayout);
        Failed_Dialog_UELayout.setHorizontalGroup(
            Failed_Dialog_UELayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Failed_Dialog_UELayout.createSequentialGroup()
                .add(42, 42, 42)
                .add(FailedUEDialogMessage)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        Failed_Dialog_UELayout.setVerticalGroup(
            Failed_Dialog_UELayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, Failed_Dialog_UELayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .add(FailedUEDialogMessage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(34, 34, 34))
        );

        ConfirmationExitUIMessage.setText("Are you sure you wish to exit the program?");

        Yes_ExitProgram.setText("Yes");

        No_ExitProgram.setText("No");

        org.jdesktop.layout.GroupLayout Confirmation_CloseProgramLayout = new org.jdesktop.layout.GroupLayout(Confirmation_CloseProgram.getContentPane());
        Confirmation_CloseProgram.getContentPane().setLayout(Confirmation_CloseProgramLayout);
        Confirmation_CloseProgramLayout.setHorizontalGroup(
            Confirmation_CloseProgramLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Confirmation_CloseProgramLayout.createSequentialGroup()
                .add(30, 30, 30)
                .add(Confirmation_CloseProgramLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Confirmation_CloseProgramLayout.createSequentialGroup()
                        .add(39, 39, 39)
                        .add(Yes_ExitProgram)
                        .add(36, 36, 36)
                        .add(No_ExitProgram))
                    .add(ConfirmationExitUIMessage))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        Confirmation_CloseProgramLayout.setVerticalGroup(
            Confirmation_CloseProgramLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Confirmation_CloseProgramLayout.createSequentialGroup()
                .add(33, 33, 33)
                .add(ConfirmationExitUIMessage)
                .add(26, 26, 26)
                .add(Confirmation_CloseProgramLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Yes_ExitProgram)
                    .add(No_ExitProgram))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Results_Label.setText("Results for the Search Query for Students");

        Results_Student_Field.setColumns(20);
        Results_Student_Field.setRows(5);
        jScrollPane1.setViewportView(Results_Student_Field);

        org.jdesktop.layout.GroupLayout SEARCH_STUDENT_RESULTSLayout = new org.jdesktop.layout.GroupLayout(SEARCH_STUDENT_RESULTS.getContentPane());
        SEARCH_STUDENT_RESULTS.getContentPane().setLayout(SEARCH_STUDENT_RESULTSLayout);
        SEARCH_STUDENT_RESULTSLayout.setHorizontalGroup(
            SEARCH_STUDENT_RESULTSLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(SEARCH_STUDENT_RESULTSLayout.createSequentialGroup()
                .add(75, 75, 75)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, SEARCH_STUDENT_RESULTSLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .add(Results_Label, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 274, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(50, 50, 50))
        );
        SEARCH_STUDENT_RESULTSLayout.setVerticalGroup(
            SEARCH_STUDENT_RESULTSLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(SEARCH_STUDENT_RESULTSLayout.createSequentialGroup()
                .add(29, 29, 29)
                .add(Results_Label)
                .add(27, 27, 27)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 177, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        Results_Assignment_Label.setText("Results for Search Query for Assignments");

        Results_Assignment_Field.setColumns(20);
        Results_Assignment_Field.setRows(5);
        jScrollPane4.setViewportView(Results_Assignment_Field);

        org.jdesktop.layout.GroupLayout SEARCH_ASSIGNMENTS_RESULTSLayout = new org.jdesktop.layout.GroupLayout(SEARCH_ASSIGNMENTS_RESULTS.getContentPane());
        SEARCH_ASSIGNMENTS_RESULTS.getContentPane().setLayout(SEARCH_ASSIGNMENTS_RESULTSLayout);
        SEARCH_ASSIGNMENTS_RESULTSLayout.setHorizontalGroup(
            SEARCH_ASSIGNMENTS_RESULTSLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, SEARCH_ASSIGNMENTS_RESULTSLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .add(Results_Assignment_Label)
                .add(61, 61, 61))
            .add(SEARCH_ASSIGNMENTS_RESULTSLayout.createSequentialGroup()
                .add(70, 70, 70)
                .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SEARCH_ASSIGNMENTS_RESULTSLayout.setVerticalGroup(
            SEARCH_ASSIGNMENTS_RESULTSLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(SEARCH_ASSIGNMENTS_RESULTSLayout.createSequentialGroup()
                .add(31, 31, 31)
                .add(Results_Assignment_Label)
                .add(30, 30, 30)
                .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        COPYRIGHT_LABEL.setText("Created by Daniel Chan");

        VERSION_LABEL.setText("Version 1.0A");

        JTable_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Assignments_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Assignment ID", "Assignment Name", "Date Due"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Assignments_Table);

        JTable_Panel.addTab("   Assignments  ", jScrollPane2);

        Student_Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Student_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Year", "Year Group", "Supervisor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Student_Table.setAutoCreateRowSorter(true);
        jScrollPane3.setViewportView(Student_Table);

        JTable_Panel.addTab("       Students      ", jScrollPane3);

        Buttons_Add_Remove_Section.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Add_Student_Button.setText("Add Student");
        Add_Student_Button.setToolTipText("Add a Student into the list.");
        Add_Student_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_Student_ButtonMouseClicked(evt);
            }
        });
        Add_Student_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Student_ButtonActionPerformed(evt);
            }
        });

        Delete_Student_Function.setText("Delete Student");
        Delete_Student_Function.setToolTipText("Delete a student from the table.");
        Delete_Student_Function.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_Student_FunctionActionPerformed(evt);
            }
        });

        Delete_ASSIGNMENT_BUTTON.setText("Delete Assignment");
        Delete_ASSIGNMENT_BUTTON.setToolTipText("Delete a assignment from the table.");
        Delete_ASSIGNMENT_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ASSIGNMENT_BUTTONActionPerformed(evt);
            }
        });

        ADD_ASSIGNMENT_BUTTON.setText("Add Assignment");
        ADD_ASSIGNMENT_BUTTON.setToolTipText("Add an assignment");
        ADD_ASSIGNMENT_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_ASSIGNMENT_BUTTONActionPerformed(evt);
            }
        });

        Search_Student_JF.setText("Search Student");
        Search_Student_JF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Student_JFActionPerformed(evt);
            }
        });

        Search_Assignment_JF.setText("Search Assignment");
        Search_Assignment_JF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Assignment_JFActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout Buttons_Add_Remove_SectionLayout = new org.jdesktop.layout.GroupLayout(Buttons_Add_Remove_Section);
        Buttons_Add_Remove_Section.setLayout(Buttons_Add_Remove_SectionLayout);
        Buttons_Add_Remove_SectionLayout.setHorizontalGroup(
            Buttons_Add_Remove_SectionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Buttons_Add_Remove_SectionLayout.createSequentialGroup()
                .addContainerGap()
                .add(Buttons_Add_Remove_SectionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(Add_Student_Button)
                    .add(ADD_ASSIGNMENT_BUTTON))
                .add(38, 38, 38)
                .add(Buttons_Add_Remove_SectionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Search_Assignment_JF, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(Search_Student_JF, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(25, 25, 25)
                .add(Buttons_Add_Remove_SectionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Delete_Student_Function)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, Delete_ASSIGNMENT_BUTTON))
                .addContainerGap())
        );

        Buttons_Add_Remove_SectionLayout.linkSize(new java.awt.Component[] {ADD_ASSIGNMENT_BUTTON, Add_Student_Button, Delete_ASSIGNMENT_BUTTON, Delete_Student_Function}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        Buttons_Add_Remove_SectionLayout.setVerticalGroup(
            Buttons_Add_Remove_SectionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Buttons_Add_Remove_SectionLayout.createSequentialGroup()
                .add(10, 10, 10)
                .add(Buttons_Add_Remove_SectionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Delete_Student_Function)
                    .add(Add_Student_Button)
                    .add(Search_Student_JF, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(12, 12, 12)
                .add(Buttons_Add_Remove_SectionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Delete_ASSIGNMENT_BUTTON)
                    .add(ADD_ASSIGNMENT_BUTTON)
                    .add(Search_Assignment_JF, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        WELCOME_LABEL_.setText("Welcome to the Coursework Management System");

        File_MenuBar.setText("File");

        SaveButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SaveButton.setText("Save All");

        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        File_MenuBar.add(SaveButton);

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        File_MenuBar.add(ExitButton);

        MenuBar.add(File_MenuBar);

        About.setText("About");

        Contact_MI.setText("Contact");
        About.add(Contact_MI);

        MenuBar.add(About);

        setJMenuBar(MenuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(COPYRIGHT_LABEL)
                            .add(VERSION_LABEL))
                        .add(18, 18, 18)
                        .add(Buttons_Add_Remove_Section, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(212, 212, 212)
                                .add(WELCOME_LABEL_))
                            .add(JTable_Panel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 737, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(WELCOME_LABEL_, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 13, Short.MAX_VALUE)
                .add(JTable_Panel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 417, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(26, 26, 26)
                        .add(COPYRIGHT_LABEL)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(VERSION_LABEL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(Buttons_Add_Remove_Section, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }            
//END OF GENERATED CODE & Start of event handling.
    
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        
        
        System.exit(0);     
        
    }            
    
    private void Options_SSActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void Search_Student_JFActionPerformed(java.awt.event.ActionEvent evt) {
        SEARCH_STUDENT_DIALOG.setVisible(true);
        SEARCH_STUDENT_DIALOG.setSize(392, 250);
        SEARCH_STUDENT_DIALOG.setLocationRelativeTo(null);
        
    }

    private void Search_Assignment_JFActionPerformed(java.awt.event.ActionEvent evt) {
        SEARCH_ASSIGNMENT_DIALOG.setVisible(true);
        SEARCH_ASSIGNMENT_DIALOG.setSize(323, 250);
        SEARCH_ASSIGNMENT_DIALOG.setLocationRelativeTo(null);
    
    }
    
    private void ASSIGNMENT_SEARCH_BUTTON_DIALOGActionPerformed(java.awt.event.ActionEvent evt) {
        
        SEARCH_ASSIGNMENTS_RESULTS.setVisible(true);
        SEARCH_ASSIGNMENTS_RESULTS.setSize(385, 320);
        SEARCH_ASSIGNMENTS_RESULTS.setLocationRelativeTo(null);
        String temp_result = listA.assignmentSearch_NAME(ASSIGNMENT_NAME_TXTFIELD_DIALOG.getText());
        Results_Assignment_Field.append(temp_result);
        
    }
    
    private void SEARCH_BUTTON_DIALOGActionPerformed(java.awt.event.ActionEvent evt) {
        
        String user_option = (String) Options_SS.getSelectedItem();

        if(user_option.equals("Search by Student ID.")) {
            
            SEARCH_STUDENT_RESULTS.setVisible(true);
            SEARCH_STUDENT_RESULTS.setSize(387, 320);
            SEARCH_STUDENT_RESULTS.setLocationRelativeTo(null);
            String temp_result = listS.studentSearch_ID(Search_Item.getText());
            Results_Student_Field.append(temp_result);
            
        
        } else if(user_option.equals("Search by Student First Name.")) {
            
            SEARCH_STUDENT_RESULTS.setVisible(true);
            SEARCH_STUDENT_RESULTS.setSize(387, 320);
            SEARCH_STUDENT_RESULTS.setLocationRelativeTo(null);
            String temp_result = listS.studentSearch_fName(Search_Item.getText());
            Results_Student_Field.append(temp_result);
            
        } else if(user_option.equals("Search by Assignment ID.")) {
            
            SEARCH_STUDENT_RESULTS.setVisible(true);
            SEARCH_STUDENT_RESULTS.setSize(387, 320);
            SEARCH_STUDENT_RESULTS.setLocationRelativeTo(null);
            String temp_result = listS.studentSearch_ASSIGNID(Search_Item.getText());
            Results_Student_Field.append(temp_result);
            
        } else if(user_option.equals("Search by Year.")) {

            SEARCH_STUDENT_RESULTS.setVisible(true);
            SEARCH_STUDENT_RESULTS.setSize(387, 320);
            SEARCH_STUDENT_RESULTS.setLocationRelativeTo(null);            
            String temp_result = listS.studentSearch_Year(Integer.parseInt(Search_Item.getText()));
            Results_Student_Field.append(temp_result);
            
        }
        
        
    }
    
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        listA.saveAll_Assignments(filename_A);
        listS.saveAll_Students(filename_S); 
        
        Success_Dialog.setVisible(true);
        Success_Dialog.setSize(270, 110);
        Success_Dialog.setLocationRelativeTo(null);
        
    }                                          

    private void Add_Student_ButtonActionPerformed(java.awt.event.ActionEvent evt) {  
        
        Student_ADD_DIALOG.setVisible(true);
        Student_ADD_DIALOG.setSize(400, 350);         
        Student_ADD_DIALOG.setLocationRelativeTo(null);
        
    }                                                  
                                     

    private void YRGRP_TXTFIELD_DIALOGActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void Add_Student_ButtonMouseClicked(java.awt.event.MouseEvent evt) {                                                
        
    }                                               

    private void ADD_ASSIGNMENT_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        
        Assignment_ADD_DIALOG.setVisible(true);
        Assignment_ADD_DIALOG.setSize(300, 150); 
        Assignment_ADD_DIALOG.setLocationRelativeTo(null);
        
    }                                                     

    private void Delete_Student_FunctionActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        
        DELETE_STUDENT_DIALOG.setVisible(true);
        DELETE_STUDENT_DIALOG.setSize(290, 150);
        DELETE_STUDENT_DIALOG.setLocationRelativeTo(null);
        
    }                                                       

                                                        

    private void CLEAR_ALL_DIALOGActionPerformed(java.awt.event.ActionEvent evt) { //Clear all. If the user wants to flush all data in the fields.                                             
        
        SUPERVISOR_TXTFIELD_DIALOG.setText(""); 
        F_NAME_TXTFIELD_DIALOG.setText("");
        L_NAME_TXT_FIELD_DIALOG.setText("");
        YR_TXTFIELD_DIALOG.setText("");
        YRGRP_TXTFIELD_DIALOG.setText("");
        ASSIGN_TXT_1.setText("-1");
        ASSIGN_TXT_2.setText("-1");
        ASSIGN_TXT_3.setText("-1");
        
    }      
    
    private void ASSIGNMENT_TXTFIELD_DIALOGMouseClicked(java.awt.event.MouseEvent evt) { 
        
        ASSIGNMENT_TXTFIELD_DIALOG.setText(""); //Clearing the field when the user clicks on it. Instead of clicking backspace to delete the characters inside the field.
        
    }       
    
    private void ADD_ASSIGNMENT_DIALOG_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {
        
        //Confirmation_Assignment.setVisible(true);
        //Confirmation_Assignment.setSize(307, 125);
        //Confirmation_Assignment.setLocationRelativeTo(null);
        
        
        int temp_day, temp_month, temp_year;
        String tempstuff;
        
        temp_day = Integer.parseInt(DDMMYYYY_TXTFIELD.getText().substring(3, 5));
        temp_month = Integer.parseInt(DDMMYYYY_TXTFIELD.getText().substring(0, 2));
        tempstuff = (String) DDMMYYYY_TXTFIELD.getText().subSequence(6, 10);
        temp_year = Integer.parseInt(tempstuff);
        
        
        listA.add(ASSIGNMENT_TXTFIELD_DIALOG.getText(), temp_day, temp_month, temp_year); //Inserting the items in the txtfields into the actual linked lists.
        table_A.addRow(new Object[] {globalcounter_ID_A, ASSIGNMENT_TXTFIELD_DIALOG.getText(), temp_month, temp_day, temp_year});
        listA.displayAssignments();
        
        globalcounter_ID_A++;
        
        
    
    }
    
    private void ID_DELETE_STUDENTMouseClicked(java.awt.event.MouseEvent evt) {
        
        ID_DELETE_STUDENT.setText("");      
        
    }

    private void DELETE_BUTTON_STUDENT_DIALOGActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        
        
        Confirmation_Student.setVisible(true);
        Confirmation_Student.setSize(305, 125);
        Confirmation_Student.setLocationRelativeTo(null);
        

        
        
        

        
        
    } 
    
    
    private void DELETE_ASSIGNMENT_DIALOG_BUTTONActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        
        Confirmation_Assignment.setVisible(true);
        Confirmation_Assignment.setSize(307, 125);
        Confirmation_Assignment.setLocationRelativeTo(null);
        

        
    }
    
    private void ADD_STUDENT_DIALOGActionPerformed(java.awt.event.ActionEvent evt) {                                                   


        String na = "N/A";
        String assign_name1 = "-1", assign_name2 = "-1", assign_name3 = "-1";
        
        
        int temp_item = Integer.parseInt(YR_TXTFIELD_DIALOG.getText());
        
        if(!(ASSIGN_TXT_1.getText().equals("-1"))) {
        assign_name1 = listA.assignmentSearch_ID(ASSIGN_TXT_1.getText());
        }
        
        if(!(ASSIGN_TXT_2.getText().equals("-1"))) {
        assign_name2 = listA.assignmentSearch_ID(ASSIGN_TXT_2.getText());
        }
        
        if(!(ASSIGN_TXT_3.getText().equals("-1"))) {
        assign_name3 = listA.assignmentSearch_ID(ASSIGN_TXT_3.getText());
        }
        
                
        listS.add(F_NAME_TXTFIELD_DIALOG.getText(), L_NAME_TXT_FIELD_DIALOG.getText(), temp_item, YRGRP_TXTFIELD_DIALOG.getText(), SUPERVISOR_TXTFIELD_DIALOG.getText(), ASSIGN_TXT_1.getText(), ASSIGN_TXT_2.getName(), ASSIGN_TXT_3.getText());

            if(assign_name1.equals("-1")) {
                
                table_S.addRow(new Object[] {globalcounter_ID_S, F_NAME_TXTFIELD_DIALOG.getText(), L_NAME_TXT_FIELD_DIALOG.getText(), temp_item, YRGRP_TXTFIELD_DIALOG.getText(), SUPERVISOR_TXTFIELD_DIALOG.getText(), na, assign_name2, assign_name3});
            
            } else if(assign_name2.equals("-1")) {
            
                table_S.addRow(new Object[] {globalcounter_ID_S, F_NAME_TXTFIELD_DIALOG.getText(), L_NAME_TXT_FIELD_DIALOG.getText(), temp_item, YRGRP_TXTFIELD_DIALOG.getText(), SUPERVISOR_TXTFIELD_DIALOG.getText(), assign_name1, na, assign_name3});
            
            } else if(assign_name3.equals("-1")) {
                
                table_S.addRow(new Object[] {globalcounter_ID_S, F_NAME_TXTFIELD_DIALOG.getText(), L_NAME_TXT_FIELD_DIALOG.getText(), temp_item, YRGRP_TXTFIELD_DIALOG.getText(), SUPERVISOR_TXTFIELD_DIALOG.getText(), assign_name1, assign_name2, na});
                
            } else if((assign_name1.equals("-1")) && (assign_name2.equals("-1"))) {
                
                table_S.addRow(new Object[] {globalcounter_ID_S, F_NAME_TXTFIELD_DIALOG.getText(), L_NAME_TXT_FIELD_DIALOG.getText(), temp_item, YRGRP_TXTFIELD_DIALOG.getText(), SUPERVISOR_TXTFIELD_DIALOG.getText(), na, na, assign_name3});
                
            } else if((assign_name1.equals("-1")) && (assign_name3.equals("-1"))) {
                
                table_S.addRow(new Object[] {globalcounter_ID_S, F_NAME_TXTFIELD_DIALOG.getText(), L_NAME_TXT_FIELD_DIALOG.getText(), temp_item, YRGRP_TXTFIELD_DIALOG.getText(), SUPERVISOR_TXTFIELD_DIALOG.getText(), na, assign_name2, na});
                
            } else if((assign_name1.equals("-1")) && (assign_name2.equals("-1")) && (assign_name3.equals("-1"))) {
                
                table_S.addRow(new Object[] {globalcounter_ID_S, F_NAME_TXTFIELD_DIALOG.getText(), L_NAME_TXT_FIELD_DIALOG.getText(), temp_item, YRGRP_TXTFIELD_DIALOG.getText(), SUPERVISOR_TXTFIELD_DIALOG.getText(), na, na, na});

            } else if((assign_name2.equals("-1")) && (assign_name3.equals("-1"))) {
                
                table_S.addRow(new Object[] {globalcounter_ID_S, F_NAME_TXTFIELD_DIALOG.getText(), L_NAME_TXT_FIELD_DIALOG.getText(), temp_item, YRGRP_TXTFIELD_DIALOG.getText(), SUPERVISOR_TXTFIELD_DIALOG.getText(), assign_name1, na, na});

            } else if(!(assign_name1.equals("-1")) && !(assign_name2.equals("-1")) && !(assign_name3.equals("-1"))) {
                
                table_S.addRow(new Object[] {globalcounter_ID_S, F_NAME_TXTFIELD_DIALOG.getText(), L_NAME_TXT_FIELD_DIALOG.getText(), temp_item, YRGRP_TXTFIELD_DIALOG.getText(), SUPERVISOR_TXTFIELD_DIALOG.getText(), assign_name1, assign_name2, assign_name3});
                
            }
            
        listS.displayStudents(); //Verifying that the method worked.
                
        globalcounter_ID_S++; //Increasing the counter by 1.
        
       
        
    }    
    
    
    private void NO_OPTION_DIALOG_SActionPerformed(java.awt.event.ActionEvent evt) {
        
        Confirmation_Student.setVisible(false);
        
    }

    private void YES_OPTION_DIALOG_SActionPerformed(java.awt.event.ActionEvent evt) {

        int temp_delete_student_ID = Integer.parseInt(ID_DELETE_STUDENT.getText());
        
        listS.delete_S(temp_delete_student_ID);
        listS.saveAll_Students(filename_S);
        
        String na = "N/A";
                
        try {
            
            BufferedReader in_student = new BufferedReader(new FileReader("students.dat"));
            
            globalcounter_ID_S = 0;
            
        for(int i = table_S.getRowCount() - 1; i >= 0; i--) {
            
            table_S.removeRow(i);
            
        }
            
            while(in_student.ready()) { //Students
            
            String student_fname_temp;
            String student_lname_temp;
            String student_yrgrp_temp;
            String student_supervisor_temp;
            int student_year_temp;
            String student_assignment_1, student_assignment_2, student_assignment_3;

            

            student_fname_temp = (in_student.readLine());
            student_lname_temp = (in_student.readLine());
            student_year_temp = Integer.parseInt(in_student.readLine());
            student_yrgrp_temp = (in_student.readLine());
            student_supervisor_temp = (in_student.readLine());
            student_assignment_1 = (in_student.readLine());
            student_assignment_2 = (in_student.readLine());
            student_assignment_3 = (in_student.readLine());
            
            String assign_name1 = listA.assignmentSearch_ID(student_assignment_1);
            String assign_name2 = listA.assignmentSearch_ID(student_assignment_2);
            String assign_name3 = listA.assignmentSearch_ID(student_assignment_3);
            
            if(assign_name1.equals("-1")) {
                
                table_S.addRow(new Object[] {globalcounter_ID_S, student_fname_temp, student_lname_temp, student_year_temp, student_yrgrp_temp, student_supervisor_temp, na, assign_name2, assign_name3});
            
            } else if(assign_name2.equals("-1")) {
            
                table_S.addRow(new Object[] {globalcounter_ID_S, student_fname_temp, student_lname_temp, student_year_temp, student_yrgrp_temp, student_supervisor_temp, assign_name1, na, assign_name3});
            
            } else if(assign_name3.equals("-1")) {
                
                table_S.addRow(new Object[] {globalcounter_ID_S, student_fname_temp, student_lname_temp, student_year_temp, student_yrgrp_temp, student_supervisor_temp, assign_name1, assign_name2, na});
                
            } else if((assign_name1.equals("-1")) && (assign_name2.equals("-1"))) {
                
                table_S.addRow(new Object[] {globalcounter_ID_S, student_fname_temp, student_lname_temp, student_year_temp, student_yrgrp_temp, student_supervisor_temp, na, na, assign_name3});
                
            } else if((assign_name1.equals("-1")) && (assign_name3.equals("-1"))) {
                
                table_S.addRow(new Object[] {globalcounter_ID_S, student_fname_temp, student_lname_temp, student_year_temp, student_yrgrp_temp, student_supervisor_temp, na, assign_name2, na});
                
            } else if((assign_name1.equals("-1")) && (assign_name2.equals("-1")) && (assign_name3.equals("-1"))) {
                
                table_S.addRow(new Object[] {globalcounter_ID_S, student_fname_temp, student_lname_temp, student_year_temp, student_yrgrp_temp, student_supervisor_temp, na, na, na});

            } else if((assign_name2.equals("-1")) && (assign_name3.equals("-1"))) {
                
                table_S.addRow(new Object[] {globalcounter_ID_S, student_fname_temp, student_lname_temp, student_year_temp, student_yrgrp_temp, student_supervisor_temp, assign_name1, na, na});

            } else if(!(assign_name1.equals("-1")) && !(assign_name2.equals("-1")) && !(assign_name3.equals("-1"))) {
                
                table_S.addRow(new Object[] {globalcounter_ID_S, F_NAME_TXTFIELD_DIALOG.getText(), L_NAME_TXT_FIELD_DIALOG.getText(), student_year_temp, YRGRP_TXTFIELD_DIALOG.getText(), SUPERVISOR_TXTFIELD_DIALOG.getText(), assign_name1, assign_name2, assign_name3});
                
            }
            listS.add(student_fname_temp, student_lname_temp, student_year_temp, student_yrgrp_temp, student_supervisor_temp, student_assignment_1, student_assignment_2, student_assignment_3);            
            globalcounter_ID_S++;
        }  
            
            
            
        } catch (FileNotFoundException e) {
            
            System.out.println("Error has occurred. Please contact the coder.");
            
        } catch (IOException e) {
            
            System.out.println("Something happened.");
            
        }
        
        Confirmation_Student.setVisible(false);
        
    }

    private void YES_OPTION_DIALOG_AActionPerformed(java.awt.event.ActionEvent evt) { //This method is for the button to get the user confirmation to delete the requested ID. It is an error handling.


        int temp_delete_assign_id = Integer.parseInt(INPUT_ASSIGNMENT_DELETE_ID.getText());
        
        listA.delete_A(temp_delete_assign_id);
        listA.saveAll_Assignments(filename_A); //Saving the assignments after deleting it to refresh the JTable.
        
        try {
            
            BufferedReader in_assign = new BufferedReader(new FileReader("assignments.dat"));
            
            globalcounter_ID_A = 0;
            
        for(int i = table_A.getRowCount() - 1; i >= 0; i--) { //Clearing all rows in a JTable.
            
            table_A.removeRow(i);
            
        }            
            
        while(in_assign.ready()) { //Reading in the assignments file to repopulate and refresh the JTable.
            
            String assignment_name_temp;
            int assignment_month_temp;
            int assignment_day_temp;
            int assignment_year_temp;
            
            
            assignment_name_temp = in_assign.readLine();
            assignment_month_temp = Integer.parseInt(in_assign.readLine());
            assignment_day_temp = Integer.parseInt(in_assign.readLine());
            assignment_year_temp = Integer.parseInt(in_assign.readLine());
            
            table_A.addRow(new Object[] {globalcounter_ID_A, assignment_name_temp, assignment_month_temp, assignment_day_temp, assignment_year_temp});
            listA.add(assignment_name_temp, assignment_day_temp, assignment_month_temp, assignment_year_temp);
            globalcounter_ID_A++;
        }            
            
            
        } catch (FileNotFoundException e) { //Error handling if the file cannot be found.
            
            System.out.println("Error has occurred. Please contact the coder.");
        
        } catch (IOException e) {
            
            System.out.println("Something went wrong.");
            
        }        
        
        Confirmation_Assignment.setVisible(false);
        
    }

    private void NO_OPTION_DIALOG_AActionPerformed(java.awt.event.ActionEvent evt) {
        
        Confirmation_Assignment.setVisible(false);
        
    }

    private void Continue_SuccessDialogActionPerformed(java.awt.event.ActionEvent evt) {
        
        Success_Dialog.setVisible(false); 

    }
    
    
    private void Delete_ASSIGNMENT_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {
        
        DELETE_ASSIGNMENT_DIALOG.setVisible(true);
        DELETE_ASSIGNMENT_DIALOG.setSize(290, 200);
        DELETE_ASSIGNMENT_DIALOG.setLocationRelativeTo(null);
        
    }

    private void INPUT_ASSIGNMENT_DELETE_IDMouseClicked(java.awt.event.MouseEvent evt) {
        
        INPUT_ASSIGNMENT_DELETE_ID.setText("");  
        
    }    
    
    
    
    
    //AUTO-GENERATED MAIN METHOD   
    public static void main(String args[]) {


        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui_main().setVisible(true);
                
                


            }     
            
        });
    }  
    
    //End of auto-generated main method.

}
    

