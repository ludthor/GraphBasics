
public class Persona {

    private long id;
    private String nombre;
    private String documento;
    private int edad;


    public Persona(long id, String nombre, String documento, int edad) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
    }


    public long getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDocumento() {
        return documento;
    }


    public void setDocumento(String documento) {
        this.documento = documento;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {

        return "Persona: [id: "
                + id + ", nombre: "
                + nombre + ", documento: "
                + documento + ", edad: "
                + edad + "]";

    }

}
