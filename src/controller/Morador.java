package controller;

public class Morador {
	
    private int numeroApartamento;
    private String nomeMorador;
    private String modeloCarro;
    private String corCarro;
    private String placaCarro;

    public Morador(int numeroApartamento, String nomeMorador, String modeloCarro, String corCarro, String placaCarro) {
        this.numeroApartamento = numeroApartamento;
        this.nomeMorador = nomeMorador;
        this.modeloCarro = modeloCarro;
        this.corCarro = corCarro;
        this.placaCarro = placaCarro;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public String getNomeMorador() {
        return nomeMorador;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }
}
