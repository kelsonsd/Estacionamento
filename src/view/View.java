package view;

import java.util.Scanner;

import bean.Caminhao;
import bean.Carro;
import bean.Moto;
import bean.Onibus;

public class View {
	static Scanner in = new Scanner(System.in);
	
	public View() {}
	
	public int imprimeMenu() {		
		System.out.println("1 - Adicionar veículo\n"
				+ "2 - Remover veículo\n"				
				+ "3 - Obter a quantidade de veículos por tipo\n"
				+ "4 - Listar todos os veículos cadastrados\n"
				+ "5 - Veículo que possui o menor valor\n"
				+ "6 - Tipo de veículo que possui maior quantidade\n"
				+ "7 - Obter o valor total da frota\n"
				+ "8 - Sair");		
		return in.nextInt();	
	}
	
	public int menuTiposVeiculos() {
		System.out.println("1 - Moto\n"
				+ "2 - Carro\n"				
				+ "3 - Caminhão\n"
				+ "4 - Ônibus");
		return in.nextInt();
	}		
	
	public Moto imprimeCadastroMoto() {
		System.out.println("\nAdicionar Moto ->");
		return new Moto(getDescricao(), getPlaca(), getAno(), getValor(), getPotencia());		
	}
	
	public Carro imprimeCadastroCarro() {
		System.out.println("\nAdicionar Carro ->");
		return new Carro(getDescricao(), getPlaca(), getAno(), getValor(), getPotencia(), getQtdePortas());		
	}
	
	public Caminhao imprimeCadastroCaminhao() {
		System.out.println("\nAdicionar Caminhão ->");
		return new Caminhao(getDescricao(), getPlaca(), getAno(), getValor(), getCargaSuportada(), getComprimento());		
	}
	
	public Onibus imprimeCadastroOnibus() {
		System.out.println("\nAdicionar Ônibus ->");
		return new Onibus(getDescricao(), getPlaca(), getAno(), getValor(), getComprimento(), getQtdePassageiros());
	}
	
//	public String removerVeiculo() {
//		System.out.print("\nRemover Veículo ->\nDescrição: ");
//		return in.next();
//	}	
	
	public static String getDescricao() {
		System.out.print("Descrição: ");
		return in.next();
	}
 	
	private String getPlaca() {
		System.out.print("Placa: ");
		return in.next();
	}	
	
	private int getAno() {
		System.out.print("Ano: ");
		return in.nextInt();
	}
	
	private float getValor() {
		System.out.print("Valor R$: ");
		return in.nextFloat();
	}
	
	private String getPotencia() {
		System.out.print("Potência: ");
		return in.next();
	}
	
	private int getQtdePortas() {
		System.out.print("Número de Portas: ");
		return in.nextInt();
	}
	
	private double getCargaSuportada() {
		System.out.print("Carga Suportada: ");
		return in.nextDouble();
	}
	
	private float getComprimento() {
		System.out.print("Comprimento: ");
		return in.nextFloat();
	}
	
	private int getQtdePassageiros() {
		System.out.print("Quantidade de Passageiros: ");
		return in.nextInt();
	}
	
}