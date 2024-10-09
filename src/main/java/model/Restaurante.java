package model;

import javax.swing.JOptionPane;

public class Restaurante extends Empresa {

    private String tipodecomida;
    private Double precomedioprato;

    public Restaurante() {
        super();
        this.tipodecomida = "";
        this.precomedioprato = 0.0;
    }

    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String fone, String tipodecomida, Double precomedioprato) {
        super(nome, endereco, cidade, estado, cep, fone);
        this.tipodecomida = tipodecomida;
        this.precomedioprato = precomedioprato;
    }

    public String getTipodecomida() {
        return tipodecomida;
    }

    public void setTipodecomida(String tipodecomida) {
        this.tipodecomida = tipodecomida;
    }

    public Double getPrecomedioprato() {
        return precomedioprato;
    }

    public void setPrecomedioprato(Double precomedioprato) {
        this.precomedioprato = precomedioprato;
    }
    @Override
    public void solicitarDados(){
        super.solicitarDados();
        this.tipodecomida = JOptionPane.showInputDialog("Insira o tipo de comida:");
        String entpreco = JOptionPane.showInputDialog("Insira o preço médio do prato:");
        this.precomedioprato = Double.valueOf(entpreco);
    }
    @Override
    public void imprimirDados(){
        super.imprimirDados();
        String dados = tipodecomida + "\n" + precomedioprato + "\n";
        JOptionPane.showMessageDialog(null, dados);
    }
}
