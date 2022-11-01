# Aplicacion distribuida segura en todos sus frentes

# Descripción del problema:

Desarrolle una aplicación Web segura con los siguientes requerimientos:

1. Debe permitir un acceso seguro desde el browser a la aplicación. Es decir debe garantizar autenticación, autorización e integridad de usuarios.
2. Debe tener al menos dos computadores comunicacndose entre ellos y el acceso de servicios remotos debe garantizar: autenticación, autorización e integridad entre los servicios. Nadie puede invocar los servicios si no está autorizado.
3. Explique como escalaría su arquitectura de seguridad para incorporar nuevos servicios.

### Entregables:

1. Código en github, bien documentado.
2. Informe que describe la arquitectura de seguridad de su prototipo. (en el README)
3. Video de experimento en AWS

# Desarrollo de la solución:

Descripción de la estructura del proyecto: 

![image](https://user-images.githubusercontent.com/25957863/199262039-99dc53ef-656c-4426-b6fe-ddd8b7ba6c03.png)

Clase "SparkSecureApp", es una aplicación segura a través de los siguientes métodos:

![image](https://user-images.githubusercontent.com/25957863/199265735-601c48e7-292a-496a-a2bd-7af6faf70b34.png)

Arquitectura de seguridad del prototipo:

![image](https://user-images.githubusercontent.com/25957863/199260798-23c73adc-5965-4395-89b9-8d57e3ab980b.png)

Creamos los pares de claves, así:

![image](https://user-images.githubusercontent.com/25957863/199265641-58af9c20-91dd-4a88-97f1-1449da56be7a.png)


