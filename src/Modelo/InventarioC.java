package Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Vista.IniciarSesion;

public class InventarioC {

    String id,nombreDeArticulo,observaciones,adquisicion,fechaDeAdquisicion,propietario,cantidad,area;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreDeArticulo() {
        return nombreDeArticulo;
    }

    public void setNombreDeArticulo(String nombreDeArticulo) {
        this.nombreDeArticulo = nombreDeArticulo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getAdquisicion() {
        return adquisicion;
    }

    public void setAdquisicion(String adquisicion) {
        this.adquisicion = adquisicion;
    }

    public String getFechaDeAdquisicion() {
        return fechaDeAdquisicion;
    }

    public void setFechaDeAdquisicion(String fechaDeAdquisicion) {
        this.fechaDeAdquisicion = fechaDeAdquisicion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

   
    
    
    public void cargarDatos(ResultSet rs, IniciarSesion ini) throws SQLException{
        if(rs.next()){
            id=rs.getString("id");
            nombreDeArticulo=rs.getString("nombreDeArticulo");
            observaciones=rs.getString("observaciones");
            adquisicion=rs.getString("adquisicion");
            fechaDeAdquisicion=rs.getString("fechaDeAdquisicion");
            propietario=rs.getString("propietario");
            cantidad=rs.getString("cantidad");
            area=rs.getString("area");
            
        }else
            JOptionPane.showMessageDialog(ini, "Articulo Inexistente", "Pagina de error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void cargarDatos2(ResultSet rs) throws SQLException{
        if(rs.next()){
            id=rs.getString("id");
            nombreDeArticulo=rs.getString("nombreDeArticulo");
            observaciones=rs.getString("observaciones");
            adquisicion=rs.getString("adquisicion");
            fechaDeAdquisicion=rs.getString("fechaDeAdquisicion");
            propietario=rs.getString("propietario");
            cantidad=rs.getString("cantidad");
            area=rs.getString("area");
        }else
            System.out.println("No existe el Inventario de este artículo");
    }
    
    public String buscarID(){
        String sql="SELECT * FROM ponguibd.inventario WHERE id='"+id+"'";
        return sql;
    }
    
    public String buscarID2(){
        String sql="SELECT * FROM ponguibd.inventario WHERE nombreDeArticulo='"+nombreDeArticulo+"'";
        return sql;
    }
    
    public String buscarID(String que, String b){
        String sql="SELECT * FROM ponguibd.inventario WHERE "+que+" like'%"+b+"%'";
        return sql;
    }
    
    public String buscarID(String que, String b, String c, String d){
        String sql="SELECT * FROM ponguibd.inventario WHERE "+que+" like'%"+b+"%' AND "+c+" like'%"+d+"%'";
        return sql;
    }
    
    public  void cargarDatos(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[8];
        model.getDataVector().removeAllElements();
        while(rs.next()){
            
            for(int i=0; i<datos.length; i++){
                datos[i]=rs.getObject(i+1);
            }
            model.addRow(datos);
            
        }
    }
    
    public  void cargarDatos2(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[8];
        model.getDataVector().removeAllElements();
        int a=0;
        while(rs.next()){
            a=0;
            for(int i=0; i<datos.length; i++){
                if(i==0||i==1||i==7){
                    datos[a]=rs.getObject(i+1);
                    a++;
                }
            }
            model.addRow(datos);
            
        }
    }
    
}