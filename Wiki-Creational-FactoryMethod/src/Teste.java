//Neste exemplo a mesma classe priva o construtor, para fornecer diferentes m�todos
//de cria��o de si mesmo.

public class Teste {
	
	public static void main(String[] args) { 
	
		Complex productPolar = Complex.fromPolarFactory(1, 10.0);
		Complex productCartesian = Complex.fromCartesianFactory(1, 10.0);
	}
}