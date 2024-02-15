import java.util.ArrayList;
import java.util.List;

public class SistemaAsistencias {
    private List<Asignatura> asignaturas;

    public SistemaAsistencias() {
        this.asignaturas = new ArrayList<>();
    }

    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    public void tomarAsistencia(String nombreProfesor, String nombreAsignatura, String paralelo, String periodoAcademico, List<Estudiante> estudiantesPresentes) {
        for (Asignatura asignatura : asignaturas) {
            if (asignatura.getNombre().equals(nombreAsignatura) && asignatura.getProfesor().getNombre().equals(nombreProfesor) &&
                    asignatura.getParalelo().equals(paralelo) && asignatura.getPeriodoAcademico().equals(periodoAcademico)) {
                // Registra la asistencia para los estudiantes proporcionados
                for (Estudiante estudiante : estudiantesPresentes) {
                    asignatura.registrarAsistencia(estudiante);
                }
                System.out.println("Asistencia registrada exitosamente.");
                return;
            }
        }
        System.out.println("No se encontró la asignatura especificada.");
    }

    public static void main(String[] args) {
        // Crea una instancia del sistema de asistencias
        SistemaAsistencias sistema = new SistemaAsistencias();

        // Agrega algunas asignaturas para probar
        Profesor profesor = new Profesor("Juan");
        Asignatura asignatura = new Asignatura("Matemáticas", profesor, "A", "2024-01");
        sistema.agregarAsignatura(asignatura);

        // Toma la asistencia para la asignatura especificada
        List<Estudiante> estudiantesPresentes = new ArrayList<>();
        estudiantesPresentes.add(new Estudiante("Maria"));
        estudiantesPresentes.add(new Estudiante("Pedro"));
        sistema.tomarAsistencia("Juan", "Matemáticas", "A", "2024-01", estudiantesPresentes);
    }
}

class Asignatura {
    private String nombre;
    private Profesor profesor;
    private String paralelo;
    private String periodoAcademico;
    private List<Estudiante> estudiantes;

    public Asignatura(String nombre, Profesor profesor, String paralelo, String periodoAcademico) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.paralelo = paralelo;
        this.periodoAcademico = periodoAcademico;
        this.estudiantes = new ArrayList<>();
    }

    public void registrarAsistencia(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public String getParalelo() {
        return paralelo;
    }

    public String getPeriodoAcademico() {
        return periodoAcademico;
    }
}

class Profesor {
    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
