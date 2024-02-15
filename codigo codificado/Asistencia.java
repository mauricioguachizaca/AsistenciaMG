import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Asistencia {
    private Date fecha;
    private Estudiante estudiante;
    private boolean presente;

    public Asistencia(Date fecha, Estudiante estudiante, boolean presente) {
        this.fecha = fecha;
        this.estudiante = estudiante;
        this.presente = presente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }
}



