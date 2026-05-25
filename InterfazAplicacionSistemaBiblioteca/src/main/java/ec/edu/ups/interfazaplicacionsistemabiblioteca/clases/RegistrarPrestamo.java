package ec.edu.ups.interfazaplicacionsistemabiblioteca.clases;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author AAGR
 */
public class RegistrarPrestamo {
    public RegistrarPrestamo() {
        Frame miVentana5 = new Frame("Registrar Prestamo");
        miVentana5.setSize(400, 280);
        miVentana5.setLocation(220, 160);
        miVentana5.setLayout(new BorderLayout());

        Panel miPanel1 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Label titulo = new Label("Registrar Prestamo");
        miPanel1.add(titulo);

        Panel miPanel2 = new Panel(new GridLayout(4, 2));

        Label cedula = new Label("Cedula usuario:");
        TextField textoCedula = new TextField(20);

        Label libro = new Label("Libro:");
        TextField textoLibro = new TextField(20);

        Label bibliotecario = new Label("Codigo bibliotecario:");
        TextField textoBibliotecario = new TextField(20);

        Label fecha = new Label("Fecha devolucion:");
        TextField textoFecha = new TextField(20);

        miPanel2.add(cedula);
        miPanel2.add(textoCedula);
        miPanel2.add(libro);
        miPanel2.add(textoLibro);
        miPanel2.add(bibliotecario);
        miPanel2.add(textoBibliotecario);
        miPanel2.add(fecha);
        miPanel2.add(textoFecha);

        Panel miPanel3 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Button botonRegistrar = new Button("+ Registrar Prestamo");
        Button botonCancelar = new Button("+ Cancelar");
        miPanel3.add(botonRegistrar);
        miPanel3.add(botonCancelar);

        miVentana5.add(miPanel1, BorderLayout.NORTH);
        miVentana5.add(miPanel2, BorderLayout.CENTER);
        miVentana5.add(miPanel3, BorderLayout.SOUTH);

        miVentana5.setVisible(true);

        botonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miVentana5.dispose();
            }
        });

        miVentana5.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                miVentana5.dispose();
            }
        });
    }
}

