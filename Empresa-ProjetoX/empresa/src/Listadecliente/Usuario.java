package Listadecliente;

public class Usuario {
    private int id;
    private String nome;
    private String bloco;
    private String piso;
    private String apartamento;

    public Usuario(int id ,String nome, String bloco, String piso, String apartamento) {
        this.id = id;
        this.nome = nome;
        this.bloco = bloco;
        this.piso = piso;
        this.apartamento = apartamento;
    }

    public Usuario() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String  piso) {
        this.piso = piso;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }
}

