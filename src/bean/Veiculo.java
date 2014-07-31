package bean;

public class Veiculo {
	private String descricao;
	private String placa;
	private int ano;	
	private float valor;	
	
	public Veiculo() {}	
	
	public Veiculo(String descricao, String placa, int ano, float valor) {	
		this.descricao = descricao;
		this.placa = placa;
		this.ano = ano;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getPlaca() {
		return placa;
	}

	public int getAno() {
		return ano;
	}

	public float getValor() {
		return valor;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Descrição: " + getDescricao() + " - Placa: " + getPlaca()
				+ " - Ano: " + getAno() + " - Valor: " + getValor();
	}
	
}