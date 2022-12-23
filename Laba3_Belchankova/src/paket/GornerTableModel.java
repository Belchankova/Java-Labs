 package paket;
import javax.swing.table.AbstractTableModel;
 

@SuppressWarnings("serial")
public class GornerTableModel extends AbstractTableModel {
	private Double[] coefficients;
	private Double from;
	private Double to;
	private Double step;
	
	public GornerTableModel(Double from, Double to, Double step, Double[] coefficients) {
		this.from = from;
		this.to = to;
		this.step = step;
		this.coefficients = coefficients;
	}
	
	public Double getFrom() {
		return from;
	}
	
	public Double getTo() {
		return to;
	}
	
	public Double getStep() {
		return step;
	}
	
	public int getColumnCount() {
		return 3;
	}
	
	@SuppressWarnings("removal")
	public int getRowCount() {
		return new Double(Math.ceil((to-from)/step)).intValue()+1;
	}
	
	public Object getValueAt(int row, int col) {
		Double x = from + step*row;
		Double result = 0.0;
		for (int i = 0; i < coefficients.length; i++) {
			result = x*result+coefficients[i];
		}
		if (col==0)
			return x; 
		else if (col==1)
			return result;
		else 
			return result  <= 0;
	}
	
	public String getColumnName(int col) {
		switch (col) {
		case 0:
			return "Значение X";
		case 1:
			return "Значение многочлена";
		default: 
			return "Результат < 0";
		}
	}
	
	public Class<?> getColumnClass(int col) {
		if (col!=2)
			return Double.class;
		return Boolean.class;
	}
}
