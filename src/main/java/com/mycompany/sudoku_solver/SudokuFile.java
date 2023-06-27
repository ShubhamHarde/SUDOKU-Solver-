/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sudoku_solver;

import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import static java.awt.Color.white;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class SudokuFile extends javax.swing.JFrame {
    
    private String turn="1";
    
    private boolean globalFlag=true;
    
    private String solveBoard[][]={
        {"2","9","8","5","1","6","7","3","4"},
        {"4","1","3","2","7","8","5","6","9"},
        {"7","5","6","3","4","9","1","2","8"},
        {"8","2","1","4","3","5","6","9","7"},
        {"5","3","4","6","9","7","2","8","1"},
        {"9","6","7","1","8","2","3","4","5"},
        {"1","4","2","8","5","3","9","7","6"},
        {"3","7","5","9","6","4","8","1","2"},
        {"6","8","9","7","2","1","4","5","3"}
    };
    
    
    private void AssignTurn(JButton btn)
    {
      select1.setBackground(black);
      select2.setBackground(black);
      select3.setBackground(black);
      select4.setBackground(black);
      select5.setBackground(black);
      select6.setBackground(black);
      select7.setBackground(black);
      select8.setBackground(black);
      select9.setBackground(black);
      
      btn.setBackground(blue);
    }
    
    
    private void ResetGame()
    {
        JButton predefinedBtns[]={j03,j06,j07,j08,j10,j14,j15,j16,j18,j20,j22,j24,j27,j34,j35,j37,j41,j42,j46,j47,j51,j53,
            j54,j61,j64,j66,j68,j70,j73,j74,j78,j80,j81,j82,j85};
        
        JButton btns[][]=
        {
            {j00,j01,j02,j03,j04,j05,j06,j07,j08},
            {j10,j11,j12,j13,j14,j15,j16,j17,j18},
            {j20,j21,j22,j23,j24,j25,j26,j27,j28},
            {j30,j31,j32,j33,j34,j35,j36,j37,j38},
            {j40,j41,j42,j43,j44,j45,j46,j47,j48},
            {j50,j51,j52,j53,j54,j55,j56,j57,j58},
            {j60,j61,j62,j63,j64,j65,j66,j67,j68},
            {j70,j71,j72,j73,j74,j75,j76,j77,j78},
            {j80,j81,j82,j83,j84,j85,j86,j87,j88},
        };
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                boolean flag=true;
                
                for(int k=0;k<predefinedBtns.length;k++){
                        if(btns[i][j]==predefinedBtns[k]){
                        flag=false;
                    }
                }
                if(flag){
                    btns[i][j].setText("");
                    btns[i][j].setForeground(black);
                    btns[i][j].setBackground(white);
                }
            }
        }
        
    }
     
    private void seeSolution()
    {
        JButton predefinedBtns[]={j03,j06,j07,j08,j10,j14,j15,j16,j18,j20,j22,j24,j27,j34,j35,j37,j41,j42,j46,j47,j51,j53,
            j54,j61,j64,j66,j68,j70,j73,j74,j78,j80,j81,j82,j85};
        
        JButton btns[][]=
        {
            {j00,j01,j02,j03,j04,j05,j06,j07,j08},
            {j10,j11,j12,j13,j14,j15,j16,j17,j18},
            {j20,j21,j22,j23,j24,j25,j26,j27,j28},
            {j30,j31,j32,j33,j34,j35,j36,j37,j38},
            {j40,j41,j42,j43,j44,j45,j46,j47,j48},
            {j50,j51,j52,j53,j54,j55,j56,j57,j58},
            {j60,j61,j62,j63,j64,j65,j66,j67,j68},
            {j70,j71,j72,j73,j74,j75,j76,j77,j78},
            {j80,j81,j82,j83,j84,j85,j86,j87,j88},
        };
        
        if(globalFlag){
            globalFlag=false;
            solution.setText("Hide");
            
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    boolean flag=true;
                    for(int k=0;k<predefinedBtns.length;k++){
                        if(btns[i][j]==predefinedBtns[k]){
                        flag=false;
                        }
                    }
                    if(flag){
                    btns[i][j].setText(solveBoard[i][j]);
                    btns[i][j].setForeground(black);
                    btns[i][j].setBackground(white);
                    }
                }
            }
        }
        else{
            solution.setText("Solution");
            globalFlag=true;
            ResetGame();
        }
    
    }

    private void checkMoves()
    {
        JButton btns[][]=
        {
            {j00,j01,j02,j03,j04,j05,j06,j07,j08},
            {j10,j11,j12,j13,j14,j15,j16,j17,j18},
            {j20,j21,j22,j23,j24,j25,j26,j27,j28},
            {j30,j31,j32,j33,j34,j35,j36,j37,j38},
            {j40,j41,j42,j43,j44,j45,j46,j47,j48},
            {j50,j51,j52,j53,j54,j55,j56,j57,j58},
            {j60,j61,j62,j63,j64,j65,j66,j67,j68},
            {j70,j71,j72,j73,j74,j75,j76,j77,j78},
            {j80,j81,j82,j83,j84,j85,j86,j87,j88},
        };
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(btns[i][j].getText()!=solveBoard[i][j] && btns[i][j].getText()!=""){
                    btns[i][j].setBackground(red);
                }
            }
        }
    }
    

    /**
     * Creates new form SudokuFile
     */
    public SudokuFile() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        j00 = new javax.swing.JButton();
        j01 = new javax.swing.JButton();
        j02 = new javax.swing.JButton();
        j10 = new javax.swing.JButton();
        j20 = new javax.swing.JButton();
        j21 = new javax.swing.JButton();
        j22 = new javax.swing.JButton();
        j11 = new javax.swing.JButton();
        j12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        j03 = new javax.swing.JButton();
        j04 = new javax.swing.JButton();
        j05 = new javax.swing.JButton();
        j13 = new javax.swing.JButton();
        j23 = new javax.swing.JButton();
        j24 = new javax.swing.JButton();
        j25 = new javax.swing.JButton();
        j14 = new javax.swing.JButton();
        j15 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        j06 = new javax.swing.JButton();
        j07 = new javax.swing.JButton();
        j08 = new javax.swing.JButton();
        j16 = new javax.swing.JButton();
        j26 = new javax.swing.JButton();
        j27 = new javax.swing.JButton();
        j28 = new javax.swing.JButton();
        j17 = new javax.swing.JButton();
        j18 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        j31 = new javax.swing.JButton();
        j32 = new javax.swing.JButton();
        j40 = new javax.swing.JButton();
        j50 = new javax.swing.JButton();
        j51 = new javax.swing.JButton();
        j52 = new javax.swing.JButton();
        j41 = new javax.swing.JButton();
        j42 = new javax.swing.JButton();
        j30 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        j36 = new javax.swing.JButton();
        j37 = new javax.swing.JButton();
        j38 = new javax.swing.JButton();
        j46 = new javax.swing.JButton();
        j56 = new javax.swing.JButton();
        j57 = new javax.swing.JButton();
        j58 = new javax.swing.JButton();
        j47 = new javax.swing.JButton();
        j48 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        j33 = new javax.swing.JButton();
        j34 = new javax.swing.JButton();
        j43 = new javax.swing.JButton();
        j53 = new javax.swing.JButton();
        j54 = new javax.swing.JButton();
        j55 = new javax.swing.JButton();
        j44 = new javax.swing.JButton();
        j45 = new javax.swing.JButton();
        j35 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        j63 = new javax.swing.JButton();
        j64 = new javax.swing.JButton();
        j65 = new javax.swing.JButton();
        j73 = new javax.swing.JButton();
        j83 = new javax.swing.JButton();
        j84 = new javax.swing.JButton();
        j85 = new javax.swing.JButton();
        j74 = new javax.swing.JButton();
        j75 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        j66 = new javax.swing.JButton();
        j67 = new javax.swing.JButton();
        j68 = new javax.swing.JButton();
        j76 = new javax.swing.JButton();
        j86 = new javax.swing.JButton();
        j87 = new javax.swing.JButton();
        j88 = new javax.swing.JButton();
        j77 = new javax.swing.JButton();
        j78 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        j60 = new javax.swing.JButton();
        j61 = new javax.swing.JButton();
        j62 = new javax.swing.JButton();
        j70 = new javax.swing.JButton();
        j80 = new javax.swing.JButton();
        j81 = new javax.swing.JButton();
        j82 = new javax.swing.JButton();
        j71 = new javax.swing.JButton();
        j72 = new javax.swing.JButton();
        select1 = new javax.swing.JButton();
        select3 = new javax.swing.JButton();
        select4 = new javax.swing.JButton();
        select5 = new javax.swing.JButton();
        select6 = new javax.swing.JButton();
        select7 = new javax.swing.JButton();
        select9 = new javax.swing.JButton();
        select8 = new javax.swing.JButton();
        select2 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        solution = new javax.swing.JButton();
        check = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        j00.setBackground(new java.awt.Color(204, 204, 204));
        j00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j00ActionPerformed(evt);
            }
        });

        j01.setBackground(new java.awt.Color(204, 204, 204));
        j01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j01ActionPerformed(evt);
            }
        });

        j02.setBackground(new java.awt.Color(204, 204, 204));
        j02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j02ActionPerformed(evt);
            }
        });

        j10.setBackground(new java.awt.Color(102, 102, 255));
        j10.setText("4");
        j10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j10ActionPerformed(evt);
            }
        });

        j20.setBackground(new java.awt.Color(102, 102, 255));
        j20.setText("7");
        j20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j20ActionPerformed(evt);
            }
        });

        j21.setBackground(new java.awt.Color(204, 204, 204));
        j21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j21ActionPerformed(evt);
            }
        });

        j22.setBackground(new java.awt.Color(102, 102, 255));
        j22.setText("6");
        j22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j22ActionPerformed(evt);
            }
        });

        j11.setBackground(new java.awt.Color(204, 204, 204));
        j11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j11ActionPerformed(evt);
            }
        });

        j12.setBackground(new java.awt.Color(204, 204, 204));
        j12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j00, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j01, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(j02, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j02, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j01, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        j03.setBackground(new java.awt.Color(102, 102, 255));
        j03.setText("5");
        j03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j03ActionPerformed(evt);
            }
        });

        j04.setBackground(new java.awt.Color(204, 204, 204));
        j04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j04ActionPerformed(evt);
            }
        });

        j05.setBackground(new java.awt.Color(204, 204, 204));
        j05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j05ActionPerformed(evt);
            }
        });

        j13.setBackground(new java.awt.Color(204, 204, 204));
        j13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j13ActionPerformed(evt);
            }
        });

        j23.setBackground(new java.awt.Color(204, 204, 204));
        j23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j23ActionPerformed(evt);
            }
        });

        j24.setBackground(new java.awt.Color(102, 102, 255));
        j24.setText("4");
        j24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j24ActionPerformed(evt);
            }
        });

        j25.setBackground(new java.awt.Color(204, 204, 204));
        j25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j25ActionPerformed(evt);
            }
        });

        j14.setBackground(new java.awt.Color(102, 102, 255));
        j14.setText("7");
        j14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j14ActionPerformed(evt);
            }
        });

        j15.setBackground(new java.awt.Color(102, 102, 255));
        j15.setText("8");
        j15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(j03, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j04, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(j05, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(j23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(j13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j03, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j05, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j04, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        j06.setBackground(new java.awt.Color(102, 102, 255));
        j06.setText("7");
        j06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j06ActionPerformed(evt);
            }
        });

        j07.setBackground(new java.awt.Color(102, 102, 255));
        j07.setText("3");
        j07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j07ActionPerformed(evt);
            }
        });

        j08.setBackground(new java.awt.Color(102, 102, 255));
        j08.setText("4");
        j08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j08ActionPerformed(evt);
            }
        });

        j16.setBackground(new java.awt.Color(102, 102, 255));
        j16.setText("5");
        j16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j16ActionPerformed(evt);
            }
        });

        j26.setBackground(new java.awt.Color(204, 204, 204));
        j26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j26ActionPerformed(evt);
            }
        });

        j27.setBackground(new java.awt.Color(102, 102, 255));
        j27.setText("2");
        j27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j27ActionPerformed(evt);
            }
        });

        j28.setBackground(new java.awt.Color(204, 204, 204));
        j28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j28ActionPerformed(evt);
            }
        });

        j17.setBackground(new java.awt.Color(204, 204, 204));
        j17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j17ActionPerformed(evt);
            }
        });

        j18.setBackground(new java.awt.Color(102, 102, 255));
        j18.setText("9");
        j18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(j06, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j07, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(j08, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(j26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j28, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(j16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j06, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j08, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j07, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        j31.setBackground(new java.awt.Color(204, 204, 204));
        j31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j31ActionPerformed(evt);
            }
        });

        j32.setBackground(new java.awt.Color(204, 204, 204));
        j32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j32ActionPerformed(evt);
            }
        });

        j40.setBackground(new java.awt.Color(204, 204, 204));
        j40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j40ActionPerformed(evt);
            }
        });

        j50.setBackground(new java.awt.Color(204, 204, 204));
        j50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j50ActionPerformed(evt);
            }
        });

        j51.setBackground(new java.awt.Color(102, 102, 255));
        j51.setText("6");
        j51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j51ActionPerformed(evt);
            }
        });

        j52.setBackground(new java.awt.Color(204, 204, 204));
        j52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j52ActionPerformed(evt);
            }
        });

        j41.setBackground(new java.awt.Color(102, 102, 255));
        j41.setText("3");
        j41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j41ActionPerformed(evt);
            }
        });

        j42.setBackground(new java.awt.Color(102, 102, 255));
        j42.setText("4");
        j42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j42ActionPerformed(evt);
            }
        });

        j30.setBackground(new java.awt.Color(204, 204, 204));
        j30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(j30, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(j31, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(j32, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(j50, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j51, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j52, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(j40, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j41, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j42, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(j32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(j31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(j30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        j36.setBackground(new java.awt.Color(204, 204, 204));
        j36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j36ActionPerformed(evt);
            }
        });

        j37.setBackground(new java.awt.Color(102, 102, 255));
        j37.setText("9");
        j37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j37ActionPerformed(evt);
            }
        });

        j38.setBackground(new java.awt.Color(204, 204, 204));
        j38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j38ActionPerformed(evt);
            }
        });

        j46.setBackground(new java.awt.Color(102, 102, 255));
        j46.setText("2");
        j46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j46ActionPerformed(evt);
            }
        });

        j56.setBackground(new java.awt.Color(204, 204, 204));
        j56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j56ActionPerformed(evt);
            }
        });

        j57.setBackground(new java.awt.Color(204, 204, 204));
        j57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j57ActionPerformed(evt);
            }
        });

        j58.setBackground(new java.awt.Color(204, 204, 204));
        j58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j58ActionPerformed(evt);
            }
        });

        j47.setBackground(new java.awt.Color(102, 102, 255));
        j47.setText("8");
        j47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j47ActionPerformed(evt);
            }
        });

        j48.setBackground(new java.awt.Color(204, 204, 204));
        j48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j48ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(j36, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j37, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(j38, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(j56, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j57, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j58, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(j46, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j47, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        j33.setBackground(new java.awt.Color(204, 204, 204));
        j33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j33ActionPerformed(evt);
            }
        });

        j34.setBackground(new java.awt.Color(102, 102, 255));
        j34.setText("3");
        j34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j34ActionPerformed(evt);
            }
        });

        j43.setBackground(new java.awt.Color(204, 204, 204));
        j43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j43ActionPerformed(evt);
            }
        });

        j53.setBackground(new java.awt.Color(102, 102, 255));
        j53.setText("1");
        j53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j53ActionPerformed(evt);
            }
        });

        j54.setBackground(new java.awt.Color(102, 102, 255));
        j54.setText("8");
        j54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j54ActionPerformed(evt);
            }
        });

        j55.setBackground(new java.awt.Color(204, 204, 204));
        j55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j55ActionPerformed(evt);
            }
        });

        j44.setBackground(new java.awt.Color(204, 204, 204));
        j44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j44ActionPerformed(evt);
            }
        });

        j45.setBackground(new java.awt.Color(204, 204, 204));
        j45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j45ActionPerformed(evt);
            }
        });

        j35.setBackground(new java.awt.Color(102, 102, 255));
        j35.setText("5");
        j35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(j33, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j34, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j35, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(j53, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(j54, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j55, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(j43, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j44, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j45, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(j33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(j34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(j35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        j63.setBackground(new java.awt.Color(204, 204, 204));
        j63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j63ActionPerformed(evt);
            }
        });

        j64.setBackground(new java.awt.Color(102, 102, 255));
        j64.setText("5");
        j64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j64ActionPerformed(evt);
            }
        });

        j65.setBackground(new java.awt.Color(204, 204, 204));
        j65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j65ActionPerformed(evt);
            }
        });

        j73.setBackground(new java.awt.Color(102, 102, 255));
        j73.setText("9");
        j73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j73ActionPerformed(evt);
            }
        });

        j83.setBackground(new java.awt.Color(204, 204, 204));
        j83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j83ActionPerformed(evt);
            }
        });

        j84.setBackground(new java.awt.Color(204, 204, 204));
        j84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j84ActionPerformed(evt);
            }
        });

        j85.setBackground(new java.awt.Color(102, 102, 255));
        j85.setText("1");
        j85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j85ActionPerformed(evt);
            }
        });

        j74.setBackground(new java.awt.Color(102, 102, 255));
        j74.setText("6");
        j74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j74ActionPerformed(evt);
            }
        });

        j75.setBackground(new java.awt.Color(204, 204, 204));
        j75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j75ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(j63, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j64, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(j65, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(j83, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j84, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j85, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(j73, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j74, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j75, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j83, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j85, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j84, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        j66.setBackground(new java.awt.Color(102, 102, 255));
        j66.setText("9");
        j66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j66ActionPerformed(evt);
            }
        });

        j67.setBackground(new java.awt.Color(204, 204, 204));
        j67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j67ActionPerformed(evt);
            }
        });

        j68.setBackground(new java.awt.Color(102, 102, 255));
        j68.setText("6");
        j68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j68ActionPerformed(evt);
            }
        });

        j76.setBackground(new java.awt.Color(204, 204, 204));
        j76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j76ActionPerformed(evt);
            }
        });

        j86.setBackground(new java.awt.Color(204, 204, 204));
        j86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j86ActionPerformed(evt);
            }
        });

        j87.setBackground(new java.awt.Color(204, 204, 204));
        j87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j87ActionPerformed(evt);
            }
        });

        j88.setBackground(new java.awt.Color(204, 204, 204));
        j88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j88ActionPerformed(evt);
            }
        });

        j77.setBackground(new java.awt.Color(204, 204, 204));
        j77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j77ActionPerformed(evt);
            }
        });

        j78.setBackground(new java.awt.Color(102, 102, 255));
        j78.setText("2");
        j78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j78ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(j66, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j67, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(j68, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(j86, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j87, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j88, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(j76, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j77, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j78, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j87, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        j60.setBackground(new java.awt.Color(204, 204, 204));
        j60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j60ActionPerformed(evt);
            }
        });

        j61.setBackground(new java.awt.Color(102, 102, 255));
        j61.setText("4");
        j61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j61ActionPerformed(evt);
            }
        });

        j62.setBackground(new java.awt.Color(204, 204, 204));
        j62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j62ActionPerformed(evt);
            }
        });

        j70.setBackground(new java.awt.Color(102, 102, 255));
        j70.setText("3");
        j70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j70ActionPerformed(evt);
            }
        });

        j80.setBackground(new java.awt.Color(102, 102, 255));
        j80.setText("6");
        j80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j80ActionPerformed(evt);
            }
        });

        j81.setBackground(new java.awt.Color(102, 102, 255));
        j81.setText("8");
        j81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j81ActionPerformed(evt);
            }
        });

        j82.setBackground(new java.awt.Color(102, 102, 255));
        j82.setText("9");
        j82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j82ActionPerformed(evt);
            }
        });

        j71.setBackground(new java.awt.Color(204, 204, 204));
        j71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j71ActionPerformed(evt);
            }
        });

        j72.setBackground(new java.awt.Color(204, 204, 204));
        j72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j72ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(j60, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j61, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(j62, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(j80, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j81, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j82, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(j70, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j71, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j72, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j82, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        select1.setBackground(new java.awt.Color(0, 0, 0));
        select1.setForeground(new java.awt.Color(255, 255, 255));
        select1.setText("1");
        select1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select1ActionPerformed(evt);
            }
        });

        select3.setBackground(new java.awt.Color(0, 0, 0));
        select3.setForeground(new java.awt.Color(255, 255, 255));
        select3.setText("3");
        select3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select3ActionPerformed(evt);
            }
        });

        select4.setBackground(new java.awt.Color(0, 0, 0));
        select4.setForeground(new java.awt.Color(255, 255, 255));
        select4.setText("4");
        select4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select4ActionPerformed(evt);
            }
        });

        select5.setBackground(new java.awt.Color(0, 0, 0));
        select5.setForeground(new java.awt.Color(255, 255, 255));
        select5.setText("5");
        select5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select5ActionPerformed(evt);
            }
        });

        select6.setBackground(new java.awt.Color(0, 0, 0));
        select6.setForeground(new java.awt.Color(255, 255, 255));
        select6.setText("6");
        select6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select6ActionPerformed(evt);
            }
        });

        select7.setBackground(new java.awt.Color(0, 0, 0));
        select7.setForeground(new java.awt.Color(255, 255, 255));
        select7.setText("7");
        select7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select7ActionPerformed(evt);
            }
        });

        select9.setBackground(new java.awt.Color(0, 0, 0));
        select9.setForeground(new java.awt.Color(255, 255, 255));
        select9.setText("9");
        select9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select9ActionPerformed(evt);
            }
        });

        select8.setBackground(new java.awt.Color(0, 0, 0));
        select8.setForeground(new java.awt.Color(255, 255, 255));
        select8.setText("8");
        select8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select8ActionPerformed(evt);
            }
        });

        select2.setBackground(new java.awt.Color(0, 0, 0));
        select2.setForeground(new java.awt.Color(255, 255, 255));
        select2.setText("2");
        select2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select2ActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(204, 255, 255));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 153, 153));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        solution.setBackground(new java.awt.Color(255, 204, 255));
        solution.setText("Solution");
        solution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionActionPerformed(evt);
            }
        });

        check.setBackground(new java.awt.Color(255, 255, 204));
        check.setText("Check Moves");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(solution, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(select1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(select2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(select3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(select4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(select5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(select6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(select7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(select8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(select9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(select1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(select9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(select8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(select7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(select6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(select5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(select4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(select3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(select2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solution, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j17ActionPerformed
        // TODO add your handling code here:
        j17.setText(turn);
        j17.setBackground(white);
    }//GEN-LAST:event_j17ActionPerformed

    private void j31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j31ActionPerformed
        // TODO add your handling code here:
        j31.setText(turn);
        j31.setBackground(white);
    }//GEN-LAST:event_j31ActionPerformed

    private void j36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j36ActionPerformed
        // TODO add your handling code here:
        j36.setText(turn);
        j36.setBackground(white);
    }//GEN-LAST:event_j36ActionPerformed

    private void j30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j30ActionPerformed
        // TODO add your handling code here:
        j30.setText(turn);
        j30.setBackground(white);
    }//GEN-LAST:event_j30ActionPerformed

    private void j52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j52ActionPerformed
        // TODO add your handling code here:
        j52.setText(turn);
        j52.setBackground(white);
    }//GEN-LAST:event_j52ActionPerformed

    private void j74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j74ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j74ActionPerformed

    private void j88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j88ActionPerformed
        // TODO add your handling code here:
        j88.setText(turn);
        j88.setBackground(white);
    }//GEN-LAST:event_j88ActionPerformed

    private void j00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j00ActionPerformed
        // TODO add your handling code here:
        j00.setText(turn);
        j00.setBackground(white);
    }//GEN-LAST:event_j00ActionPerformed

    private void j01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j01ActionPerformed
        // TODO add your handling code here:
        j01.setText(turn);
        j01.setBackground(white);
    }//GEN-LAST:event_j01ActionPerformed

    private void j02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j02ActionPerformed
        // TODO add your handling code here:
        j02.setText(turn);
        j02.setBackground(white);
    }//GEN-LAST:event_j02ActionPerformed

    private void j04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j04ActionPerformed
        // TODO add your handling code here:
        j04.setText(turn);
        j04.setBackground(white);
    }//GEN-LAST:event_j04ActionPerformed

    private void j05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j05ActionPerformed
        // TODO add your handling code here:
        j05.setText(turn);
        j05.setBackground(white);
    }//GEN-LAST:event_j05ActionPerformed

    private void j11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j11ActionPerformed
        // TODO add your handling code here:
        j11.setText(turn);
        j11.setBackground(white);
    }//GEN-LAST:event_j11ActionPerformed

    private void j12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j12ActionPerformed
        // TODO add your handling code here:
        j12.setText(turn);
        j12.setBackground(white);
    }//GEN-LAST:event_j12ActionPerformed

    private void j13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j13ActionPerformed
        // TODO add your handling code here:
        j13.setText(turn);
        j13.setBackground(white);
    }//GEN-LAST:event_j13ActionPerformed

    private void j21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j21ActionPerformed
        // TODO add your handling code here:
        j21.setText(turn);
        j21.setBackground(white);
    }//GEN-LAST:event_j21ActionPerformed

    private void j23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j23ActionPerformed
        // TODO add your handling code here:
        j23.setText(turn);
        j23.setBackground(white);
    }//GEN-LAST:event_j23ActionPerformed

    private void j25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j25ActionPerformed
        // TODO add your handling code here:
        j25.setText(turn);
        j25.setBackground(white);
    }//GEN-LAST:event_j25ActionPerformed

    private void j26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j26ActionPerformed
        // TODO add your handling code here:
        j26.setText(turn);
        j26.setBackground(white);
    }//GEN-LAST:event_j26ActionPerformed

    private void j28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j28ActionPerformed
        // TODO add your handling code here:
        j28.setText(turn);
        j28.setBackground(white);
    }//GEN-LAST:event_j28ActionPerformed

    private void j32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j32ActionPerformed
        // TODO add your handling code here:
        j32.setText(turn);
        j32.setBackground(white);
    }//GEN-LAST:event_j32ActionPerformed

    private void j33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j33ActionPerformed
        // TODO add your handling code here:
        j33.setText(turn);
        j33.setBackground(white);
    }//GEN-LAST:event_j33ActionPerformed

    private void j38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j38ActionPerformed
        // TODO add your handling code here:
        j38.setText(turn);
        j38.setBackground(white);
    }//GEN-LAST:event_j38ActionPerformed

    private void j40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j40ActionPerformed
        // TODO add your handling code here:
        j40.setText(turn);
        j40.setBackground(white);
    }//GEN-LAST:event_j40ActionPerformed

    private void j43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j43ActionPerformed
        // TODO add your handling code here:
        j43.setText(turn);
        j43.setBackground(white);
    }//GEN-LAST:event_j43ActionPerformed

    private void j44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j44ActionPerformed
        // TODO add your handling code here:
        j44.setText(turn);
        j44.setBackground(white);
    }//GEN-LAST:event_j44ActionPerformed

    private void j45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j45ActionPerformed
        // TODO add your handling code here:
        j45.setText(turn);
        j45.setBackground(white);
    }//GEN-LAST:event_j45ActionPerformed

    private void j48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j48ActionPerformed
        // TODO add your handling code here:
        j48.setText(turn);
        j48.setBackground(white);
    }//GEN-LAST:event_j48ActionPerformed

    private void j50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j50ActionPerformed
        // TODO add your handling code here:
        j50.setText(turn);
        j50.setBackground(white);
    }//GEN-LAST:event_j50ActionPerformed

    private void j55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j55ActionPerformed
        // TODO add your handling code here:
        j55.setText(turn);
        j55.setBackground(white);
    }//GEN-LAST:event_j55ActionPerformed

    private void j56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j56ActionPerformed
        // TODO add your handling code here:
        j56.setText(turn);
        j56.setBackground(white);
    }//GEN-LAST:event_j56ActionPerformed

    private void j57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j57ActionPerformed
        // TODO add your handling code here:
        j57.setText(turn);
        j57.setBackground(white);
    }//GEN-LAST:event_j57ActionPerformed

    private void j58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j58ActionPerformed
        // TODO add your handling code here:
        j58.setText(turn);
        j58.setBackground(white);
    }//GEN-LAST:event_j58ActionPerformed

    private void j60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j60ActionPerformed
        // TODO add your handling code here:
        j60.setText(turn);
        j60.setBackground(white);
    }//GEN-LAST:event_j60ActionPerformed

    private void j62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j62ActionPerformed
        // TODO add your handling code here:
        j62.setText(turn);
        j62.setBackground(white);
    }//GEN-LAST:event_j62ActionPerformed

    private void j63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j63ActionPerformed
        // TODO add your handling code here:
        j63.setText(turn);
        j63.setBackground(white);
    }//GEN-LAST:event_j63ActionPerformed

    private void j65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j65ActionPerformed
        // TODO add your handling code here:
        j65.setText(turn);
        j65.setBackground(white);
    }//GEN-LAST:event_j65ActionPerformed

    private void j67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j67ActionPerformed
        // TODO add your handling code here:
        j67.setText(turn);
        j67.setBackground(white);
    }//GEN-LAST:event_j67ActionPerformed

    private void j71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j71ActionPerformed
        // TODO add your handling code here:
        j71.setText(turn);
        j71.setBackground(white);
    }//GEN-LAST:event_j71ActionPerformed

    private void j72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j72ActionPerformed
        // TODO add your handling code here:
        j72.setText(turn);
        j72.setBackground(white);
    }//GEN-LAST:event_j72ActionPerformed

    private void j75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j75ActionPerformed
        // TODO add your handling code here:
        j75.setText(turn);
        j75.setBackground(white);
    }//GEN-LAST:event_j75ActionPerformed

    private void j76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j76ActionPerformed
        // TODO add your handling code here:
        j76.setText(turn);
        j76.setBackground(white);
    }//GEN-LAST:event_j76ActionPerformed

    private void j77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j77ActionPerformed
        // TODO add your handling code here:
        j77.setText(turn);
        j77.setBackground(white);
    }//GEN-LAST:event_j77ActionPerformed

    private void j83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j83ActionPerformed
        // TODO add your handling code here:
        j83.setText(turn);
        j83.setBackground(white);
    }//GEN-LAST:event_j83ActionPerformed

    private void j84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j84ActionPerformed
        // TODO add your handling code here:
        j84.setText(turn);
        j84.setBackground(white);
    }//GEN-LAST:event_j84ActionPerformed

    private void j86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j86ActionPerformed
        // TODO add your handling code here:
        j86.setText(turn);
        j86.setBackground(white);
    }//GEN-LAST:event_j86ActionPerformed

    private void j87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j87ActionPerformed
        // TODO add your handling code here:
        j87.setText(turn);
        j87.setBackground(white);
    }//GEN-LAST:event_j87ActionPerformed

    private void j03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j03ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j03ActionPerformed

    private void j06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j06ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j06ActionPerformed

    private void j07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j07ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j07ActionPerformed

    private void j08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j08ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j08ActionPerformed

    private void j10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j10ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j10ActionPerformed

    private void j14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j14ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j14ActionPerformed

    private void j15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j15ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j15ActionPerformed

    private void j16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j16ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j16ActionPerformed

    private void j18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j18ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j18ActionPerformed

    private void j20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j20ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j20ActionPerformed

    private void j22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j22ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j22ActionPerformed

    private void j24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j24ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j24ActionPerformed

    private void j27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j27ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j27ActionPerformed

    private void j34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j34ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j34ActionPerformed

    private void j35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j35ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j35ActionPerformed

    private void j37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j37ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j37ActionPerformed

    private void j41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j41ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j41ActionPerformed

    private void j42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j42ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j42ActionPerformed

    private void j46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j46ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j46ActionPerformed

    private void j47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j47ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_j47ActionPerformed

    private void j51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j51ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j51ActionPerformed

    private void j53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j53ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j53ActionPerformed

    private void j54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j54ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j54ActionPerformed

    private void j61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j61ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j61ActionPerformed

    private void j64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j64ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j64ActionPerformed

    private void j66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j66ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j66ActionPerformed

    private void j68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j68ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j68ActionPerformed

    private void j70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j70ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j70ActionPerformed

    private void j73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j73ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j73ActionPerformed

    private void j78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j78ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j78ActionPerformed

    private void j80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j80ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j80ActionPerformed

    private void j81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j81ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j81ActionPerformed

    private void j82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j82ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j82ActionPerformed

    private void j85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j85ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"This place allready allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_j85ActionPerformed

    private void select1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select1ActionPerformed
        // TODO add your handling code here:
        AssignTurn(select1);
        turn="1";
    }//GEN-LAST:event_select1ActionPerformed

    private void select2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select2ActionPerformed
        // TODO add your handling code here:
        AssignTurn(select2);
        turn="2";
    }//GEN-LAST:event_select2ActionPerformed

    private void select3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select3ActionPerformed
        // TODO add your handling code here:
        AssignTurn(select3);
        turn="3";
    }//GEN-LAST:event_select3ActionPerformed

    private void select4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select4ActionPerformed
        // TODO add your handling code here:
        AssignTurn(select4);
        turn="4";
    }//GEN-LAST:event_select4ActionPerformed

    private void select5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select5ActionPerformed
        // TODO add your handling code here:
        AssignTurn(select5);
        turn="5";
    }//GEN-LAST:event_select5ActionPerformed

    private void select6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select6ActionPerformed
        // TODO add your handling code here:
        AssignTurn(select6);
        turn="6";
    }//GEN-LAST:event_select6ActionPerformed

    private void select7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select7ActionPerformed
        // TODO add your handling code here:
        AssignTurn(select7);
        turn="7";
    }//GEN-LAST:event_select7ActionPerformed

    private void select8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select8ActionPerformed
        // TODO add your handling code here:
        AssignTurn(select8);
        turn="8";
    }//GEN-LAST:event_select8ActionPerformed

    private void select9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select9ActionPerformed
        // TODO add your handling code here:
        AssignTurn(select9);
        turn="9";
    }//GEN-LAST:event_select9ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("Reset");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want reset the game",
                "Sudoku Puzzl",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            ResetGame();
        }
        
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit",
                "Sudoku Puzzle",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void solutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionActionPerformed
        // TODO add your handling code here:
        seeSolution();
    }//GEN-LAST:event_solutionActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
         checkMoves();
    }//GEN-LAST:event_checkActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SudokuFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton check;
    private javax.swing.JButton exit;
    private javax.swing.JButton j00;
    private javax.swing.JButton j01;
    private javax.swing.JButton j02;
    private javax.swing.JButton j03;
    private javax.swing.JButton j04;
    private javax.swing.JButton j05;
    private javax.swing.JButton j06;
    private javax.swing.JButton j07;
    private javax.swing.JButton j08;
    private javax.swing.JButton j10;
    private javax.swing.JButton j11;
    private javax.swing.JButton j12;
    private javax.swing.JButton j13;
    private javax.swing.JButton j14;
    private javax.swing.JButton j15;
    private javax.swing.JButton j16;
    private javax.swing.JButton j17;
    private javax.swing.JButton j18;
    private javax.swing.JButton j20;
    private javax.swing.JButton j21;
    private javax.swing.JButton j22;
    private javax.swing.JButton j23;
    private javax.swing.JButton j24;
    private javax.swing.JButton j25;
    private javax.swing.JButton j26;
    private javax.swing.JButton j27;
    private javax.swing.JButton j28;
    private javax.swing.JButton j30;
    private javax.swing.JButton j31;
    private javax.swing.JButton j32;
    private javax.swing.JButton j33;
    private javax.swing.JButton j34;
    private javax.swing.JButton j35;
    private javax.swing.JButton j36;
    private javax.swing.JButton j37;
    private javax.swing.JButton j38;
    private javax.swing.JButton j40;
    private javax.swing.JButton j41;
    private javax.swing.JButton j42;
    private javax.swing.JButton j43;
    private javax.swing.JButton j44;
    private javax.swing.JButton j45;
    private javax.swing.JButton j46;
    private javax.swing.JButton j47;
    private javax.swing.JButton j48;
    private javax.swing.JButton j50;
    private javax.swing.JButton j51;
    private javax.swing.JButton j52;
    private javax.swing.JButton j53;
    private javax.swing.JButton j54;
    private javax.swing.JButton j55;
    private javax.swing.JButton j56;
    private javax.swing.JButton j57;
    private javax.swing.JButton j58;
    private javax.swing.JButton j60;
    private javax.swing.JButton j61;
    private javax.swing.JButton j62;
    private javax.swing.JButton j63;
    private javax.swing.JButton j64;
    private javax.swing.JButton j65;
    private javax.swing.JButton j66;
    private javax.swing.JButton j67;
    private javax.swing.JButton j68;
    private javax.swing.JButton j70;
    private javax.swing.JButton j71;
    private javax.swing.JButton j72;
    private javax.swing.JButton j73;
    private javax.swing.JButton j74;
    private javax.swing.JButton j75;
    private javax.swing.JButton j76;
    private javax.swing.JButton j77;
    private javax.swing.JButton j78;
    private javax.swing.JButton j80;
    private javax.swing.JButton j81;
    private javax.swing.JButton j82;
    private javax.swing.JButton j83;
    private javax.swing.JButton j84;
    private javax.swing.JButton j85;
    private javax.swing.JButton j86;
    private javax.swing.JButton j87;
    private javax.swing.JButton j88;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton reset;
    private javax.swing.JButton select1;
    private javax.swing.JButton select2;
    private javax.swing.JButton select3;
    private javax.swing.JButton select4;
    private javax.swing.JButton select5;
    private javax.swing.JButton select6;
    private javax.swing.JButton select7;
    private javax.swing.JButton select8;
    private javax.swing.JButton select9;
    private javax.swing.JButton solution;
    // End of variables declaration//GEN-END:variables
}
