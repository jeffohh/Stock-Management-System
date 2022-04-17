package main;

import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class PieChartExample extends JFrame {  
  private static final long serialVersionUID = 6294689542092367723L;  
  
  // To delete
  public PieChartExample(String title) {  
    super(title);  
  
    // Create dataset  
    PieDataset dataset = createDataset();  
  
    // Create chart  
    JFreeChart chart = ChartFactory.createPieChart(  
        "Pie Chart",  
        dataset,  
        true,   
        true,  
        false);  
  
    //Format Label  
    PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator(  
        "{0} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));  
    ((PiePlot) chart.getPlot()).setLabelGenerator(labelGenerator);  
      
    // Create Panel  
    ChartPanel panel = new ChartPanel(chart);  
    setContentPane(panel);  
  }  
  
  public PieChartExample(String title, Iterable<Items>[] data) {  
	    super(title);  
	  
	    // Create dataset  
	    PieDataset dataset = createDataset(data);  
	  
	    // Create chart  
	    JFreeChart chart = ChartFactory.createPieChart(  
	        "Pie Chart",  
	        dataset,  
	        true,   
	        true,  
	        false);  
	  
	    //Format Label  
	    PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator(  
	        "{0} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));  
	    ((PiePlot) chart.getPlot()).setLabelGenerator(labelGenerator);  
	      
	    // Create Panel  
	    ChartPanel panel = new ChartPanel(chart);  
	    setContentPane(panel);  
  }  
  
  // To delete
  private PieDataset createDataset() {  
  
    DefaultPieDataset dataset=new DefaultPieDataset();  
    dataset.setValue("Mouse", 10);  
    dataset.setValue("Monitor", 20);  
    dataset.setValue("Speaker", 40);  
    dataset.setValue("CPU", 80);  
    dataset.setValue("GPU", 160);
    dataset.setValue("Keyboard", 320); 
    return dataset;  
  }  
  
  private PieDataset createDataset(Iterable<Items>[] data) {  
	  
	    DefaultPieDataset dataset=new DefaultPieDataset();  
	    dataset.setValue("Mouse", 10);  
	    dataset.setValue("Monitor", 20);  
	    dataset.setValue("Speaker", 40);  
	    dataset.setValue("CPU", 80);  
	    dataset.setValue("GPU", 160);
	    dataset.setValue("Keyboard", 320); 
	    return dataset;  
  }
  
  public static void main(String[] args) {  
    SwingUtilities.invokeLater(() -> {  
      PieChartExample example = new PieChartExample("Pie Chart");  
      example.setSize(800, 400);  
      example.setLocationRelativeTo(null);  
      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
      example.setVisible(true);  
    });  
  }  
}  