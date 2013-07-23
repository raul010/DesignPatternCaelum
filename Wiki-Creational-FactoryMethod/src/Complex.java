
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