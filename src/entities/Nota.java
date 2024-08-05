package entities;

public class Nota {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double media() {
		
		double x = ((nota1 + nota2 + nota3) / 3.0);
		return x;
	}

}
