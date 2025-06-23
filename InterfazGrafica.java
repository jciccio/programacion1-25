import javax.swing.*;
import java.awt.event.*;


public class InterfazGrafica implements ActionListener{

	private JTextField textoDeUnaLinea;
	private JTextArea textoMultilinea;

	public InterfazGrafica(){
		JFrame ventana = new JFrame();
		ventana.setLayout(null);
		ventana.setBounds(500,100, 500,500);// x, y, width, height

		JButton boton1 = new JButton("Abrir");
		boton1.setBounds(20, 20, 200, 30);// x, y, w, h
		boton1.addActionListener(this);
		ventana.add(boton1);

		JButton boton2 = new JButton("Guardar");
		boton2.setBounds(250, 20, 200, 30);// x, y, w, h
		boton2.addActionListener(this);
		ventana.getContentPane().add(boton2);

		textoDeUnaLinea = new JTextField();
		textoDeUnaLinea.setBounds(20, 80, 430, 30);// x, y, w, h

		ventana.getContentPane().add(textoDeUnaLinea);

		textoMultilinea = new JTextArea();
		textoMultilinea.setBounds(20, 120, 430, 300);// x, y, w, h
		//ventana.getContentPane().add(textoMultilinea);

		JScrollPane scroll = new JScrollPane(textoMultilinea);
		scroll.setBounds(20, 120, 430, 300);// x, y, w, h
		ventana.getContentPane().add(scroll);
		ventana.setVisible(true);
	}


	public void abrirArchivo(){
		System.out.println(textoDeUnaLinea.getText());
		LectorDeArchivos lector = new LectorDeArchivos(textoDeUnaLinea.getText());
		String todoContenido = lector.leerArchivo();
		textoMultilinea.setText(todoContenido);
		lector.cerrar();
	}

	public void guardarArchivo(){
		EscritorDeArchivos escritor = new EscritorDeArchivos(textoDeUnaLinea.getText());
		escritor.escribir(textoMultilinea.getText());
		escritor.cerrar();
	}


	public void actionPerformed(ActionEvent evento){
		//System.out.println(evento);
		//System.out.println(evento.getSource());
		//System.out.println(evento.getActionCommand());
		String nombreBoton = evento.getActionCommand();
		if(nombreBoton.equals("Abrir")){
			System.out.println("Estamos abriendo un archivo");
			abrirArchivo();
		}
		else if (nombreBoton.equals("Guardar")){
			System.out.println("Estamos guardando un archivo");
			guardarArchivo();
		}
	}


	public static void main (String args[]){
		InterfazGrafica interfaz = new InterfazGrafica();
	}

}