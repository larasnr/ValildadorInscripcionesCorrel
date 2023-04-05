import java.util.List;

public class Alumno {
    private List<Materia> materiasAprobadas;
    private List<Materia> materiasEnCurso;
    private List<Inscripcion> inscripcionesAprobadas;
    private List<Inscripcion> inscripcionesRechazadas;
    private List<Inscripcion> inscripcionesEnCurso;

    private String nombre;

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public Alumno(String nombre, List<Materia> materiasAprobadas, List<Materia> materiasEnCurso, List<Inscripcion> inscripcionesAprobadas, List<Inscripcion> inscripipcionesRechazadas, List<Inscripcion> inscripcionesEnCurso) {
        this.materiasAprobadas = materiasAprobadas;
        this.materiasEnCurso = materiasEnCurso;
        this.inscripcionesAprobadas = inscripcionesAprobadas;
        this.inscripcionesRechazadas = inscripipcionesRechazadas;
        this.inscripcionesEnCurso = inscripcionesEnCurso;
    }

    public void inscribirse(List<Materia> materias){
        Inscripcion inscripcionNueva = new Inscripcion(materias,this);
        inscripcionesEnCurso.add(inscripcionNueva);
    }

    public List<Inscripcion> getInscripipcionesRechazadas() {
        return inscripcionesRechazadas;
    }

    public List<Materia> getMateriasEnCurso() {
        return materiasEnCurso;
    }

    public List<Inscripcion> getInscripcionesEnCurso() {
        return inscripcionesEnCurso;
    }

    public List<Inscripcion> getInscripcionesAprobadas() {
        return inscripcionesAprobadas;
    }

}
