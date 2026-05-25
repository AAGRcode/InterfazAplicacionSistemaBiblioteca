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
public class RegistrarUsuario {
     public RegistrarUsuario() {
        Frame miVentana3 = new Frame("Registrar Usuario");
        miVentana3.setSize(400, 320);
        miVentana3.setLocation(220, 160);
        miVentana3.setLayout(new BorderLayout());

        Panel miPanel1 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Label titulo = new Label("Registrar Usuario");
        miPanel1.add(titulo);

        Panel miPanel2 = new Panel(new GridLayout(5, 2));

        Label nombre = new Label("Nombre completo:");
        TextField textoNombre = new TextField(20);

        Label cedula = new Label("Cedula:");
        TextField textoCedula = new TextField(20);

        Label edad = new Label("Edad:");
        TextField textoEdad = new TextField(20);

        Label correo = new Label("Correo electronico:");
        TextField textoCorreo = new TextField(20);

        Label lblUsuario = new Label("Nombre de usuario:");
        TextField textoUsuario = new TextField(20);

        miPanel2.add(nombre);
        miPanel2.add(textoNombre);
        miPanel2.add(cedula);
        miPanel2.add(textoCedula);
        miPanel2.add(edad);
        miPanel2.add(textoEdad);
        miPanel2.add(correo);
        miPanel2.add(textoCorreo);
        miPanel2.add(lblUsuario);
        miPanel2.add(textoUsuario);

        Panel miPanel3 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Button botonRegistrar = new Button("+ Registrar Usuario");
        Button botonCancelar = new Button("+ Cancelar");
        miPanel3.add(botonRegistrar);
        miPanel3.add(botonCancelar);

        miVentana3.add(miPanel1, BorderLayout.NORTH);
        miVentana3.add(miPanel2, BorderLayout.CENTER);
        miVentana3.add(miPanel3, BorderLayout.SOUTH);

        miVentana3.setVisible(true);

        botonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miVentana3.dispose();
            }
        });

        miVentana3.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                miVentana3.dispose();
            }
        });
    }
}


