package bean;

public class Carro extends Veiculo {
	private String potencia;
	private int qtdePortas;	
	
	public Carro() {}
	
	public Carro(String descricao, String placa, int ano, float valor, String potencia, int qtdePortas) {
		super(descricao, placa, ano, valor);		
		this.potencia = potencia;
		this.qtdePortas = qtdePortas;
	}

	public int getQtdePortas() {
		return qtdePortas;
	}

	public String getPotencia() {
		return potencia;
	}

	@Override
	public String toString() {
		return "Carro [" + super.toString() + " - Quantidade de Portas: " + getQtdePortas()
				+ " - Potência: " + getPotencia() + "]";				
	}
	
}