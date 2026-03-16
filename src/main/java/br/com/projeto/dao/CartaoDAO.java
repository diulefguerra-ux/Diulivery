package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import br.com.projeto.model.Cartao;

public class CartaoDAO {

    public int salvarCartao(Cartao cartao) {
        String sql = "INSERT INTO cartao (nome_Cartao, numero_Cartao, bandeira, tipo_Cartao, validade, cvv) VALUES (?, ?, ?, ?, ?, ?)";
        int idGerado = 0;

        try (Connection conn = Conexao.getConexao()) {
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, cartao.getNomeCartao());
            stmt.setString(2, cartao.getNumeroCartao());
            stmt.setString(3, cartao.getBandeira());
            stmt.setString(4, cartao.getTipoCartao());
            stmt.setString(5, cartao.getValidade());
            stmt.setString(6, cartao.getCvv());
            
            stmt.execute();

            // Recupera o ID para o Pagamento usar como chave estrangeira
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                idGerado = rs.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return idGerado;
    }
}