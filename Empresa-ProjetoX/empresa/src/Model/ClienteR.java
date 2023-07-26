package Model;

public class ClienteR extends Cliente{

        public ClienteR(String nome, int bloco, int piso, int apartamento) {
            super(nome, bloco, piso, apartamento);
        }

        public void visualizar() {
            super.visualizar();
            System.out.println("================================");
            System.out.println("Nome: " + getNome());
            System.out.println("Apartamento: " + getApartamento());
        }
}
