package repository;

import model.Candidato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RhRepository {

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/aulapoo";
        Connection connection = DriverManager.getConnection(url, "root", "");


        return connection;
    }
    public void insere(Candidato candidato) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();

        PreparedStatement stmt = connection.prepareStatement("insert into " +
                "candidato values(?, ?, ?, ?, ?, ?)");
        stmt.setInt(1, candidato.getCodigo().intValue());
        stmt.setString(2, candidato.getDescCandidato());
        stmt.setString(3, String.valueOf(candidato.getDataNascimento()));
        stmt.setString(4, (candidato.getCpf()));
        stmt.setString(5, candidato.getDescCurriculo());
        stmt.setString(6, candidato.getEmailCandidato());

        int i = stmt.executeUpdate();
        System.out.println(i + " linhas inseridas");
        connection.close();

    }

}
