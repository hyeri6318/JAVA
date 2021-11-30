/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.java_project.lectureclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 정민수,윤채민
 */
public class ChangeLecture extends javax.swing.JFrame {

    /**
     * Creates new form ChangeLecture
     */
    public ChangeLecture() {
        initComponents();
    }

    String URL = null;

    public ChangeLecture(String URL) {
        initComponents();
        setTitle("수업 담당자 - 강좌 수정");
        this.URL = URL + "\\lectureclass_temp.txt";
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        temp_name = new javax.swing.JTextField();
        temp_major = new javax.swing.JTextField();
        temp_score = new javax.swing.JTextField();
        result_name = new javax.swing.JTextField();
        result_major = new javax.swing.JTextField();
        result_score = new javax.swing.JTextField();
        result_info = new javax.swing.JTextField();
        check = new javax.swing.JCheckBox();
        Change = new javax.swing.JButton();
        Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("기존 정보");

        jLabel2.setText("변경 정보");

        jLabel3.setText("강좌명");

        jLabel4.setText("개설학과");

        jLabel5.setText("학점");

        jLabel6.setText("강좌 정보");

        check.setText("정보 변경 동의");

        Change.setText("수정");
        Change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeActionPerformed(evt);
            }
        });

        Close.setText("닫기");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(temp_score, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(temp_major, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addComponent(temp_name, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Close)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(result_major, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(result_name, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(result_score, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(result_info, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(check)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(Change, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(temp_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(temp_major, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result_major, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(temp_score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result_score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(result_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check)
                    .addComponent(Change)
                    .addComponent(Close)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<String> num_list = new ArrayList<>(); // 강의 번호 리스트
    ArrayList<String> name_list = new ArrayList<>(); // 강의명 리스트
    ArrayList<String> major_list = new ArrayList<>(); // 개설학과 리스트
    ArrayList<String> professor_list = new ArrayList<>(); // 교수 이름 리스트
    ArrayList<String> score_list = new ArrayList<>(); // 학점 리스트
    ArrayList<String> info_list = new ArrayList<>(); // 강의 정보 리스트

    private boolean InfoCompare(int index) {
        // 변경하고자 하는 값이 일치할 때 true 반환
        if ((temp_name.getText().equals(name_list.get(index))) && (temp_major.getText().equals(major_list.get(index))) && (temp_score.getText().equals(score_list.get(index)))) {
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
            for (int i = 0; i < name_list.size(); i++) {
                String s = "/";
                String n = "\n";
                writer.write(num_list.get(i));
                writer.write(s);
                writer.write(name_list.get(i));
                writer.write(s);
                writer.write(major_list.get(i));
                writer.write(s);
                writer.write(professor_list.get(i));
                writer.write(s);
                writer.write(score_list.get(i));
                writer.write(s);
                writer.write(info_list.get(i));
                writer.write(n);

                writer.flush();// 출력은 버퍼에 쌓여있기에 쌓인 버퍼를 목적지로 보내줌
            }
            JOptionPane.showMessageDialog(null, "정보 수정 완료");
            writer.close();

            num_list.clear();
            name_list.clear();
            major_list.clear();
            professor_list.clear();
            score_list.clear();
            info_list.clear();

        } catch (IOException ex) {
            System.out.println("오류발생");
        }
    }

    private void ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeActionPerformed
        // TODO add your handling code here:
        if (check.isSelected()) { // 동의가 체크되어 있다면
            try {

                String str; // 메모장 안에 있는 데이터를 읽어와 저장
                String[] array = null;

                BufferedReader is = new BufferedReader(new FileReader(URL));
                // BufferedReader is = new BufferedReader(new FileReader(URL));

                //파일 객체 생성
                Path path = Paths.get(URL);
                // 캐릭터셋 지정
                Charset cs = StandardCharsets.UTF_8;
                // 파일 내용을 담을 리스트
                ArrayList<String> list = new ArrayList<String>();
                list = (ArrayList<String>) Files.readAllLines(path, cs);
                // 모든 파일 내용 읽어와서 저장
                ArrayList<String> list_temp = new ArrayList<String>(); // 임시 저장
                is.close();

                for (String i : list) {
                    array = i.split("\n");
                    list_temp.add(array[0]);
                }

                for (String i : list_temp) {
                    String[] temp = i.split("/");

                    num_list.add(temp[0]);
                    name_list.add(temp[1]);
                    major_list.add(temp[2]);
                    professor_list.add(temp[3]);
                    score_list.add(temp[4]);
                    info_list.add(temp[5]);

                }

                int ch = 0; // 0이면 정상 종료, -1 이면 기존 정보가 없음
                int index = 0; // 새로운 파일에 복사하기 위함
                for (int i = 0; i < name_list.size(); i++) {
                    if (InfoCompare(i)) {
                        name_list.set(i, result_name.getText());
                        major_list.set(i, result_major.getText());
                        score_list.set(i, result_score.getText());
                        info_list.add(i, result_info.getText());
                        ch = 0;
                        break;
                    } else {
                        ch = -1;
                    }
                }

                if (ch == -1) {
                    JOptionPane.showMessageDialog(null, "기존 정보가 존재하지 않습니다.");
                } else {
                    NewFileCreat(); // 파일에 기록 후 종료
                }
                dispose();

            } catch (IOException E10) {
                E10.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "정보 수정 동의를 체크해주시기 바랍니다.");
        }
    }//GEN-LAST:event_ChangeActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CloseActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeLecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeLecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeLecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeLecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeLecture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change;
    private javax.swing.JButton Close;
    private javax.swing.JCheckBox check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField result_info;
    private javax.swing.JTextField result_major;
    private javax.swing.JTextField result_name;
    private javax.swing.JTextField result_score;
    private javax.swing.JTextField temp_major;
    private javax.swing.JTextField temp_name;
    private javax.swing.JTextField temp_score;
    // End of variables declaration//GEN-END:variables
}
