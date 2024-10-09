package model;

import javax.swing.JOptionPane;

public class Empresa {

    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String fone;

    public Empresa() {
        this.nome = "";
        this.endereco = "";
        this.cidade = "";
        this.estado = "";
        this.cep = "";
        this.fone = "";
    }

    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String fone) {
        this.nome = nome;
        this.endereco = endereco;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    public void solicitarDados() {
        this.nome = JOptionPane.showInputDialog(null, "Digite o seu nome:");
        this.endereco = JOptionPane.showInputDialog(null, "Digite o seu endereço:");
        this.cidade = JOptionPane.showInputDialog(null, "Digite o nome da sua cidade:");
        this.estado = JOptionPane.showInputDialog(null, "Digite o nome do seu estado:");
        this.cep = JOptionPane.showInputDialog(null, "Digite o seu cep:");
        this.fone = JOptionPane.showInputDialog(null, "Digite o seu número de telefone:");
    }
    public void imprimirDados() {
        String dadosimpressos = nome + "\n" + endereco + "\n" + cidade + "\n" + estado + "\n" + cep + "\n" + fone + "\n";
        JOptionPane.showMessageDialog(null, dadosimpressos);
    }
}
