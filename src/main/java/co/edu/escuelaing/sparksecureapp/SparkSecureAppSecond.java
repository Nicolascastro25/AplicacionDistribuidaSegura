/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.sparksecureapp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.secure;

/**
 *
 * @author Jaime Castro
 */
public class SparkSecureAppSecond {
    
    public static void main(String[] args) throws KeyStoreException, IOException, FileNotFoundException, NoSuchAlgorithmException, CertificateException, KeyManagementException {
        port(getPort());
        secure(getKeyStore(), getKeyStorePassword(), null, null); 
        SecureUrlReader.loadTrustStore(SparkSecureApp.getKeyStore(), SparkSecureApp.getKeyStorePassword());
        get("/inicio", (req, res) -> "Hello to second SparkApp secure");
        get("/remoto", (req, res) -> SecureUrlReader.readURL(SparkSecureApp.getUrlAppSecure()));
    }

    /**
     * Método que obtiene la llave del archivo almacenado en el directorio del
     * proyecto
     *
     * @return llave para app segura
     */
    public static String getKeyStore() {
        if (System.getenv("KEYSTORE") != null) {
            return System.getenv("KEYSTORE");
        }
        return "keystores/awskeystore.p12";
    }

    /**
     * Método que obtiene la contraseña de la llave.
     *
     * @return clave de la llave app segura
     */
    public static String getKeyStorePassword() {
        if (System.getenv("KEYSTOREPWD") != null) {
            return System.getenv("KEYSTOREPWD");
        }
        return "arep123";
    }

    /**
     * Método que retorna el puerto por el cual se va a publicar nuestro
     * servicio web.
     *
     * @return puerto de comunicacion de la app web
     */
    public static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }
    
    /**
     * Método que obtiene la URL del aplicativo desplegado en AWS.
     * @return Url de la app desplegada en AWS
     */
    public static String getUrlAppSecure2(){
        return "";
    }

}
