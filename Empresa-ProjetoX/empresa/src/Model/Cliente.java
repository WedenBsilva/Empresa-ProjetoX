package Model;

public abstract class Cliente {

    private String nome;
    private int bloco;
    private int piso;
    private int apartamento;

        public Cliente(String nome, int bloco, int piso, int apartamento) {
            this.nome = nome;
            this.bloco = bloco;
            this.piso = piso;
            this.apartamento = apartamento ;
        }

        public Cliente(String nome, int piso) {
            this.nome = nome;
            this.piso = piso;
        }

        public int getApartamento() {
            return apartamento;
        }

        public void setApartamento(int apartamento) {
            this.apartamento = apartamento;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getPiso() {
            return piso;
        }

        public void setPiso(int piso) {
            this.piso = piso;
        }



        @Override
        public String toString() {
            return "Nome: " + nome + ", Piso: " + piso + ", Apartamento: " + apartamento + "";
        }

        public void visualizar() {

            System.out.println("************************************");
            System.out.println("****** INFORMAÇÕES DO MORADOR ******");
            System.out.println("Nome: " + getNome());
            System.out.println("Piso: R$" + getPiso());
//        System.out.println("Classificação: " + tipo);
        }
}
