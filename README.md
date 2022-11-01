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

Creamos la instancia e ingresamos a través de consola a la misma para instalar Java, así:

![image](https://user-images.githubusercontent.com/25957863/199266897-1859a35d-be32-4fa2-917f-9b7cde137c97.png)

Una vez finalizada la instalación veremos lo siguiente:

![image](https://user-images.githubusercontent.com/25957863/199267251-99db892f-082c-443d-9c9d-fc8075caa557.png)

Copiamos el archivo .zip en nuestra instancia, así:

![image](https://user-images.githubusercontent.com/25957863/199271679-322b947f-0592-4f2b-98f6-34432597a53e.png)

Los extraemos:

![image](https://user-images.githubusercontent.com/25957863/199271781-9af0f703-2dd9-499b-adb3-1135090be7a2.png)

Y ejecutamos con el comando:

`
java -cp target/classes:target/dependency/* co.edu.escuelaing.sparksecureapp.SparkSecureApp
`
Vemos corriendo la primera instancia:

![image](https://user-images.githubusercontent.com/25957863/199274929-bd6edc66-3800-4953-932a-4e643270b4b6.png)

