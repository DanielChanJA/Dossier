/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dossier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

/**
 *
 * @author DanielChan
 */
public class GUI_Form extends javax.swing.JFrame {
        
    
    int selection, age, supervisor, subject;
        
    boolean continuity;
        
    int input = 0;
    String placeholder_fname, placeholder_lname, placeholder_yeargrp, placeholder_supervisor;
    int placeholder_year, placeholder_studentID;
        
    String placeholder_assignmentName;
    String placeholder_date;
        
        
    String filename_S = "students.dat";
    String filename_A = "assignments.dat";
        
    int day = 0, month = 0, year = 0, placeholder_assignID, counter = 0;
        
    public static LinkedLists listS = new LinkedLists();
    public static LinkedLists listA = new LinkedLists();
    
    public static DefaultTableModel tablemodel;
    
              
    
    Scanner scanner = new Scanner(System.in);
    /**
     * Creates new form GUI_Form
     */
    public GUI_Form() {
        initComponents();
        
        
        
        
        
        
        
       /* int n = 0;
        
           Object Student_rowData[][] = new Object[7][100];
           Object Student_columnNames[] = new Object[5];
            
            Student_columnNames[0] = "Student ID";
            Student_columnNames[1] = "Student First Name";
            Student_columnNames[2] = "Student Last Name";
            Student_columnNames[3] = "Student Year";
            Student_columnNames[4] = "Student Year Group";
            Student_columnNames[5] = "Student Supervisor";
            
        
        
        while(counter != 10000) {
            

            for(int i = 0; i <= 100; i++) {
                Student_rowData[0][i] = listS.columnID[n];
                Student_rowData[1][i] = listS.columnFNAME[n];
                Student_rowData[2][i] = listS.columnLNAME[n];
                Student_rowData[3][i] = listS.columnYear[n];
                Student_rowData[4][i] = listS.columnYRGRP[n];
                Student_rowData[5][i] = listS.columnSUPER[n];
                
                
            }
            
            
            
            JTable Student_Table = new JTable(Student_rowData, Student_columnNames);

            
            
            
            
        } */
    }



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        ASSIGNMENT_TXTFIELD_DIALOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASSIGNMENT_TXTFIELD_DIALOGActionPerformed(evt);
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

        Options_SS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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
        ASSIGNMENT_NAME_TXTFIELD_DIALOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASSIGNMENT_NAME_TXTFIELD_DIALOGActionPerformed(evt);
            }
        });

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
                DELETE_BUTTON_STUDENT_DIALOGActionPerformed(evt);
            }
        });

        ID_DELETE_STUDENT.setText("Insert ID of Student");
        ID_DELETE_STUDENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ID_DELETE_STUDENTMouseClicked(evt);
            }
        });
        ID_DELETE_STUDENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_DELETE_STUDENTActionPerformed(evt);
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
                DELETE_ASSIGNMENT_DIALOG_BUTTONActionPerformed(evt);
            }
        });

        INPUT_ASSIGNMENT_DELETE_ID.setText("ID of Assignment");
        INPUT_ASSIGNMENT_DELETE_ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                INPUT_ASSIGNMENT_DELETE_IDMouseClicked(evt);
            }
        });
        INPUT_ASSIGNMENT_DELETE_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INPUT_ASSIGNMENT_DELETE_IDActionPerformed(evt);
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
        SaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SaveButtonMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveButtonMouseClicked(evt);
            }
        });
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        SaveButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SaveButtonKeyPressed(evt);
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
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
            listA.saveAll_Assignments(filename_A);
            listS.saveAll_Students(filename_S); 
            
            Success_Dialog.setVisible(true);
            Success_Dialog.setSize(271, 71);
            Success_Dialog.setLocationRelativeTo(null);
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void Add_Student_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Student_ButtonActionPerformed
        Student_ADD_DIALOG.setVisible(true);
        Student_ADD_DIALOG.setSize(400, 300);      // TODO add your handling code here:
    }//GEN-LAST:event_Add_Student_ButtonActionPerformed

    private void SaveButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SaveButtonKeyPressed
                // TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonKeyPressed

    private void YRGRP_TXTFIELD_DIALOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YRGRP_TXTFIELD_DIALOGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YRGRP_TXTFIELD_DIALOGActionPerformed

    private void Add_Student_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Student_ButtonMouseClicked
        
    }//GEN-LAST:event_Add_Student_ButtonMouseClicked

    private void ADD_ASSIGNMENT_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD_ASSIGNMENT_BUTTONActionPerformed
        Assignment_ADD_DIALOG.setVisible(true);
        Assignment_ADD_DIALOG.setSize(300, 150); 
    }//GEN-LAST:event_ADD_ASSIGNMENT_BUTTONActionPerformed

    private void Delete_Student_FunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_Student_FunctionActionPerformed
        DELETE_STUDENT_DIALOG.setVisible(true);
        DELETE_STUDENT_DIALOG.setSize(290, 150);
    }//GEN-LAST:event_Delete_Student_FunctionActionPerformed

    private void CLEAR_ALL_DIALOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEAR_ALL_DIALOGActionPerformed
        
        SUPERVISOR_TXTFIELD_DIALOG.setText("");
        F_NAME_TXTFIELD_DIALOG.setText("");
        L_NAME_TXT_FIELD_DIALOG.setText("");
        YR_TXTFIELD_DIALOG.setText("");
        YRGRP_TXTFIELD_DIALOG.setText("");
        
    }//GEN-LAST:event_CLEAR_ALL_DIALOGActionPerformed

    private void ADD_STUDENT_DIALOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD_STUDENT_DIALOGActionPerformed

        Confirmation_Student.setVisible(true);
        Confirmation_Student.setSize(305, 120);
        Confirmation_Student.setLocationRelativeTo(null);
        
        ADD_STUDENT_DIALOG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int temp_item = Integer.parseInt(YR_TXTFIELD_DIALOG.getText());
                
                GUI_Form.tablemodel.addRow(new String[] {F_NAME_TXTFIELD_DIALOG.getText(), L_NAME_TXT_FIELD_DIALOG.getName(), YR_TXTFIELD_DIALOG.getText(), YRGRP_TXTFIELD_DIALOG.getText(), SUPERVISOR_TXTFIELD_DIALOG.getText()});
                listS.add(F_NAME_TXTFIELD_DIALOG.getText(), L_NAME_TXT_FIELD_DIALOG.getText(), temp_item, YRGRP_TXTFIELD_DIALOG.getText(), SUPERVISOR_TXTFIELD_DIALOG.getText());
                listS.displayStudents();
                Student_ADD_DIALOG.dispose();
            }
        });
        
        
    }//GEN-LAST:event_ADD_STUDENT_DIALOGActionPerformed

    private void ADD_ASSIGNMENT_DIALOG_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD_ASSIGNMENT_DIALOG_BUTTONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADD_ASSIGNMENT_DIALOG_BUTTONActionPerformed

    private void ASSIGNMENT_TXTFIELD_DIALOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASSIGNMENT_TXTFIELD_DIALOGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ASSIGNMENT_TXTFIELD_DIALOGActionPerformed

    private void ASSIGNMENT_TXTFIELD_DIALOGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ASSIGNMENT_TXTFIELD_DIALOGMouseClicked
        ASSIGNMENT_TXTFIELD_DIALOG.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_ASSIGNMENT_TXTFIELD_DIALOGMouseClicked

    private void ID_DELETE_STUDENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_DELETE_STUDENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_DELETE_STUDENTActionPerformed

    private void ID_DELETE_STUDENTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ID_DELETE_STUDENTMouseClicked
        ID_DELETE_STUDENT.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_ID_DELETE_STUDENTMouseClicked

    private void DELETE_BUTTON_STUDENT_DIALOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETE_BUTTON_STUDENT_DIALOGActionPerformed
        int temp_delete_student_ID = Integer.parseInt(ID_DELETE_STUDENT.getText());
        listS.delete_S(temp_delete_student_ID);        // TODO add your handling code here:
    }//GEN-LAST:event_DELETE_BUTTON_STUDENT_DIALOGActionPerformed

    private void INPUT_ASSIGNMENT_DELETE_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INPUT_ASSIGNMENT_DELETE_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INPUT_ASSIGNMENT_DELETE_IDActionPerformed

    private void DELETE_ASSIGNMENT_DIALOG_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETE_ASSIGNMENT_DIALOG_BUTTONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DELETE_ASSIGNMENT_DIALOG_BUTTONActionPerformed

    private void Delete_ASSIGNMENT_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ASSIGNMENT_BUTTONActionPerformed
        DELETE_ASSIGNMENT_DIALOG.setVisible(true);
        DELETE_ASSIGNMENT_DIALOG.setSize(290, 200);// TODO add your handling code here:
    }//GEN-LAST:event_Delete_ASSIGNMENT_BUTTONActionPerformed

    private void INPUT_ASSIGNMENT_DELETE_IDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INPUT_ASSIGNMENT_DELETE_IDMouseClicked
        INPUT_ASSIGNMENT_DELETE_ID.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_INPUT_ASSIGNMENT_DELETE_IDMouseClicked

    private void NO_OPTION_DIALOG_SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO_OPTION_DIALOG_SActionPerformed
        Confirmation_Student.setVisible(false);
    }//GEN-LAST:event_NO_OPTION_DIALOG_SActionPerformed

    private void YES_OPTION_DIALOG_SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YES_OPTION_DIALOG_SActionPerformed
                       // TODO add your handling code here:
    }//GEN-LAST:event_YES_OPTION_DIALOG_SActionPerformed

    private void YES_OPTION_DIALOG_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YES_OPTION_DIALOG_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YES_OPTION_DIALOG_AActionPerformed

    private void NO_OPTION_DIALOG_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO_OPTION_DIALOG_AActionPerformed
        Confirmation_Assignment.setVisible(false);
    }//GEN-LAST:event_NO_OPTION_DIALOG_AActionPerformed

    private void Continue_SuccessDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Continue_SuccessDialogActionPerformed
        Success_Dialog.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_Continue_SuccessDialogActionPerformed

    private void SaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseClicked
            Success_Dialog.setVisible(true);
            Success_Dialog.setSize(271, 71);
            Success_Dialog.setLocationRelativeTo(null);        // TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonMouseClicked

    private void SaveButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMousePressed
            Success_Dialog.setVisible(true);
            Success_Dialog.setSize(271, 71);
            Success_Dialog.setLocationRelativeTo(null);        // TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonMousePressed

    private void Options_SSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Options_SSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Options_SSActionPerformed

    private void Search_Student_JFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Student_JFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_Student_JFActionPerformed

    private void Search_Assignment_JFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Assignment_JFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_Assignment_JFActionPerformed


    private void ASSIGNMENT_SEARCH_BUTTON_DIALOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASSIGNMENT_SEARCH_BUTTON_DIALOGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ASSIGNMENT_SEARCH_BUTTON_DIALOGActionPerformed

    private void SEARCH_BUTTON_DIALOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCH_BUTTON_DIALOGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SEARCH_BUTTON_DIALOGActionPerformed

    private void ASSIGNMENT_NAME_TXTFIELD_DIALOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASSIGNMENT_NAME_TXTFIELD_DIALOGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ASSIGNMENT_NAME_TXTFIELD_DIALOGActionPerformed

    
    /**
     * @param args the command line arguments
     */
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
                new GUI_Form().setVisible(true);
                
                


            }     
            
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD_ASSIGNMENT_BUTTON;
    private javax.swing.JButton ADD_ASSIGNMENT_DIALOG_BUTTON;
    private javax.swing.JButton ADD_STUDENT_DIALOG;
    private javax.swing.JLabel ASSIGNMENTNAME_LABEL;
    private javax.swing.JLabel ASSIGNMENT_NAME_LABEL_DIALOG;
    private javax.swing.JTextField ASSIGNMENT_NAME_TXTFIELD_DIALOG;
    private javax.swing.JButton ASSIGNMENT_SEARCH_BUTTON_DIALOG;
    private javax.swing.JTextField ASSIGNMENT_TXTFIELD_DIALOG;
    private javax.swing.JLabel ASSIGN_LABEL_1;
    private javax.swing.JLabel ASSIGN_LABEL_2;
    private javax.swing.JLabel ASSIGN_LABEL_3;
    private javax.swing.JTextField ASSIGN_TXT_1;
    private javax.swing.JTextField ASSIGN_TXT_2;
    private javax.swing.JTextField ASSIGN_TXT_3;
    private javax.swing.JMenu About;
    private javax.swing.JButton Add_Student_Button;
    private javax.swing.JDialog Assignment_ADD_DIALOG;
    private javax.swing.JTable Assignments_Table;
    private javax.swing.JPanel BUTTONS;
    private javax.swing.JPanel Buttons_Add_Remove_Section;
    private javax.swing.JButton CLEAR_ALL_DIALOG;
    private javax.swing.JLabel COPYRIGHT_LABEL;
    private javax.swing.JLabel ConfirmationExitUIMessage;
    private javax.swing.JLabel ConfirmationLabel_Assignment;
    private javax.swing.JLabel ConfirmationLabel_S;
    private javax.swing.JDialog Confirmation_Assignment;
    private javax.swing.JDialog Confirmation_CloseProgram;
    private javax.swing.JDialog Confirmation_Student;
    private javax.swing.JMenuItem Contact_MI;
    private javax.swing.JButton Continue_SuccessDialog;
    private javax.swing.JLabel DATEDUE_LABEL;
    private javax.swing.JTextField DDMMYYYY_TXTFIELD;
    private javax.swing.JLabel DELETE_ASSIGNMENTNAME_LABEL;
    private javax.swing.JDialog DELETE_ASSIGNMENT_DIALOG;
    private javax.swing.JButton DELETE_ASSIGNMENT_DIALOG_BUTTON;
    private javax.swing.JButton DELETE_BUTTON_STUDENT_DIALOG;
    private javax.swing.JDialog DELETE_STUDENT_DIALOG;
    private javax.swing.JButton Delete_ASSIGNMENT_BUTTON;
    private javax.swing.JButton Delete_Student_Function;
    private javax.swing.JMenuItem ExitButton;
    private javax.swing.JLabel F_NAME_LABEL_DIALOG;
    private javax.swing.JTextField F_NAME_TXTFIELD_DIALOG;
    private javax.swing.JLabel FailedUEDialogMessage;
    private javax.swing.JDialog Failed_Dialog_UE;
    private javax.swing.JMenu File_MenuBar;
    private javax.swing.JTextField ID_DELETE_STUDENT;
    private javax.swing.JTextField INPUT_ASSIGNMENT_DELETE_ID;
    private javax.swing.JPanel IO;
    private javax.swing.JTabbedPane JTable_Panel;
    private javax.swing.JLabel L_NAME_LABEL_DIALOG;
    private javax.swing.JTextField L_NAME_TXT_FIELD_DIALOG;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton NO_OPTION_DIALOG_A;
    private javax.swing.JButton NO_OPTION_DIALOG_S;
    private javax.swing.JButton No_ExitProgram;
    private javax.swing.JComboBox Options_SS;
    private javax.swing.JTextArea Results_Assignment_Field;
    private javax.swing.JLabel Results_Assignment_Label;
    private javax.swing.JLabel Results_Label;
    private javax.swing.JTextArea Results_Student_Field;
    private javax.swing.JDialog SEARCH_ASSIGNMENTS_RESULTS;
    private javax.swing.JDialog SEARCH_ASSIGNMENT_DIALOG;
    private javax.swing.JButton SEARCH_BUTTON_DIALOG;
    private javax.swing.JDialog SEARCH_STUDENT_DIALOG;
    private javax.swing.JDialog SEARCH_STUDENT_RESULTS;
    private javax.swing.JLabel STUDENT_LABEL_DELETE_DIALOG;
    private javax.swing.JLabel STUDENT_NAME_LABEL_SEARCH;
    private javax.swing.JLabel SUPERVISOR_DIALOG;
    private javax.swing.JTextField SUPERVISOR_TXTFIELD_DIALOG;
    private javax.swing.JMenuItem SaveButton;
    private javax.swing.JLabel Save_All_Success;
    private javax.swing.JButton Search_Assignment_JF;
    private javax.swing.JTextField Search_Item;
    private javax.swing.JLabel Search_Item_Label;
    private javax.swing.JButton Search_Student_JF;
    private javax.swing.JDialog Student_ADD_DIALOG;
    private javax.swing.JTable Student_Table;
    private javax.swing.JDialog Success_Dialog;
    private javax.swing.JLabel VERSION_LABEL;
    private javax.swing.JLabel WELCOME_LABEL_;
    private javax.swing.JLabel YEAR_LABEL_DIALOG;
    private javax.swing.JButton YES_OPTION_DIALOG_A;
    private javax.swing.JButton YES_OPTION_DIALOG_S;
    private javax.swing.JTextField YRGRP_TXTFIELD_DIALOG;
    private javax.swing.JLabel YR_GROUP_LABEL_DIALOG;
    private javax.swing.JTextField YR_TXTFIELD_DIALOG;
    private javax.swing.JButton Yes_ExitProgram;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
