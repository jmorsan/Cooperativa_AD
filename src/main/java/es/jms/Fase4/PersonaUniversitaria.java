package es.jms.Fase4;

public class PersonaUniversitaria extends Persona {

    private int universidadId;

    private String correo;

    public PersonaUniversitaria(int codigo, String nombre, int edad, int universidadId, String correo) {
        super(codigo, nombre, edad);
        this.universidadId = universidadId;
        this.correo = correo;
    }

    public int getUniversidadId() {
        return universidadId;
    }

    public void setUniversidadId(int universidadId) {
        this.universidadId = universidadId;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "PersonaUniversitaria{" +
                "universidadId=" + universidadId +
                ", correo='" + correo + '\'' +
                '}';
    }
}
