/*
* Proyecto: swing_c_p02_SanchezAlpanezHugo
* Paquete: cruisin
* Archivo: VentanaPrincipal.java
* Autor/a: Hugo Sanchez Alpañez
* Fecha: 26 nov 2025 12:25:38
*
* Descripción:
* [Resumen del propósito del archivo/clase.]
*
* Licencia:
* [Condiciones de uso/licencia.]
*/
package cruisin;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


// TODO: Auto-generated Javadoc
/**
 * The Class VentanaPrincipal.
 */
public class VentanaPrincipal extends JFrame implements ActionListener{
	
	/** The menu. */
	JMenuBar menu = new JMenuBar();
	
	/** The archivo. */
	JMenu archivo = new JMenu("Archivo");
	
	/** The registro. */
	JMenu registro = new JMenu("Registro");
	
	/** The ayuda. */
	JMenu ayuda = new JMenu("Ayuda");
	
	/** The salir. */
	JMenuItem salir = new JMenuItem("Salir");
	
	/** The alta pisos. */
	JMenuItem altaPisos = new JMenuItem("Alta Pisos");
	
	/** The baja pisos. */
	JMenuItem bajaPisos = new JMenuItem("Baja Pisos");
	
	/** The acerca de. */
	JMenuItem acercaDe = new JMenuItem("Acerca De");
	
	/** The nuevo. */
	JButton nuevo = new JButton("Nuevo");
	
	/** The eliminar. */
	JButton eliminar = new JButton("Eliminar");
	
    JButton btnCambiarTema = new JButton("Tema Claro/Oscuro");

	

	/**
	 * Instantiates a new ventana principal.
	 */
	public VentanaPrincipal() {
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setTitle("Gestión Apartamentos Turísticos AlmeriaCruising");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(pantalla.width / 2, pantalla.height / 2);
		setLocationRelativeTo(null);
		
		ImageIcon icon = new ImageIcon(getClass().getResource("/recursos/icono.png"));
		setIconImage(icon.getImage());
		
		archivo.setMnemonic(KeyEvent.VK_F);
		salir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
		archivo.add(salir);
		
		registro.setMnemonic(KeyEvent.VK_R);
		altaPisos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		altaPisos.addActionListener(this);
		bajaPisos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
		bajaPisos.addActionListener(this);
		registro.add(altaPisos);
		registro.add(bajaPisos);
		
		ayuda.setMnemonic(KeyEvent.VK_A);
		acercaDe.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
		acercaDe.addActionListener(this);
		ayuda.add(acercaDe);
		
		menu.add(archivo);
		menu.add(registro);
		menu.add(ayuda);
		setJMenuBar(menu);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.PAGE_AXIS));
		
		ImageIcon iconoNuevo = new ImageIcon(getClass().getResource("/recursos/nuevo.png"));
		Image nuevoEscalado = iconoNuevo.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		nuevo.setIcon(new ImageIcon(nuevoEscalado));
		nuevo.setPreferredSize(new Dimension(Integer.MAX_VALUE, 50));
		nuevo.setAlignmentX(Component.CENTER_ALIGNMENT);
		nuevo.addActionListener(this);
		
		ImageIcon iconoEliminar = new ImageIcon(getClass().getResource("/recursos/eliminar.png"));
		Image eliminarEscalado = iconoEliminar.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		eliminar.setIcon(new ImageIcon(eliminarEscalado));
		eliminar.setPreferredSize(new Dimension(Integer.MAX_VALUE, 50));
		eliminar.setAlignmentX(Component.CENTER_ALIGNMENT);
		eliminar.addActionListener(this);
		
		btnCambiarTema.addActionListener(e -> {
		    try {
		        if (UIManager.getLookAndFeel() instanceof FlatLightLaf) {
		            UIManager.setLookAndFeel(new FlatDarkLaf());
		        } else {
		            UIManager.setLookAndFeel(new FlatLightLaf());
		        }

		        // Actualiza la ventana completa con el nuevo look and feel
		        SwingUtilities.updateComponentTreeUI(this);
		    } catch (Exception ex) {
		        ex.printStackTrace();
		    }
		});
		btnCambiarTema.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
		panelPrincipal.add(Box.createVerticalGlue());
		panelPrincipal.add(nuevo);
		panelPrincipal.add(Box.createVerticalStrut(40));
		panelPrincipal.add(eliminar);
		panelPrincipal.add(Box.createVerticalStrut(40));
		panelPrincipal.add(btnCambiarTema);
		panelPrincipal.add(Box.createVerticalGlue());
		
		add(panelPrincipal, BorderLayout.CENTER);
		getRootPane().setDefaultButton(nuevo);
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == nuevo || e.getSource() == altaPisos) {
			VentanaAlta dialog = new VentanaAlta(this);
			dialog.setVisible(true);
		}
		if (e.getSource() == eliminar || e.getSource() == bajaPisos) {
			JOptionPane.showMessageDialog(this, "Esta funcion todavia no esta implementada", "Error", JOptionPane.ERROR_MESSAGE);
		}
		if (e.getSource() == acercaDe) {
			JOptionPane.showMessageDialog(this, "Empresa: COMPRO ORO \n Version: 1.0 \n Autor: Hugo Sánchez Alpañez");
		}
		
	}
}
