public class empleado {
    protected String id;
    protected String nombre;
    protected double salarioBase;

    // Constructor

    public empleado() {
    }

    public empleado(String id, String nombre, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }

    // Métodos
    public double calcularSalario() {
        return salarioBase;
    }

    public String info() {
        return "ID: " + id + " | Nombre: " + nombre + " | Salario Base: " + salarioBase;
    }
}
