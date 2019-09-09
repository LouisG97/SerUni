package Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Vista.IniciarSesion;

public class UsuariosC {

    String id,nombreCompleto,nombreUsuario,contraseña,area,horario,prioridad,imagen;

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
    
    
    public void cargarDatos(ResultSet rs, IniciarSesion ini) throws SQLException{
        if(rs.next()){
            id=rs.getString("id");
            nombreUsuario=rs.getString("nombreUsuario");
            contraseña=rs.getString("contraseña");
            area=rs.getString("area");
            horario=rs.getString("horario");
            prioridad=rs.getString("prioridad");
            nombreCompleto=rs.getString("nombreCompleto");
            imagen=rs.getString("imagen");
        }else
            JOptionPane.showMessageDialog(ini, "Usuario Inexistente", "Pagina de error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void cargarDatos2(ResultSet rs) throws SQLException{
        if(rs.next()){
            id=rs.getString("id");
            nombreUsuario=rs.getString("nombreUsuario");
            contraseña=rs.getString("contraseña");
            area=rs.getString("area");
            horario=rs.getString("horario");
            prioridad=rs.getString("prioridad");
            nombreCompleto=rs.getString("nombreCompleto");
            imagen=rs.getString("imagen");
        }else
            System.out.println("No existe el usuario");
    }
    
    public String buscarID(){
        String sql="SELECT * FROM ponguibd.usuarios WHERE id='"+id+"'";
        return sql;
    }
    
    public String buscarID2(){
        String sql="SELECT * FROM ponguibd.usuarios WHERE nombreUsuario='"+nombreUsuario+"'";
        return sql;
    }
    
    public String buscarID(String que, String b){
        String sql="SELECT * FROM ponguibd.usuarios WHERE "+que+" like'%"+b+"%'";
        return sql;
    }
    
    public String buscarID5(String que, String b, String c, String d){
        String sql="SELECT * FROM ponguibd.usuarios WHERE "+que+" like'%"+b+"%' AND "+c+" like'%"+d+"%'";
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
                if(i==0||i==1||i==2||i==4){
                    datos[a]=rs.getObject(i+1);
                    a++;
                }
            }
            model.addRow(datos);
            
        }
    }
    
    public  void cargarDatos3(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[8];
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
    
}