package br.com.projeto.model;

public class Cartao {
    private int idcartao;
    private String nomeCartao;
    private String numeroCartao;
    private String bandeira;
    private String tipoCartao;
    private String validade;
    private String cvv;

    // Getters e Setters
    public int getIdcartao() { return idcartao; }
    public void setIdcartao(int idcartao) { this.idcartao = idcartao; }

    public String getNomeCartao() { return nomeCartao; }
    public void setNomeCartao(String nomeCartao) { this.nomeCartao = nomeCartao; }

    public String getNumeroCartao() { return numeroCartao; }
    public void setNumeroCartao(String numeroCartao) { this.numeroCartao = numeroCartao; }

    public String getBandeira() { return bandeira; }
    public void setBandeira(String bandeira) { this.bandeira = bandeira; }

    public String getTipoCartao() { return tipoCartao; }
    public void setTipoCartao(String tipoCartao) { this.tipoCartao = tipoCartao; }

    public String getValidade() { return validade; }
    public void setValidade(String validade) { this.validade = validade; }

    public String getCvv() { return cvv; }
    public void setCvv(String cvv) { this.cvv = cvv; }
}
