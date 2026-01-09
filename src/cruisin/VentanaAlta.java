/*
* Proyecto: swing_c_p02_SanchezAlpanezHugo
* Paquete: cruisin
* Archivo: VentanaAlta.java
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
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.toedter.calendar.JDateChooser;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


// TODO: Auto-generated Javadoc
/**
 * The Class VentanaAlta.
 */
public class VentanaAlta extends JDialog implements FocusListener, ChangeListener, ItemListener, ActionListener{
	
	/** The icono error. */
	private ImageIcon iconoError =  new ImageIcon(getClass().getResource("/recursos/error.png"));
	
	/** The color fondo. */
	private Color fondo = new Color(238, 227, 255);
	
	private Color foreground = new Color(120, 1, 255);
	
	/** The nombre text. */
	//Los datos del formulario "Arrendador"
	private JTextField nombreText = new JTextField(20);
	
	/** The apellidos text. */
	private JTextField apellidosText = new JTextField(20);
	
	/** The dni text. */
	private JTextField dniText = new JTextField(20);
	
	/** The telefono text. */
	private JTextField telefonoText = new JTextField(20);
	
	/** The direccion text. */
	//Los datos del formulario "Inmueble"
	private JTextField direccionText = new JTextField(20);
	
	/** The combo provincias. */
	private JComboBox<String> comboProvincias = new JComboBox<>(new String[] { "Álava", "Albacete", "Alicante", "Almería", "Asturias", "Ávila", "Badajoz", "Barcelona", "Burgos", "Cáceres", "Cádiz", "Cantabria", "Castellón", "Ciudad Real", "Córdoba", "Cuenca", "Gerona", "Granada", "Guadalajara", "Guipúzcoa", "Huelva", "Huesca", "Islas Baleares", "Jaén", "La Coruña", "La Rioja", "Las Palmas", "León", "Lérida", "Lugo", "Madrid", "Málaga", "Murcia", "Navarra", "Orense", "Palencia", "Pontevedra", "Salamanca", "Santa Cruz de Tenerife", "Segovia", "Sevilla", "Soria", "Tarragona", "Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza"});
	
	/** The fecha alta. */
	private JDateChooser fechaAlta = new JDateChooser();
	
	/** The fecha fin disp. */
	private JDateChooser fechaFinDisp = new JDateChooser();
	
	/** The num huespedes. */
	//Validacion 4: Todas las validaciones de JSpinner se realizan en la creacion
	private JSpinner numHuespedes = new JSpinner(new SpinnerNumberModel(1, 1, 8, 1));
	
	/** The num dormitorios. */
	private JSpinner numDormitorios = new JSpinner(new SpinnerNumberModel(1, 1, 4, 1));
	
	/** The num banos. */
	private JSpinner numBanos = new JSpinner(new SpinnerNumberModel(1, 1, 3, 1));
	
	/** The num camas. */
	private JSpinner numCamas = new JSpinner(new SpinnerNumberModel(1, 1, 4, 1));
	
	/** The tipos cama. */
	private String [] tiposCama = new String[] {"Cama simple", "Cama doble", "Sofa cama"};
	
	/** The combo cama 1. */
	private JComboBox<String> comboCama1 = new JComboBox<>(tiposCama);
	
	/** The combo cama 2. */
	private JComboBox<String> comboCama2 = new JComboBox<>(tiposCama);
	
	/** The combo cama 3. */
	private JComboBox<String> comboCama3 = new JComboBox<>(tiposCama);
	
	/** The combo cama 4. */
	private JComboBox<String> comboCama4 = new JComboBox<>(tiposCama);
	
	/** The cama 1. */
	private JLabel cama1 = new JLabel("Cama 1");
	
	/** The cama 2. */
	private JLabel cama2 = new JLabel("Cama 2");
	
	/** The cama 3. */
	private JLabel cama3 = new JLabel("Cama 3");
	
	/** The cama 4. */
	private JLabel cama4 = new JLabel("Cama 4");
	
	/** The ninos. */
	private JCheckBox ninos = new JCheckBox("Niños");
	
	/** The edad ninos. */
	private JSpinner edadNinos = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
	
	/** The extras ninos. */
	private JTextField extrasNinos = new JTextField(20);
	
	/** The panel ninos. */
	private JPanel panelNinos = new JPanel();
	
	/** The imagenes. */
	private ImageIcon[] imagenes = new ImageIcon[] {
			redimensionar(new ImageIcon(getClass().getResource("/recursos/piso1.png")), 400, 300),
			redimensionar(new ImageIcon(getClass().getResource("/recursos/piso2.png")), 400, 300),
			redimensionar(new ImageIcon(getClass().getResource("/recursos/piso3.png")), 400, 300),
	};
	
	/** The siguiente img. */
	private JButton siguienteImg = new JButton(">>");
	
	/** The anterior img. */
	private JButton anteriorImg = new JButton("<<");
	
	/** The num imagen. */
	private int numImagen = 0;
	
	/** The imagen. */
	private JLabel imagen = new JLabel(imagenes[numImagen]);
	
	/** The precio minimo. */
	private JLabel precioMinimo = new JLabel("Precio minimo: ");
	
	/** The nombre R. */
	//Etiquetas JTabbedPane resumen
	private JLabel nombreR = new JLabel("Nombre:");
	
	/** The apellidos R. */
	private JLabel apellidosR = new JLabel("Apellidos:");
	
	/** The telefono R. */
	private JLabel telefonoR = new JLabel("Telefono:");
	
	/** The dni R. */
	private JLabel dniR = new JLabel("DNI:");
	
	/** The direccion R. */
	private JLabel direccionR = new JLabel("Dirección:");
	
	/** The provincia R. */
	private JLabel provinciaR = new JLabel("Provincia:");
	
	/** The fecha alta R. */
	private JLabel fechaAltaR = new JLabel("Fecha Alta:");
	
	/** The fecha fin R. */
	private JLabel fechaFinR = new JLabel("Fecha Fin Disp.:");
	
	/** The num huespedes R. */
	private JLabel numHuespedesR = new JLabel("Huespedes:");
	
	/** The num banos R. */
	private JLabel numBanosR = new JLabel("Baños:");
	
	/** The num dormitorios R. */
	private JLabel numDormitoriosR = new JLabel("Dormitorios:");
	
	/** The num cama simple R. */
	private JLabel numCamaSimpleR = new JLabel("Camas Simples:");
	
	/** The num cama doble R. */
	private JLabel numCamaDobleR = new JLabel("Camas Dobles:");
	
	/** The num sofa cama R. */
	private JLabel numSofaCamaR = new JLabel("Sofas Cama:");
	
	/** The extras ninos R. */
	private JLabel extrasNinosR = new JLabel("Extra Niños:");
	
	/** The precio minimo R. */
	private JLabel precioMinimoR = new JLabel("Precio Mínimo:");
	
	/** The imprimir. */
	//Botones abajo del panel principal
	private JButton imprimir = new JButton("Imprimir");
	
	/** The guardar. */
	private JButton guardar = new JButton("Guardar");
	
	/** The crear nuevo. */
	private JButton crearNuevo = new JButton("Nuevo");
	
	private JButton btnCambiarTema = new JButton("Tema Claro/Oscuro");
	
	/** The muy mal. */
	//Componente extra: Valoraciones usando JRadioButton
	private JRadioButton muyMal = new JRadioButton("Muy mal");
	
	/** The mal. */
	private JRadioButton mal = new JRadioButton("Mal");
	
	/** The neutro. */
	private JRadioButton neutro = new JRadioButton("Neutro");
	
	/** The bien. */
	private JRadioButton bien = new JRadioButton("Bien");
	
	/** The muy bien. */
	private JRadioButton muyBien = new JRadioButton("Muy Bien");
	
	/** The icono mal. */
	private ImageIcon iconoMal = new ImageIcon(getClass().getResource("/recursos/mal.png"));
	
	/** The icono meh. */
	private ImageIcon iconoMeh = new ImageIcon(getClass().getResource("/recursos/meh.png"));
	
	/** The icono bien. */
	private ImageIcon iconoBien = new ImageIcon(getClass().getResource("/recursos/bien.png"));
	
	/** The icono valoracion. */
	private JLabel iconoValoracion = new JLabel(iconoMeh);
	
	/** The valoraciones. */
	private ButtonGroup valoraciones = new ButtonGroup();
	
	/** The direccion error. */
	//JLabels de error con icono y TooltipText para mayor claridad
	private JLabel direccionError = new JLabel(iconoError);
	
	/** The telefono error. */
	private JLabel telefonoError = new JLabel(iconoError);
	
	/** The dni error. */
	private JLabel dniError = new JLabel(iconoError);
	
	/**
	 * Instantiates a new ventana alta.
	 *
	 * @param Constructor del JDialog
	 */
	public VentanaAlta(Frame parent) {
		super(parent, true);
		FlatLightLaf.setup();
		setSize(GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getSize());
		setTitle("Alta Pisos");
		ImageIcon icon = new ImageIcon(getClass().getResource("/recursos/icono.png"));
		setIconImage(icon.getImage());
		
		getContentPane().add(cabecera(), BorderLayout.PAGE_START);
		
		JPanel grid = new JPanel(new GridLayout(0, 2));
		grid.add(datosArrendador());
		grid.add(datosInmueble());
		getContentPane().add(grid, BorderLayout.CENTER);
		
		JPanel panelBottom = new JPanel(new BorderLayout());
		panelBottom.setBackground(fondo);
		panelBottom.add(resumen(), BorderLayout.CENTER);
		
		JPanel panelValoraciones = new JPanel();
		panelValoraciones.setBackground(fondo);
		muyMal.addActionListener(this);
		muyMal.setBackground(fondo);
		mal.addActionListener(this);
		mal.setBackground(fondo);
		neutro.addActionListener(this);
		neutro.setBackground(fondo);
		bien.addActionListener(this);
		bien.setBackground(fondo);
		muyBien.addActionListener(this);
		muyBien.setBackground(fondo);
		valoraciones.add(muyMal);
		valoraciones.add(mal);
		valoraciones.add(neutro);
		valoraciones.add(bien);
		valoraciones.add(muyBien);
		panelValoraciones.add(new JLabel("¿Como ha sido tu experiencia en este formulario?"));
		panelValoraciones.add(muyMal);
		panelValoraciones.add(mal);
		panelValoraciones.add(neutro);
		panelValoraciones.add(bien);
		panelValoraciones.add(muyBien);
		panelValoraciones.add(iconoValoracion);
		panelValoraciones.setToolTipText("Indica tu experiencia con el formulario");
		neutro.setSelected(true);
		panelBottom.add(panelValoraciones, BorderLayout.NORTH);
		
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(fondo);
		imprimir.addActionListener(this);
		imprimir.setIcon(new ImageIcon(getClass().getResource("/recursos/imprimir.png")));
		guardar.addActionListener(this);
		guardar.setIcon(new ImageIcon(getClass().getResource("/recursos/guardar.png")));
		crearNuevo.addActionListener(this);
		crearNuevo.setIcon(new ImageIcon(getClass().getResource("/recursos/nuevo_documento.png")));
		btnCambiarTema.addActionListener(e -> {
		    try {
		        if (UIManager.getLookAndFeel() instanceof FlatLightLaf) {
		            UIManager.setLookAndFeel(new FlatDarkLaf());
		        } else {
		            UIManager.setLookAndFeel(new FlatLightLaf());
		        }

		        // Actualiza solo el diálogo
		        SwingUtilities.updateComponentTreeUI(this);

		    } catch (Exception ex) {
		        ex.printStackTrace();
		    }
		});
		panelBotones.add(imprimir);
		panelBotones.add(guardar);
		panelBotones.add(crearNuevo);
		panelBotones.add(btnCambiarTema);
		panelBottom.add(panelBotones, BorderLayout.SOUTH);
		getRootPane().setDefaultButton(guardar);
		
		getContentPane().add(panelBottom, BorderLayout.SOUTH);
	}
	
	/**
	 * Cabecera.
	 *
	 * @return Constructor del JPanel Cabecera
	 */
	private JPanel cabecera() {
		JPanel cabecera = new JPanel();
		cabecera.setBorder(BorderFactory.createLineBorder(foreground, 2));
		cabecera.setBackground(fondo);
		cabecera.setLayout(new FlowLayout());
		JLabel nombreEmpresa = new JLabel("ALMERIA CRUISING");
		nombreEmpresa.setFont(new Font("Impact", Font.PLAIN, 35));
		nombreEmpresa.setForeground(foreground);
		cabecera.add(nombreEmpresa);
		
		return cabecera;
	}
	
	/**
	 * Datos arrendador.
	 *
	 * @return Constructor del JPanel del primer formulario
	 */
	private JPanel datosArrendador() {
		
		telefonoError.setVisible(false);
		dniError.setVisible(false);
		
		JPanel datos = new JPanel();
		datos.setBorder(BorderFactory.createLineBorder(foreground, 2));
		datos.setBackground(fondo);
		datos.setLayout(new BoxLayout(datos, BoxLayout.PAGE_AXIS));
		
		JPanel panelTitulo = new JPanel(new FlowLayout());
		panelTitulo.setBackground(fondo);
		JLabel titulo = new JLabel("DATOS DEL ARRENDADOR");
		titulo.setForeground(foreground);
		titulo.setFont(getFont().deriveFont(Font.BOLD, 20));
		panelTitulo.add(titulo);
		
		JPanel fila1 = new JPanel();
		fila1.setBackground(fondo);
		fila1.add(new JLabel("Nombre"));
		fila1.add(nombreText);
		fila1.add(Box.createHorizontalStrut(20));
		fila1.add(new JLabel("Apellidos"));
		fila1.add(apellidosText);
		
		JPanel fila2 = new JPanel();
		fila2.setBackground(fondo);
		dniError.setToolTipText("El DNI debe constar de 8 numeros y una letra mayuscula");
		dniText.addFocusListener(this);
		fila2.add(new JLabel("DNI"));
		fila2.add(dniText);
		fila2.add(dniError);
		fila2.add(Box.createHorizontalStrut(20));
		
		telefonoError.setToolTipText("El telefono debe tener 9 digitos");
		telefonoText.addFocusListener(this);
		fila2.add(new JLabel("Telefono"));
		fila2.add(telefonoText);
		fila2.add(telefonoError);
		
		
		datos.add(panelTitulo);
		datos.add(fila1);
		
		datos.add(fila2);
		datos.add(Box.createVerticalGlue());
		

		return datos;
	}
	
	/**
	 * Datos inmueble.
	 *
	 * @return Constructor del JPanel del segundo formulario
	 */
	private JPanel datosInmueble() {
		
		Date hoy = new Date();
		
		JPanel datos = new JPanel();
		datos.setBorder(BorderFactory.createLineBorder(foreground, 2));
		datos.setBackground(fondo);
		datos.setLayout(new BoxLayout(datos, BoxLayout.PAGE_AXIS));
		
		JPanel panelTitulo =  new JPanel(new FlowLayout());
		panelTitulo.setBackground(fondo);
		JLabel titulo = new JLabel("DATOS DEL INMUEBLE");
		titulo.setForeground(foreground);
		titulo.setFont(getFont().deriveFont(Font.BOLD, 20));
		panelTitulo.add(titulo);
		
		JPanel fila1 = new JPanel();
		fila1.setBackground(fondo);
		fila1.add(new JLabel("Direccion"));
		fila1.add(direccionText);
		fila1.add(direccionError);
		direccionText.addFocusListener(this);
		direccionError.setToolTipText("La direccion no puede estar vacía");
		direccionError.setVisible(false);
		fila1.add(Box.createHorizontalStrut(20));
		fila1.add(new JLabel("Provincia"));
		fila1.add(comboProvincias);
		
		JPanel fila2 = new JPanel();
		fila2.setBackground(fondo);
		fila2.add(new JLabel("Fecha de alta"));
		fechaAlta.setPreferredSize(new Dimension(100, 20));
		fechaAlta.setMinSelectableDate(hoy);
		fechaAlta.setDate(hoy);
		fila2.add(fechaAlta);
		fila2.add(Box.createHorizontalStrut(20));
		
		fila2.add(new JLabel("Fecha final disponibilidad"));
		//Validacion 3
		fechaFinDisp.setPreferredSize(new Dimension(100, 20));
		fechaFinDisp.setMinSelectableDate(hoy);
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(hoy);
		calendario.add(Calendar.YEAR, 1);
		fechaFinDisp.setDate(calendario.getTime());
		fila2.add(fechaFinDisp);
		
		JPanel fila3 = new JPanel();
		fila3.setBackground(fondo);
		fila3.add(new JLabel("Nº de huespedes"));
		fila3.add(numHuespedes);
		fila3.add(Box.createHorizontalStrut(20));
		fila3.add(new JLabel("Nº de dormitorios"));
		fila3.add(numDormitorios);
		fila3.add(Box.createHorizontalStrut(20));
		fila3.add(new JLabel("Nº de baños"));
		numBanos.addChangeListener(this);
		fila3.add(numBanos);
		fila3.add(Box.createHorizontalStrut(20));
		fila3.add(new JLabel("Nº de camas"));
		numCamas.addChangeListener(this);
		fila3.add(numCamas);
		
		JPanel fila4 = new JPanel();
		fila4.setBackground(fondo);
		cama2.setVisible(false);
		comboCama2.setVisible(false);
		cama3.setVisible(false);
		comboCama3.setVisible(false);
		cama4.setVisible(false);
		comboCama4.setVisible(false);
		comboCama1.addItemListener(this);
		comboCama2.addItemListener(this);
		comboCama3.addItemListener(this);
		comboCama4.addItemListener(this);
		fila4.add(cama1);
		fila4.add(comboCama1);
		fila4.add(cama2);
		fila4.add(comboCama2);
		fila4.add(cama3);
		fila4.add(comboCama3);
		fila4.add(cama4);
		fila4.add(comboCama4);
		
		JPanel fila5 = new JPanel();
		fila5.setBackground(fondo);
		ninos.addItemListener(this);
		ninos.setBackground(fondo);
		fila5.add(ninos);
		panelNinos.setVisible(false);
		panelNinos.setBackground(fondo);
		panelNinos.add(new JLabel("Edad"));
		panelNinos.add(edadNinos);
		extrasNinos.addFocusListener(this);
		panelNinos.add(extrasNinos);
		fila5.add(panelNinos);
		
		JPanel fila6 = new JPanel();
		fila6.setBackground(fondo);
		imagen.setHorizontalAlignment(JLabel.CENTER);
		anteriorImg.addActionListener(this);
		siguienteImg.addActionListener(this);
		fila6.add(anteriorImg);
		fila6.add(imagen);
		fila6.add(siguienteImg);
		
		JPanel fila7 = new JPanel();
		fila7.setBackground(fondo);
		fila7.add(precioMinimo);
		
		
		datos.add(panelTitulo);
		datos.add(fila1);
		datos.add(fila2);
		datos.add(fila3);
		datos.add(fila4);
		datos.add(fila5);
		datos.add(fila6);
		datos.add(fila7);
		
		return datos;
	}
	
	/**
	 * Resumen.
	 *
	 * @return the j tabbed pane
	 */
	//Constructor del JTabbedPane con las etiquetas de resumen
	private JTabbedPane resumen() {
		JTabbedPane resumen = new JTabbedPane();
		resumen.setBackground(fondo);
		
		JPanel arrendador = new JPanel();
		arrendador.setBackground(fondo);
		arrendador.add(nombreR);
		arrendador.add(Box.createHorizontalStrut(20));
		arrendador.add(apellidosR);
		arrendador.add(Box.createHorizontalStrut(20));
		arrendador.add(dniR);
		arrendador.add(Box.createHorizontalStrut(20));
		arrendador.add(telefonoR);
		
		JPanel inmueble = new JPanel();
		inmueble.setBackground(fondo);
		inmueble.add(direccionR);
		inmueble.add(Box.createHorizontalStrut(20));
		inmueble.add(provinciaR);
		inmueble.add(Box.createHorizontalStrut(20));
		inmueble.add(fechaAltaR);
		inmueble.add(Box.createHorizontalStrut(20));
		inmueble.add(fechaFinR);
		inmueble.add(Box.createHorizontalStrut(20));
		inmueble.add(numHuespedesR);
		inmueble.add(Box.createHorizontalStrut(20));
		inmueble.add(numDormitoriosR);
		inmueble.add(Box.createHorizontalStrut(20));
		inmueble.add(numBanosR);
		inmueble.add(Box.createHorizontalStrut(20));
		inmueble.add(numCamaSimpleR);
		inmueble.add(Box.createHorizontalStrut(20));
		inmueble.add(numCamaDobleR);
		inmueble.add(Box.createHorizontalStrut(20));
		inmueble.add(numSofaCamaR);
		inmueble.add(Box.createHorizontalStrut(20));
		inmueble.add(extrasNinosR);
		inmueble.add(Box.createHorizontalStrut(20));
		inmueble.add(precioMinimoR);
		
		resumen.add("Datos", arrendador);
		resumen.add("Piso", inmueble);
		return resumen;
	}

	/**
	 * Focus gained.
	 *
	 * @param e the e
	 */
	@Override
	public void focusGained(FocusEvent e) {
		//Funcionalidad 3 JTexField con el extra de los niños y recalcula el precio
		if (e.getSource() == extrasNinos) {
			if ((int)edadNinos.getValue() <= 3) {
				extrasNinos.setText("Cuna");
			}else {
				extrasNinos.setText("Cama supletoria pequeña");
			}
			calcularPrecio();
		}
		
	}

	/**
	 * Focus lost.
	 *
	 * @param e the e
	 */
	//Muestra los errores de los "campos obligatorios" para mayor claridad y validación
	@Override
	public void focusLost(FocusEvent e) {
		//Validacion 1
		if (e.getSource() == telefonoText) {
			telefonoError.setVisible(!telefonoText.getText().matches("\\d{9}"));
		}
		//Validacion 2
		if (e.getSource() == dniText) {
			dniError.setVisible(!dniText.getText().matches("^[0-9]{8}[A-Z]$"));
		}
		if (e.getSource() == direccionText) {
			direccionError.setVisible(direccionText.getText().isBlank());
		}
		
	}

	/**
	 * State changed.
	 *
	 * @param e the e
	 */
	@Override
	public void stateChanged(ChangeEvent e) {
		//Funcionalidad 1
		if (e.getSource() == numCamas) {
			cama1.setVisible((int)numCamas.getValue() >= 1);
			comboCama1.setVisible((int)numCamas.getValue() >= 1);
			cama2.setVisible((int)numCamas.getValue() >= 2);
			comboCama2.setVisible((int)numCamas.getValue() >= 2);
			cama3.setVisible((int)numCamas.getValue() >= 3);
			comboCama3.setVisible((int)numCamas.getValue() >= 3);
			cama4.setVisible((int)numCamas.getValue() >= 4);
			comboCama4.setVisible((int)numCamas.getValue() >= 4);
		}
		
		//Recalcula el precio cada vez que cambian las camas o los baños
		if (e.getSource() == numCamas || e.getSource() == numBanos) {
			calcularPrecio();
		}
		
	}

	/**
	 * Item state changed.
	 *
	 * @param e the e
	 */
	@Override
	public void itemStateChanged(ItemEvent e) {
		//Funcionalidad 2
		if (e.getSource() == ninos) {
			panelNinos.setVisible(e.getStateChange() == ItemEvent.SELECTED);
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				extrasNinos.setText("");
				calcularPrecio();
			}
		}
		
		//Recalcula el precio cada vez que un JComboBox de camas cambia
		if (e.getSource() == comboCama1 || e.getSource() == comboCama2 || e.getSource() == comboCama3 || e.getSource() == comboCama4) {
			calcularPrecio();
		}
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//Botones para moverse por las imagenes
		if (e.getSource() == anteriorImg) {
			numImagen--;
			if (numImagen < 0) {
				numImagen = imagenes.length - 1;
			}
			imagen.setIcon(imagenes[numImagen]);
		}
		if (e.getSource() == siguienteImg) {
			numImagen++;
			if (numImagen >= imagenes.length) {
				numImagen = 0;
			}
			imagen.setIcon(imagenes[numImagen]);
		}
		
		//Boton Imprimir que vuelca los datos de los dos formularios en el JTabbedPane resumen
		if (e.getSource() == imprimir && validar()) {
			
			JComboBox[] combosCama = {comboCama1, comboCama2, comboCama3, comboCama4};
			int camasSimples = 0;
			int camasDobles = 0;
			int sofasCama = 0;
			for(int i = 0; i < (int) numCamas.getValue(); i++) {
				switch(combosCama[i].getSelectedItem().toString()) {
				case "Cama simple" -> camasSimples++;
				case "Cama doble" -> camasDobles++;
				case "Sofa cama" -> sofasCama++;
				}
			}
			
			nombreR.setText("Nombre: " + nombreText.getText());
			apellidosR.setText("Apellidos: " + apellidosText.getText());
			telefonoR.setText("Teléfono: " + telefonoText.getText());
			dniR.setText("DNI: " + dniText.getText());
			
			direccionR.setText("Dirección: " + direccionText.getText());
			provinciaR.setText("Provincia: " + comboProvincias.getSelectedItem());
			fechaAltaR.setText("Fecha Alta: " + fechaAlta.getDate());
			fechaFinR.setText("Fecha Fin Disp.: " + fechaFinDisp.getDate());
			numHuespedesR.setText("Huéspedes: " + numHuespedes.getValue());
			numDormitoriosR.setText("Dormitorios: " + numDormitorios.getValue());
			numBanosR.setText("Baños: " + numBanos.getValue());
			numCamaSimpleR.setText("Camas Simples: " + camasSimples);
			numCamaDobleR.setText("Camas Dobles: " + camasDobles);
			numSofaCamaR.setText("Sofás Cama: " + sofasCama);
			extrasNinosR.setText("Extra Niños: " + extrasNinos.getText());
			precioMinimoR.setText("Precio Mínimo: " + precioMinimo.getText());
		}
		
		//Boton de guardar que muestra un dialogo
		if (e.getSource() == guardar && validar()) {
			JOptionPane.showMessageDialog(this, "Registro Guardado");
		}
		
		//Mensaje de error cuando la validacion sale mal
		if ((e.getSource() == imprimir || e.getSource() == guardar) && !validar()) {
			String mensajeError = "";
			if (!dniText.getText().matches("^[0-9]{8}[A-Z]$")) {
				mensajeError += "El DNI debe tener 8 letras y 1 número \n";
				dniError.setVisible(true);
			}
			if (!telefonoText.getText().matches("\\d{9}")) {
				mensajeError += "El teléfono debe tener 9 números \n";
				telefonoError.setVisible(true);
			}
			if (direccionText.getText().isBlank()) {
				mensajeError += "La dirección no puede estar vacía \n";
			}
			if (fechaAlta.getDate() == null) {
				mensajeError += "La fecha de alta es incorrecta \n";
			}
			if (fechaFinDisp.getDate() == null) {
				mensajeError += "La fecha de fin de disponibilidad es incorrecta \n";
			}
			JOptionPane.showMessageDialog(this, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		//Boton de nuevo que resetea el formulario
		if (e.getSource() == crearNuevo) {
			nombreText.setText("");
			apellidosText.setText("");
			dniText.setText("");
			telefonoText.setText("");
			
			direccionText.setText("");
			comboProvincias.setSelectedIndex(0);
			fechaAlta.setDate(fechaAlta.getMinSelectableDate());
			fechaFinDisp.setDate(fechaFinDisp.getMinSelectableDate());
			numHuespedes.setValue(1);
			numBanos.setValue(1);
			numDormitorios.setValue(1);
			numCamas.setValue(1);
			comboCama1.setSelectedIndex(0);
			comboCama2.setSelectedIndex(0);
			comboCama3.setSelectedIndex(0);
			comboCama4.setSelectedIndex(0);
			ninos.setSelected(false);
		}
		
		//JRadioButtons del componente extra para cambiar la imagen de la valoracion
		if (e.getSource() == muyMal || e.getSource() == mal) {
			iconoValoracion.setIcon(iconoMal);
		}
		
		if (e.getSource() == neutro) {
			iconoValoracion.setIcon(iconoMeh);
		}
		
		if (e.getSource() == bien || e.getSource() == muyBien) {
			iconoValoracion.setIcon(iconoBien);
		}
		
	}
	
	/**
	 * Calcular precio. Funcionalidad 4
	 */
	private void calcularPrecio() {
		
		int precio = 0;
		
		JComboBox[] combosCama = {comboCama1, comboCama2, comboCama3, comboCama4}; 
		
		for(int i = 0; i < (int) numCamas.getValue(); i++) {
			switch(combosCama[i].getSelectedItem().toString()) {
			case "Cama simple" -> precio += 15;
			case "Cama doble" -> precio += 20;
			case "Sofa cama" -> precio += 15;
			}
		}
		
		precio += (int)numBanos.getValue() * 25;
		
		if (extrasNinos.getText().equals("Cuna") || extrasNinos.getText().equals("Cama supletoria pequeña")) {
			precio += 12;
		}
		precioMinimo.setText("Precio minimo: " + precio);
	}
	
	/**
	 * Validar.
	 *
	 * @return true, if successful
	 */
	//Metodo para poder validar rapido en los eventos
	private boolean validar() {
		return (dniText.getText().matches("^[0-9]{8}[A-Z]$") && telefonoText.getText().matches("\\d{9}") && !direccionText.getText().isBlank() && fechaAlta.getDate() != null && fechaFinDisp.getDate() != null);
	}
	
	/**
	 * Redimensionar.
	 *
	 * @param icon the icon
	 * @param ancho the ancho
	 * @param alto the alto
	 * @return the image icon
	 */
	//Metodo de utilidad
	private ImageIcon redimensionar(ImageIcon icon, int ancho, int alto) {
	    Image img = icon.getImage();
	    Image imgEscalada = img.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
	    return new ImageIcon(imgEscalada);
	}

}
