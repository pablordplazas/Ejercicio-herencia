public class gerente extends empleado {
    private double bonoFijo;
    private int empleadosACargo;

    // Constructor


    public gerente() {
    }

    public gerente(String id, String nombre, double salarioBase, double bonoFijo, int empleadosACargo) {
        super(id, nombre, salarioBase);
        this.bonoFijo = bonoFijo;
        this.empleadosACargo = empleadosACargo;
    }

    // Getters y Setters
    public double getBonoFijo() { return bonoFijo; }
    public void setBonoFijo(double bonoFijo) { this.bonoFijo = bonoFijo; }

    public int getEmpleadosACargo() { return empleadosACargo; }
    public void setEmpleadosACargo(int empleadosACargo) { this.empleadosACargo = empleadosACargo; }

    // Métodos
    public double calcularIncentivoLiderazgo() {
        if (empleadosACargo > 10) {
            return getSalarioBase() * 0.05;
        }
        return 0;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonoFijo + calcularIncentivoLiderazgo();
    }

    @Override
    public String info() {
        return super.info() +
                " | Bono Fijo: " + bonoFijo +
                " | Empleados a Cargo: " + empleadosACargo +
                " | Incentivo: " + calcularIncentivoLiderazgo() +
                " | Salario Final: " + calcularSalario();
    }
}
