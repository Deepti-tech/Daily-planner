/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// package dailyplanner;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author DEEPTI SINGH
 */
public class MainPage extends javax.swing.JFrame {

    public MainPage() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        TabbedPane = new javax.swing.JTabbedPane();
        Board_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AddNewTask = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Status_panel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Pending_task = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Completed_task = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Category_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Work = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Personal = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Health = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        TabbedPane.setBackground(new java.awt.Color(255, 255, 102));
        TabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        TabbedPane.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        TabbedPane.setOpaque(true);

        Board_panel.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("ScriptC", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DEEPTI SINGH\\Downloads\\edit-tools.png")); // NOI18N
        jLabel1.setText(" Create your first board");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        AddNewTask.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AddNewTask.setText("+");
        AddNewTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddNewTaskMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel2.setText("New Task");

        javax.swing.GroupLayout Board_panelLayout = new javax.swing.GroupLayout(Board_panel);
        Board_panel.setLayout(Board_panelLayout);
        Board_panelLayout.setHorizontalGroup(
                Board_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Board_panelLayout.createSequentialGroup()
                                .addGap(411, 411, 411)
                                .addComponent(AddNewTask)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Board_panelLayout.createSequentialGroup()
                                .addContainerGap(238, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 629,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(188, 188, 188)));
        Board_panelLayout.setVerticalGroup(
                Board_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Board_panelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Board_panelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AddNewTask)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(65, Short.MAX_VALUE)));

        TabbedPane.addTab("Board", Board_panel);

        Status_panel.setBackground(new java.awt.Color(153, 153, 255));

        jLabel10.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel10.setText("Pending tasks:");

        Pending_task.setBackground(new java.awt.Color(0, 51, 102));
        Pending_task.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        Pending_task.setForeground(new java.awt.Color(255, 255, 255));
        Pending_task.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Name", "Due", "Priority", "Category"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        Pending_task.setFillsViewportHeight(true);
        Pending_task.setGridColor(new java.awt.Color(204, 204, 204));
        Pending_task.setRowHeight(20);
        Pending_task.setSelectionBackground(new java.awt.Color(204, 255, 204));
        Pending_task.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane5.setViewportView(Pending_task);

        jLabel11.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel11.setText("Completed tasks:");

        Completed_task.setBackground(new java.awt.Color(0, 51, 102));
        Completed_task.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        Completed_task.setForeground(new java.awt.Color(255, 255, 255));
        Completed_task.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Name", "Due", "Priority", "Category"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        Completed_task.setFillsViewportHeight(true);
        Completed_task.setGridColor(new java.awt.Color(204, 204, 204));
        Completed_task.setRowHeight(20);
        Completed_task.setSelectionBackground(new java.awt.Color(204, 255, 204));
        Completed_task.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane6.setViewportView(Completed_task);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\DEEPTI SINGH\\Downloads\\working.png")); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\DEEPTI SINGH\\Downloads\\check.png")); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout Status_panelLayout = new javax.swing.GroupLayout(Status_panel);
        Status_panel.setLayout(Status_panelLayout);
        Status_panelLayout.setHorizontalGroup(
                Status_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Status_panelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(Status_panelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Status_panelLayout.createSequentialGroup()
                                                .addGroup(Status_panelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(Status_panelLayout.createSequentialGroup()
                                                                .addGap(17, 17, 17)
                                                                .addComponent(jLabel4))
                                                        .addGroup(Status_panelLayout.createSequentialGroup()
                                                                .addComponent(jLabel6,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel11)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(Status_panelLayout.createSequentialGroup()
                                                .addGroup(Status_panelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(Status_panelLayout.createSequentialGroup()
                                                                .addGroup(Status_panelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(Status_panelLayout
                                                                                .createSequentialGroup()
                                                                                .addGap(11, 11, 11)
                                                                                .addComponent(jLabel3))
                                                                        .addComponent(jLabel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel10)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(jScrollPane6)
                                                        .addComponent(jScrollPane5,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 993,
                                                                Short.MAX_VALUE))
                                                .addGap(36, 36, 36)))));
        Status_panelLayout.setVerticalGroup(
                Status_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Status_panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Status_panelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(Status_panelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel5))
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 171,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Status_panelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Status_panelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel6))
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 171,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(62, Short.MAX_VALUE)));

        TabbedPane.addTab("Status", Status_panel);

        Category_panel.setBackground(new java.awt.Color(153, 153, 255));
        Category_panel.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Work",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe Script", 3, 18))); // NOI18N

        Work.setBackground(new java.awt.Color(0, 51, 102));
        Work.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        Work.setForeground(new java.awt.Color(255, 255, 255));
        Work.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Name", "Due", "Priority"
                }));
        Work.setFillsViewportHeight(true);
        Work.setRowHeight(18);
        jScrollPane2.setViewportView(Work);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe Script", 3, 18))); // NOI18N

        Personal.setBackground(new java.awt.Color(0, 51, 102));
        Personal.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        Personal.setForeground(new java.awt.Color(255, 255, 255));
        Personal.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Name", "Due", "Priority"
                }));
        Personal.setFillsViewportHeight(true);
        Personal.setRowHeight(18);
        jScrollPane3.setViewportView(Personal);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));

        jPanel7.setBackground(new java.awt.Color(153, 153, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Health",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe Script", 3, 18))); // NOI18N

        Health.setBackground(new java.awt.Color(0, 51, 102));
        Health.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        Health.setForeground(new java.awt.Color(255, 255, 255));
        Health.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Name", "Due", "Priority"
                }));
        Health.setFillsViewportHeight(true);
        Health.setRowHeight(18);
        jScrollPane4.setViewportView(Health);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE));
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE));

        javax.swing.GroupLayout Category_panelLayout = new javax.swing.GroupLayout(Category_panel);
        Category_panel.setLayout(Category_panelLayout);
        Category_panelLayout.setHorizontalGroup(
                Category_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Category_panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        Category_panelLayout.setVerticalGroup(
                Category_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                Category_panelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(Category_panelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addContainerGap()));

        TabbedPane.addTab("Category", Category_panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TabbedPane));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TabbedPane));

        pack();
    }// </editor-fold>

    private void AddNewTaskMouseClicked(java.awt.event.MouseEvent evt) {
        NewTask main = new NewTask();
        main.setVisible(true);
        main.pack();
        this.dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton AddNewTask;
    private javax.swing.JPanel Board_panel;
    private javax.swing.JPanel Category_panel;
    private javax.swing.JTable Completed_task;
    private javax.swing.JTable Health;
    private javax.swing.JTable Pending_task;
    private javax.swing.JTable Personal;
    private javax.swing.JPanel Status_panel;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JTable Work;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration
}
