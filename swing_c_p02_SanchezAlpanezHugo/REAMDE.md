# Proyecto: Gestión de Apartamentos Turísticos AlmeriaCruising 

¡Hola! Este es mi proyecto para la asignatura de Desarrollo de Interfaces. He creado una aplicación de escritorio con Java Swing para gestionar el alta de viviendas turísticas. Mi objetivo era practicar la creación de menús, el uso de diálogos modales y la validación de formularios.

## Cómo ponerlo en marcha

Para que el proyecto funcione bien en tu ordenador, necesitas:
* **Java 17** o superior.
* **Librería FlatLaf**: La he usado para que la interfaz no se vea tan antigua y soporte temas oscuros.
* **Librería JCalendar**: Necesaria para que funcionen los selectores de fecha (`JDateChooser`).
* **Carpeta de recursos**: Asegúrate de que los iconos y las fotos de `/recursos/` estén incluidos en el proyecto para que no den error al cargar.

## ¿Qué hace la aplicación?

### 1. Ventana Principal
Es el menú de inicio de la aplicación.
* Tiene una **barra de menú** con atajos de teclado (mnemónicos y aceleradores como `Ctrl+Q` para salir).
* Incluye un botón para **cambiar el tema** entre claro y oscuro en tiempo real usando la librería FlatLaf.
* Desde aquí se accede al formulario de "Alta Pisos".

### 2. Formulario de Alta (VentanaAlta)
Es un diálogo que se abre sobre la ventana principal. He incluido varias cosas interesantes:
* **Validación de datos**: El programa revisa si el DNI tiene el formato correcto (8 números y 1 letra) y si el teléfono tiene 9 dígitos. Si te equivocas, aparece un icono de error rojo con un mensaje de ayuda.
* **Lógica de camas**: Dependiendo del número de camas que elijas en el selector, aparecen más o menos desplegables para elegir el tipo de cama (simple, doble o sofá).
* **Cálculo de precio automático**: El precio mínimo se actualiza solo cada vez que cambias el número de baños, el tipo de camas o si añades extras para niños (como cunas).
* **Galería de imágenes**: He puesto un sistema con botones `<<` y `>>` para ver fotos de ejemplo de los pisos.

### 3. Sistema de Resumen
He usado un `JTabbedPane` en la parte de abajo. Cuando pulsas el botón **"Imprimir"**, todos los datos que has escrito en el formulario se copian ahí para que puedas revisarlos antes de "guardar".

## Detalles "Extra"
* **Valoración de usuario**: He añadido unos `JRadioButton` para que el usuario valore su experiencia. Según lo que elijas, cambia un icono de una cara (contenta, neutra o triste).
* **Botón por defecto**: He configurado el `RootPane` para que al pulsar "Enter" se active el botón de guardar o nuevo automáticamente, para ir más rápido.

## Notas
* La opción de **"Baja Pisos"** todavía no está terminada, así que he puesto un mensaje de aviso (`JOptionPane`) por si alguien intenta pulsarla.
* He intentado que el código esté organizado por paneles para que el diseño no se rompa al cambiar el tamaño de la ventana.

---
**Autor:** Hugo Sánchez Alpañez  
**Fecha:** Noviembre 2025