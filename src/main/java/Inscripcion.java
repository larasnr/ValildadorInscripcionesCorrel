import java.util.List;
import java.util.stream.Collectors;

public class Inscripcion {
    private List<Materia> materias;
    private Alumno alumno;
    private boolean estaAprobada;

    public Inscripcion(List<Materia> materias, Alumno alumno) {
        this.materias = materias;
        this.alumno = alumno;
    }


    public boolean aprobar(){
        estaAprobada = this.materias.stream().allMatch(m -> alumno.validarCorrelatividad(m) == true);

        if(estaAprobada){
            alumno.getInscripcionesAprobadas().add(this);
        }
        else{
            alumno.getInscripipcionesRechazadas().add(this);
        }
        alumno.getInscripcionesEnCurso().remove(this);

        return estaAprobada;
    }

}
