package view;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import controller.Morador;
import controller.TabelaEspalhamento;

public class Principal {
	
	public static void main(String[] args) {
		
        TabelaEspalhamento tabelaEspalhamento = new TabelaEspalhamento();

        // Cadastrar moradores
        Morador morador1 = new Morador(101, "Carlos", "Fiat uno", "Preto", "CAC-6294");
        tabelaEspalhamento.cadastrarMorador(morador1);

        Morador morador2 = new Morador(202, "Luiza", "Chevrolet", "Vermelho", "BJH-1234");
        tabelaEspalhamento.cadastrarMorador(morador2);

        Morador morador3 = new Morador(301, "Julio", "Volkswagen", "Preto", "AMV-9876");
        tabelaEspalhamento.cadastrarMorador(morador3);
        
        Morador morador4 = new Morador(401, "Carla", "Audi", "Preto", "HTI-9672");
        tabelaEspalhamento.cadastrarMorador(morador4); 

        // Consulta os moradoradores por numero de apartamento
     
        int numeroApartamento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do apartamento:"));
        Morador moradorConsultado = tabelaEspalhamento.consultarMorador(numeroApartamento);
        if (moradorConsultado != null) {
            System.out.println("Morador encontrado: " + moradorConsultado.getNomeMorador());
        } else {
            System.out.println("Morador não encontrado");
        }

        // exclui morador por numero de apartamento
        
       numeroApartamento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do apartamento que deseja excluir:"));
        tabelaEspalhamento.excluirMorador(numeroApartamento);

        // Listar moradores de um determinado andar
       int andar = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do Andar:"));
        LinkedList<Morador> moradoresAndar = tabelaEspalhamento.listarMoradoresAndar(andar);
        if (moradoresAndar.isEmpty()) {
            System.out.println("Não há moradores no andar " + andar);
        } else {
            System.out.println("Moradores do andar " + andar + ":");
            for (Morador morador : moradoresAndar) {
                System.out.println("Apartamento " + morador.getNumeroApartamento() + ": " + morador.getNomeMorador());
            }
        }
    }
}
