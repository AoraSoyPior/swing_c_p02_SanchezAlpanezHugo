# Gestión de Apartamentos Turísticos AlmeriaCruising

## Descripción del proyecto
Este proyecto consiste en una aplicación de escritorio desarrollada para la gestión de inmuebles turísticos. La herramienta permite el registro de arrendadores y la configuración detallada de viviendas, incluyendo validaciones de seguridad para datos sensibles y un sistema de cálculo de precios dinámico basado en las características del inmueble.

## Contenido de la publicación
Siguiendo los requisitos de la práctica, el repositorio se estructura en los siguientes directorios:
* **desarrollo**: Carpeta que contiene el proyecto completo con el código fuente de la aplicación.
* **ejecutable**: Directorio donde se ubica el archivo JAR para la ejecución directa del software.
* **documentación técnica**: Espacio destinado al Javadoc generado para las clases del proyecto.
* **documentos**: Carpeta que incluye el análisis de usabilidad de la interfaz.

## Desarrollo del proyecto
Durante el desarrollo se han implementado las siguientes características técnicas:
* Interfaz principal con barra de menú, mnemónicos y aceleradores para una navegación eficiente.
* Ventana de alta mediante JDialog modal con validación de DNI y teléfono mediante expresiones regulares.
* Componentes dinámicos que muestran u ocultan elementos según la interacción del usuario.
* Sistema de resumen de datos mediante JTabbedPane antes de la confirmación del registro.
* Implementación de Look and Feel con soporte para temas claro y oscuro mediante la librería FlatLaf.

## Despliegue
Para ejecutar la aplicación desde el archivo ejecutable, siga estas instrucciones:

### Windows
1. Localice el archivo .jar en la carpeta ejecutable.
2. Realice doble clic sobre el archivo para iniciar la aplicación (requiere Java 17 o superior).

### Línea de comandos
1. Abra una terminal o consola del sistema.
2. Ejecute el comando: java -jar AlmeriaCruising.jar

## Construido con
* **Java Swing**: Framework principal para la interfaz gráfica.
* **FlatLaf**: Librería para la gestión de estilos y temas.
* **JCalendar**: Componente para la selección de fechas en los formularios.

## Versionado
* **v1.0**: Entrega final de la práctica con todas las funcionalidades requeridas.

## Autores
* **Hugo Sánchez Alpañez**: Alumno de Desarrollo de Aplicaciones Multiplataforma.

## Licencia
Este software ha sido realizado con fines exclusivamente académicos para la asignatura de Desarrollo de Interfaces.

## Recursos adicionales
* **Link al repositorio**: [[Añadir aquí el enlace a la página de GitHub al realizar la entrega](https://github.com/AoraSoyPior/swing_c_p02_SanchezAlpanezHugo)]
