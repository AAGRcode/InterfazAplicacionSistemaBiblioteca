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
public class RegistrarLibro {
     public RegistrarLibro() {
        Frame miVentana2 = new Frame("Registrar Libro");
        miVentana2.setSize(400, 250);
        miVentana2.setLocation(220, 160);
        miVentana2.setLayout(new BorderLayout());

        Panel miPanel1 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Label titulo = new Label("Registrar Libro");
        miPanel1.add(titulo);

        Panel miPanle2 = new Panel(new GridLayout(3, 2));

        Label nombre = new Label("Nombre libro:");
        TextField textoNombre = new TextField(20);

        Label categoria = new Label("Categoria:");
        TextField textoCategoria = new TextField(20);

        Label año = new Label("Año de publicacion:");
        TextField textoAño = new TextField(20);

        miPanle2.add(nombre);
        miPanle2.add(textoNombre);
        miPanle2.add(categoria);
        miPanle2.add(textoCategoria);
        miPanle2.add(año);
        miPanle2.add(textoAño);

        Panel miPanel3 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Button botonRegistrar = new Button("+ Registrar Libro");
        Button botonCancelar = new Button("+ Cancelar");
        miPanel3.add(botonRegistrar);
        miPanel3.add(botonCancelar);

        miVentana2.add(miPanel1, BorderLayout.NORTH);
        miVentana2.add(miPanle2, BorderLayout.CENTER);
        miVentana2.add(miPanel3, BorderLayout.SOUTH);

        miVentana2.setVisible(true);

        botonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miVentana2.dispose();
            }
        });

        miVentana2.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                miVentana2.dispose();
            }
        });
    }
}


