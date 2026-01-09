# Gestión de Apartamentos Turísticos AlmeriaCruising

## Descripción del proyecto
Este proyecto consiste en una aplicación de escritorio desarrollada en Java utilizando la librería Swing. Su propósito es gestionar el alta de inmuebles turísticos para la empresa AlmeriaCruising, permitiendo introducir datos del arrendador y detalles técnicos del inmueble, con validaciones en tiempo real y cálculo automático de precios.

## Contenido de la publicación
La estructura de este repositorio se organiza de la siguiente manera:
* [cite_start]**desarrollo**: Contiene el código fuente completo del proyecto de la práctica[cite: 6].
* [cite_start]**ejecutable**: Incluye el archivo ejecutable (JAR) de la aplicación[cite: 7].
* [cite_start]**documentación técnica**: Contiene el Javadoc generado para todas las clases del proyecto[cite: 8].
* [cite_start]**documentos**: Incluye el documento relativo al análisis de usabilidad de la aplicación[cite: 9].

## Desarrollo del proyecto
Para el desarrollo se han implementado las siguientes funcionalidades:
* Ventana principal con barra de menú y accesos rápidos (mnemónicos y aceleradores).
* Diálogo de alta de pisos con validaciones mediante expresiones regulares para DNI y teléfono.
* Interfaz dinámica que muestra u oculta selectores de camas según el número total seleccionado.
* Panel de resumen dinámico mediante un JTabbedPane que vuelca los datos al pulsar el botón de imprimir.
* Sistema de cambio de tema (Look and Feel) entre modo claro y oscuro.

## Despliegue
Para ejecutar la aplicación a través del archivo ejecutable incluido, siga los pasos correspondientes a su entorno:

### Windows
1. Navegue hasta la carpeta `ejecutable`.
2. Haga doble clic sobre el archivo `.jar` (es necesario tener instalado el JRE o JDK 17 o superior).

### Línea de comandos
1. Abra un terminal o símbolo del sistema.
2. Acceda a la ruta donde se encuentra el ejecutable.
3. Ejecute el comando: `java -jar nombre_del_archivo.jar`

## Construido con
* **Java Swing**: Para la creación de la interfaz gráfica.
* **FlatLaf**: Para el diseño y soporte de temas claro y oscuro.
* **JCalendar**: Para la gestión de componentes de calendario y fechas.

## Versionado
* **Versión 1.0**: Versión inicial con funcionalidades de alta, validación y temas.

## Autores
* **Hugo Sánchez Alpañez** - Estudiante de DAM en IES Al-Andalus.

## Licencia
Este proyecto es de uso académico para la asignatura de Desarrollo de Interfaces.

## Recursos adicionales
* [cite_start]Puedes consultar el repositorio y futuras actualizaciones en el siguiente enlace: [Link a la propia página de GitHub] [cite: 24]
