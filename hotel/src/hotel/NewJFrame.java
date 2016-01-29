package hotel;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;

class NewJFrame extends javax.swing.JFrame {

		public NewJFrame() {
		initComponents();
	}

	private void initComponents() {

		systemMessage = new javax.swing.JDialog();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		offersPane = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		priceText = new javax.swing.JTextField();
		roomTypeCombo = new javax.swing.JComboBox();
		jLabel2 = new javax.swing.JLabel();
		submitPriceButton = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		priceTable = new javax.swing.JTable(db.getPriceTableModel());
		jPanel1 = new javax.swing.JPanel();
		jScrollPane3 = new javax.swing.JScrollPane();
		bookingTable = new javax.swing.JTable();
		startDatePicker = new org.jdesktop.swingx.JXDatePicker();
		endDatePicker = new org.jdesktop.swingx.JXDatePicker();
		jButton1 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();

		systemMessage.setTitle("SystemMessage");

		org.jdesktop.layout.GroupLayout systemMessageLayout = new org.jdesktop.layout.GroupLayout(
				systemMessage.getContentPane());
		systemMessage.getContentPane().setLayout(systemMessageLayout);
		systemMessageLayout.setHorizontalGroup(systemMessageLayout
				.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(0, 400, Short.MAX_VALUE));
		systemMessageLayout.setVerticalGroup(systemMessageLayout
				.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(0, 300, Short.MAX_VALUE));

		jTable1.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Check Availability");

		jLabel1.setText("Type");

		priceText.setText("0.0");
		priceText.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				priceTextActionPerformed(evt);
			}
		});

		roomTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SINGLE", "DOUBLE" }));
		roomTypeCombo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				roomTypeComboActionPerformed(evt);
			}
		});
		roomTypeCombo.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				roomTypeComboMouseClicked(evt);
			}
		});

		jLabel2.setText("Price");

		submitPriceButton.setText("Submit Price");
		submitPriceButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				submitPriceButtonActionPerformed(evt);
			}
		});

		jScrollPane2.setViewportView(priceTable);

		org.jdesktop.layout.GroupLayout offersPaneLayout = new org.jdesktop.layout.GroupLayout(offersPane);
		offersPane.setLayout(offersPaneLayout);
		offersPaneLayout
				.setHorizontalGroup(
						offersPaneLayout
								.createParallelGroup(
										org.jdesktop.layout.GroupLayout.LEADING)
								.add(offersPaneLayout
										.createSequentialGroup().add(
												offersPaneLayout
														.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
														.add(offersPaneLayout.createSequentialGroup().add(354, 354, 354)
																.add(submitPriceButton))
														.add(org.jdesktop.layout.GroupLayout.TRAILING,
																offersPaneLayout.createSequentialGroup()
																		.add(190, 190, 190).add(jLabel1).add(18, 18, 18)
																		.add(roomTypeCombo, 0, 106, Short.MAX_VALUE)
																		.add(18, 18, 18).add(jLabel2).add(18, 18, 18)
																		.add(priceText,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				50,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
								.add(offersPaneLayout.createSequentialGroup().addContainerGap().add(jScrollPane2,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 437,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))).addContainerGap()));
		offersPaneLayout.setVerticalGroup(offersPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(offersPaneLayout.createSequentialGroup().add(26, 26, 26)
						.add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.add(34, 34, 34)
						.add(offersPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
								.add(roomTypeCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
										org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
								.add(jLabel1)
								.add(priceText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
										org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
								.add(jLabel2))
						.add(28, 28, 28).add(submitPriceButton).addContainerGap(61, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Offers", offersPane);

		bookingTable
				.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane3.setViewportView(bookingTable);

		jButton1.setText("Find Bookings");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel3.setText("Start Date");

		jLabel4.setText("End Date");

		org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(jPanel1Layout.createSequentialGroup().add(18, 18, 18)
						.add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
								.add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane3,
										org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
						.add(jPanel1Layout.createSequentialGroup().add(jLabel3)
								.addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
								.add(startDatePicker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
										org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
								.add(26, 26, 26).add(jLabel4).addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
								.add(endDatePicker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
										org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
								.add(18, 18, 18)
								.add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(jPanel1Layout.createSequentialGroup().add(24, 24, 24)
						.add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
								.add(startDatePicker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
										org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.add(endDatePicker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).add(jLabel3).add(jLabel4).add(jButton1))
						.add(18, 18, 18)
						.add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
						.addContainerGap()));

		jTabbedPane1.addTab("Statistics", jPanel1);

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(layout.createSequentialGroup().addContainerGap()
						.add(jTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(layout.createSequentialGroup()
						.add(jTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}

	private void roomTypeComboActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void priceTextActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void roomTypeComboMouseClicked(java.awt.event.MouseEvent evt) {
		
	}

	private void submitPriceButtonActionPerformed(java.awt.event.ActionEvent evt) {
		float price = Float.parseFloat(priceText.getText());
		String roomType = (String) roomTypeCombo.getSelectedItem();
		db.setPriceForRoomType(roomType, price);
		priceTable.setModel(db.getPriceTableModel());
		System.out.println("Set price for room type " + roomType + " to " + price);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		Date startDate = startDatePicker.getDate();
		Date endDate = endDatePicker.getDate();

		bookingTable.setModel(db.getBookingTableModel(startDate, endDate));
	}

	private DatabaseHandler db = new DatabaseHandler();
	
	private javax.swing.JTable bookingTable;
	private org.jdesktop.swingx.JXDatePicker endDatePicker;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JPanel offersPane;
	private javax.swing.JTable priceTable;
	private javax.swing.JTextField priceText;
	private javax.swing.JComboBox roomTypeCombo;
	private org.jdesktop.swingx.JXDatePicker startDatePicker;
	private javax.swing.JButton submitPriceButton;
	private javax.swing.JDialog systemMessage;
	
}