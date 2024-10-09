package principal;


import model.Restaurante;

public class Principal {

    public static void main(String[] args) {
        Restaurante rest = new Restaurante();
        rest.solicitarDados();
        rest.imprimirDados();
    }

}
