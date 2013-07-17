//Neste exemplo a mesma classe priva o construtor, para fornecer diferentes métodos
//de criação de si mesmo.

class Complex {
     public static Complex fromCartesianFactory(double real, double imaginary) {
         return new Complex(real, imaginary);
     }
     public static Complex fromPolarFactory(double modulus, double angle) {
         return new Complex(modulus * cos(angle), modulus * sin(angle));
     }
     private Complex(double a, double b) {
         //...
     }
     
     //pseudo metodos
     static double cos(double angle) {return 0;}
     static double sin(double angle) {return 0;}
     
}
public class Teste {
	
	public static void main(String[] args) { 
	
		Complex productPolar = Complex.fromPolarFactory(1, 10.0);
		Complex productCartesian = Complex.fromCartesianFactory(1, 10.0);
	}
}