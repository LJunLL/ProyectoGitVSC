import java.util.ArrayList;

public class Tareas {

    // Lista de tareas
    private ArrayList<String> listaTareas;

    // Constructor
    public Tareas() {
        listaTareas = new ArrayList<>();
    }

    // Método para imprimir la lista de tareas
    public void imprimirTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas.");
        } else {
            System.out.println("Lista de Tareas:");
            for (String tarea : listaTareas) {
                System.out.println("- " + tarea);
            }
        }
    }

    // Método para agregar una nueva tarea (simulado con un print)
    public void agregarTarea(String tarea) {
        listaTareas.add(tarea);
        System.out.println("Tarea agregada: " + tarea);
    }

    public static void main(String[] args) {
        // Crear una instancia de Tareas
        Tareas miTareas = new Tareas();

        // Agregar tareas
        miTareas.agregarTarea("Comprar pan");
        miTareas.agregarTarea("Estudiar Java");

        // Imprimir lista de tareas
        miTareas.imprimirTareas();
    }
}
