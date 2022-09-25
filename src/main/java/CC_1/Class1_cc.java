package CC_1;

import javax.naming.spi.DirStateFactory;
import javax.xml.transform.Result;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Class1_cc {
   /* static String result; */
    public static void main(String[] args)  throws Exception {
        // System.out.println("Hola Peru");
try {

// 1. CArga de Driver
    Class.forName("com.mysql.jdbc.Driver");

// Crear Conexion
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmmt1", "root", "root");

// Crear statment
    Statement stmt = con.createStatement();

// Ejecutar Query
    ResultSet result = stmt.executeQuery("select * from Productos");
    /* int resultUpdate = stmt.executeUpdate(sql:"update users set phone='83838374748' where name='Messi'"); */

// Recorrer resultados
}
catch (ClassNotFoundException ex) {
    System.out.println(ex.getMessage());
};
        while (result.next()) {
            System.out.println(ResultSet.getString("id"));
            System.out.println(ResultSet.getString("name"));
            System.out.println(ResultSet.getString("descripcion"));
            System.out.println(ResultSet.getString("tipo"));
        }

    }




// --------- Bloque con PreparedStatement----

PreparedStatement preparedStatement=
        con.preparedStatement("select * from Productos where name=?");
PreparedStatement.setString( 1, "Porteña");
ResultSet resultSet2= preparedStatement.executeQuery();
While(resultSet2.netx()){
    System.out.println(resultSet2.getString("name")+"\n"+
            resultSet2.getString("tipo")+ "\n" +
            );
  }
  // Insert(crear) registros
    Statement stCreate = con.createStatement();
    int nuevosRegistros=
            stCreate.executeUpdate("insert into Productos values(3,'Amber','cerveza trigo'");

    system.out.println("registros afectados:"+nuevosRegistros)
while(resultSet2.netx()){
    systems.out.println(resultSet2.getString("name")+ "\n"+
            resultSet2.getString("tipo"));
}
// ---- BLOQUE CON CallableStatment ----

    CallableStatement callSp = Connection.prepareCall("{call StoreEp1(?,?,?)}");
    callSp.setString(1,"APA");
    callSp.setString(2,Cerveza Chalaca);
    CallSp.registerOutParameter(3,Types.Integer);

    // ejecutando CallSp
    ResultSet resultado= callSp.executeQuery();

}

