package ufc.crateus.sd.model;


public class Car {
	private int id;
	private String nome;
	private String marca;
	private int anoFabricacao;
	private int anoModelo;
	private double preco;
	
	
	
	
	public Car(int id, String nome, String marca, int anoFabricacao, int anoModelo, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.preco = preco;
	}

	public Car(String nome, String marca, int anoFabricacao, int anoModelo, double preco) {
		this.nome = nome;
		this.marca = marca;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "car [nome=" + nome + ", marca=" + marca + ", anoFabricacao=" + anoFabricacao + ", anoModelo="
				+ anoModelo + ", preco=" + preco + "]";
	}
}
