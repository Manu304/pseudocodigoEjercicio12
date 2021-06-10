import java.util.Scanner;

//202030799 Manuel Rojas
//Dise�ar un algoritmo que lea desde teclado la informaci�n
//sobre altura, edad, y sexo (F/M) de los participantes de un
//curso. La lectura finaliza cuando se lee un valor de altura
//negativo. Luego calcule:
//	a. Promedio de altura de las mujeres.
//	b. Promedio de altura de los varones.
//	c. Promedio de edad de los participantes.
public class Ejercicio12Parte2 {
    public static void main(String[] args) {
        float alturaMT = 0, alturaFT = 0, altura, alturaMP, alturaFP, edadP;
        int alturaMC = 0, alturaFC = 0, edadT = 0;

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la altura de la persona: ");
            altura = scanner.nextFloat();
            if (altura > 0) {
                int edad;
                char sexo;
                System.out.print("Ingrese la edad de la persona: ");
                edad = scanner.nextInt();
                System.out.print("Ingrese el sexo de la persona (F/M): ");
                sexo = scanner.next().toUpperCase().charAt(0);

                if (sexo == 'F') {
                    alturaFT += altura;
                    alturaFC++;
                    edadT += edad;
                }else if (sexo == 'M') {
                    alturaMT += altura;
                    alturaMC++;
                    edadT += edad;
                }else{
                    System.out.println("No ingresado. Escriba un sexo valido");
                }
            }else{
                System.out.println("Se termino la lectura de datos");
            }
        }while (altura != 0);
        alturaMP = (float) alturaMT/alturaMC;
	    alturaFP = (float) alturaFT/alturaFC;
	    edadP = (float) edadT/(alturaMC+alturaFC);
        System.out.println("El promedio de altura de las mujeres es: " + alturaFP
        + "\nEl promedio de altura de los varones es: " + alturaMP
        + "\nEl promedio de edad de los participantes es: " + edadP);
    } 
}