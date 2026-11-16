import java.util.Scanner;
public class MetodoValidacion {
    public int validacionInt(){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        while (true){
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                break;
            }
            else{
                System.out.println("No es valido!!");
                sc.nextLine();
            }
        }
        System.out.println("El numero ya es valido");
        sc.close();
        return numero;
    }
    public static void main(String[] args) {
        MetodoValidacion mv = new MetodoValidacion();
        System.out.println("Escribe un numero entero");
        int numero = mv.validacionInt();
    }
}
