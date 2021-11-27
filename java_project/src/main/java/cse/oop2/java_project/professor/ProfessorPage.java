/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.java_project.professor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 이혜리, 정민수
 */
public class ProfessorPage extends javax.swing.JFrame {

    /**
     * Creates new form ProfessorPage
     */
    public ProfessorPage() {
        initComponents();
    }

    String URL = null;
    String name = null;
    static String lecture_num = null;

    public ProfessorPage(String URL) {
        initComponents();
        this.URL = URL;
    }

    String URL_lecture = null;
    public ProfessorPage(String URL, String name) {
        initComponents();
        this.URL = URL;
        this.URL_lecture =  URL + "\\lectureclass.txt";
        this.name = name;
    }

    private boolean ProfessorNameCompare() {
        try {

            //String str=null;
            String[] array = null;

            BufferedReader is = new BufferedReader(new FileReader(URL_lecture));

            Path path = Paths.get(URL_lecture);
            Charset cs = StandardCharsets.UTF_8;

            ArrayList<String> list = new ArrayList<>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);

            ArrayList<String> list_temp = new ArrayList<>();
            ArrayList<String> name_list = new ArrayList<>();

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");
                name_list.add(temp[3]);
            }

            for (int i = 0; i < name_list.size(); i++) {
                if (name.equals(name_list.get(i))) {
                    return true;
                }
            }
            is.close();
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BUTT_ChangePW = new javax.swing.JButton();
        BUTT_SearchStudent = new javax.swing.JButton();
        BUTT_SearchAttendance = new javax.swing.JButton();
        BUTT_InputGrade = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("교수페이지");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "강좌번호", "강좌이름"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        BUTT_ChangePW.setText("비밀번호 변경");
        BUTT_ChangePW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTT_ChangePWActionPerformed(evt);
            }
        });

        BUTT_SearchStudent.setText("학생 명단 조회");
        BUTT_SearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTT_SearchStudentActionPerformed(evt);
            }
        });

        BUTT_SearchAttendance.setText("출석부 조회");
        BUTT_SearchAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTT_SearchAttendanceActionPerformed(evt);
            }
        });

        BUTT_InputGrade.setText("성적 입력");
        BUTT_InputGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTT_InputGradeActionPerformed(evt);
            }
        });

        jButton1.setText("조회");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(BUTT_ChangePW, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BUTT_SearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BUTT_SearchAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BUTT_InputGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(104, 104, 104)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUTT_ChangePW, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUTT_SearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUTT_SearchAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUTT_InputGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUTT_ChangePWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTT_ChangePWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BUTT_ChangePWActionPerformed

    private void BUTT_SearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTT_SearchStudentActionPerformed
        // TODO add your handling code here:
        StudentList student = new StudentList(URL);
        student.setVisible(true);
        dispose();
    }//GEN-LAST:event_BUTT_SearchStudentActionPerformed

    private void BUTT_SearchAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTT_SearchAttendanceActionPerformed
        // TODO add your handling code here;
        AttendanceList attend = new AttendanceList(URL);
        attend.setVisible(true);
        dispose();
    }//GEN-LAST:event_BUTT_SearchAttendanceActionPerformed

    private void BUTT_InputGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTT_InputGradeActionPerformed
        // TODO add your handling code here:
        GradeInput grade = new GradeInput(URL);
        grade.setVisible(true);
        dispose();
    }//GEN-LAST:event_BUTT_InputGradeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean name_compare = ProfessorNameCompare();

        if (name_compare) {
            try {
                String filePath = URL_lecture;
                File file = new File(filePath);

                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                BufferedReader read = new BufferedReader(new FileReader(file));

                Object[] tableline = read.lines().toArray();

                for (int i = 0; i < tableline.length; i++) {
                    String line = tableline[i].toString().trim();
                    String[] dataRow = line.split("/");

                    ArrayList arr = new ArrayList<>();
                    arr.add(dataRow[0]);
                    arr.add(dataRow[1]);

                    model.addRow(new Object[]{arr.get(0), arr.get(1)});
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "배정된 강좌가 없습니다.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int number = jTable1.getSelectedRow();

        lecture_num = jTable1.getValueAt(number, 0).toString();


    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(ProfessorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfessorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfessorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfessorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfessorPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTT_ChangePW;
    private javax.swing.JButton BUTT_InputGrade;
    private javax.swing.JButton BUTT_SearchAttendance;
    private javax.swing.JButton BUTT_SearchStudent;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
