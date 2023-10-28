/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_bryanarita;

import java.util.Scanner;

/**
 *
 * @author mlope
 */
public class Lab3P1_BryanArita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        System.out.println("1. Sucesiones");
        System.out.println("2. Pocket Monsters");
        System.out.println("3. Asterico en casa");
        System.out.println("Ingrese su opcion");
        int opcion = leer.nextInt();

        while (opcion > 0 && opcion < 4) {

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese la diferencia: ");
                    int diff = leer.nextInt();
                    System.out.print("Ingrese el inicial: ");
                    int ini = leer.nextInt();
                    System.out.print("Ingrese la cantidad de numeros a imprimir: ");
                    int cant = leer.nextInt();

                int num=0;
                int ini2=ini;
                int diff2=diff;
                int cant2=cant;
                     
                    for (int i=1;i<=cant-1;i++){
                        System.out.print(+ini+", ");
                        ini+=diff;
                        diff+=1;
                    }
                    System.out.print(+ini);
                    System.out.println("\nQue numero desea ver mas adelante en la sucesion? ");
                    int adel = leer.nextInt();
                    for (int q=1;q<adel;q++){
                        ini2+=diff2;
                        diff2 += 1;
                    }
                    System.out.println("El numero seria: "+ini2);

                    break;

                case 2:

                    System.out.println("Seleccione modo de pelea: ");
                    System.out.println("1. Hasta la muerte");
                    System.out.println("2. por rondas");
                    int mod = leer.nextInt();

                    System.out.println("ESTADISTICAS");
                    System.out.println("Sylveon      Vida:280    Ataque:80   Defensa:15%");
                    System.out.println("Gyarados     Vida:300    Ataque:50   Defensa:10%");
                    System.out.println("Giratina     Vida:300    Ataque:70   Defensa:25%");
                    System.out.println("Dragonite    Vida:250    Ataque:75   Defensa:20%");

                    System.out.println("\nIngrese una pelea determinada");
                    System.out.println("1. Sylveon      vrs     Dragonite");
                    System.out.println("2. Gyarados     vrs     Giratina");
                    System.out.println("3. Dragonite    vrs     Giratina");
                    System.out.println("4. Giratina     vrs     Sylveon");
                    int pelea = leer.nextInt();

                    int rondas;
                    int limite = 0;
                    double vida1 = 280;
                    double ataque1 = 80;
                    double def1 = 0.15;

                    double vida2 = 300;
                    double ataque2 = 50;
                    double def2 = 0.10;

                    double vida3 = 300,
                     ataque3 = 70,
                     def3 = 0.25;
                    double vida4 = 250,
                     ataque4 = 75,
                     def4 = 0.20;

                    double ata1 = 0;
                    double ata2 = 0;
                    double ata3 = 0;
                    double ata4 = 0;

                    if (mod == 1) {
                        limite = 9999;
                    } else if (mod == 2) {
                        System.out.println("Ingrese las rondas que se jugaran:");
                        limite = leer.nextInt();
                        if (limite > 10) {
                            System.out.println("solo se pueden jugar menos de 10 rounds");
                        }
                    }

                    switch (pelea) {

                        case 1:
                            for (int p = 1; p <= limite; p++) {
                                System.out.println("-------------- Ronda" + p + " --------------");
                                System.out.println("Vida de pokemon 1: " + vida1);
                                System.out.println("Vida de pokemon 2: " + vida4);
                                System.out.println("\nPokemon 1 Ha atacado!!");
                                System.out.println("Pokemon 2 Ha atacado!!");

                                ata1 = ataque1 - (ataque1 * def4);
                                ata4 = ataque4 - (ataque4 * def1);

                                vida1 = vida1 - ata1;
                                vida4 = vida4 - ata4;

                                if (vida1 <= 0) {
                                    vida1 = 0;
                                    p = limite;
                                } else if (vida4 <= 0) {
                                    vida4 = 0;
                                    p = limite;
                                }

                                System.out.println("Vida de pokemon 1: " + vida1);
                                System.out.println("Vida de pokemon 2: " + vida4);

                                if (vida1 <= 0 || vida1 < vida4) {
                                    System.out.println("************FIN DE LA BTALLA************");
                                    System.out.println("Pokemon 2 es el ganador");
                                } else if (vida4 <= 0 || vida4 < vida1) {
                                    System.out.println("************FIN DE LA BTALLA************");
                                    System.out.println("Pokemon 1 es el ganador");
                                }
                            }

                            break;

                        case 2:
                            for (int p = 1; p <= limite; p++) {

                                System.out.println("-------------- Ronda" + p + " --------------");
                                System.out.println("Vida de pokemon 1: " + vida2);
                                System.out.println("Vida de pokemon 2: " + vida3);
                                System.out.println("\nPokemon 1 Ha atacado!!");
                                System.out.println("Pokemon 2 Ha atacado!!");

                                ata2 = ataque2 - (ataque2 * def3);
                                ata3 = ataque3 - (ataque3 * def2);

                                vida2 = vida2 - ata2;
                                vida3 = vida3 - ata3;

                                if (vida2 <= 0) {
                                    vida2 = 0;
                                    p = limite;
                                } else if (vida3 <= 0) {
                                    vida3 = 0;
                                    p = limite;
                                }

                                System.out.println("Vida de pokemon 1: " + vida2);
                                System.out.println("Vida de pokemon 2: " + vida3);
                                if (vida2 <= 0 || vida2 < vida3) {
                                    System.out.println("************FIN DE LA BTALLA************");
                                    System.out.println("Pokemon 2 es el ganador");
                                } else if (vida3 <= 0 || vida3 < vida2) {
                                    System.out.println("************FIN DE LA BTALLA************");
                                    System.out.println("Pokemon 1 es el ganador");
                                }
                            }

                            break;

                        case 3:
                            for (int p = 1; p <= limite; p++) {

                                System.out.println("-------------- Ronda" + p + " --------------");
                                System.out.println("Vida de pokemon 1: " + vida4);
                                System.out.println("Vida de pokemon 2: " + vida3);
                                System.out.println("\nPokemon 1 Ha atacado!!");
                                System.out.println("Pokemon 2 Ha atacado!!");

                                ata4 = ataque4 - (ataque4 * def3);
                                ata3 = ataque3 - (ataque3 * def4);

                                vida4 = vida4 - ata4;
                                vida3 = vida3 - ata3;

                                if (vida4 <= 0) {
                                    vida4 = 0;
                                    p = limite;
                                } else if (vida3 <= 0) {
                                    vida3 = 0;
                                    p = limite;
                                }

                                System.out.println("Vida de pokemon 1: " + vida4);
                                System.out.println("Vida de pokemon 2: " + vida3);
                                if (vida4 <= 0 || vida4 < vida3) {
                                    System.out.println("************FIN DE LA BTALLA************");
                                    System.out.println("Pokemon 2 es el ganador");
                                } else if (vida3 <= 0 || vida3 < vida4) {
                                    System.out.println("************FIN DE LA BTALLA************");
                                    System.out.println("Pokemon 1 es el ganador");
                                }
                            }

                            break;

                        default:
                            for (int p = 1; p <= limite; p++) {

                                System.out.println("-------------- Ronda" + p + " --------------");
                                System.out.println("Vida de pokemon 1: " + vida3);
                                System.out.println("Vida de pokemon 2: " + vida1);
                                System.out.println("\nPokemon 1 Ha atacado!!");
                                System.out.println("Pokemon 2 Ha atacado!!");

                                ata1 = ataque1 - (ataque1 * def3);
                                ata3 = ataque3 - (ataque3 * def1);

                                vida1 = vida1 - ata1;
                                vida3 = vida3 - ata3;

                                if (vida1 <= 0) {
                                    vida1 = 0;
                                    p = limite;
                                } else if (vida3 <= 0) {
                                    vida3 = 0;
                                    p = limite;
                                }

                                System.out.println("Vida de pokemon 1: " + vida3);
                                System.out.println("Vida de pokemon 2: " + vida1);

                                if (vida3 <= 0 || vida3 < vida1) {
                                    System.out.println("************FIN DE LA BTALLA************");
                                    System.out.println("Pokemon 2 es el ganador");
                                } else if (vida1 <= 0 || vida1 < vida3) {
                                    System.out.println("************FIN DE LA BTALLA************");
                                    System.out.println("Pokemon 1 es el ganador");
                                }
                            }

                    }// fin del switch pelea

                    break;// fin del case 2

                default:

                    System.out.print("Ingrese un numero impar y mayor a 7: ");
                    int n = leer.nextInt();
                    while (n >= 7 && n % 2 != 0) {
                        for (int i = 1; i <= n; i++) {
                            for (int k = 1; k <= n; k++) {
                                if (i == 1 || i == n || k == n || k == 1) {
                                    System.out.print(" * ");
                                } else if (k == n / 2 + 1) {
                                    System.out.print(" | ");
                                } else if (i == k || i + k == n + 1) {
                                    System.out.print(" > ");
                                } else {
                                    System.out.print("   ");
                                }

                            }

                            System.out.println("");
                        }
                    System.out.print("Ingrese un numero impar y mayor a 7: ");
                    n = leer.nextInt();
                    }
                    
                    System.out.println("debe de ingresar un numero impar y mayor a 7");

            }// fin del switch principal
            System.out.println("\n1. Sucesiones");
            System.out.println("2. Pocket Monsters");
            System.out.println("3. Asterico en casa");
            System.out.println("Ingrese su opcion");
            opcion = leer.nextInt();
        }// fin del while principal

    }// fin del main
}// fin de la clase
