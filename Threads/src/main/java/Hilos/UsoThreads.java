package Hilos;

import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsoThreads {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        JFrame marco = new MarcoRebote();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

}

//Clase que genera varios hilos--------------------------------------------------------------------------
class PelotaHilos implements Runnable {

    private Pelota pelota;
    private Component componente;

    public PelotaHilos(Pelota unaPelota, Component unComponente) {

        this.pelota = unaPelota;
        this.componente = unComponente;

    }

    @Override
    public void run() {

        while (!Thread.interrupted()) {

            pelota.mueve_pelota(componente.getBounds());
            componente.paint(componente.getGraphics());

            try {
                Thread.sleep(4);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

    }

}

//Movimiento de la pelota-----------------------------------------------------------------------------------------
class Pelota {

    private static final int TAMX = 15;
    private static final int TAMY = 15;
    private double x = 0;
    private double y = 0;
    private double dx = 1;
    private double dy = 1;

    // Mueve la pelota invirtiendo posici�n si choca con l�mites
    public void mueve_pelota(Rectangle2D limites) {

        x += dx;
        y += dy;

        if (x < limites.getMinX()) {

            x = limites.getMinX();
            dx = -dx;
        }

        if (x + TAMX >= limites.getMaxX()) {

            x = limites.getMaxX() - TAMX;
            dx = -dx;
        }

        if (y < limites.getMinY()) {

            y = limites.getMinY();
            dy = -dy;
        }

        if (y + TAMY >= limites.getMaxY()) {

            y = limites.getMaxY() - TAMY;
            dy = -dy;

        }

    }

    //Forma de la pelota en su posici�n inicial
    public Ellipse2D getShape() {

        return new Ellipse2D.Double(x, y, TAMX, TAMY);

    }

}

// L�mina que dibuja las pelotas----------------------------------------------------------------------
class LaminaPelota extends JPanel {

    //A�adimos pelota a la l�mina
    public void add(Pelota b) {
        pelotas.add(b);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        pelotas.forEach(b -> {
            g2.fill(b.getShape());
        });

    }

    private final ArrayList<Pelota> pelotas = new ArrayList<>();
}

//Marco con l�mina y botones------------------------------------------------------------------------------
final class MarcoRebote extends JFrame {

    public MarcoRebote() {

        setBounds(600, 300, 400, 350);
        setTitle("Rebotes");
        lamina = new LaminaPelota();
        add(lamina, BorderLayout.CENTER);
        JPanel laminaBotones = new JPanel();
        ponerBoton(laminaBotones, "Dale!", (ActionEvent evento) -> {
            comienza_el_juego();
        });

        ponerBoton(laminaBotones, "Salir", (ActionEvent evento) -> {
            System.exit(0);
        });

        ponerBoton(laminaBotones, "Pausar", (ActionEvent evento) -> {
            detener();
        });

        add(laminaBotones, BorderLayout.SOUTH);
    }

    //Ponemos botones
    public void ponerBoton(Container c, String titulo, ActionListener oyente) {

        JButton boton = new JButton(titulo);
        c.add(boton);
        boton.addActionListener(oyente);

    }

    //A�ade pelota y la bota 1000 veces
    public void comienza_el_juego() {

        Pelota pelota = new Pelota();
        lamina.add(pelota);

        Runnable r = new PelotaHilos(pelota, lamina);
        t = new Thread(r);
        t.start();

    }

    public void detener() {

        t.interrupt();

    }

    private final LaminaPelota lamina;
    Thread t;

}
