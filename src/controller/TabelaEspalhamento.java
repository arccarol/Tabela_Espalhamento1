package controller;

import java.util.LinkedList;

public class TabelaEspalhamento {
	
	 private static final int TAMANHO_TABELA = 10;
	    private LinkedList<Morador>[] tabela;

	    @SuppressWarnings("unchecked")
	    public TabelaEspalhamento() {
	        tabela = new LinkedList[TAMANHO_TABELA];
	        for (int i = 0; i < TAMANHO_TABELA; i++) {
	            tabela[i] = new LinkedList<>();
	        }
	    }

	    private int calcularHash(int numeroApartamento) {
	    	// le o primeiro numero do aparatamento Ex: ap 506, então o ardar é 5
	        int andar = numeroApartamento / 100;
	        return andar % TAMANHO_TABELA;
	    }

	    public void cadastrarMorador(Morador morador) {
	        int indice = calcularHash(morador.getNumeroApartamento());
	        tabela[indice].add(morador);
	    }

	    public Morador consultarMorador(int numeroApartamento) {
	        int indice = calcularHash(numeroApartamento);
	        LinkedList<Morador> listaMoradores = tabela[indice];
	        for (Morador morador : listaMoradores) {
	            if (morador.getNumeroApartamento() == numeroApartamento) {
	                return morador;
	            }
	        }
	        return null;
	    }

	    public void excluirMorador(int numeroApartamento) {
	        int indice = calcularHash(numeroApartamento);
	        LinkedList<Morador> listaMoradores = tabela[indice];
	        for (Morador morador : listaMoradores) {
	            if (morador.getNumeroApartamento() == numeroApartamento) {
	                listaMoradores.remove(morador);
	                return;
	            }
	        }
	    }

	    public LinkedList<Morador> listarMoradoresAndar(int andar) {
	        LinkedList<Morador> moradoresAndar = new LinkedList<>();
	        int numeroApartamentoInicial = (andar * 100) + 1;
	        int numeroApartamentoFinal = (andar + 1) * 100;
	        for (int numeroApartamento = numeroApartamentoInicial; numeroApartamento <= numeroApartamentoFinal; numeroApartamento++) {
	            int indice = calcularHash(numeroApartamento);
	            LinkedList<Morador> listaMoradores = tabela[indice];
	            for (Morador morador : listaMoradores) {
	                if (morador.getNumeroApartamento() == numeroApartamento) {
	                    moradoresAndar.add(morador);
	                }
	            }
	        }
	        return moradoresAndar;
	    }
	}


