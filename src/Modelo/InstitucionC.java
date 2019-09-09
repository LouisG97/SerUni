package Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Vista.IniciarSesion;

public class InstitucionC {

    String idDeLaInstitucion,imagen1,imagen2,nombreDeLaInstitucion,direccion,telefono,responsableDeLaInstitucion;

    public String getIdDeLaInstitucion() {
        return idDeLaInstitucion;
    }

    public void setIdDeLaInstitucion(String idDeLaInstitucion) {
        this.idDeLaInstitucion = idDeLaInstitucion;
    }

    public String getImagen1() {
        return imagen1;
    }

    public void setImagen1(String imagen1) {
        this.imagen1 = imagen1;
    }

    public String getImagen2() {
        return imagen2;
    }

    public void setImagen2(String imagen2) {
        this.imagen2 = imagen2;
    }

    public String getNombreDeLaInstitucion() {
        return nombreDeLaInstitucion;
    }

    public void setNombreDeLaInstitucion(String nombreDeLaInstitucion) {
        this.nombreDeLaInstitucion = nombreDeLaInstitucion;
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

    public String getResponsableDeLaInstitucion() {
        return responsableDeLaInstitucion;
    }

    public void setResponsableDeLaInstitucion(String responsableDeLaInstitucion) {
        this.responsableDeLaInstitucion = responsableDeLaInstitucion;
    }
    
    public void cargarDatos(ResultSet rs, IniciarSesion ini) throws SQLException{
        if(rs.next()){
            idDeLaInstitucion=rs.getString("idDeLaInstitucion");
            imagen1=rs.getString("imagen1");
            imagen2=rs.getString("imagen2");
            nombreDeLaInstitucion=rs.getString("nombreDeLaInstitucion");
            direccion=rs.getString("direccion");
            telefono=rs.getString("telefono");
            responsableDeLaInstitucion=rs.getString("responsableDeLaInstitucion");
        }else
            JOptionPane.showMessageDialog(ini, "Institucion Inexistente", "Pagina de error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void cargarDatos2(ResultSet rs) throws SQLException{
        if(rs.next()){
            idDeLaInstitucion=rs.getString("idDeLaInstitucion");
            imagen1=rs.getString("imagen1");
            imagen2=rs.getString("imagen2");
            nombreDeLaInstitucion=rs.getString("nombreDeLaInstitucion");
            direccion=rs.getString("direccion");
            telefono=rs.getString("telefono");
            responsableDeLaInstitucion=rs.getString("responsableDeLaInstitucion");
        }else
            System.out.println("No existe la institucion");
    }
    
    public String buscarID(){
        String sql="SELECT * FROM ponguibd.institucion WHERE idDeLaInstitucion='"+idDeLaInstitucion+"'";
        return sql;
    }
    
    public String buscarID2(){
        String sql="SELECT * FROM ponguibd.institucion WHERE nombreDeLaInstitucion='"+nombreDeLaInstitucion+"'";
        return sql;
    }
    
    public String buscarID(String que, String b){
        String sql="SELECT * FROM ponguibd.institucion WHERE "+que+" like'%"+b+"%'";
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
                if(i==1||i==2||i==4){
                    datos[a]=rs.getObject(i+1);
                    a++;
                }
            }
            model.addRow(datos);
            
        }
    }
    
}