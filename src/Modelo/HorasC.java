package Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Vista.IniciarSesion;

public class HorasC {
    
    String idVoluntario,fecha,horaEntrada,horaSalida,tiempoTotal;

    public String getIdVoluntario() {
        return idVoluntario;
    }

    public void setIdVoluntario(String idVoluntario) {
        this.idVoluntario = idVoluntario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(String tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    
    
    
    public void cargarDatos(ResultSet rs, IniciarSesion ini) throws SQLException{
        if(rs.next()){
            idVoluntario=rs.getString("idVoluntario");
            fecha=rs.getString("fecha");
            horaEntrada=rs.getString("horaEntrada");
            horaSalida=rs.getString("horaSalida");
            tiempoTotal=rs.getString("tiempoTotal");
        }else
            JOptionPane.showMessageDialog(ini, "Horas Inexistentes", "Pagina de error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void cargarDatos2(ResultSet rs) throws SQLException{
        if(rs.next()){
            idVoluntario=rs.getString("idVoluntario");
            fecha=rs.getString("fecha");
            horaEntrada=rs.getString("horaEntrada");
            horaSalida=rs.getString("horaSalida");
            tiempoTotal=rs.getString("tiempoTotal");
        }else
            System.out.println("No existe registro de horas para este usuario");
    }
    
    public String buscarID(){
        String sql="SELECT * FROM ponguibd.horas WHERE idVoluntario='"+idVoluntario+"' AND fecha='"+fecha+"' AND horaSalida='"+"NA"+"'";
        return sql;
    }
    
    public String buscarID(String que, String b){
        String sql="SELECT * FROM ponguibd.horas WHERE "+que+" like'%"+b+"%'";
        return sql;
    }
    
    public  void cargarDatos(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[5];
        model.getDataVector().removeAllElements();
        while(rs.next()){
            
            for(int i=0; i<datos.length; i++){
                datos[i]=rs.getObject(i+1);
            }
            model.addRow(datos);
            
        }
    }
    
    public  void cargarDatos2(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[5];
        model.getDataVector().removeAllElements();
        int a=0;
        while(rs.next()){
            a=0;
            for(int i=0; i<datos.length; i++){
                if(i==0||i==1||i==2||i==3||i==4){
                    datos[a]=rs.getObject(i+1);
                    a++;
                }
            }
            model.addRow(datos);
            
        }
    }
    
}
