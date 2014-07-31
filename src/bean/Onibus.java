package bean;

public class Onibus extends Veiculo {
	private float comprimento;
	private int qtdePassageiros;
	
	public Onibus() {}
	
	public Onibus(String descricao, String placa, int ano, float valor, float comprimento, int qtdePassageiros) {
		super(descricao, placa, ano, valor);
		this.comprimento = comprimento;
		this.qtdePassageiros = qtdePassageiros;
	}
	
	public float getComprimento() {
		return comprimento;
	}

	public int getQtdePassageiros() {
		return qtdePassageiros;
	}

	@Override
	public String toString() {
		return "Onibus [" + super.toString() + " - Comprimento: " + getComprimento()
				+ " - Quantidade de Passageiros: " + getQtdePassageiros() + "]";
	}
	
}