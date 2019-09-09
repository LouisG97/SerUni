package Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Vista.IniciarSesion;

public class CitasC {

    String id,cliente,area,fecha,hora,atendera,folioUF,estado,servicio,costo,estadoDePago,folioSCE;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAtendera() {
        return atendera;
    }

    public void setAtendera(String atendera) {
        this.atendera = atendera;
    }

    public String getFolioUF() {
        return folioUF;
    }

    public void setFolioUF(String folioUF) {
        this.folioUF = folioUF;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getEstadoDePago() {
        return estadoDePago;
    }

    public void setEstadoDePago(String estadoDePago) {
        this.estadoDePago = estadoDePago;
    }

    public String getFolioSCE() {
        return folioSCE;
    }

    public void setFolioSCE(String folioSCE) {
        this.folioSCE = folioSCE;
    }

    
    
    public void cargarDatos(ResultSet rs, IniciarSesion ini) throws SQLException{
        if(rs.next()){
            id=rs.getString("id");
            cliente=rs.getString("cliente");
            area=rs.getString("area");
            fecha=rs.getString("fecha");
            hora=rs.getString("hora");
            atendera=rs.getString("atendera");
            folioUF=rs.getString("folioUF");
            estado=rs.getString("estado");
            servicio=rs.getString("servicio");
            costo=rs.getString("costo");
            estadoDePago=rs.getString("estadoDePago");
            folioSCE=rs.getString("folioSCE");
        }else
            JOptionPane.showMessageDialog(ini, "Cita inexistente", "Pagina de error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void cargarDatos2(ResultSet rs) throws SQLException{
        if(rs.next()){
            id=rs.getString("id");
            cliente=rs.getString("cliente");
            area=rs.getString("area");
            fecha=rs.getString("fecha");
            hora=rs.getString("hora");
            atendera=rs.getString("atendera");
            folioUF=rs.getString("folioUF");
            estado=rs.getString("estado");
            servicio=rs.getString("servicio");
            costo=rs.getString("costo");
            estadoDePago=rs.getString("estadoDePago");
            folioSCE=rs.getString("folioSCE");
        }else
            System.out.println("No existe la cita");
    }
    
    public String buscarID(){
        String sql="SELECT * FROM ponguibd.citas WHERE id='"+id+"'";
        return sql;
    }
    
    public String buscarID2(){
        String sql="SELECT * FROM ponguibd.citas WHERE cliente='"+cliente+"'";
        return sql;
    }
    
    public String buscarID3(){
        String sql="SELECT * FROM ponguibd.citas WHERE atendera='"+atendera+"'";
        return sql;
    }
    
    public String buscarID4(){
        String sql="SELECT * FROM ponguibd.citas WHERE area='"+area+"'";
        return sql;
    }
    
    public String buscarID(String que, String b){
        String sql="SELECT * FROM ponguibd.citas WHERE "+que+" like'%"+b+"%'";
        return sql;
    }
    
    public String buscarID5(String que, String b, String c, String d){
        String sql="SELECT * FROM ponguibd.citas WHERE "+que+" like'%"+b+"%' AND "+c+" like'%"+d+"%'";
        return sql;
    }
    
    public  void cargarDatos(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[12];
        model.getDataVector().removeAllElements();
        while(rs.next()){
            
            for(int i=0; i<datos.length; i++){
                datos[i]=rs.getObject(i+1);
            }
            model.addRow(datos);
            
        }
    }
    
    public  void cargarDatos2(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[12];
        model.getDataVector().removeAllElements();
        int a=0;
        while(rs.next()){
            a=0;
            for(int i=0; i<datos.length; i++){
                if(i==1||i==2||i==3||i==7){
                    datos[a]=rs.getObject(i+1);
                    a++;
                }
            }
            model.addRow(datos);
            
        }
    }
    
    public  void cargarDatos3(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[12];
        model.getDataVector().removeAllElements();
        int a=0;
        while(rs.next()){
            a=0;
            for(int i=0; i<datos.length; i++){
                if(i==0||i==1||i==2||i==3||i==7){
                    datos[a]=rs.getObject(i+1);
                    a++;
                }
            }
            model.addRow(datos);
            
        }
    }
    
}