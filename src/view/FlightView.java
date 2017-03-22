/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.FlightController;

/**
 *
 * @author Cedric DELHOME
 */
public class FlightView extends javax.swing.JPanel {

    FlightController flightController = new FlightController();
    
    /**
     * Creates new form FlightView
     */
    public FlightView() {
        initComponents();
       jt_listFlight = flightController.addRowTable(jt_listFlight);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jp_table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_listFlight = new javax.swing.JTable();
        jp_info = new javax.swing.JPanel();
        jp_left = new javax.swing.JPanel();
        lb_numFlight = new javax.swing.JLabel();
        lb_cityStart = new javax.swing.JLabel();
        lb_countryStart = new javax.swing.JLabel();
        lb_IATAStart = new javax.swing.JLabel();
        lb_cityArrived = new javax.swing.JLabel();
        lb_countryArrived = new javax.swing.JLabel();
        lb_IATAArrived = new javax.swing.JLabel();
        lb_dateStart = new javax.swing.JLabel();
        lb_hoursStart = new javax.swing.JLabel();
        tf_numFlight = new javax.swing.JTextField();
        cb_cityStart = new javax.swing.JComboBox<>();
        tf_countryStart = new javax.swing.JTextField();
        tf_IATAStart = new javax.swing.JTextField();
        cb_cityArrived = new javax.swing.JComboBox<>();
        tf_countryArrived = new javax.swing.JTextField();
        tf_IATAArrived = new javax.swing.JTextField();
        tf_dateStart = new javax.swing.JTextField();
        tf_hoursStart = new javax.swing.JTextField();
        jp_right = new javax.swing.JPanel();
        lb_dateArrived = new javax.swing.JLabel();
        lb_hoursArrived = new javax.swing.JLabel();
        lb_time = new javax.swing.JLabel();
        lb_price = new javax.swing.JLabel();
        lb_pilote = new javax.swing.JLabel();
        lb_copilote = new javax.swing.JLabel();
        lb_staff1 = new javax.swing.JLabel();
        lb_staff2 = new javax.swing.JLabel();
        lb_staff3 = new javax.swing.JLabel();
        tf_dateArrived = new javax.swing.JTextField();
        tf_time = new javax.swing.JTextField();
        tf_price = new javax.swing.JTextField();
        cb_copilote = new javax.swing.JComboBox<>();
        cb_pilote = new javax.swing.JComboBox<>();
        cb_staff1 = new javax.swing.JComboBox<>();
        cb_staff2 = new javax.swing.JComboBox<>();
        cb_staff3 = new javax.swing.JComboBox<>();
        tf_hoursArrived = new javax.swing.JTextField();
        jp_button = new javax.swing.JPanel();
        pb_init = new javax.swing.JButton();
        pb_delete = new javax.swing.JButton();
        pb_update = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jp_table.setMaximumSize(new java.awt.Dimension(32767, 300));
        jp_table.setMinimumSize(new java.awt.Dimension(1000, 300));
        jp_table.setPreferredSize(new java.awt.Dimension(1000, 300));
        jp_table.setLayout(new java.awt.GridLayout());

        jt_listFlight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Ville départ", "Pays départ", "Code départ", "Ville arrivée", "Pays arrivée", "Code arrivée", "Date / Heures départ", "Date / heure arrivée", "Durée (min)", "Tarif (€)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_listFlight.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jt_listFlight.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jt_listFlight);
        if (jt_listFlight.getColumnModel().getColumnCount() > 0) {
            jt_listFlight.getColumnModel().getColumn(0).setResizable(false);
            jt_listFlight.getColumnModel().getColumn(0).setPreferredWidth(45);
            jt_listFlight.getColumnModel().getColumn(1).setResizable(false);
            jt_listFlight.getColumnModel().getColumn(1).setPreferredWidth(125);
            jt_listFlight.getColumnModel().getColumn(2).setResizable(false);
            jt_listFlight.getColumnModel().getColumn(2).setPreferredWidth(125);
            jt_listFlight.getColumnModel().getColumn(3).setResizable(false);
            jt_listFlight.getColumnModel().getColumn(3).setPreferredWidth(50);
            jt_listFlight.getColumnModel().getColumn(4).setResizable(false);
            jt_listFlight.getColumnModel().getColumn(4).setPreferredWidth(125);
            jt_listFlight.getColumnModel().getColumn(5).setResizable(false);
            jt_listFlight.getColumnModel().getColumn(5).setPreferredWidth(125);
            jt_listFlight.getColumnModel().getColumn(6).setResizable(false);
            jt_listFlight.getColumnModel().getColumn(6).setPreferredWidth(50);
            jt_listFlight.getColumnModel().getColumn(7).setResizable(false);
            jt_listFlight.getColumnModel().getColumn(7).setPreferredWidth(150);
            jt_listFlight.getColumnModel().getColumn(8).setResizable(false);
            jt_listFlight.getColumnModel().getColumn(8).setPreferredWidth(150);
            jt_listFlight.getColumnModel().getColumn(9).setResizable(false);
            jt_listFlight.getColumnModel().getColumn(9).setPreferredWidth(100);
            jt_listFlight.getColumnModel().getColumn(10).setResizable(false);
            jt_listFlight.getColumnModel().getColumn(10).setPreferredWidth(100);
        }

        jp_table.add(jScrollPane1);

        add(jp_table);

        jp_info.setLayout(new java.awt.GridBagLayout());

        jp_left.setLayout(new java.awt.GridBagLayout());

        lb_numFlight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_numFlight.setText("N° de vol");
        lb_numFlight.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_numFlight.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(lb_numFlight, gridBagConstraints);

        lb_cityStart.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_cityStart.setText("Ville de départ");
        lb_cityStart.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_cityStart.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(lb_cityStart, gridBagConstraints);

        lb_countryStart.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_countryStart.setText("Pays de départ");
        lb_countryStart.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_countryStart.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(lb_countryStart, gridBagConstraints);

        lb_IATAStart.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_IATAStart.setText("Code aéroport de départ");
        lb_IATAStart.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_IATAStart.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(lb_IATAStart, gridBagConstraints);

        lb_cityArrived.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_cityArrived.setText("Ville d'arrivée");
        lb_cityArrived.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_cityArrived.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(lb_cityArrived, gridBagConstraints);

        lb_countryArrived.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_countryArrived.setText("Pays d'arrivée");
        lb_countryArrived.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_countryArrived.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(lb_countryArrived, gridBagConstraints);

        lb_IATAArrived.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_IATAArrived.setText("Code aéroport d'arrivée");
        lb_IATAArrived.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_IATAArrived.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(lb_IATAArrived, gridBagConstraints);

        lb_dateStart.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_dateStart.setText("Date de départ");
        lb_dateStart.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_dateStart.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(lb_dateStart, gridBagConstraints);

        lb_hoursStart.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_hoursStart.setText("Heure de départ");
        lb_hoursStart.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_hoursStart.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(lb_hoursStart, gridBagConstraints);

        tf_numFlight.setMinimumSize(new java.awt.Dimension(150, 25));
        tf_numFlight.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(tf_numFlight, gridBagConstraints);

        cb_cityStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_cityStart.setMinimumSize(new java.awt.Dimension(150, 25));
        cb_cityStart.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(cb_cityStart, gridBagConstraints);

        tf_countryStart.setMinimumSize(new java.awt.Dimension(150, 25));
        tf_countryStart.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(tf_countryStart, gridBagConstraints);

        tf_IATAStart.setMinimumSize(new java.awt.Dimension(150, 25));
        tf_IATAStart.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(tf_IATAStart, gridBagConstraints);

        cb_cityArrived.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_cityArrived.setMinimumSize(new java.awt.Dimension(150, 25));
        cb_cityArrived.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(cb_cityArrived, gridBagConstraints);

        tf_countryArrived.setMinimumSize(new java.awt.Dimension(150, 25));
        tf_countryArrived.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(tf_countryArrived, gridBagConstraints);

        tf_IATAArrived.setMinimumSize(new java.awt.Dimension(150, 25));
        tf_IATAArrived.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(tf_IATAArrived, gridBagConstraints);

        tf_dateStart.setMinimumSize(new java.awt.Dimension(150, 25));
        tf_dateStart.setPreferredSize(new java.awt.Dimension(150, 25));
        tf_dateStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dateStartActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(tf_dateStart, gridBagConstraints);

        tf_hoursStart.setMinimumSize(new java.awt.Dimension(150, 25));
        tf_hoursStart.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_left.add(tf_hoursStart, gridBagConstraints);

        jp_info.add(jp_left, new java.awt.GridBagConstraints());

        jp_right.setLayout(new java.awt.GridBagLayout());

        lb_dateArrived.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_dateArrived.setText("Date d'arrivée");
        lb_dateArrived.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_dateArrived.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_right.add(lb_dateArrived, gridBagConstraints);

        lb_hoursArrived.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_hoursArrived.setText("Heure d'arrivée");
        lb_hoursArrived.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_hoursArrived.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_right.add(lb_hoursArrived, gridBagConstraints);

        lb_time.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_time.setText("Durée en min");
        lb_time.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_time.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_right.add(lb_time, gridBagConstraints);

        lb_price.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_price.setText("Tarif en euro");
        lb_price.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_price.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_right.add(lb_price, gridBagConstraints);

        lb_pilote.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_pilote.setText("Pilote");
        lb_pilote.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_pilote.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_right.add(lb_pilote, gridBagConstraints);

        lb_copilote.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_copilote.setText("Copilote");
        lb_copilote.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_copilote.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_right.add(lb_copilote, gridBagConstraints);

        lb_staff1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_staff1.setText("Hotesse / Steward 1");
        lb_staff1.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_staff1.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_right.add(lb_staff1, gridBagConstraints);

        lb_staff2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_staff2.setText("Hotesse / Steward 2");
        lb_staff2.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_staff2.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_right.add(lb_staff2, gridBagConstraints);

        lb_staff3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_staff3.setText("Hotesse / Steward 3");
        lb_staff3.setMinimumSize(new java.awt.Dimension(150, 25));
        lb_staff3.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_right.add(lb_staff3, gridBagConstraints);

        tf_dateArrived.setMinimumSize(new java.awt.Dimension(150, 25));
        tf_dateArrived.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_right.add(tf_dateArrived, gridBagConstraints);

        tf_time.setMinimumSize(new java.awt.Dimension(150, 25));
        tf_time.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_right.add(tf_time, gridBagConstraints);

        tf_price.setMinimumSize(new java.awt.Dimension(150, 25));
        tf_price.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_right.add(tf_price, gridBagConstraints);

        cb_copilote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_copilote.setMinimumSize(new java.awt.Dimension(150, 25));
        cb_copilote.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        jp_right.add(cb_copilote, gridBagConstraints);

        cb_pilote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_pilote.setMinimumSize(new java.awt.Dimension(150, 25));
        cb_pilote.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_right.add(cb_pilote, gridBagConstraints);

        cb_staff1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_staff1.setMinimumSize(new java.awt.Dimension(150, 25));
        cb_staff1.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        jp_right.add(cb_staff1, gridBagConstraints);

        cb_staff2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_staff2.setMinimumSize(new java.awt.Dimension(150, 25));
        cb_staff2.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        jp_right.add(cb_staff2, gridBagConstraints);

        cb_staff3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_staff3.setMinimumSize(new java.awt.Dimension(150, 25));
        cb_staff3.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        jp_right.add(cb_staff3, gridBagConstraints);

        tf_hoursArrived.setMinimumSize(new java.awt.Dimension(150, 25));
        tf_hoursArrived.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        jp_right.add(tf_hoursArrived, gridBagConstraints);

        jp_info.add(jp_right, new java.awt.GridBagConstraints());

        jp_button.setMinimumSize(new java.awt.Dimension(350, 30));
        jp_button.setPreferredSize(new java.awt.Dimension(350, 30));
        jp_button.setLayout(new java.awt.GridBagLayout());

        pb_init.setText("réinitialiser");
        pb_init.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pb_initActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jp_button.add(pb_init, gridBagConstraints);

        pb_delete.setText("supprimer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jp_button.add(pb_delete, gridBagConstraints);

        pb_update.setText("Mettre à jour");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jp_button.add(pb_update, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jp_info.add(jp_button, gridBagConstraints);

        add(jp_info);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_dateStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dateStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dateStartActionPerformed

    private void pb_initActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pb_initActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pb_initActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_cityArrived;
    private javax.swing.JComboBox<String> cb_cityStart;
    private javax.swing.JComboBox<String> cb_copilote;
    private javax.swing.JComboBox<String> cb_pilote;
    private javax.swing.JComboBox<String> cb_staff1;
    private javax.swing.JComboBox<String> cb_staff2;
    private javax.swing.JComboBox<String> cb_staff3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp_button;
    private javax.swing.JPanel jp_info;
    private javax.swing.JPanel jp_left;
    private javax.swing.JPanel jp_right;
    private javax.swing.JPanel jp_table;
    private javax.swing.JTable jt_listFlight;
    private javax.swing.JLabel lb_IATAArrived;
    private javax.swing.JLabel lb_IATAStart;
    private javax.swing.JLabel lb_cityArrived;
    private javax.swing.JLabel lb_cityStart;
    private javax.swing.JLabel lb_copilote;
    private javax.swing.JLabel lb_countryArrived;
    private javax.swing.JLabel lb_countryStart;
    private javax.swing.JLabel lb_dateArrived;
    private javax.swing.JLabel lb_dateStart;
    private javax.swing.JLabel lb_hoursArrived;
    private javax.swing.JLabel lb_hoursStart;
    private javax.swing.JLabel lb_numFlight;
    private javax.swing.JLabel lb_pilote;
    private javax.swing.JLabel lb_price;
    private javax.swing.JLabel lb_staff1;
    private javax.swing.JLabel lb_staff2;
    private javax.swing.JLabel lb_staff3;
    private javax.swing.JLabel lb_time;
    private javax.swing.JButton pb_delete;
    private javax.swing.JButton pb_init;
    private javax.swing.JButton pb_update;
    private javax.swing.JTextField tf_IATAArrived;
    private javax.swing.JTextField tf_IATAStart;
    private javax.swing.JTextField tf_countryArrived;
    private javax.swing.JTextField tf_countryStart;
    private javax.swing.JTextField tf_dateArrived;
    private javax.swing.JTextField tf_dateStart;
    private javax.swing.JTextField tf_hoursArrived;
    private javax.swing.JTextField tf_hoursStart;
    private javax.swing.JTextField tf_numFlight;
    private javax.swing.JTextField tf_price;
    private javax.swing.JTextField tf_time;
    // End of variables declaration//GEN-END:variables
}
