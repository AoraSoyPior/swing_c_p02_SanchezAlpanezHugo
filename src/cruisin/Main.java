/*
* Proyecto: swing_c_p02_SanchezAlpanezHugo
* Paquete: cruisin
* Archivo: Main.java
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

import com.formdev.flatlaf.FlatLightLaf;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(() -> {
			FlatLightLaf.setup();
            new VentanaPrincipal().setVisible(true);
        });
	}
}
