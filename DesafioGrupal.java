import java.util.*;

public class DesafioGrupal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // declarao mi objeto
        Scanner miTeclado;
        // inicializo objeto
        miTeclado = new Scanner(System.in);

        // declaro variables
        String usuario;
        String contraseña;
        String apellido;
        String nombre;
        String mail;
        String cbu;
        double saldo;
        boolean respuesta;
        boolean transferir;
        boolean pagar;
        boolean S;
        boolean N;

        // inicializo
        apellido = "Perez";
        nombre = "Sivia";
        mail = "silviaperez1@gmail.com";
        cbu = "0000029568741253698751";
        saldo = 56822.23;
        S = true;
        N = false;
        respuesta = true;
        transferir = true;
        pagar = true;

        System.out.println("ingrese su nombre de usuario");
        usuario = miTeclado.nextLine();
        System.out.println("ingrese su contraseña");
        contraseña = miTeclado.nextLine();

        System.out.println("Bienvenido a su HomeBanking");
        System.out.println("Datos del usuario");
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo electrónico: " + mail);
        System.out.println("nro de CBU: " + cbu);
        System.out.println("su saldo actual es: " + saldo);
        System.out.println("Tranferencias ");
        System.out.println("Pagos");
        System.out.println("desea cerrar la sesión S/N?: ");
        respuesta = miTeclado.nextBoolean();
        if (respuesta = S) {
            System.out.println("Por favor retire su tarjeta");

        } else {
            System.out.println("Seleccione una operación");
        }

        System.out.println("La sesión ha finalizado");

    }

}
