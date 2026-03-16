package br.com.projeto.model;

public class Pagamento {
    private int idpagamento;
    private String formaPagamento;
    private String statusPagamento;
    private String dataPagamento;
    private Pedido pedido;
    private Cartao cartao; // Relacionamento com a tabela cartao do diagrama

    // Getters e Setters
    public int getIdpagamento() { return idpagamento; }
    public void setIdpagamento(int idpagamento) { this.idpagamento = idpagamento; }
    public String getFormaPagamento() { return formaPagamento; }
    public void setFormaPagamento(String formaPagamento) { this.formaPagamento = formaPagamento; }
    public String getStatusPagamento() { return statusPagamento; }
    public void setStatusPagamento(String statusPagamento) { this.statusPagamento = statusPagamento; }
    public String getDataPagamento() { return dataPagamento; }
    public void setDataPagamento(String dataPagamento) { this.dataPagamento = dataPagamento; }
    public Pedido getPedido() { return pedido; }
    public void setPedido(Pedido pedido) { this.pedido = pedido; }
    public Cartao getCartao() { return cartao; }
    public void setCartao(Cartao cartao) { this.cartao = cartao; }
}