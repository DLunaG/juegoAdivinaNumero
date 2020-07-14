//08. Adivina el número
//        Generar un programa que genere un número aleatorio entre 1 y el 100.
//        A continuación, solicitará valores al usuario y le indicará si el número generado es mayor o menor durante 10 turnos.
//        Si al finalizar los turnos no lo ha adivinado, mostrará el mensaje "HAS PERDIDO".
//        Si durante los 10 turnos, en algún momento lo acierta, mostrará "HAS GANADO"

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        Player juego = new Player();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido. Comenzamos el juego. Adivina un nº aleatorio del 1 al 100");
        while(juego.getLifes() > 0){
            System.out.println("¿Qué número es? (vidas: " + juego.getLifes() + ")");
            num = sc.nextInt();
            juego.comprobacion(num);
        }
    }

}