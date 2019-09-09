package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SQL {
    
    public static Connection conexion(){
        Connection con=null;
        try{
            //SERVIDOR
            String url = "jdbc:mysql://Localhost:3306/ponguibd";
            //            
            //CLIENTE
            //String url = "jdbc:mysql://192.168.0.107:3306/ponguibd";
            //
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, "root","root");
            if(con!=null){
                System.out.println("Se ha establecido una conexión a la base de datos");
            }
        }catch(Exception e){
            System.out.println("No hay conexión");
        }
        return con;
    }
    
    public static void ejecuta(String sql, JFrame j, int op){
        String mensaje[]={"Algunos de los campos no tiene informacion","","No se pudo actualizar","No se pudo eliminar"};
        try{
        Connection con=conexion();
        Statement st=con.createStatement();
        st.executeUpdate(sql);
        con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(j,mensaje[op], "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(j, "Operación Exitosa", "Aviso", JOptionPane.ERROR_MESSAGE);
    }
    
     public static ResultSet ejecutaQ(String sql, JFrame j, int op){
        String mensaje[]={"Algunos de los campos no tiene informacion"};
        ResultSet rs=null;
        try{
        Connection con=conexion();
        Statement st=con.createStatement();
        rs=st.executeQuery(sql);
//        con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(j,mensaje[op], "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    
}
