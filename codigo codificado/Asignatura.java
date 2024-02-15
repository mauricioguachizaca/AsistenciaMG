import java.util.ArrayList;
import java.util.List; 
import java.util.Scanner;


public class Asignatura {
    private String nombre;
    private Profesor profesor;
    private String paralelo;
    private String periodoAcademico;
    private List<Asistencia> asistencias;

    public Asignatura(String nombre, Profesor profesor, String paralelo, String periodoAcademico) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.paralelo = paralelo;
        this.periodoAcademico = periodoAcademico;
        this.asistencias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(String periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public List<Asistencia> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(List<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese el nombre del profesor
            System.out.println("Ingrese el nombre del profesor:");
            String nombreProfesor = scanner.nextLine();

            // Crear una instancia de la clase Profesor con el nombre proporcionado por el usuario
            Profesor profesor = new Profesor(1, nombreProfesor, "Apellido");

            // Crear una instancia de la clase Asignatura con el profesor creado y otros datos
            Asignatura asignatura = new Asignatura("Matemáticas", profesor, "A", "2024-01");

            // Mostrar información sobre la asignatura y el profesor
            System.out.println("Nombre de la asignatura: " + asignatura.getNombre());
            System.out.println("Profesor asignado: " + asignatura.getProfesor().getNombre());
        }
    }
}