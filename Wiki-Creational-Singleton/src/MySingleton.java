 public final class MySingleton {
     // Instancia est�tica privada que ser� acessada
     private static final MySingleton INSTANCE = new MySingleton();
 
     // Construtor privado. Suprime o construtor p�blico padrao.
     private MySingleton() {
      // Opera��es de inicializa��o da classe
     }
 
     // M�todo p�blico est�tico de acesso �nico ao objeto!
     public static synchronized MySingleton getInstance(){
           return INSTANCE;
     }
     
     //Teste
     public static void main(String[] args){
    	 MySingleton.getInstance();
     }
 }
 