package Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Vista.IniciarSesion;

public class VoluntariosC {
    
    String id,nombres,apellidoPaterno,apellidoMaterno,sexo,edad,fechaDeNacimiento,nombreEscuela,especialidad,tipoEscuela,turno,semestre,
            grupo,matricula,telefono,celular,correo,area,horasRequeridas,horasPlan,kilos,fechaIngreso,estado,nombreCompleto,horasContadas,
            activo,dia,kilosR;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTipoEscuela() {
        return tipoEscuela;
    }

    public void setTipoEscuela(String tipoEscuela) {
        this.tipoEscuela = tipoEscuela;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getHorasRequeridas() {
        return horasRequeridas;
    }

    public void setHorasRequeridas(String horasRequeridas) {
        this.horasRequeridas = horasRequeridas;
    }

    public String getHorasPlan() {
        return horasPlan;
    }

    public void setHorasPlan(String horasPlan) {
        this.horasPlan = horasPlan;
    }

    public String getKilos() {
        return kilos;
    }

    public void setKilos(String kilos) {
        this.kilos = kilos;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getHorasContadas() {
        return horasContadas;
    }

    public void setHorasContadas(String horasContadas) {
        this.horasContadas = horasContadas;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getKilosR() {
        return kilosR;
    }

    public void setKilosR(String kilosR) {
        this.kilosR = kilosR;
    }
    
    
    
    public void cargarDatos(ResultSet rs, IniciarSesion ini) throws SQLException{
        if(rs.next()){
            id=rs.getString("id");
            nombres=rs.getString("nombres");
            apellidoPaterno=rs.getString("apellidoPaterno");
            apellidoMaterno=rs.getString("apellidoMaterno");
            sexo=rs.getString("sexo");
            edad=rs.getString("edad");
            fechaDeNacimiento=rs.getString("fechaDeNacimiento");
            nombreEscuela=rs.getString("nombreEscuela");
            especialidad=rs.getString("especialidad");
            tipoEscuela=rs.getString("tipoEscuela");
            turno=rs.getString("turno");
            semestre=rs.getString("semestre");
            grupo=rs.getString("grupo");
            matricula=rs.getString("matricula");
            telefono=rs.getString("telefono");
            celular=rs.getString("celular");
            correo=rs.getString("correo");
            area=rs.getString("area");
            horasRequeridas=rs.getString("horasRequeridas");
            horasPlan=rs.getString("horasPlan");
            kilos=rs.getString("kilos");
            fechaIngreso=rs.getString("fechaIngreso");
            estado=rs.getString("estado");
            nombreCompleto=rs.getString("nombreCompleto");
            horasContadas=rs.getString("horasContadas");
            activo=rs.getString("activo");
            dia=rs.getString("dia");
            kilosR=rs.getString("kilosR");
        }else
            JOptionPane.showMessageDialog(ini, "Voluntario Inexistente", "Pagina de error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void cargarDatos2(ResultSet rs) throws SQLException{
        if(rs.next()){
            id=rs.getString("id");
            nombres=rs.getString("nombres");
            apellidoPaterno=rs.getString("apellidoPaterno");
            apellidoMaterno=rs.getString("apellidoMaterno");
            sexo=rs.getString("sexo");
            edad=rs.getString("edad");
            fechaDeNacimiento=rs.getString("fechaDeNacimiento");
            nombreEscuela=rs.getString("nombreEscuela");
            especialidad=rs.getString("especialidad");
            tipoEscuela=rs.getString("tipoEscuela");
            turno=rs.getString("turno");
            semestre=rs.getString("semestre");
            grupo=rs.getString("grupo");
            matricula=rs.getString("matricula");
            telefono=rs.getString("telefono");
            celular=rs.getString("celular");
            correo=rs.getString("correo");
            area=rs.getString("area");
            horasRequeridas=rs.getString("horasRequeridas");
            horasPlan=rs.getString("horasPlan");
            kilos=rs.getString("kilos");
            fechaIngreso=rs.getString("fechaIngreso");
            estado=rs.getString("estado");
            nombreCompleto=rs.getString("nombreCompleto");
            horasContadas=rs.getString("horasContadas");
            activo=rs.getString("activo");
            dia=rs.getString("dia");
            kilosR=rs.getString("kilosR");
        }else
            System.out.println("No existe el voluntario");
    }
    
    public String buscarID(){
        String sql="SELECT * FROM ponguibd.voluntarios WHERE id='"+id+"'";
        return sql;
    }
    
    public String buscarID2(){
        String sql="SELECT * FROM ponguibd.voluntarios WHERE nombreCompleto='"+nombreCompleto+"'";
        return sql;
    }
    
    public String buscarID3(){
        String sql="SELECT * FROM ponguibd.voluntarios WHERE area='"+area+"'";
        return sql;
    }
    
    public String buscarID(String que, String b){
        String sql="SELECT * FROM ponguibd.voluntarios WHERE "+que+" like'%"+b+"%'";
        return sql;
    }
    
    public  void cargarDatos(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[28];
        model.getDataVector().removeAllElements();
        while(rs.next()){
            
            for(int i=0; i<datos.length; i++){
                datos[i]=rs.getObject(i+1);
            }
            model.addRow(datos);
            
        }
    }
    
    public  void cargarDatos2(ResultSet rs, DefaultTableModel model) throws SQLException{
        
        Object datos[] = new Object[28];
        model.getDataVector().removeAllElements();
        int a=0;
        while(rs.next()){
            a=0;
            for(int i=0; i<datos.length; i++){
                if(i==0||i==17||i==23){
                    datos[a]=rs.getObject(i+1);
                    a++;
                }
            }
            model.addRow(datos);
            
        }
    }
    
}
