import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<empleado> empleados = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\n=== SISTEMA DE NÓMINA TECHMARKET ===");
            System.out.println("1. Registrar Vendedor");
            System.out.println("2. Registrar Gerente");
            System.out.println("3. Listar empleados");
            System.out.println("4. Calcular nómina total");
            System.out.println("5. Mostrar empleado con mayor salario");
            System.out.println("6. Calcular salario promedio");
            System.out.println("7. Buscar empleado por ID");
            System.out.println("8. Mostrar cantidad de Vendedores y Gerentes");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    String idV = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombreV = sc.nextLine();
                    System.out.print("Salario Base: ");
                    double sbV = sc.nextDouble();
                    System.out.print("Ventas Mensuales: ");
                    double ventas = sc.nextDouble();
                    System.out.print("Porcentaje Comisión (ej. 0,05): ");
                    double com = sc.nextDouble();
                    empleados.add(new vendedores(idV, nombreV, sbV, ventas, com));
                    break;

                case 2:
                    System.out.print("ID: ");
                    String idG = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombreG = sc.nextLine();
                    System.out.print("Salario Base: ");
                    double sbG = sc.nextDouble();
                    System.out.print("Bono Fijo: ");
                    double bono = sc.nextDouble();
                    System.out.print("Empleados a Cargo: ");
                    int cargo = sc.nextInt();
                    empleados.add(new gerente(idG, nombreG, sbG, bono, cargo));
                    break;

                case 3:
                    for (empleado e : empleados) {
                        System.out.println(e.info());
                    }
                    break;

                case 4:
                    double total = 0;
                    for (empleado e : empleados) total += e.calcularSalario();
                    System.out.println("Nómina Total: " + total);
                    break;

                case 5:
                    if (!empleados.isEmpty()) {
                        empleado mayor = empleados.get(0);
                        for (empleado e : empleados) {
                            if (e.calcularSalario() > mayor.calcularSalario()) mayor = e;
                        }
                        System.out.println("Empleado con mayor salario:\n" + mayor.info());
                    }
                    break;

                case 6:
                    if (!empleados.isEmpty()) {
                        double suma = 0;
                        for (empleado e : empleados) suma += e.calcularSalario();
                        System.out.println("Salario Promedio: " + (suma / empleados.size()));
                    }
                    break;

                case 7:
                    System.out.print("Ingrese ID: ");
                    String buscarId = sc.nextLine();
                    boolean encontrado = false;
                    for (empleado e : empleados) {
                        if (e.getId().equalsIgnoreCase(buscarId)) {
                            System.out.println(e.info());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) System.out.println("Empleado no encontrado.");
                    break;

                case 8:
                    int countV = 0, countG = 0;
                    for (empleado e : empleados) {
                        if (e instanceof vendedores) countV++;
                        if (e instanceof gerente) countG++;
                    }
                    System.out.println("Vendedores: " + countV + " | Gerentes: " + countG);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
