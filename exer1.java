package aula33.labs;



public class exer1 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();

	    lampada.ligar();

		lampada.mostrarEstado();

		lampada.desligar();

		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
	}

}
