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
public class MostrarDatos {
    public MostrarDatos() {
        Frame miVentana8 = new Frame("Mostrar Datos");
        miVentana8.setSize(550, 350);
        miVentana8.setLocation(180, 130);
        miVentana8.setLayout(new BorderLayout());

        Panel miPanel1 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Label titulo = new Label("Datos del Sistema de Biblioteca");
        miPanel1.add(titulo);

        Panel miPanel2 = new Panel(new GridLayout(1, 3));

        Panel miPanel3 = new Panel(new BorderLayout());
        Label autores = new Label("Autores:");
        TextArea areaAutores = new TextArea("1. Garcia Marquez\n   Colombiano\n\n" +"2. Edgar Allan Poe\n   Estadounidense\n\n" +"3. Cervantes\n   Español\n", 8, 15);
        areaAutores.setEditable(false);
        miPanel3.add(autores, BorderLayout.NORTH);
        miPanel3.add(areaAutores, BorderLayout.CENTER);

        Panel miPanel4 = new Panel(new BorderLayout());
        Label libros = new Label("Libros:");
        TextArea areaLibros = new TextArea("1. Cien años de soledad\n   Ficcion\n\n" +"2. El gato negro\n   Terror\n\n" +"3. Don Quijote\n   Novela\n", 8, 15);
        areaLibros.setEditable(false);
        miPanel4.add(libros, BorderLayout.NORTH);
        miPanel4.add(areaLibros, BorderLayout.CENTER);

        Panel miPanel5 = new Panel(new BorderLayout());
        Label prestamos = new Label("Prestamos:");
        TextArea areaPrestamos = new TextArea("#1 Cien años de soledad\n   Axel Gonzalez\n   Vence: 25 dic\n\n" +"#2 El gato negro\n   Maria Lopez\n   Vence: 30 dic\n", 8, 15);
        areaPrestamos.setEditable(false);
        miPanel5.add(prestamos, BorderLayout.NORTH);
        miPanel5.add(areaPrestamos, BorderLayout.CENTER);

        miPanel2.add(miPanel3);
        miPanel2.add(miPanel4);
        miPanel2.add(miPanel5);

        Panel miPanel6 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Button botonCerrar = new Button("Cerrar");
        miPanel6.add(botonCerrar);

        miVentana8.add(miPanel1, BorderLayout.NORTH);
        miVentana8.add(miPanel2, BorderLayout.CENTER);
        miVentana8.add(miPanel6, BorderLayout.SOUTH);

        miVentana8.setVisible(true);

        botonCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miVentana8.dispose();
            }
        });

        miVentana8.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                miVentana8.dispose();
            }
        });
    }
}

