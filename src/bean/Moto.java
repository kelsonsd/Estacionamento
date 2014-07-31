package bean;

public class Moto extends Veiculo {
	private String potencia;

	public Moto() {}

	public Moto(String descricao, String placa, int ano, float valor, String potencia) {
		super(descricao, placa, ano, valor);
		this.potencia = potencia;
	}	

	public String getPotencia() {
		return potencia;
	}	

	@Override
	public String toString() {
		return "Moto [" + super.toString() + " - Potência: " + getPotencia() + "]";
	}	
	
}