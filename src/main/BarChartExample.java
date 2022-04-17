package main;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;  
  
public class BarChartExample extends JFrame {  
  
  private static final long serialVersionUID = 1L;  
  
  // To delete
  public BarChartExample(String appTitle) {  
    super(appTitle);  
  
    // Create Dataset  
    CategoryDataset dataset = createDataset();  
      
    //Create chart  
    JFreeChart chart=ChartFactory.createBarChart(  
        "Bar Chart", //Chart Title  
        "Products", // Category axis  
        "Quantity", // Value axis  
        dataset,  
        PlotOrientation.VERTICAL,  
        false,true,false  
       );  
  
    ChartPanel panel=new ChartPanel(chart);  
    setContentPane(panel);  
  }
  
  public BarChartExample(String appTitle, Iterable<Items>[] data) {  
	    super(appTitle);  
	  
	    // Create Dataset  
	    CategoryDataset dataset = createDataset(data);  
	      
	    //Create chart  
	    JFreeChart chart=ChartFactory.createBarChart(  
	        "Bar Chart", //Chart Title  
	        "Products", // Category axis  
	        "Quantity", // Value axis  
	        dataset,  
	        PlotOrientation.VERTICAL,  
	        false,true,false  
	       );  
	  
	    ChartPanel panel=new ChartPanel(chart);  
	    setContentPane(panel);  
	  }
  
  //To delete 
  private CategoryDataset createDataset() {  
	    DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
	  
	    // Population in 2005  
	    dataset.addValue(500, "In Stock", "Mouse");  
	    dataset.addValue(200, "In Stock", "Keyboard");  
	    dataset.addValue(100, "In Stock", "Monitor");  
	    dataset.addValue(100, "In Stock", "Speaker"); 
	    dataset.addValue(100, "In Stock", "CPU"); 
	    dataset.addValue(100, "In Stock", "VGA"); 
	    dataset.addValue(100, "In Stock", "RAM"); 
	   
	    return dataset;  
  }  
  
  
  private CategoryDataset createDataset(Iterable<Items>[] data) {  
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
  
    // Population in 2005  
    dataset.addValue(500, "In Stock", "Mouse");  
    dataset.addValue(200, "In Stock", "Keyboard");  
    dataset.addValue(100, "In Stock", "Monitor");  
    dataset.addValue(100, "In Stock", "Speaker"); 
    dataset.addValue(100, "In Stock", "CPU"); 
    dataset.addValue(100, "In Stock", "VGA"); 
    dataset.addValue(100, "In Stock", "RAM"); 
   
    return dataset;  
  }  
  
  public static void main(String[] args) throws Exception {  
    SwingUtilities.invokeAndWait(()->{  
      BarChartExample example=new BarChartExample("Bar Chart Window");  
      example.setSize(800, 400);  
      example.setLocationRelativeTo(null);  
      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
      example.setVisible(true);  
    });  
  }  
}  