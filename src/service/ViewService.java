package service;

import java.util.Scanner;

import bean.Caminhao;
import bean.Carro;
import bean.Moto;
import bean.Onibus;
import view.View;

public class ViewService {	
	private VeiculoService vs = new VeiculoService();			
	
	public void iniciar() {
		View view = new View();
		Scanner in = new Scanner(System.in);
		int opcao = view.imprimeMenu();	
				
		while(opcao != 8) {
			switch (opcao) {
				case 1:
					System.out.println("\nAdicionar ve�culo -> (1 - 4)");
					opcao = view.menuTiposVeiculos();
					do {
						switch(opcao) {
							case 1:
								if(vs.addVeiculo(view.imprimeCadastroMoto())) {
									System.out.println("Moto adicionada com sucesso!\n");
								}						
								opcao = view.imprimeMenu();
								break;						
							case 2: 
								if(vs.addVeiculo(view.imprimeCadastroCarro())) {
									System.out.println("Carro adicionado com sucesso!\n");
								}						
								opcao = view.imprimeMenu();
								break;
							case 3:
								if(vs.addVeiculo(view.imprimeCadastroCaminhao())) {
									System.out.println("Caminh�o adicionado com sucesso!\n");
								}												
								opcao = view.imprimeMenu();
								break;							
							case 4:
								if(vs.addVeiculo(view.imprimeCadastroOnibus())) {
									System.out.println("�nibus adicionado com sucesso!\n");
								}						
								opcao = view.imprimeMenu();
								break;							
							default:
								System.out.println("\nOp��o Inv�lida!\n");
								opcao = view.menuTiposVeiculos();								
						}						
					} while(opcao < 1 && opcao > 4);					
					break;
				case 2: 
					System.out.println("\nRemover Ve�culo ->");
					if(vs.removerVeiculo()) {
						System.out.println("Ve�culo removido com sucesso!\n");
					}					
					opcao = view.imprimeMenu();
					break;
				case 3:
					System.out.println();
					opcao = view.menuTiposVeiculos();
					do {
						switch(opcao) {
							case 1: 
								System.out.println("\n" + vs.getQtdeVeiculosPorTipo(Moto.class) + " Moto(s)\n");
								opcao = view.imprimeMenu();
								break;
							case 2: 
								System.out.println("\n" + vs.getQtdeVeiculosPorTipo(Carro.class)  + " Carro(s)\n");
								opcao = view.imprimeMenu();
								break;
							case 3:
								System.out.println("\n" + vs.getQtdeVeiculosPorTipo(Caminhao.class) + " Caminh�o(�es)\n");
								opcao = view.imprimeMenu();
								break;
							case 4:
								System.out.println("\n" + vs.getQtdeVeiculosPorTipo(Onibus.class) + " �nibus\n");
								opcao = view.imprimeMenu();
								break;
							default:
								System.out.print("\nOp��o Inv�lida!");
								opcao = view.menuTiposVeiculos();																
						}						
					} while(opcao < 1 && opcao > 4);					
					break;
				case 4:
					vs.exibirVeiculos();					
					opcao = view.imprimeMenu();
					break;
					
				case 5:
					System.out.println();
					opcao = view.menuTiposVeiculos();
					do {
						switch(opcao) {
							case 1: 
								vs.veiculoMenorValorPorTipo(Moto.class);						
								opcao = view.imprimeMenu();
								break;
							case 2: 
								vs.veiculoMenorValorPorTipo(Carro.class);												
								opcao = view.imprimeMenu();
								break;
							case 3:
								vs.veiculoMenorValorPorTipo(Caminhao.class);												
								opcao = view.imprimeMenu();
								break;
							case 4:
								vs.veiculoMenorValorPorTipo(Onibus.class);												
								opcao = view.imprimeMenu();
								break;
							default:
								System.out.println("Op��o Inv�lida!\n");
								opcao = view.menuTiposVeiculos();								
						}
					} while(opcao < 1 && opcao > 4);					
					break;	
				case 6:
					vs.tipoVeiculoMaiorQtde();					
					opcao = view.imprimeMenu();
					break;
				case 7:	
					vs.valorTotalDaFrota();					
					opcao = view.imprimeMenu();
					break;					
				default:
					System.out.println("\nOp��o Inv�lida!\n");					
					opcao = view.imprimeMenu();					
			}			
		}		
		in.close();
		System.out.print("\n-------------> SISTEMA ENCERRADO <-------------");
	}
	
}