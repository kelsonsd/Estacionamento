package bean;

public class Caminhao extends Veiculo {
	private double cargaSuportada;
	private float comprimento;
	
	public Caminhao() {}
	
	public Caminhao(String descricao, String placa, int ano, float valor, double cargaSuportada, float comprimento) {
		super(descricao, placa, ano, valor);
		this.cargaSuportada = cargaSuportada;
		this.comprimento = comprimento;
	}

	public double getCargaSuportada() {
		return cargaSuportada;
	}

	public float getComprimento() {
		return comprimento;
	}

	@Override
	public String toString() {
		return "Caminhao [" + super.toString() + " - Carga Suportada: " + getCargaSuportada()
				+ " - Comprimento: " + getComprimento() + "]";
	}	
	
}