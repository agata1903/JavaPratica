import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Minha janelinha! =3");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400,300);

        JButton button = new JButton("Clique aqui");

        frame.getContentPane().add(button);

        frame.setVisible(true);
    }
}