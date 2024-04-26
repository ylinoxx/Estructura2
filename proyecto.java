import java.util.LinkedList;
import java.util.Scanner;

public class proyecto {

    public static void main(String[] args) {
        LinkedList<empleado> empleados = new LinkedList<empleado>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            empleado item = new empleado(null, null, null, i, null);
            System.out.println("Ingrese el nombre");
            item.setNombre(in.next());
            System.out.println("Ingrese el apellido");
            item.setApellido(in.next());
            System.out.println("Ingrese la direccion");
            item.setDireccion(in.next());
            System.out.println("Ingrese la edad");
            item.setEdad(in.nextInt());
            System.out.println("Ingrese el cargo");
            item.setCargo(in.next());
            empleados.add(item);
        }
        String cadena = "";
        for (empleado empleado : empleados) {
            cadena = cadena + empleado.getNombre() + "\n" + empleado.getApellido() + "\n" + empleado.getDireccion() + "\n" + empleado.getEdad() + "\n" + empleado.getCargo() + "\n";
        }
    }
}