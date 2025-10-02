public class empleado extends persona{

    private String tipocontrato;
    private int sueldo;

    public empleado() {
    }

    public empleado(String nombre, String apellido, int edad, String Documento, String tipocontrato, int sueldo) {
        super(nombre, apellido, edad, Documento);
        this.tipocontrato = tipocontrato;
        this.sueldo = sueldo;
    }

    public String getTipocontrato() {
        return tipocontrato;
    }

    public void setTipocontrato(String tipocontrato) {
        this.tipocontrato = tipocontrato;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "empleado{" +
                "tipocontrato='" + tipocontrato + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
    @Override
    public String mostrarinfo() {
        return "SOY UN EMPLEADO nombre  "+ nombre + "apellido  "+ apellido + "edad  "+ edad + "Documento  "+ Documento +
                "tipocontrato  "+ tipocontrato + "sueldo  "+ sueldo;
    }
}
