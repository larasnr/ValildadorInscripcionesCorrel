import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;

public class ValidarMaterias {

    @Test
    public void inscripcionAprobada(){

        Materia algoritmos = new Materia("Algoritmos y estructuras de datos",null);
        Materia discreta = new Materia("Matematica discreta",null);
        Materia pdp = new Materia("Paradigmas de programacion", Arrays.asList(algoritmos,discreta));

        Alumno pepito = new Alumno("Pepito",Arrays.asList(algoritmos,discreta), new ArrayList<>(),new ArrayList<>(),new ArrayList<>(),new ArrayList<>());

        pepito.inscribirse(Arrays.asList(pdp));

    Assert.assertTrue(pepito.getInscripcionesEnCurso().get(0).procesarInscripcion());

    }

    @Test
    public void inscripcionRechazada(){

        Materia algoritmos = new Materia("Algoritmos y estructuras de datos",null);
        Materia discreta = new Materia("Matematica discreta",null);
        Materia pdp = new Materia("Paradigmas de programacion", Arrays.asList(algoritmos,discreta));

        Alumno pepito = new Alumno("Pepito",Arrays.asList(algoritmos), new ArrayList<>(),new ArrayList<>(),new ArrayList<>(),new ArrayList<>());

        pepito.inscribirse(Arrays.asList(pdp));

        Assert.assertFalse(pepito.getInscripcionesEnCurso().get(0).procesarInscripcion());

    }
}