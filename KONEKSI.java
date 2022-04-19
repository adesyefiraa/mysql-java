/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.satu;

/**
 *
 * @author M-SI
 */
import java.sql.*;
import org.omg.CORBA.PUBLIC_MEMBER;
public class KONEKSI {
    
    static final String DRIVER="com.mysql.jdbl.Driver";
    static final String URL="jdbl:mysqlc://localhost/penjualan";
    static final String USER="root";
    static final String UPASS="";
    static Connection conn;
    static Statement stat;
    
    public static void konek (){
        try{
            Class.forName(DRIVER);
    conn=DriverManager.getConnection(URL, USER, UPASS);
    System.out.println("koneksi Berhasil");
 } catch(Exception e){
      System.out.println("koneksi gagal");
}
        
       }
}
