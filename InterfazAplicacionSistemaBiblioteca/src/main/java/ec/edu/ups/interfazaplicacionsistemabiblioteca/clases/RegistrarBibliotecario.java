package ec.edu.ups.interfazaplicacionsistemabiblioteca.clases;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author AAGR
 */
public class RegistrarBibliotecario {
    public RegistrarBibliotecario() {
        Frame miVentana4 = new Frame("Registrar Bibliotecario");
        miVentana4.setSize(400, 280);
        miVentana4.setLocation(220, 160);
        miVentana4.setLayout(new BorderLayout());

        Panel miPanel1 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Label titulo = new Label("Registrar Bibliotecario");
        miPanel1.add(titulo);

        Panel miPanel2 = new Panel(new GridLayout(4, 2));

        Label nombre = new Label("Nombre completo:");
        TextField textoNombre = new TextField(20);

        Label cedula = new Label("Cedula:");
        TextField textoCedula = new TextField(20);

        Label edad = new Label("Edad:");
        TextField textoEdad = new TextField(20);

        Label codigo = new Label("Codigo Empleado:");
        TextField textoCodigo = new TextField(20);

        miPanel2.add(nombre);
        miPanel2.add(textoNombre);
        miPanel2.add(cedula);
        miPanel2.add(textoCedula);
        miPanel2.add(edad);
        miPanel2.add(textoEdad);
        miPanel2.add(codigo);
        miPanel2.add(textoCodigo);

        Panel miPanel3 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Button botonRegistrar = new Button("+ Registrar Bibliotecario");
        Button botonCancelar = new Button("+ Cancelar");
        miPanel3.add(botonRegistrar);
        miPanel3.add(botonCancelar);

        miVentana4.add(miPanel1, BorderLayout.NORTH);
        miVentana4.add(miPanel2, BorderLayout.CENTER);
        miVentana4.add(miPanel3, BorderLayout.SOUTH);

        miVentana4.setVisible(true);

        botonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miVentana4.dispose();
            }
        });

        miVentana4.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                miVentana4.dispose();
            }
        });
    }
}
