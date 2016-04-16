package observer.ex1;

/**
 * Classe executável.
 * 
 * @author Vítor Souza
 * @version 2005.07.21
 */
public class MainObserverEx1 {
    /** Método principal - executável. */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }
}
