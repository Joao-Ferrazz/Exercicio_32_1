package principal;

import javax.swing.JOptionPane;
import model.Empresa;
import model.Restaurante;

public class Principal {

    public static void main(String[] args) {
        Empresa emp = new Empresa();
        Restaurante rest = new Restaurante();
        emp.solicitarDados();
        emp.imprimirDados();
        rest.solicitarDados();
        rest.imprimirDados();
    }

}
