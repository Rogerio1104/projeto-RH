package repository;

import model.Candidato;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CandidatoRepository {

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/db_rh";
        Connection connection = DriverManager.getConnection(url, "root", "");


        return connection;
    }
    public void insere(Candidato candidato) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();

        PreparedStatement stmt = connection.prepareStatement("insert into " +
                "candidato values(?, ?, ?, ?, ?, ?)");
        stmt.setInt(1, candidato.setCodigo(null));
        stmt.setString(2, candidato.getNomeCandidato());
        stmt.setString(3, String.valueOf(candidato.getDataNascimento()));
        stmt.setString(4, (candidato.getCpf()));
        stmt.setString(5, candidato.getDescCurriculo());
        stmt.setString(6, candidato.getEmailCandidato());

        int i = stmt.executeUpdate();
        System.out.println(i + " linhas inseridas");
        connection.close();

    }
}
    public Integer proximoCodigo() throws SQLException, ClassNotFoundException {

        List<Candidato> candidatos = new ArrayList<>();

        Connection connection = getConnection();

        PreparedStatement stmt = connection.prepareStatement("select max(cd_candidato) from candidato ");
        ResultSet resultSet = stmt.executeQuery();

        while (resultSet.next()){
            return resultSet.getInt(1) + 1;
        }
        return 1;
    }
}
