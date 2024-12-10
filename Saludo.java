public class SaludoDespedida {

    // Método que imprime un saludo inicial
    public static void saludar() {
        System.out.println("¡Hola! Bienvenido al programa.");
    }

    // Método que imprime un mensaje de despedida
    public static void despedir() {
        System.out.println("¡Adiós! Gracias por usar el programa.");
    }

    public static void main(String[] args) {
        // Llamamos a los métodos desde el main
        saludar();  // Llama al método saludar
        despedir(); // Llama al método despedir
    }
}
