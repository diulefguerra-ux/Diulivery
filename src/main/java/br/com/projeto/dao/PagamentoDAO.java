package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import br.com.projeto.model.Pagamento;

public class PagamentoDAO {
    public void registrarPagamento(Pagamento pag) {
        String sql = "INSERT INTO pagamento (forma_Pagamento, status_Pagamento, data_Pagamento, pedido_idpedido) VALUES (?, ?, CURDATE(), ?)";
        
        try (Connection conn = Conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, pag.getFormaPagamento());
            stmt.setString(2, "Aprovado"); // Simulação de status conforme o diagrama
            stmt.setInt(3, pag.getPedido().getIdpedido());
            
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}