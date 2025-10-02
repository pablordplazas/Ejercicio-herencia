public class persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String Documento;

    public persona() {

    }
    public persona(String nombre, String apellido, int edad, String Documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Documento = Documento;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String documento) {
        Documento = documento;
    }

    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", Documento='" + Documento + '\'' +
                '}';
    }

    public String mostrarinfo() {
        return "nombre  "+ nombre + "apellido  "+ apellido + "edad  "+ edad + "Documento  "+ Documento;
    }
}
