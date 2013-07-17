 public final class MySingleton {
     // Instancia estática privada que será acessada
     private static final MySingleton INSTANCE = new MySingleton();
 
     // Construtor privado. Suprime o construtor público padrao.
     private MySingleton() {
      // Operações de inicialização da classe
     }
 
     // Método público estático de acesso único ao objeto!
     public static synchronized MySingleton getInstance(){
           return INSTANCE;
     }
     
     //Teste
     public static void main(String[] args){
    	 MySingleton.getInstance();
     }
 }
 