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
public class RegistrarAutor{
    public RegistrarAutor() {
        Frame miVentana = new Frame("Registrar Autor");
        miVentana.setSize(400, 250);
        miVentana.setLocation(200, 150);
        miVentana.setLayout(new BorderLayout());

        Panel miPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
        Label titulo = new Label("Registrar Autor");
        miPanel.add(titulo);

        Panel miPanel2 = new Panel(new GridLayout(3, 2));

        Label nombre = new Label("Nombre completo:");
        TextField ingresoNombre = new TextField(20);

        Label nacionalidad = new Label("Nacionalidad:");
        TextField ingresoNacionalidad = new TextField(20);

        Label año = new Label("Año de nacimiento:");
        TextField ingresoAño = new TextField(20);

        miPanel2.add(nombre);
        miPanel2.add(ingresoNombre);
        miPanel2.add(nacionalidad);
        miPanel2.add(ingresoNacionalidad);
        miPanel2.add(año);
        miPanel2.add(ingresoAño);

        Panel miPanel3 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Button botonRegistrar = new Button("+ Registrar Autor");
        Button botonCancelar = new Button("+ Cancelar");
        miPanel3.add(botonRegistrar);
        miPanel3.add(botonCancelar);

        miVentana.add(miPanel, BorderLayout.NORTH);
        miVentana.add(miPanel2, BorderLayout.CENTER);
        miVentana.add(miPanel3, BorderLayout.SOUTH);

        miVentana.setVisible(true);

        botonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miVentana.dispose();
            }
        });
        
        miVentana.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                miVentana.dispose();
            }
        });
    }
    
}
