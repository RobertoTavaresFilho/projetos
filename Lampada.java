package aula33.labs;

public class Lampada {
 // atributos
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoluz;
	private int garantiaMeses;
	private String[] tipos;
	private boolean tipoAbajur;
	private boolean ligada;
	
	
	// costrutores.
	public Lampada() {
		
	}
	public Lampada(String modelo, String tensao, int potencia, String cor, String tipoluz, int garantiaMeses,
			String[] tipos, boolean tipoAbajur, boolean ligada) {
		super();
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.cor = cor;
		this.tipoluz = tipoluz;
		this.garantiaMeses = garantiaMeses;
		this.tipos = tipos;
		this.tipoAbajur = tipoAbajur;
		this.ligada = ligada;
	}



	// metodos gets / set
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipoluz() {
		return tipoluz;
	}
	public void setTipoluz(String tipoluz) {
		this.tipoluz = tipoluz;
	}
	public int getGarantiaMeses() {
		return garantiaMeses;
	}
	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
	public String[] getTipos() {
		return tipos;
	}
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	public boolean isTipoAbajur() {
		return tipoAbajur;
	}
	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	//outros metodos
	public void ligar() {

		
		setLigada(true);
	}

	public void desligar() {

		
		setLigada(false);
	}
	public void mostrarEstado() {

		if (isLigada()) {

			System.out.println("Lâmpada está ligada. ");
		} else {

			System.out.println("Lâmpada está  desligada.");

		}
	}
		public void mudarEstado() {

			if (isLigada()) {
				setLigada(false);
			} else {
				setLigada(true);
			}
		}
}
