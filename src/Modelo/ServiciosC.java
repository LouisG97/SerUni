package Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Vista.IniciarSesion;

public class ServiciosC {

    String id,nombreDelServicio,area,costo,porcentajeP1,porcentajeP2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreDelServicio() {
        return nombreDelServicio;
    }

    public void setNombreDelServicio(String nombreDelServicio) {
        this.nombreDelServicio = nombreDelServicio;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getPorcentajeP1() {
        return porcentajeP1;
    }

    public void setPorcentajeP1(String porcentajeP1) {
        this.porcentajeP1 = porcentajeP1;
    }

    public String getPorcentajeP2() {
        return porcentajeP2;
    }

    public void setPorcentajeP2(String porcentajeP2) {
        this.porcentajeP2 = porcentajeP2;
    }

    
    
    public void cargarDatos(ResultSet rs, IniciarSesion ini) throws SQLException{
        if(rs.next()){
            id=rs.getString("id");
            nombreDelServicio=rs.getString("nombreDelServicio");
            area=rs.getString("area");
            costo=rs.getString("costo");
            porcentajeP1=rs.getString("porcentajeP1");
            porcentajeP2=rs.getString("porcentajeP2");
        }else
            JOptionPane.showMessageDialog(ini, "Servicio Inexistente", "Pagina de error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void cargarDatos2(ResultSet rs) throws SQLException{
        if(rs.next()){
            id=rs.getString("id");
            nombreDelServicio=rs.getString("nombreDelServicio");
            area=rs.getString("area");
            costo=rs.getString("costo");
            porcentajeP1=rs.getString("porcentajeP1");
            porcentajeP2=rs.getString("porcentajeP2");
        }else
            System.out.println("No existe el servicio");
    }
    
    public String buscarID(){
        String sql="SELECT * FROM ponguibd.servicios WHERE id='"+id+"'";
        return sql;
    }
    
    public String buscarID2(){
        String sql="SELECT * FROM ponguibd.servicios WHERE nombreDelServicio='"+nombreDelServicio+"'";
        return sql;
    }
    
    public String buscarID3(){
        String sql="SELECT * FROM ponguibd.servicios WHERE area='"+area+"'";
        return sql;
    }
    
    public String buscarID(String que, String b){
        String sql="SELECT * FROM ponguibd.servicios WHERE "+que+" like'%"+b+"%'";
        return sql;
    }
    
    public String buscarID5(String que, String b, String c, String d){
        String sql="SELECT * FROM ponguibd.servicios WHERE "+que+" like'%"+b+"%' AND "+c+" like'%"+d+"%'";
        return sql;
    }
    
    public  void cargarDatos(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[6];
        model.getDataVector().removeAllElements();
        while(rs.next()){
            
            for(int i=0; i<datos.length; i++){
                datos[i]=rs.getObject(i+1);
            }
            model.addRow(datos);
            
        }
    }
    
    public  void cargarDatos2(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[6];
        model.getDataVector().removeAllElements();
        int a=0;
        while(rs.next()){
            a=0;
            for(int i=0; i<datos.length; i++){
                if(i==1||i==2||i==3){
                    datos[a]=rs.getObject(i+1);
                    a++;
                }
            }
            model.addRow(datos);
            
        }
    }
    
    public  void cargarDatos3(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[6];
        model.getDataVector().removeAllElements();
        int a=0;
        while(rs.next()){
            a=0;
            for(int i=0; i<datos.length; i++){
                if(i==1){
                    datos[a]=rs.getObject(i+1);
                    a++;
                }
            }
            model.addRow(datos);
            
        }
    }
    
    public  void cargarDatos4(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[6];
        model.getDataVector().removeAllElements();
        int a=0;
        while(rs.next()){
            a=0;
            for(int i=0; i<datos.length; i++){
                if(i==1||i==2){
                    datos[a]=rs.getObject(i+1);
                    a++;
                }
            }
            model.addRow(datos);
            
        }
    }
    
}