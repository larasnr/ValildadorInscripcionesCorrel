import java.util.List;
import java.util.stream.Collectors;

public class Alumno {
    private List<Materia> materiasAprobadas;
    private List<Materia> materiasEnCurso;
    private List<Inscripcion> inscripcionesAprobadas;
    private List<Inscripcion> inscripcionesRechazadas;
    private List<Inscripcion> inscripcionesEnCurso;

    private String nombre;

    public Alumno(String nombre, List<Materia> materiasAprobadas, List<Materia> materiasEnCurso, List<Inscripcion> inscripcionesAprobadas, List<Inscripcion> inscripipcionesRechazadas, List<Inscripcion> inscripcionesEnCurso) {
        this.materiasAprobadas = materiasAprobadas;
        this.materiasEnCurso = materiasEnCurso;
        this.inscripcionesAprobadas = inscripcionesAprobadas;
        this.inscripcionesRechazadas = inscripipcionesRechazadas;
        this.inscripcionesEnCurso = inscripcionesEnCurso;
    }

    public List<Inscripcion> getInscripipcionesRechazadas() {
        return inscripcionesRechazadas;
    }

    public List<Inscripcion> getInscripcionesEnCurso() {
        return inscripcionesEnCurso;
    }

    public List<Inscripcion> getInscripcionesAprobadas() {
        return inscripcionesAprobadas;
    }


    public void inscribirse(List<Materia> materias){
        Inscripcion inscripcionNueva = new Inscripcion(materias,this);
        inscripcionesEnCurso.add(inscripcionNueva);
    }
    public boolean validarCorrelatividad(Materia materia){
        return materiasAprobadas.containsAll(materia.getCorrelativas());
    }

}
