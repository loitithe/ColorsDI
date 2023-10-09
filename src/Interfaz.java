import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Interfaz extends JFrame implements ActionListener {
    Font f = new Font("Helvetica", Font.BOLD, 12);
    private String[] colores = { "Negro", "Gris oscuro", "Gris", "Gris Claro", "Blanco", "Magenta", "Azul", "Cian",
            "Verde", "Amarillo", "Naranja", "Rojo", "Rosa" };
    private static final Color[] colors = { Color.BLACK, Color.darkGray,
            Color.gray, Color.lightGray, Color.white, Color.MAGENTA,
            Color.blue, Color.cyan, Color.green, Color.yellow,
            Color.orange, Color.red, Color.pink };

    JScrollBar scrollBar_Red, scrollBar_Green, scrollBar_Blue;
    JTextField textRojo, textVerde, textAzul;
    JLabel lblRojo, lblVerde, lblAzul;

    JPanel jpanel_colorsButton, jpanel_principal, jpanel_ScrollsBar, jpanel_rgbNumbers;

    public Interfaz() {
        super("Colores");
        this.setLayout(new BorderLayout(6, 10));

        // creacion de panel para botones de colores
        jpanel_colorsButton = new JPanel(new GridLayout(13, 1));

        // Creacion de botones
        for (int i = 0; i < colores.length; i++) {
            JButton btn_Colores = new JButton(colores[i]);
            btn_Colores.setPreferredSize(new Dimension(100, 100));
            btn_Colores.setBackground(colors[i]);
            btn_Colores.setFont(f);
            if (colors[i] == Color.BLACK || colors[i] == Color.darkGray || colors[i] == Color.GRAY) {
                btn_Colores.setForeground(Color.white);
            } else {
                btn_Colores.setForeground(Color.black);
            }
            btn_Colores.addActionListener(this);
            jpanel_colorsButton.add(btn_Colores, BorderLayout.EAST);

        }
        jpanel_principal = new JPanel();
        jpanel_principal.setBackground(Color.lightGray);

        scrollBar_Red = new JScrollBar();
        scrollBar_Red.setBackground(Color.red);
        scrollBar_Green = new JScrollBar();
        scrollBar_Green.setBackground(Color.green);
        scrollBar_Blue = new JScrollBar();
        scrollBar_Blue.setBackground(Color.blue);

        jpanel_ScrollsBar = new JPanel(new GridLayout(1, 3));
        jpanel_ScrollsBar.add(scrollBar_Red);
        jpanel_ScrollsBar.add(scrollBar_Green);
        jpanel_ScrollsBar.add(scrollBar_Blue);

        jpanel_rgbNumbers = new JPanel(new GridLayout(1, 6));
        lblRojo = new JLabel("rojo");
        lblRojo.setFont(f);
        lblRojo.setOpaque(true);
        lblRojo.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        lblRojo.setBackground(Color.red);
        lblRojo.setForeground(Color.BLACK);

        textRojo = new JTextField("0");

        lblVerde = new JLabel("verde");
        lblVerde.setOpaque(true);
        lblVerde.setFont(f);
        lblVerde.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        lblVerde.setBackground(Color.GREEN);
        lblVerde.setForeground(Color.BLACK);

        textVerde = new JTextField("0");

        lblAzul = new JLabel("azul");
        lblAzul.setOpaque(true);
        lblAzul.setFont(f);
        lblAzul.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        lblAzul.setBackground(Color.blue);
        lblAzul.setForeground(Color.BLACK);

        textAzul = new JTextField("0");

        jpanel_rgbNumbers.add(lblRojo);
        jpanel_rgbNumbers.add(textRojo);
        jpanel_rgbNumbers.add(lblVerde);
        jpanel_rgbNumbers.add(textVerde);
        jpanel_rgbNumbers.add(lblAzul);
        jpanel_rgbNumbers.add(textAzul);
        this.add(jpanel_rgbNumbers, BorderLayout.SOUTH);
        this.add(jpanel_ScrollsBar, BorderLayout.WEST);
        this.add(jpanel_colorsButton, BorderLayout.EAST);
        this.add(jpanel_principal, BorderLayout.CENTER);
    }

}
