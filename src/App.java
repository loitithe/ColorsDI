import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {

        Interfaz interfaz = new Interfaz();
        interfaz.setDefaultCloseOperation(Interfaz.EXIT_ON_CLOSE);
        interfaz.setSize(800, 800);
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true);
    }
}
