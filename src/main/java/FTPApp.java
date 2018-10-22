import service.ConexionFTP;



public class FTPApp {

    public static void main(String[] args) {
        ConexionFTP.conectar("aqui va el servidor", "adrioso", "5233801.");
        ConexionFTP.desconectar();
    }
}