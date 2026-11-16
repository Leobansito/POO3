import java.util.Scanner;
public class AreaCirculo {
    public int validacionInt(){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        while (true) {
            if (sc.hasNextInt()){
                numero = sc.nextInt();
                break;
            }
            else{                         
                System.out.println("El dato es invalido!");;
                sc.nextLine();
            }
        }
        sc.close();
        return numero;   
    }
    public double areaCirculo(int radio){
        double pi = 3.1416;
        return (pi * (radio * radio));
    }
    public static void main(String[] args) {
        AreaCirculo ae = new AreaCirculo();
        System.out.println("Hola hermano bienvenido a este programa el cual\ncalcula el area de un circulo");
        System.out.print("Por favor ingrese el radio de su circulo: ");
        int valor = ae.validacionInt();
        System.out.println("Perfecto, ahora calcularemos el area!");
        System.out.print("El area de su circulo es: "+ ae.areaCirculo(valor));
        
    }
}