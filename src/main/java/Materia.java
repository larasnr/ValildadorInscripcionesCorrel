import java.util.List;
public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public String getNombre() {
        return nombre;
    }

    public Materia(String nombre, List<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }
}
