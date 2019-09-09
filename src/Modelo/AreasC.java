package Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Vista.IniciarSesion;

public class AreasC {
    
    String nombreDelArea,telefono,extTelefono,encargado;

    public String getNombreDelArea() {
        return nombreDelArea;
    }

    public void setNombreDelArea(String nombreDelArea) {
        this.nombreDelArea = nombreDelArea;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getExtTelefono() {
        return extTelefono;
    }

    public void setExtTelefono(String extTelefono) {
        this.extTelefono = extTelefono;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }
    
    
    
    public void cargarDatos(ResultSet rs, IniciarSesion ini) throws SQLException{
        if(rs.next()){
            nombreDelArea=rs.getString("nombreDelArea");
            telefono=rs.getString("telefono");
            extTelefono=rs.getString("extTelefono");
            encargado=rs.getString("encargado");
        }else
            JOptionPane.showMessageDialog(ini, "Área Inexistente", "Pagina de error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void cargarDatos2(ResultSet rs) throws SQLException{
        if(rs.next()){
            nombreDelArea=rs.getString("nombreDelArea");
            telefono=rs.getString("telefono");
            extTelefono=rs.getString("extTelefono");
            encargado=rs.getString("encargado");
        }else
            System.out.println("No existe el área");
    }
    
    public String buscarID(){
        String sql="SELECT * FROM ponguibd.areas WHERE nombreDelArea='"+nombreDelArea+"'";
        return sql;
    }
    
    public String buscarID2(){
        String sql="SELECT * FROM ponguibd.areas WHERE nombreDelArea='"+nombreDelArea+"'";
        return sql;
    }
    
    public String buscarID(String que, String b){
        String sql="SELECT * FROM ponguibd.areas WHERE "+que+" like'%"+b+"%'";
        return sql;
    }
    
    public  void cargarDatos(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[4];
        model.getDataVector().removeAllElements();
        while(rs.next()){
            
            for(int i=0; i<datos.length; i++){
                datos[i]=rs.getObject(i+1);
            }
            model.addRow(datos);
            
        }
    }
    
    public  void cargarDatos2(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[4];
        model.getDataVector().removeAllElements();
        int a=0;
        while(rs.next()){
            a=0;
            for(int i=0; i<datos.length; i++){
                if(i==1||i==2||i==4){
                    datos[a]=rs.getObject(i+1);
                    a++;
                }
            }
            model.addRow(datos);
            
        }
    }
    
}
