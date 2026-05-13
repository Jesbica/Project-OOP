package br.com.concessionaria.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private String servidor, banco, user, password;
    public Connection conexao;

    public Conexao(){
        this.servidor = "localhost";
        this.banco = "db_java";
        this.user = "root";
        this.password = "123qaz";
    }

    public Boolean connectDrive(){
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.user, this.password);
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public Connection getConexao(){
        boolean validaConexao = connectDrive();

        if (validaConexao){
            return this.conexao;
        }

        return  null;
    }
}


