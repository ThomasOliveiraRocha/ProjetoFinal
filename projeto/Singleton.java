
package projeto;


 public class Singleton {
        private static Singleton singleton; //Variavel de classe
        private Singleton() {
        }
        public static Singleton iniciar() {
        if ( singleton == null ){ 
        singleton = new Singleton();
        System.out.println("Nova singleton instanciada");
        return singleton;
        } else
        System.out.println("Já foi decladara. Descanse");
        return null;
        }
    }