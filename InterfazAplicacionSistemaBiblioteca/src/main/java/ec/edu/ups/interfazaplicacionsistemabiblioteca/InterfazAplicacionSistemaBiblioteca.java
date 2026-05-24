package ec.edu.ups.interfazaplicacionsistemabiblioteca;
import ec.edu.ups.interfazaplicacionsistemabiblioteca.clases.MostrarDatos;
import ec.edu.ups.interfazaplicacionsistemabiblioteca.clases.RegistrarAutor;
import ec.edu.ups.interfazaplicacionsistemabiblioteca.clases.RegistrarBibliotecario;
import ec.edu.ups.interfazaplicacionsistemabiblioteca.clases.RegistrarDevolucion;
import ec.edu.ups.interfazaplicacionsistemabiblioteca.clases.RegistrarLibro;
import ec.edu.ups.interfazaplicacionsistemabiblioteca.clases.RegistrarPrestamo;
import ec.edu.ups.interfazaplicacionsistemabiblioteca.clases.RegistrarUsuario;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author AAGR
 */
public class InterfazAplicacionSistemaBiblioteca {

    public static void main(String[] args) {
        Frame miVentana = new Frame("Sistema de Biblioteca");
        miVentana.setSize(400, 400);
        miVentana.setLocation(100, 80);
        miVentana.setLayout(new BorderLayout());

        Panel miPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
        Label titulo = new Label("Sistema de Biblioteca");
        miPanel.add(titulo);

        Panel miPanel1 = new Panel(new GridLayout(9, 1));

        Label registros = new Label("REGISTROS");
        Button botonAutor = new Button("Registrar autor");
        Button botonLibro = new Button("Registrar libro");
        Button botonUsuario = new Button("Registrar usuario");
        Button botonBibliotecario = new Button("Registrar bibliotecario");

        Label prestamos = new Label("PRESTAMOS");
        Button botonPrestamo   = new Button("Registrar prestamo");
        Button botonDevolucion = new Button("Registrar devolucion");
        Button botonDatos      = new Button("Mostrar datos");

        miPanel1.add(registros);
        miPanel1.add(botonAutor);
        miPanel1.add(botonLibro);
        miPanel1.add(botonUsuario);
        miPanel1.add(botonBibliotecario);
        miPanel1.add(prestamos);
        miPanel1.add(botonPrestamo);
        miPanel1.add(botonDevolucion);
        miPanel1.add(botonDatos);

        Panel miPanel2 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Button btnSalir = new Button("Salir");
        miPanel2.add(btnSalir);

        miVentana.add(miPanel, BorderLayout.NORTH);
        miVentana.add(miPanel1, BorderLayout.CENTER);
        miVentana.add(miPanel2, BorderLayout.SOUTH);

        miVentana.setVisible(true);

        botonAutor.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new RegistrarAutor();
        }
        });

        botonLibro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RegistrarLibro();
            }
        });

        botonUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RegistrarUsuario();
            }
        });

        botonBibliotecario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RegistrarBibliotecario();
            }
        });

        botonPrestamo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RegistrarPrestamo();
            }
        });

        botonDevolucion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RegistrarDevolucion();
            }
        });

        botonDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MostrarDatos();
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

            miVentana.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
            }
        });
    }
}

