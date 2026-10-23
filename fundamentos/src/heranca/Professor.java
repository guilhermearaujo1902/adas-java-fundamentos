package heranca;

public class Professor extends Pessoa {

    private String codigoEspecial;
    private String materia;

    public Professor() {
    }

    public Professor(String codigoEspecial, String materia) {
        this.codigoEspecial = codigoEspecial;
        this.materia = materia;
    }

    public String getCodigoEspecial() {
        return codigoEspecial;
    }

    public void setCodigoEspecial(String codigoEspecial) {
        this.codigoEspecial = codigoEspecial;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
