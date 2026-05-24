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
public class RegistrarDevolucion {
    public RegistrarDevolucion() {
        Frame miVentana7 = new Frame("Registrar Devolucion");
        miVentana7.setSize(400, 220);
        miVentana7.setLocation(220, 160);
        miVentana7.setLayout(new BorderLayout());

        Panel miPanel1 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Label titulo = new Label("Registrar Devolucion");
        miPanel1.add(titulo);

        Panel miPanel2 = new Panel(new GridLayout(3, 2));

        Label id = new Label("ID de Prestamo:");
        TextField textoId = new TextField(20);

        Label cedula = new Label("Cedula usuario:");
        TextField textoCedula = new TextField(20);

        Label fecha = new Label("Fecha de devolucion:");
        TextField textoFecha = new TextField(20);

        miPanel2.add(id);
        miPanel2.add(textoId);
        miPanel2.add(cedula);
        miPanel2.add(textoCedula);
        miPanel2.add(fecha);
        miPanel2.add(textoFecha);

        Panel miPanel3 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Button botonRegistrar = new Button("+ Registrar Devolucion");
        Button botonCancelar = new Button("+ Cancelar");
        miPanel3.add(botonRegistrar);
        miPanel3.add(botonCancelar);

        miVentana7.add(miPanel1, BorderLayout.NORTH);
        miVentana7.add(miPanel2, BorderLayout.CENTER);
        miVentana7.add(miPanel3, BorderLayout.SOUTH);

        miVentana7.setVisible(true);

        botonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miVentana7.dispose();
            }
        });

        miVentana7.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                miVentana7.dispose();
            }
        });
    }
}
