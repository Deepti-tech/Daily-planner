/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// package dailyplanner;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author DEEPTI SINGH
 */
public class NewTask extends javax.swing.JFrame implements TableCellRenderer {

    DefaultTableModel tbModel;

    public NewTask() {
        initComponents();
        UpdateTask_Panel.setVisible(false);
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    Connection con;
    PreparedStatement ps, ps1, ps2, ps3, ps4, ps5;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PriorDue = new javax.swing.ButtonGroup();
        FilterSort = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Task = new javax.swing.JTabbedPane();
        AddTask_Panel = new javax.swing.JPanel();
        AddDetails = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TaskName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DueDate = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        Category = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Priority = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Board_panel = new javax.swing.JPanel();
        AddTask = new javax.swing.JButton();
        TablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TaskTable = new javax.swing.JTable();
        SortButton = new javax.swing.JRadioButton();
        FilterButton = new javax.swing.JRadioButton();
        Refresh = new javax.swing.JButton();
        Completed = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Status_panel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Pending_task = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        Completed_task = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Category_panel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Personal = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Work = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Health = new javax.swing.JTable();
        Filter = new javax.swing.JPanel();
        Apply = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Today = new javax.swing.JRadioButton();
        Tomorrow = new javax.swing.JRadioButton();
        InAWeek = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        Low = new javax.swing.JRadioButton();
        High = new javax.swing.JRadioButton();
        Sort = new javax.swing.JPanel();
        Apply1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Ascending = new javax.swing.JRadioButton();
        Descending = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        Low1 = new javax.swing.JRadioButton();
        High1 = new javax.swing.JRadioButton();
        UpdateTask_Panel = new javax.swing.JPanel();
        UpdateDetails = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        TaskName1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        DueDate1 = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        Category1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        Priority1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Task.setBackground(new java.awt.Color(255, 255, 102));
        Task.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        Task.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        Task.setOpaque(true);
        Task.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaskMouseClicked(evt);
            }
        });

        AddTask_Panel.setBackground(new java.awt.Color(153, 153, 255));
        AddTask_Panel.setDoubleBuffered(false);
        AddTask_Panel.setEnabled(false);

        AddDetails.setBackground(new java.awt.Color(255, 255, 204));
        AddDetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AddDetails.setForeground(new java.awt.Color(0, 102, 102));
        AddDetails.setText("Add");
        AddDetails.setAlignmentY(0.0F);
        AddDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddDetailsMouseClicked(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(153, 153, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setText("Task name:");

        TaskName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel3.setText("Due date:");

        DueDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        DueDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DueDate.setText("YY/MM/DD");
        DueDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DueDateMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel5.setText("Category:");

        Category.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Category.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Personal", "Health", "Work" }));
        Category.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel4.setText("Priority:");

        Priority.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Priority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "High" }));
        Priority.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TaskName, javax.swing.GroupLayout.PREFERRED_SIZE, 330,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Priority, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(128, Short.MAX_VALUE)));
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel2))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel8Layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(TaskName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Priority, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addContainerGap(61, Short.MAX_VALUE)));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel1.setText("New Task");

        jLabel9.setText("jLabel5");

        javax.swing.GroupLayout AddTask_PanelLayout = new javax.swing.GroupLayout(AddTask_Panel);
        AddTask_Panel.setLayout(AddTask_PanelLayout);
        AddTask_PanelLayout.setHorizontalGroup(
                AddTask_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AddTask_PanelLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddTask_PanelLayout
                                .createSequentialGroup()
                                .addGap(24, 179, Short.MAX_VALUE)
                                .addGroup(AddTask_PanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                AddTask_PanelLayout.createSequentialGroup()
                                                        .addComponent(AddDetails)
                                                        .addGap(107, 107, 107))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                AddTask_PanelLayout.createSequentialGroup()
                                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(167, 167, 167)))));
        AddTask_PanelLayout.setVerticalGroup(
                AddTask_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AddTask_PanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(AddTask_PanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(AddDetails)
                                .addContainerGap(43, Short.MAX_VALUE)));

        Task.addTab("Add task", AddTask_Panel);

        Board_panel.setBackground(new java.awt.Color(153, 153, 255));
        Board_panel.setMaximumSize(new java.awt.Dimension(1000, 1000));
        Board_panel.setPreferredSize(new java.awt.Dimension(1000, 500));

        AddTask.setBackground(new java.awt.Color(255, 255, 51));
        AddTask.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        AddTask.setText("Add new task");
        AddTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTaskActionPerformed(evt);
            }
        });

        TaskTable.setBackground(new java.awt.Color(0, 51, 102));
        TaskTable.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        TaskTable.setForeground(new java.awt.Color(255, 255, 255));
        TaskTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Name", "Due", "Priority", "Category", "Days left"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        TaskTable.setFillsViewportHeight(true);
        TaskTable.setGridColor(new java.awt.Color(204, 204, 204));
        TaskTable.setRowHeight(20);
        TaskTable.setSelectionBackground(new java.awt.Color(204, 255, 204));
        TaskTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        TaskTable.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(TaskTable);
        TaskTable.getColumnModel().getSelectionModel()
                .setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout TablePanelLayout = new javax.swing.GroupLayout(TablePanel);
        TablePanel.setLayout(TablePanelLayout);
        TablePanelLayout.setHorizontalGroup(
                TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE));
        TablePanelLayout.setVerticalGroup(
                TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE));

        FilterSort.add(SortButton);
        SortButton.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        SortButton.setText("Sort");
        SortButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SortButtonMouseClicked(evt);
            }
        });

        FilterSort.add(FilterButton);
        FilterButton.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        FilterButton.setText("Filter");
        FilterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilterButtonMouseClicked(evt);
            }
        });

        Refresh.setBackground(new java.awt.Color(255, 255, 51));
        Refresh.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshMouseClicked(evt);
            }
        });

        Completed.setBackground(new java.awt.Color(255, 255, 51));
        Completed.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        Completed.setText("Completed");
        Completed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompletedMouseClicked(evt);
            }
        });

        Update.setBackground(new java.awt.Color(255, 255, 51));
        Update.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        Update.setText("Update");
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Board_panelLayout = new javax.swing.GroupLayout(Board_panel);
        Board_panel.setLayout(Board_panelLayout);
        Board_panelLayout.setHorizontalGroup(
                Board_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Board_panelLayout.createSequentialGroup()
                                .addGap(0, 34, Short.MAX_VALUE)
                                .addGroup(Board_panelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Board_panelLayout.createSequentialGroup()
                                                .addGroup(Board_panelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(Board_panelLayout.createSequentialGroup()
                                                                .addComponent(Update)
                                                                .addGap(32, 32, 32)
                                                                .addComponent(Completed)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(Refresh))
                                                        .addGroup(Board_panelLayout.createSequentialGroup()
                                                                .addComponent(AddTask)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(FilterButton)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(SortButton)))
                                                .addGap(62, 62, 62))
                                        .addGroup(Board_panelLayout.createSequentialGroup()
                                                .addComponent(TablePanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(114, Short.MAX_VALUE)))));
        Board_panelLayout.setVerticalGroup(
                Board_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Board_panelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(Board_panelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SortButton)
                                        .addComponent(FilterButton)
                                        .addComponent(AddTask))
                                .addGap(35, 35, 35)
                                .addComponent(TablePanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(Board_panelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Refresh)
                                        .addComponent(Completed)
                                        .addComponent(Update))
                                .addContainerGap(54, Short.MAX_VALUE)));

        Task.addTab("Board", Board_panel);

        Status_panel.setBackground(new java.awt.Color(153, 153, 255));
        Status_panel.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel10.setText("Pending tasks:");

        jLabel11.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel11.setText("Completed tasks:");

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
        Pending_task.getColumnModel().getSelectionModel()
                .setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

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
        Completed_task.getColumnModel().getSelectionModel()
                .setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout Status_panelLayout = new javax.swing.GroupLayout(Status_panel);
        Status_panel.setLayout(Status_panelLayout);
        Status_panelLayout.setHorizontalGroup(
                Status_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Status_panelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(Status_panelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                Status_panelLayout.createSequentialGroup()
                                                        .addGap(8, 8, 8)
                                                        .addComponent(jLabel6)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel10)
                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(36, 36, 36))
                        .addGroup(Status_panelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        Status_panelLayout.setVerticalGroup(
                Status_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Status_panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Status_panelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 171,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Status_panelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 171,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE)));

        Task.addTab("Status", Status_panel);

        Category_panel.setBackground(new java.awt.Color(153, 153, 255));

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
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));

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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));

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
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE));
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE));

        javax.swing.GroupLayout Category_panelLayout = new javax.swing.GroupLayout(Category_panel);
        Category_panel.setLayout(Category_panelLayout);
        Category_panelLayout.setHorizontalGroup(
                Category_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Category_panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7)));
        Category_panelLayout.setVerticalGroup(
                Category_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Category_panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Category_panelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(30, Short.MAX_VALUE)));

        Task.addTab("Category", Category_panel);

        Apply.setBackground(new java.awt.Color(255, 204, 153));
        Apply.setFont(new java.awt.Font("Nirmala UI", 2, 14)); // NOI18N
        Apply.setText("Apply");
        Apply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApplyMouseClicked(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "By Due Date",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe Script", 1, 14))); // NOI18N

        PriorDue.add(Today);
        Today.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        Today.setText("Today");

        PriorDue.add(Tomorrow);
        Tomorrow.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        Tomorrow.setText("Tomorrow");

        PriorDue.add(InAWeek);
        InAWeek.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        InAWeek.setText("In a week");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Tomorrow)
                                        .addComponent(Today)
                                        .addComponent(InAWeek))
                                .addContainerGap(137, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Today)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tomorrow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(InAWeek)
                                .addGap(0, 42, Short.MAX_VALUE)));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "By Priority",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe Script", 1, 14))); // NOI18N

        PriorDue.add(Low);
        Low.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        Low.setText("Low");

        PriorDue.add(High);
        High.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        High.setText("High");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(High)
                                        .addComponent(Low))
                                .addContainerGap(173, Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(16, Short.MAX_VALUE)
                                .addComponent(High)
                                .addGap(18, 18, 18)
                                .addComponent(Low)
                                .addGap(33, 33, 33)));

        javax.swing.GroupLayout FilterLayout = new javax.swing.GroupLayout(Filter);
        Filter.setLayout(FilterLayout);
        FilterLayout.setHorizontalGroup(
                FilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FilterLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Apply)
                                .addGap(24, 24, 24))
                        .addGroup(FilterLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(FilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(126, Short.MAX_VALUE)));
        FilterLayout.setVerticalGroup(
                FilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FilterLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Apply)
                                .addContainerGap()));

        Apply1.setBackground(new java.awt.Color(255, 204, 153));
        Apply1.setFont(new java.awt.Font("Nirmala UI", 2, 14)); // NOI18N
        Apply1.setText("Apply");
        Apply1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Apply1MouseClicked(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "By Due Date",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe Script", 1, 14))); // NOI18N

        PriorDue.add(Ascending);
        Ascending.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        Ascending.setText("Ascending");

        PriorDue.add(Descending);
        Descending.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        Descending.setText("Descending");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Descending)
                                        .addComponent(Ascending))
                                .addContainerGap(124, Short.MAX_VALUE)));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(Ascending)
                                .addGap(18, 18, 18)
                                .addComponent(Descending)
                                .addContainerGap(41, Short.MAX_VALUE)));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "By Priority",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe Script", 1, 14))); // NOI18N

        PriorDue.add(Low1);
        Low1.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        Low1.setText("Low");

        PriorDue.add(High1);
        High1.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        High1.setText("High");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(High1)
                                        .addComponent(Low1))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(16, Short.MAX_VALUE)
                                .addComponent(High1)
                                .addGap(18, 18, 18)
                                .addComponent(Low1)
                                .addGap(33, 33, 33)));

        javax.swing.GroupLayout SortLayout = new javax.swing.GroupLayout(Sort);
        Sort.setLayout(SortLayout);
        SortLayout.setHorizontalGroup(
                SortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SortLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Apply1))
                        .addGroup(SortLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(
                                        SortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(83, Short.MAX_VALUE)));
        SortLayout.setVerticalGroup(
                SortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SortLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Apply1)
                                .addContainerGap(22, Short.MAX_VALUE)));

        UpdateTask_Panel.setBackground(new java.awt.Color(153, 153, 255));
        UpdateTask_Panel.setDoubleBuffered(false);
        UpdateTask_Panel.setEnabled(false);

        UpdateDetails.setBackground(new java.awt.Color(255, 255, 204));
        UpdateDetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UpdateDetails.setForeground(new java.awt.Color(0, 102, 102));
        UpdateDetails.setText("Update");
        UpdateDetails.setAlignmentY(0.0F);
        UpdateDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateDetailsMouseClicked(evt);
            }
        });
        UpdateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDetailsActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(153, 153, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black));

        jLabel12.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel12.setText("Task name:");

        jLabel13.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel13.setText("Due date:");

        DueDate1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        DueDate1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DueDate1.setText("YY/MM/DD");
        DueDate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DueDate1MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel14.setText("Category:");

        Category1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Category1.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Personal", "Health", "Work" }));
        Category1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel15.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel15.setText("Priority:");

        Priority1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Priority1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Medium", "High" }));
        Priority1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TaskName1, javax.swing.GroupLayout.PREFERRED_SIZE, 330,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel9Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(Priority1, javax.swing.GroupLayout.Alignment.LEADING, 0,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Category1, javax.swing.GroupLayout.Alignment.LEADING, 0,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(DueDate1, javax.swing.GroupLayout.Alignment.LEADING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                                .addContainerGap(217, Short.MAX_VALUE)));
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(TaskName1, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(DueDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(Category1, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(Priority1, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(78, Short.MAX_VALUE)));

        jLabel17.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel17.setText("Update Task");

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\DEEPTI SINGH\\Downloads\\new-task.png")); // NOI18N
        jLabel18.setText("jLabel5");

        javax.swing.GroupLayout UpdateTask_PanelLayout = new javax.swing.GroupLayout(UpdateTask_Panel);
        UpdateTask_Panel.setLayout(UpdateTask_PanelLayout);
        UpdateTask_PanelLayout.setHorizontalGroup(
                UpdateTask_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(UpdateTask_PanelLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 163,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateTask_PanelLayout
                                .createSequentialGroup()
                                .addGap(24, 184, Short.MAX_VALUE)
                                .addGroup(UpdateTask_PanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                UpdateTask_PanelLayout.createSequentialGroup()
                                                        .addComponent(UpdateDetails)
                                                        .addGap(107, 107, 107))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                UpdateTask_PanelLayout.createSequentialGroup()
                                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(167, 167, 167)))));
        UpdateTask_PanelLayout.setVerticalGroup(
                UpdateTask_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(UpdateTask_PanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(UpdateTask_PanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(UpdateDetails)
                                .addContainerGap(81, Short.MAX_VALUE)));

        jLayeredPane1.setLayer(Task, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Filter, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Sort, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(UpdateTask_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Task, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGap(289, 289, 289)
                                        .addComponent(Filter, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(290, 290, 290)))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGap(287, 287, 287)
                                        .addComponent(Sort, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(291, Short.MAX_VALUE)))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(UpdateTask_Panel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))));
        jLayeredPane1Layout.setVerticalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Task, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(Filter, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(44, 44, 44)))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(Sort, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(42, Short.MAX_VALUE)))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(UpdateTask_Panel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLayeredPane1));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLayeredPane1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DueDateMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_DueDateMouseClicked
        DueDate.setText("");
    }// GEN-LAST:event_DueDateMouseClicked

    private void AddDetailsMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_AddDetailsMouseClicked
        String name, due_date, priority, category;
        name = TaskName.getText();
        due_date = DueDate.getText();
        priority = Priority.getSelectedItem().toString();
        category = Category.getSelectedItem().toString();

        try {
            con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/daily_planner?user=root&password=Kingfisher@1");
            ps = con.prepareStatement("insert into task values (?,?,?,?) ");
            ps.setString(1, name);
            ps.setString(2, due_date);
            ps.setString(3, priority);
            ps.setString(4, category);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Task created!");
        } catch (SQLException ex) {
            Logger.getLogger(NewTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_AddDetailsMouseClicked

    private void AddTaskActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_AddTaskActionPerformed
        Task.setSelectedIndex(0);
    }// GEN-LAST:event_AddTaskActionPerformed

    private void FilterButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_FilterButtonMouseClicked
        Filter.setVisible(true);
        Task.setVisible(false);
        Sort.setVisible(false);
        UpdateTask_Panel.setVisible(false);
    }// GEN-LAST:event_FilterButtonMouseClicked

    int flag = 0;
    String command;

    private void TaskMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_TaskMouseClicked
        try {
            TaskTable.setModel(
                    new DefaultTableModel(null, new String[] { "Name", "Due", "Priority", "Category", "Days left" }));
            con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/daily_planner?user=root&password=Kingfisher@1");
            String sql = "Select name, due, priority, category from task";
            ps = con.prepareStatement("sql");
            ResultSet rs = ps.executeQuery(sql);
            // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            // LocalDateTime now = LocalDateTime.now();
            CallableStatement cstmt = con.prepareCall("{? = call diffInDays (?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            tbModel = (DefaultTableModel) TaskTable.getModel();
            int actualdiff, i = 0;
            while (rs.next()) {
                String name = rs.getString("name");
                String due = rs.getString("due");
                String priority = rs.getString("priority");
                String category = rs.getString("category");
                String daysdiff;

                cstmt.setString(2, due);
                cstmt.execute();
                actualdiff = cstmt.getInt(1);
                if (actualdiff < 0) {
                    daysdiff = "Overdue";
                } else {
                    daysdiff = actualdiff + " day(s) left";
                }
                String tbData[] = { name, due, priority, category, daysdiff };
                tbModel.addRow(tbData);
            }
            ps1 = con.prepareStatement("Select * from task where category = ?");
            ps1.setString(1, "Work");
            ResultSet rs1 = ps1.executeQuery();
            ps2 = con.prepareStatement("Select * from task where category = ?");
            ps2.setString(1, "Personal");
            ResultSet rs2 = ps2.executeQuery();
            ps3 = con.prepareStatement("Select * from task where category = ?");
            ps3.setString(1, "Health");
            ResultSet rs3 = ps3.executeQuery();
            Work.setModel(new DefaultTableModel(null, new String[] { "Name", "Due", "Priority" }));
            Personal.setModel(new DefaultTableModel(null, new String[] { "Name", "Due", "Priority" }));
            Health.setModel(new DefaultTableModel(null, new String[] { "Name", "Due", "Priority" }));
            while (rs1.next()) {
                String name = rs1.getString("name");
                String due = rs1.getString("due");
                String priority = rs1.getString("priority");
                DefaultTableModel tbModel1 = (DefaultTableModel) Work.getModel();
                String tbData1[] = { name, due, priority };
                tbModel1.addRow(tbData1);
            }
            while (rs2.next()) {
                String name2 = rs2.getString("name");
                String due2 = rs2.getString("due");
                String priority2 = rs2.getString("priority");
                DefaultTableModel tbModel2 = (DefaultTableModel) Personal.getModel();
                String tbData2[] = { name2, due2, priority2 };
                tbModel2.addRow(tbData2);
            }
            while (rs3.next()) {
                String name3 = rs3.getString("name");
                String due3 = rs3.getString("due");
                String priority3 = rs3.getString("priority");
                DefaultTableModel tbModel3 = (DefaultTableModel) Health.getModel();
                String tbData3[] = { name3, due3, priority3 };
                tbModel3.addRow(tbData3);
            }
            ps4 = con.prepareStatement("Select * from task");
            ResultSet rs4 = ps4.executeQuery();
            Pending_task.setModel(new DefaultTableModel(null, new String[] { "Name", "Due", "Priority", "Category" }));
            while (rs4.next()) {
                String name = rs4.getString("name");
                String due = rs4.getString("due");
                String priority = rs4.getString("priority");
                String category = rs4.getString("category");
                DefaultTableModel tbModel4 = (DefaultTableModel) Pending_task.getModel();
                String tbData4[] = { name, due, priority, category };
                tbModel4.addRow(tbData4);
            }
            ps5 = con.prepareStatement("Select * from completed_task");
            ResultSet rs5 = ps5.executeQuery();
            Completed_task
                    .setModel(new DefaultTableModel(null, new String[] { "Name", "Due", "Priority", "Category" }));
            while (rs5.next()) {
                String name = rs5.getString("name");
                String due = rs5.getString("due");
                String priority = rs5.getString("priority");
                String category = rs5.getString("category");
                DefaultTableModel tbModel5 = (DefaultTableModel) Completed_task.getModel();
                String tbData5[] = { name, due, priority, category };
                tbModel5.addRow(tbData5);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_TaskMouseClicked

    private void ApplyMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ApplyMouseClicked
        if (High.isSelected() == true)
            command = "High";
        else if (Low.isSelected() == true)
            command = "Low";
        else if (Today.isSelected() == true)
            command = "Today";
        else if (Tomorrow.isSelected() == true)
            command = "Tomorrow";
        else if (InAWeek.isSelected() == true)
            command = "InAWeek";
        Filter.setVisible(false);
        Task.setVisible(true);
        try {
            if (command == "High" || command == "Low") {
                TaskTable.setModel(new DefaultTableModel(null,
                        new String[] { "name", "due", "priority", "category", "Days left" }));
                con = DriverManager
                        .getConnection("jdbc:mysql://localhost:3306/daily_planner?user=root&password=Kingfisher@1");
                ps = con.prepareStatement("Select name, due, priority, category from task where priority = ?");
                ps.setString(1, command);
                tbModel = (DefaultTableModel) TaskTable.getModel();
                ResultSet rs = ps.executeQuery();
                CallableStatement cstmt = con.prepareCall("{? = call diffInDays (?)}");
                cstmt.registerOutParameter(1, Types.INTEGER);
                int actualdiff;
                while (rs.next()) {
                    String name = rs.getString("name");
                    String due = rs.getString("due");
                    String priority = rs.getString("priority");
                    String category = rs.getString("category");
                    String daysdiff;

                    cstmt.setString(2, due);
                    cstmt.execute();
                    actualdiff = cstmt.getInt(1);
                    if (actualdiff < 0) {
                        daysdiff = "Overdue";
                    } else {
                        daysdiff = actualdiff + " day(s) left";
                    }
                    String tbData[] = { name, due, priority, category, daysdiff };
                    tbModel.addRow(tbData);
                }
            } else {
                int diff = -10000, actualdiff;
                if (command == "Today")
                    diff = 0;
                else if (command == "Tomorrow")
                    diff = 1;
                CallableStatement cstmt = con.prepareCall("{? = call diffInDays (?)}");
                cstmt.registerOutParameter(1, Types.INTEGER);
                TaskTable.setModel(new DefaultTableModel(null, new String[] { "name", "due", "priority", "category" }));
                con = DriverManager
                        .getConnection("jdbc:mysql://localhost:3306/daily_planner?user=root&password=Kingfisher@1");
                ps = con.prepareStatement("Select name, due, priority, category from task");
                tbModel = (DefaultTableModel) TaskTable.getModel();
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String due = rs.getString("due");
                    cstmt.setString(2, due);
                    cstmt.execute();
                    actualdiff = cstmt.getInt(1);
                    if (actualdiff == diff) {
                        String name = rs.getString("name");
                        String priority = rs.getString("priority");
                        String category = rs.getString("category");
                        String tbData[] = { name, due, priority, category };
                        tbModel.addRow(tbData);
                    } else if (command == "InAWeek" && 0 <= actualdiff && actualdiff <= 7) {
                        String name = rs.getString("name");
                        String priority = rs.getString("priority");
                        String category = rs.getString("category");
                        String tbData[] = { name, due, priority, category };
                        tbModel.addRow(tbData);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_ApplyMouseClicked

    private void RefreshMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_RefreshMouseClicked

        FilterSort.clearSelection();

        TaskTable.setModel(
                new DefaultTableModel(null, new String[] { "Name", "Due", "Priority", "Category", "Days left" }));
        try {
            TaskTable.setModel(
                    new DefaultTableModel(null, new String[] { "Name", "Due", "Priority", "Category", "Days left" }));
            con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/daily_planner?user=root&password=Kingfisher@1");
            String sql = "Select name, due, priority, category from task";
            ps = con.prepareStatement("sql");
            ResultSet rs = ps.executeQuery(sql);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDateTime now = LocalDateTime.now();
            CallableStatement cstmt = con.prepareCall("{? = call diffInDays (?)}");
            cstmt.registerOutParameter(1, Types.INTEGER);
            tbModel = (DefaultTableModel) TaskTable.getModel();
            int actualdiff, i = 0;
            while (rs.next()) {
                String name = rs.getString("name");
                String due = rs.getString("due");
                String priority = rs.getString("priority");
                String category = rs.getString("category");
                String daysdiff;

                cstmt.setString(2, due);
                cstmt.execute();
                actualdiff = cstmt.getInt(1);
                if (actualdiff < 0) {
                    daysdiff = "Overdue";
                } else {
                    daysdiff = actualdiff + " day(s) left";
                }
                String tbData[] = { name, due, priority, category, daysdiff };
                tbModel.addRow(tbData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewTask.class.getName()).log(Level.SEVERE, null, ex);
        }

    }// GEN-LAST:event_RefreshMouseClicked

    private void SortButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_SortButtonMouseClicked
        Filter.setVisible(false);
        Task.setVisible(false);
        Sort.setVisible(true);
        UpdateTask_Panel.setVisible(false);
    }// GEN-LAST:event_SortButtonMouseClicked

    private void Apply1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Apply1MouseClicked
        if (High1.isSelected() == true)
            command = "High";
        else if (Low1.isSelected() == true)
            command = "Low";
        else if (Ascending.isSelected() == true)
            command = "Ascending";
        else if (Descending.isSelected() == true)
            command = "Descending";
        Filter.setVisible(false);
        Sort.setVisible(false);
        Task.setVisible(true);

        try {
            if (command == "High" || command == "Low") {
                CallableStatement cstmt = con.prepareCall("{? = call diffInDays (?)}");
                cstmt.registerOutParameter(1, Types.INTEGER);
                int actualdiff;
                if (command == "High") {
                    TaskTable.setModel(new DefaultTableModel(null,
                            new String[] { "name", "due", "priority", "category", "Days left" }));
                    con = DriverManager
                            .getConnection("jdbc:mysql://localhost:3306/daily_planner?user=root&password=Kingfisher@1");
                    ps = con.prepareStatement("Select name, due, priority, category from task order by priority ");
                    tbModel = (DefaultTableModel) TaskTable.getModel();
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        String name = rs.getString("name");
                        String due = rs.getString("due");
                        String priority = rs.getString("priority");
                        String category = rs.getString("category");
                        String daysdiff;

                        cstmt.setString(2, due);
                        cstmt.execute();
                        actualdiff = cstmt.getInt(1);
                        if (actualdiff < 0) {
                            daysdiff = "Overdue";
                        } else {
                            daysdiff = actualdiff + " day(s) left";
                        }
                        String tbData[] = { name, due, priority, category, daysdiff };
                        tbModel.addRow(tbData);
                    }
                } else {
                    TaskTable.setModel(new DefaultTableModel(null,
                            new String[] { "name", "due", "priority", "category", "Days left" }));
                    con = DriverManager
                            .getConnection("jdbc:mysql://localhost:3306/daily_planner?user=root&password=Kingfisher@1");
                    ps = con.prepareStatement("Select name, due, priority, category from task order by priority desc");
                    tbModel = (DefaultTableModel) TaskTable.getModel();
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        String name = rs.getString("name");
                        String due = rs.getString("due");
                        String priority = rs.getString("priority");
                        String category = rs.getString("category");
                        String daysdiff;

                        cstmt.setString(2, due);
                        cstmt.execute();
                        actualdiff = cstmt.getInt(1);
                        if (actualdiff < 0) {
                            daysdiff = "Overdue";
                        } else {
                            daysdiff = actualdiff + " day(s) left";
                        }
                        String tbData[] = { name, due, priority, category, daysdiff };
                        tbModel.addRow(tbData);
                    }
                }
            } else if (command == "Ascending" || command == "Descending") {
                CallableStatement cstmt = con.prepareCall("{? = call diffInDays (?)}");
                cstmt.registerOutParameter(1, Types.INTEGER);
                int actualdiff;
                if (command == "Ascending") {
                    TaskTable.setModel(new DefaultTableModel(null,
                            new String[] { "name", "due", "priority", "category", "Days left" }));
                    con = DriverManager
                            .getConnection("jdbc:mysql://localhost:3306/daily_planner?user=root&password=Kingfisher@1");
                    ps = con.prepareStatement("Select name, due, priority, category from task order by due");
                    tbModel = (DefaultTableModel) TaskTable.getModel();
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        String name = rs.getString("name");
                        String due = rs.getString("due");
                        String priority = rs.getString("priority");
                        String category = rs.getString("category");
                        String daysdiff;

                        cstmt.setString(2, due);
                        cstmt.execute();
                        actualdiff = cstmt.getInt(1);
                        if (actualdiff < 0) {
                            daysdiff = "Overdue";
                        } else {
                            daysdiff = actualdiff + " day(s) left";
                        }
                        String tbData[] = { name, due, priority, category, daysdiff };
                        tbModel.addRow(tbData);
                    }
                } else if (command == "Descending") {
                    TaskTable.setModel(new DefaultTableModel(null,
                            new String[] { "name", "due", "priority", "category", "Days left" }));
                    con = DriverManager
                            .getConnection("jdbc:mysql://localhost:3306/daily_planner?user=root&password=Kingfisher@1");
                    ps = con.prepareStatement("Select name, due, priority, category from task order by due desc");
                    tbModel = (DefaultTableModel) TaskTable.getModel();
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        String name = rs.getString("name");
                        String due = rs.getString("due");
                        String priority = rs.getString("priority");
                        String category = rs.getString("category");
                        String daysdiff;

                        cstmt.setString(2, due);
                        cstmt.execute();
                        actualdiff = cstmt.getInt(1);
                        if (actualdiff < 0) {
                            daysdiff = "Overdue";
                        } else {
                            daysdiff = actualdiff + " day(s) left";
                        }
                        String tbData[] = { name, due, priority, category, daysdiff };
                        tbModel.addRow(tbData);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_Apply1MouseClicked

    private void CompletedMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_CompletedMouseClicked
        int row = TaskTable.getSelectedRow();

        if (row < 0)
            JOptionPane.showMessageDialog(this, "Select a task");

        else {
            try {
                String name, due_date, priority, category;
                tbModel = (DefaultTableModel) TaskTable.getModel();
                int selectedRowIndex = TaskTable.getSelectedRow();
                name = tbModel.getValueAt(selectedRowIndex, 0).toString();
                due_date = tbModel.getValueAt(selectedRowIndex, 1).toString();
                priority = tbModel.getValueAt(selectedRowIndex, 2).toString();
                category = tbModel.getValueAt(selectedRowIndex, 3).toString();
                con = DriverManager
                        .getConnection("jdbc:mysql://localhost:3306/daily_planner?user=root&password=Kingfisher@1");
                ps1 = con.prepareStatement("DELETE FROM task WHERE name = ?");
                ps1.setString(1, name);
                ps1.executeUpdate();
                ps = con.prepareStatement("insert into completed_task values (?,?,?,?) ");
                ps.setString(1, name);
                ps.setString(2, due_date);
                ps.setString(3, priority);
                ps.setString(4, category);
                ps.execute();
            } catch (SQLException ex) {
                Logger.getLogger(NewTask.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultTableModel model = (DefaultTableModel) TaskTable.getModel();
            model.removeRow(row);
        }
    }// GEN-LAST:event_CompletedMouseClicked

    private void TaskNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TaskNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_TaskNameActionPerformed

    int selectedRowIndex;
    String oldname;

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_UpdateMouseClicked
        selectedRowIndex = TaskTable.getSelectedRow();
        oldname = tbModel.getValueAt(selectedRowIndex, 0).toString();

        Filter.setVisible(false);
        Task.setVisible(false);
        Sort.setVisible(false);
        UpdateTask_Panel.setVisible(true);
    }// GEN-LAST:event_UpdateMouseClicked

    private void UpdateDetailsMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_UpdateDetailsMouseClicked
        String name, due_date, priority, category;
        name = TaskName1.getText();
        due_date = DueDate1.getText();
        priority = Priority1.getSelectedItem().toString();
        category = Category1.getSelectedItem().toString();
        try {
            con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/daily_planner?user=root&password=Kingfisher@1");
            ps = con.prepareStatement("UPDATE task set name=?, due=?, priority=?, category=?  where name = ? ");
            ps.setString(1, name);
            ps.setString(2, due_date);
            ps.setString(3, priority);
            ps.setString(4, category);
            ps.setString(5, oldname);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Task updated!");
            UpdateTask_Panel.setVisible(false);
            Task.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_UpdateDetailsMouseClicked

    private void DueDate1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_DueDate1MouseClicked
        DueDate1.setText("");
    }// GEN-LAST:event_DueDate1MouseClicked

    private void UpdateDetailsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_UpdateDetailsActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_UpdateDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(NewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewTask().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDetails;
    private javax.swing.JButton AddTask;
    private javax.swing.JPanel AddTask_Panel;
    public static javax.swing.JButton Apply;
    public static javax.swing.JButton Apply1;
    private javax.swing.JRadioButton Ascending;
    private javax.swing.JPanel Board_panel;
    private javax.swing.JComboBox<String> Category;
    private javax.swing.JComboBox<String> Category1;
    private javax.swing.JPanel Category_panel;
    private javax.swing.JButton Completed;
    private javax.swing.JTable Completed_task;
    private javax.swing.JRadioButton Descending;
    private javax.swing.JFormattedTextField DueDate;
    private javax.swing.JFormattedTextField DueDate1;
    private javax.swing.JPanel Filter;
    private javax.swing.JRadioButton FilterButton;
    private javax.swing.ButtonGroup FilterSort;
    private javax.swing.JTable Health;
    public static javax.swing.JRadioButton High;
    public static javax.swing.JRadioButton High1;
    private javax.swing.JRadioButton InAWeek;
    private javax.swing.JRadioButton Low;
    private javax.swing.JRadioButton Low1;
    private javax.swing.JTable Pending_task;
    private javax.swing.JTable Personal;
    private javax.swing.ButtonGroup PriorDue;
    private javax.swing.JComboBox<String> Priority;
    private javax.swing.JComboBox<String> Priority1;
    private javax.swing.JButton Refresh;
    private javax.swing.JPanel Sort;
    private javax.swing.JRadioButton SortButton;
    private javax.swing.JPanel Status_panel;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JTabbedPane Task;
    private javax.swing.JTextField TaskName;
    private javax.swing.JTextField TaskName1;
    private javax.swing.JTable TaskTable;
    private javax.swing.JRadioButton Today;
    private javax.swing.JRadioButton Tomorrow;
    private javax.swing.JButton Update;
    private javax.swing.JButton UpdateDetails;
    private javax.swing.JPanel UpdateTask_Panel;
    private javax.swing.JTable Work;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
