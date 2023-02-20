
package app;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class Tabla2 extends JTable {

    private Font font;
    private int horizontalAlignment;
    
    public Tabla2(){
        getTableHeader().setDefaultRenderer(new Tabla2Header()); //Obtenemos instancia del header de la tabla por defecto para sobrescribirlo
    }

    private class Tabla2Header extends DefaultTableCellRenderer{
        
        @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        setBackground(new Color( 54, 85, 152 )); // Color fondo header tabla
        setForeground(new Color(255,255,255)); // Color fuente header tabla
        ((DefaultTableCellRenderer)getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER); //Alineación centrada header tabla
        setFont(new Font("Verdana", Font.BOLD, 16));
        setPreferredSize(new Dimension(0,30));
        
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
    }
        
    }
    

    

}