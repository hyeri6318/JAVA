/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.java_project.professor;

import cse.oop2.java_project.professor.ProfessorPage;
import static cse.oop2.java_project.professor.ProfessorPage.lecture_num;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 이혜리
 */
public class GradeInput extends javax.swing.JFrame {

    /**
     * Creates new form GradeInput
     */
    public GradeInput() {
        initComponents();
    }

    String URL = null;

    public GradeInput(String URL) {
        initComponents();
        this.URL = URL + "\\stcourse.txt";
    }

    // 강좌 일치 비교
    ArrayList<String> num_list = new ArrayList<>();

    private boolean CourseCompare() {
        try {
            String[] array = null;

            BufferedReader is = new BufferedReader(new FileReader(URL));

            Path path = Paths.get(URL);
            Charset cs = StandardCharsets.UTF_8;

            ArrayList<String> list = new ArrayList<>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);

            ArrayList<String> list_temp = new ArrayList<>();

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");
                num_list.add((temp[2])); // 강좌번호
            }

            for (int i = 0; i < num_list.size(); i++) {
                if (ProfessorPage.lecture_num.equals(num_list.get(i))) {
                    return true;
                }
            }

            is.close();
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        return false;
    }

    private boolean CompareName(String[] cmp_temp) {

        String[] cmp = cmp_temp;
        try {
            for (int j = 0; j < jTable2.getRowCount(); j++) {
                if (cmp[0].equals(jTable2.getValueAt(j, 0).toString()) && cmp[1].equals(jTable2.getValueAt(j, 1).toString())) {
                    return false;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }

    String student_num = null;

    private boolean GradeCompare() {
        String grade = Grade_INPUT.getText();
        if (grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("F")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "학점은 A, B, C, D, E 중 하나가 입력되어야 합니다.");
            return false;
        }
    }

    ArrayList<String> snum_list = new ArrayList<>(); //학번 리스트
    ArrayList<String> sname_list = new ArrayList<>(); // 학생이름 리스트
    ArrayList<String> lnum_list = new ArrayList<>(); // 강좌번호 리스트
    ArrayList<String> lname_list = new ArrayList<>(); // 강좌명 리스트
    ArrayList<String> major_list = new ArrayList<>(); // 개설학과 리스트
    ArrayList<String> professor_list = new ArrayList<>(); // 교수이름 리스트
    ArrayList<String> score_list = new ArrayList<>(); // 학점 리스트
    ArrayList<String> info_list = new ArrayList<>(); // 강의정보 리스트
    ArrayList<String> grade_list = new ArrayList<>(); // 성적정보 리스트
    
    private boolean SNumCompare(int index) {
        if (student_num.equals(snum_list.get(index))) {
            return true;
        } else {
            return false;
        }
    }

    private boolean LNumCompare(int index) {
        if (ProfessorPage.lecture_num.equals(lnum_list.get(index))) {
            return true;
        } else {
            return false;
        }
    }

    private void NewFileCreat() {
        try {
            File file = new File(URL);
            FileWriter writer;
            writer = new FileWriter(file, false);
            String s = "/";
            String n = "\n";
            for (int i = 0; i < snum_list.size(); i++) {
                writer.write(snum_list.get(i));
                writer.write(s);
                writer.write(sname_list.get(i));
                writer.write(s);
                writer.write(lnum_list.get(i));
                writer.write(s);
                writer.write(lname_list.get(i));
                writer.write(s);
                writer.write(major_list.get(i));
                writer.write(s);
                writer.write(professor_list.get(i));
                writer.write(s);
                writer.write(score_list.get(i));
                writer.write(s);
                writer.write(info_list.get(i));
                writer.write(s);
                writer.write(grade_list.get(i));
                
                writer.write(n);
                writer.flush();
            }
            writer.close();

            snum_list.clear();
            sname_list.clear();
            lnum_list.clear();
            lname_list.clear();
            major_list.clear();
            professor_list.clear();
            score_list.clear();
            info_list.clear();
            grade_list.clear();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BUTT_Close = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        BUTT_Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Grade_INPUT = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BUTT_Close.setText("종료");
        BUTT_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTT_CloseActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "학번", "이름", "학점"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        BUTT_Back.setText("돌아가기");
        BUTT_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTT_BackActionPerformed(evt);
            }
        });

        jLabel1.setText("성적입력");

        jLabel2.setText("성적");

        Grade_INPUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Grade_INPUTActionPerformed(evt);
            }
        });

        jButton3.setText("입력");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("조회");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BUTT_Back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BUTT_Close))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 635, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Grade_INPUT, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(328, 328, 328))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Grade_INPUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUTT_Back)
                    .addComponent(BUTT_Close))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUTT_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTT_CloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BUTT_CloseActionPerformed

    private void BUTT_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTT_BackActionPerformed
        // TODO add your handling code here:
        ProfessorPage back = new ProfessorPage();
        back.setVisible(true);
        dispose();
    }//GEN-LAST:event_BUTT_BackActionPerformed

    private void Grade_INPUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Grade_INPUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Grade_INPUTActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        if (jTable2.getSelectedRowCount() == 1) {
            if (GradeCompare()) {
                String score = Grade_INPUT.getText();
                model.setValueAt(score, jTable2.getSelectedRow(), 2);
            }
        }

        try {
            String str;
            String[] array = null;

            BufferedReader is = new BufferedReader(new FileReader(URL));

            Path path = Paths.get(URL);
            Charset cs = StandardCharsets.UTF_8;

            ArrayList<String> list = new ArrayList<String>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);

            ArrayList<String> list_temp = new ArrayList<String>();
            is.close();

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");
                snum_list.add(temp[0]);
                sname_list.add(temp[1]);
                lnum_list.add(temp[2]);
                lname_list.add(temp[3]);
                major_list.add(temp[4]);
                professor_list.add(temp[5]);
                score_list.add(temp[6]);
                info_list.add(temp[7]);
                grade_list.add(temp[8]);
            }

            int ch = 0;
            int index = 0;
            for (int i = 0; i < snum_list.size(); i++) {
                if (SNumCompare(i)) {
                    grade_list.set(i, Grade_INPUT.getText());
                    ch = 0;
                    break;
                } else {
                    ch = -1;

                }
            }

            if (ch == -1) {
                JOptionPane.showMessageDialog(null, "오류발생.");
            } else {
                NewFileCreat();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // 교수 첫번째 페이지에서 클릭한 강좌번호와 stcourse에 저장되어있는 강좌번호가 일치하는 조건 추가
        String filePath = URL;
        File file = new File(filePath);

        try {
            BufferedReader read = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

            // 텍스트파일에서 한 줄씩 읽어옴.
            Object[] tableline = read.lines().toArray();

            if (CourseCompare()) {
                for (int i = 0; i < tableline.length; i++) {
                    if (ProfessorPage.lecture_num.equals(num_list.get(i))) {
                        String line = tableline[i].toString().trim();
                        String[] dataRow = line.split("/");
                        ArrayList arr = new ArrayList<>();

                        if (jTable2.getRowCount() == 0) {
                            arr.add(dataRow[0]);
                            arr.add(dataRow[1]);
                            arr.add(dataRow[8]);

                            model.addRow(new Object[]{arr.get(0), arr.get(1),arr.get(2)});
                        } else {
                            if (CompareName(dataRow)) {
                                arr.add(dataRow[0]);
                                arr.add(dataRow[1]);
                                arr.add(dataRow[8]);
                                
                                model.addRow(new Object[]{arr.get(0), arr.get(1),arr.get(2)});
                            }
                        }
                    }

                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int number = jTable2.getSelectedRow();
        student_num = jTable2.getValueAt(number, 0).toString();
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(GradeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeInput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTT_Back;
    private javax.swing.JButton BUTT_Close;
    private javax.swing.JTextField Grade_INPUT;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
