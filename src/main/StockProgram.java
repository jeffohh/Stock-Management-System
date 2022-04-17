package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class StockProgram extends JPanel {

	private JTable table;
	private DefaultTableModel model;
	private JTable orderTable;
	private DefaultTableModel orderModel;
	
    public StockProgram() {
        super(new GridLayout(1, 1));     
        
        //3 Buttons in Modify Tab
        JButton addBtn = new JButton("Add Item");
        addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
        	
        });
        
        JButton editBtn = new JButton("Edit Item");
        editBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
      	
      });
        JButton deleteBtn = new JButton("Delete Item");
        deleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
      	
      });
        
        
        //3 Button in Order Tab
        JButton addOrder = new JButton("Order");
        addOrder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
        	
        });
        
        JButton editOrder = new JButton("Edit Order");
        editOrder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
      	
      });
        JButton deleteOrder = new JButton("Delete Order");
        deleteOrder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
      	
      });
        
        // test table
        String[] tableHead={"ID","Name","Code","Price","Qty","Date Created"};
        String[][] tableData = {
                { "1", "Steve", "AUS" },
                { "2", "Virat", "IND" },
                { "3", "Kane", "NZ" },
                { "4", "David", "AUS" },
                { "5", "Ben", "ENG" },
                { "6", "Eion", "ENG" },
                { "1", "Steve", "AUS" },
                { "2", "Virat", "IND" },
                { "3", "Kane", "NZ" },
                { "4", "David", "AUS" },
                { "5", "Ben", "ENG" },
                { "6", "Eion", "ENG" },
                { "1", "Steve", "AUS" },
                { "2", "Virat", "IND" },
                { "3", "Kane", "NZ" },
                { "4", "David", "AUS" }
             };
        
        JTabbedPane tabbedPane = new JTabbedPane();
        
        model = new DefaultTableModel(tableData, tableHead);
        table = new JTable(model);
        
        
        // base Panel for Modify Tab
        JPanel basePanel = new JPanel();
        JPanel panel1 = new JPanel();
        basePanel.setLayout(new FlowLayout());
        panel1.setLayout(new GridLayout(3,1));
  
        
	    panel1.add(addBtn);
	    panel1.add(deleteBtn);
	    panel1.add(editBtn); 
	    
        basePanel.add(new JScrollPane(table));
        basePanel.add(panel1);
        tabbedPane.addTab("Modify", basePanel);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        
        
        //Order Tab
        JButton orderBtn = new JButton("Order");
        orderBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
      	
      });
        
        String[] orderHead = {"ID","Name","Code","Price","Qty","Ship to"};
        String[][] orderData = {};
        orderModel = new DefaultTableModel(orderData, orderHead);
        orderTable = new JTable(orderModel);

              
        // base Panel for Order Tab
        JPanel basePanel2 = new JPanel();
        JPanel panel2 = new JPanel();
        basePanel2.setLayout(new FlowLayout());
        panel2.setLayout(new GridLayout(3,1));
  
	    panel2.add(addOrder);
	    panel2.add(deleteOrder);
	    panel2.add(editOrder); 
	    
	    //TO-DO change table
	    basePanel2.add(new JScrollPane(orderTable));
	    basePanel2.add(panel2);
        tabbedPane.addTab("Order", basePanel2);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        
        
        //Report Tab
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        //Button to generate Pie Char
        JButton pieChartBtn = new JButton("Pie Chart");
        pieChartBtn.setPreferredSize(new Dimension(150,100));
        pieChartBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			      PieChartExample  pieChart = new PieChartExample("Pie Chart");  
			      pieChart.setSize(800, 400);  
			      pieChart.setLocationRelativeTo(null);  			      
			      pieChart.setVisible(true);  				
			}
        	
        });
        //Button to generate Bar Char
        JButton barCharttBtn = new JButton("Bar Chart");
        barCharttBtn.setPreferredSize(new Dimension(150,100));
        barCharttBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			      BarChartExample barChart = new BarChartExample("Bar Chart");  
			      barChart.setSize(800, 400);  
			      barChart.setLocationRelativeTo(null);    
			      barChart.setVisible(true);  	
			}
        	
        });
        JButton exportBtn = new JButton("Export Excel File");
        exportBtn.setPreferredSize(new Dimension(150,100));
        exportBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//TO-DO export .cvs file contains the stock
			}
        	
        });
        
        panel3.add(pieChartBtn);
        panel3.add(barCharttBtn);
        panel3.add(exportBtn);
        tabbedPane.addTab("Report", panel3);
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
        
        
        //Add the tabbed pane to this panel.
        add(tabbedPane);

    }
    

    private static void createAndShowGUI() {
        //Create and set up the window.
    	JFrame frame = new JFrame("Manage Inventory System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Add content to the window.
        frame.add(new StockProgram(), BorderLayout.CENTER);
        
        //Display the window.
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
//        frame.setResizable(false);
    }
    
    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
        	public void run() {
		        //Turn off metal's use of bold fonts
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				createAndShowGUI();
            }
        });
    }
}
