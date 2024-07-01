/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udf.ProvaA1_Aviao.DAL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConexaoMySQL {

    public Connection con;
    public PreparedStatement ps;
    public ResultSet rs;
    public String SQL;

    public void abrirBD() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/provaa1";
        String user = "root";//Seu nome de usuário.
        String password = ""; //Sua senha.
        con = DriverManager.getConnection(url, user, password);
    }

    public void fecharBD() throws Exception {
        if (con != null) {
            con.close();
        }

    } 
}
