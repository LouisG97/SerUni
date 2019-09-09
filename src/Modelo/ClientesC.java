package Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Vista.IniciarSesion;

public class ClientesC {

    String id,nombreCompleto,direccion,telefono,celular,correo,ciudad;

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    
    
    public void cargarDatos(ResultSet rs, IniciarSesion ini) throws SQLException{
        if(rs.next()){
            id=rs.getString("id");
            nombreCompleto=rs.getString("nombreCompleto");
            direccion=rs.getString("direccion");
            telefono=rs.getString("telefono");
            celular=rs.getString("celular");
            correo=rs.getString("correo");
            ciudad=rs.getString("ciudad");
        }else
            JOptionPane.showMessageDialog(ini, "Cliente inexistente", "Pagina de error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void cargarDatos2(ResultSet rs) throws SQLException{
        if(rs.next()){
            id=rs.getString("id");
            nombreCompleto=rs.getString("nombreCompleto");
            direccion=rs.getString("direccion");
            telefono=rs.getString("telefono");
            celular=rs.getString("celular");
            correo=rs.getString("correo");
            ciudad=rs.getString("ciudad");
        }else
            System.out.println("No existe el cliente");
    }
    
    public String buscarID(){
        String sql="SELECT * FROM ponguibd.clientes WHERE id='"+id+"'";
        return sql;
    }
    
    public String buscarID2(){
        String sql="SELECT * FROM ponguibd.clientes WHERE nombreCompleto='"+nombreCompleto+"'";
        return sql;
    }
    
    public String buscarID(String que, String b){
        String sql="SELECT * FROM ponguibd.clientes WHERE "+que+" like'%"+b+"%'";
        return sql;
    }
    
    public String buscarID3(String que, String b){
        String sql="SELECT * FROM ponguibd.clientes WHERE "+que+" like'%"+b+"%'";
        return sql;
    }
    
    public  void cargarDatos(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[7];
        model.getDataVector().removeAllElements();
        while(rs.next()){
            
            for(int i=0; i<datos.length; i++){
                datos[i]=rs.getObject(i+1);
            }
            model.addRow(datos);
            
        }
    }
    
    public  void cargarDatos2(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[7];
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
        
        Object datos[] = new Object[7];
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