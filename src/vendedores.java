public class vendedores extends empleado {
    private double ventasMensuales;
    private double porcentajeComision;

    // Constructor


    public vendedores() {
    }

    public vendedores(String id, String nombre, double salarioBase, double ventasMensuales, double porcentajeComision) {
        super(id, nombre, salarioBase);
        this.ventasMensuales = ventasMensuales;
        this.porcentajeComision = porcentajeComision;
    }

    // Getters y Setters
    public double getVentasMensuales() { return ventasMensuales; }
    public void setVentasMensuales(double ventasMensuales) { this.ventasMensuales = ventasMensuales; }

    public double getPorcentajeComision() { return porcentajeComision; }
    public void setPorcentajeComision(double porcentajeComision) { this.porcentajeComision = porcentajeComision; }

    // Métodos
    public double calcularBonificacionPorMeta() {
        if (ventasMensuales > 5000000) {
            return ventasMensuales * 0.10;
        }
        return 0;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (ventasMensuales * porcentajeComision) + calcularBonificacionPorMeta();
    }

    @Override
    public String info() {
        return super.info() +
                " | Ventas: " + ventasMensuales +
                " | Comisión: " + (ventasMensuales * porcentajeComision) +
                " | Bono: " + calcularBonificacionPorMeta() +
                " | Salario Final: " + calcularSalario();
    }
}
