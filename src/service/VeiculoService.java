package service;

import java.util.Scanner;

import view.View;
import bean.Caminhao;
import bean.Carro;
import bean.Moto;
import bean.Veiculo;

public class VeiculoService {
	private Veiculo[] veiculos;
	private int qtdeVeiculos;	

	public VeiculoService() {	
		this.veiculos = new Veiculo[100];
		this.qtdeVeiculos = 0;
	}
	
	private boolean estacionamentoLivre() {
		if(getQtdeVeiculos() < getVeiculos().length) {
			return true;			
		}
		return false;			
	}
	
	private boolean existeVeiculoNoEstacionamento() {
		if(getQtdeVeiculos() > 0) {
			return true;
		}
		return false;
	}
	
	public boolean addVeiculo(Veiculo v) {
		if(!existeVeiculoNoEstacionamento()) {
			getVeiculos()[incrementQtdeVeiculo()] = v;
			return true;
		}	
		else if(estacionamentoLivre()) {
			boolean exist = false;
			for(int i = 0; i < getQtdeVeiculos(); i++) {
				if(getVeiculos()[i].getDescricao().equalsIgnoreCase(v.getDescricao())) {
					exist = true;					
					break;
				}
			}
			if(!exist) {
				getVeiculos()[incrementQtdeVeiculo()] = v;
				return true;
			}	
			else {
				System.out.println("\nN„o È permitido veÌculos no estacionamento com a mesma descriÁ„o.\n");				
			}
		}	
		else {
			System.out.println("Estacionamento est· cheio!\n");
		}
		return false;
	}
	
	public boolean removerVeiculo() {
		if(existeVeiculoNoEstacionamento()) {
			Scanner in = new Scanner(System.in);
			for(int i = 0; i < getQtdeVeiculos(); i++) {
				if(getVeiculos()[i].getDescricao().equalsIgnoreCase(View.getDescricao())) {					
					for(int index = i; index < getQtdeVeiculos(); index++) {
						getVeiculos()[index] = getVeiculos()[index + 1];
					}
					decrementQtdeVeiculo();					
					return true;
				}
				in.close();
			}
		}
		else {
			System.out.println("\nEstacionamento vazio!\n");			
		}
		return false;
	}
	
	public <T> int getQtdeVeiculosPorTipo(Class<T> tipoVeiculo) {		
		int count = 0;
		if(existeVeiculoNoEstacionamento()) {			
			for(int i = 0; i < getQtdeVeiculos(); i++) {
				if(getVeiculos()[i].getClass() == tipoVeiculo) {
					count++;
				}
			}
		}
		return count;
	}	
	
	public void exibirVeiculos() {
		if(existeVeiculoNoEstacionamento()) {
			for(int i = 0; i < getQtdeVeiculos(); i++) {
				System.out.print("\nDescriÁ„o: " + getVeiculos()[i].getDescricao() + " - Ano: " + getVeiculos()[i].getAno());
			}
			System.out.println("\n");
		}
		else {
			System.out.println("Estacionamento vazio!\n");
		}
	}
	
	public <T> void veiculoMenorValorPorTipo(Class<T> tipoVeiculo) {
		System.out.println(System.currentTimeMillis());
		float menor = Float.MAX_VALUE;
		
		if(existeVeiculoNoEstacionamento()) {
			for(int i = 0; i < getQtdeVeiculos(); i++) {
				if(getVeiculos()[i].getClass() == tipoVeiculo) {
					if(getVeiculos()[i].getValor() < menor) {
						menor = getVeiculos()[i].getValor();
					}
				}
			}		
			for(int i = 0; i < getQtdeVeiculos(); i++) {
				if(getVeiculos()[i].getValor() == menor) {
					System.out.print("\n" + getVeiculos()[i] + "\n");
				}
			}			
		}		
		else if(getQtdeVeiculos() == 1) {			
			System.out.println("\n" + getVeiculos()[0] + "\n");
		}		
		else {
			System.out.println("\nN„o h· veÌculo do tipo informado no estacionamento.\n");
		}	
	}
		
	public void tipoVeiculoMaiorQtde() {		
		int moto = 0;
		int carro = 0;
		int caminhao = 0;
		int onibus = 0;
		
		if(existeVeiculoNoEstacionamento()) {
			for(int i = 0; i < getQtdeVeiculos(); i++) {
				if(getVeiculos()[i].getClass() == Moto.class) {
					moto++;
				}
				else if(getVeiculos()[i].getClass() == Carro.class) {
					carro++;
				}
				else if(getVeiculos()[i].getClass() == Caminhao.class) {
					caminhao++;				
				}
				else {
					onibus++;
				}			
			}			
			if((moto > carro) && (moto > caminhao) && (moto > onibus)) {
				System.out.println("\nMoto\n");
			}
			else if((carro > moto) && (carro > caminhao) && (carro > onibus)) {
				System.out.println("\nCarro\n");
			}
			else if((caminhao > moto) && (caminhao > carro) && (caminhao > onibus)) {
				System.out.println("\nCaminh„o\n");
			}
			else if((onibus > moto) && (onibus > carro) && (onibus > caminhao)) {
				System.out.println("\n‘nibus\n");
			}		
		}
		else {
			System.out.println("\nEstacionamento vazio.\n");
		}
	}	
	
	public void valorTotalDaFrota() {
		if(existeVeiculoNoEstacionamento()) {
			float valorTotal = 0;
			for(int i = 0; i < getQtdeVeiculos(); i++) {
				valorTotal += getVeiculos()[i].getValor();
			}			
			System.out.println("\nValor total da frota: " + valorTotal + "\n");
		}
		else {
			System.out.println("\nEstacionamento vazio.\n");
		}
	}
	
	private Veiculo[] getVeiculos() {
		return veiculos;
	}
	
	private int getQtdeVeiculos() {
		return this.qtdeVeiculos;
	}
	
	private int incrementQtdeVeiculo() {
		return this.qtdeVeiculos++;
	}
	
	private void decrementQtdeVeiculo() {
		this.qtdeVeiculos--;
	}
	
}