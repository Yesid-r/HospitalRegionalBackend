# Agenda de citas médicas
Este proyecto consiste en una aplicación web para agendar citas médicas. Está desarrollado con Java Spring Boot y utiliza una base de datos PostgreSql para almacenar los datos.
# Requisitos
Java 17  PostgreSql

# Instalación
El proyecto de Java se puede clonar desde GitHub con el siguiente comando:
```bash
git clone https://github.com/Yesid-/HospitalRegionalBackend.git

```
# 
Crear la base de datos en PostgreSql. Se debe crear una base de datos con el nombre "bd_hospital" y configurar las credenciales de acceso en el archivo application.properties ubicado en la carpeta src/main/resources.


# Uso
La aplicación permite crear, eliminar y actualizar tareas de una lista. Para ejecutarla, primero se debe compilar el código fuente y luego ejecutar el archivo JAR resultante. Los comandos disponibles son:

# acceder
Acceder a la aplicación desde el navegador. La aplicación estará disponible en http://localhost:8080/.

# Funcionalidades
La aplicación permite:

Registrar doctores y enfermeras con sus datos personales y de contacto.
Agendar citas médicas con la fecha, hora y especialidad del médico.
Visualizar las citas médicas agendadas.
