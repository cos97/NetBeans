/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopr_qeq;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TrabajoPR_QEQ {
//Prueba commit v0.2 github
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         /*
        1.Bart - 2.Lisa - 3.Homer - 4.Marge - 5.Milhouse - 6.Barns - 7.Krasty - 8.TroyMclure - 9.Gemelas
         */
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        //Crear los personajes
        Personajes simpson[] = new Personajes[9];

        //Nuestro personaje
        Personajes simpsonAux = new Personajes();
        //                                 nombre      femenino    peloAzul       pocoPelo      esJoven     esFamoso
        simpson[0] = new Personajes("Bart", false, false, false, true, false);
        simpson[1] = new Personajes("Lisa", true, false, false, true, false);
        simpson[2] = new Personajes("Homer", false, false, true, false, false);
        simpson[3] = new Personajes("Marge", true, true, false, false, false);
        simpson[4] = new Personajes("Milhouse", false, true, false, true, false);
        simpson[5] = new Personajes("Barns", false, false, true, false, true);
        simpson[6] = new Personajes("Krusty", false, true, false, false, true);
        simpson[7] = new Personajes("Troy", false, false, false, false, true);
        simpson[8] = new Personajes("Gemelas", true, true, false, true, false);

        //Intro
        System.out.println("Welcome to the ultimate version of the game: Who is who?\n" +
                            "the simpsons edition\n" +
                            "by @cos7\n");
        System.out.println("_____ .   . .___       __  . .    . .__   __   __  .   .  __");
        System.out.println("  |   |   | |         (__` | |\\  /| |  \\ (__` /  \\ |\\  | (__`");
        System.out.println("  |   |---| |---         \\ | | \\/ | |__/    \\ |  | | \\ |    \\");
        System.out.println("  |   |   | |___      \\__/ | |    | |    \\__/ \\__/ |  \\| \\__/\n\n");
        System.out.println("                          (####)");
        System.out.println("                        (#######)");
        System.out.println("                      (#########)");
        System.out.println("                     (#########)");
        System.out.println("                    (#########)");
        System.out.println("                   (#########)");
        System.out.println("   __&__          (#########)");
        System.out.println("  /     \\        (#########)   |\\/\\/\\/|     /\\ /\\  /\\               /\\");
        System.out.println(" |       |      (#########)    |      |     | V  \\/  \\---.    .----/  \\----.");
        System.out.println(" |  (o)(o)       (o)(o)(##)    |      |      \\_        /       \\          /");
        System.out.println(" C   .---_)    ,_C     (##)    | (o)(o)       (o)(o)  <__.   .--\\ (o)(o) /__.");
        System.out.println("  | |.___|    /___,   (##)     C      _)     _C         /     \\     ()     /");
        System.out.println("  |  \\__/       \\     (#)       | ,___|     /____,   )  \\      >   (C_)   <");
        System.out.println("  /_____\\        |    |         |   /         \\     /----'    /___\\____/___\\");
        System.out.println(" /_____/ \\       OOOOOO        /____\\          ooooo             /|    |\\");
        System.out.println("/         \\     /      \\      /      \\        /     \\           /        \\");
        //Instrucciones
        System.out.println("\n\n\n\nIntenta adivinar el personaje que ha escogido la máquina de entre la siguiente lista:"
                            + "\n\n- Bart\n- Lisa\n- Homer\n- Marge\n- Milhouse\n- Barns\n- Krasty\n- Troy McClure\n- Gemelas\n");
        System.out.println("------------------------------------------------");
        //Preguntas, comienza el turno de la máquina, y luego el nuestro y así con todas las preguntas ;
        System.out.println("Le preguntamos a la máquina y nos responde con 'true' o 'false'\n");
        System.out.println("------------------------------------------------");
        System.out.println("NOTAS:\n* Atentos a las respuestas de la máquina para poder descartar desde el menú de tachado y encontrar su personaje"
                + "\n* Si la máquina nos responde por ejemplo 'true' a una pregunta, deberemos de tachar los personajes del tablero que respondan 'false' a esa misma pregunta"
                + "\n* Por cada pregunta que le realicemos a la máquina, resta '1.5' Pts. a la máxima nota posible, que es '10' Pts."
                + "\n* Además por cada intento de respuesta fallido, resta de nuevo '1,5' Pts.");
        System.out.println("------------------------------------------------");
        //Aux para salir del bucle
        int aux = 10;
        int aux2 = 10;
        int aux3 = 10;
        int aux4 = 10;
        //Variables
        double puntuacion = 10.0;
        int e = 0;
        int contadorPreguntas;
        
        //Jugadores (10 max)
        Players jugadores[] = new Players[10];
        jugadores[0] = new Players();
        jugadores[1] = new Players();
        jugadores[2] = new Players();
        jugadores[3] = new Players();
        jugadores[4] = new Players();
        jugadores[5] = new Players();
        jugadores[6] = new Players();
        jugadores[7] = new Players();
        jugadores[8] = new Players();
        jugadores[9] = new Players();
        
        //Random para que la máquina escoja un personaje que se ubican en un array, dentro de un bucle do while, para que escoja uno diferente en cada juego dentro de una misma partida
        do {
            int aux1 = (int) (Math.floor(Math.random() * 9));
            String tachadoCompleto[] = {"Bart", "Lisa", "Homer", "Marge", "Milhouse", "Sr. Barns", "Payaso Krusty", "Troy McClure", "Gemelas"};
            String tachadoBorrado[] = {"", "", "", "", "", "", "", "", ""};
            //Actuallizar puntuacion a su estado original tras cada turno
            puntuacion = 10.0;
            
            System.out.println("Comienza el juego de Quién es Quién\n");
            //Pregunta nuestro nombre, que posteriormente convertirá en un nick con las iniciales en mayusculas.
            jugadores[e].preguntaNombre();
            //Reiniciar aux2
            aux2 = 10;
            //Comienza el turno del jugador anterior
            while (aux2 != 100) {
                System.out.println("------------------------------------------------");
                System.out.println("Tablero:\n");//Tablero principal por consola (Muestra los personajes que no estén tachados) y luego el menú principal con las diferentes opciones(preguntar, tachar, responder)
                for (int i = 0; i < simpson.length; i++) {
                                System.out.println(tachadoCompleto[i]);
                            }
                System.out.println("------------------------------------------------");
                System.out.println("\nMenú Principal\n"
                        + "\n1. Menú Selecciona pregunta:"
                        + "\n2. Menú tachado"
                        + "\n3. Menú de Responder"
                        + "\n4. Menú Records");
                System.out.println("------------------------------------------------");
                aux2 = sc.nextInt();
                switch (aux2) {
                    //Menu preguntas
                    case 1:
                        //Reiniciar aux3
                        aux3 = 10;
                        System.out.println("Menú Preguntar\n"
                                + "\n1. ¿Es joven?"
                                + "\n2. ¿Es una mujer?"
                                + "\n3. ¿Tiene poco pelo?"
                                + "\n4. ¿Es famoso?"
                                + "\n5. ¿Tiene el pelo de color azul?\n");
                        System.out.println("------------------------------------------------");
                        aux3 = sc.nextInt();
                        System.out.println("\nRespuesta de la máquina:");//Por cada pregunta que se hace, se resta puntos para que se obtenga más puntos si se resuelve con menos preguntas
                        switch (aux3) {
                            case 1:
                                System.out.println(simpsonAux.preguntaJoven());
                                System.out.println(simpson[aux1].isJoven());
                                puntuacion -= 1.5;
                                break;
                            case 2:
                                System.out.println(simpsonAux.preguntaFemenino());
                                System.out.println(simpson[aux1].isFemenino());
                                puntuacion -= 1.5;
                                break;
                            case 3:
                                System.out.println(simpsonAux.preguntaPeloCalvo());
                                System.out.println(simpson[aux1].isPeloCalvete());
                                puntuacion -= 1.5;
                                break;
                            case 4:
                                System.out.println(simpsonAux.preguntaFamoso());
                                System.out.println(simpson[aux1].isFamoso());
                                puntuacion -= 1.5;
                                break;
                            case 5:
                                System.out.println(simpsonAux.preguntaPeloAzul());
                                System.out.println(simpson[aux1].isPeloAzul());
                                puntuacion -= 1.5;
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Menú de tachado");
                        //Reiniciar aux4
                        aux4 = 10;
                        while (aux4 != 0) {
                            System.out.println("\n"
                                    + "\n1. Tachar si jóvenes = true"
                                    + "\n2. Tachar si jóvenes = false"
                                    + "\n3. Tachar si mujer = true"
                                    + "\n4. Tachar si mujer = false"
                                    + "\n5. Tachar si calvete = true"
                                    + "\n6. Tachar si calvete = false"
                                    + "\n7. Tachar si famoso = true"
                                    + "\n8. Tachar si famoso = false"
                                    + "\n9. Tachar si pelo azul = true"
                                    + "\n10. Tachar si pelo azul = false"
                                    + "\n\n11. Reestablecer tablero");
                            System.out.println("\n '0' para salir del menú tachado");
                            System.out.println("------------------------------------------------\nTablero:");
                            for (int i = 0; i < simpson.length; i++) {
                                System.out.println(tachadoCompleto[i]);
                            }
                            System.out.println("------------------------------------------------");
                            aux4 = sc.nextInt();
                            switch (aux4) {
                                case 1:
                                    for (int i = 0; i < simpson.length; i++) {
                                        if (simpson[i].isJoven() == true) {
                                            tachadoCompleto[i] = tachadoBorrado[i];
                                        }
                                    }
                                    break;
                                case 2:
                                    for (int i = 0; i < simpson.length; i++) {
                                        if (simpson[i].isJoven() == false) {
                                            tachadoCompleto[i] = tachadoBorrado[i];
                                        }
                                    }
                                    break;
                                case 3:
                                    for (int i = 0; i < simpson.length; i++) {
                                        if (simpson[i].isFemenino() == true) {
                                            tachadoCompleto[i] = tachadoBorrado[i];
                                        }
                                    }
                                    break;
                                case 4:
                                    for (int i = 0; i < simpson.length; i++) {
                                        if (simpson[i].isFemenino() == false) {
                                            tachadoCompleto[i] = tachadoBorrado[i];
                                        }
                                    }
                                    break;
                                case 5:
                                    for (int i = 0; i < simpson.length; i++) {
                                        if (simpson[i].isPeloCalvete() == true) {
                                            tachadoCompleto[i] = tachadoBorrado[i];
                                        }
                                    }
                                    break;
                                case 6:
                                    for (int i = 0; i < simpson.length; i++) {
                                        if (simpson[i].isPeloCalvete() == false) {
                                            tachadoCompleto[i] = tachadoBorrado[i];
                                        }
                                    }
                                    break;
                                case 7:
                                    for (int i = 0; i < simpson.length; i++) {
                                        if (simpson[i].isFamoso() == true) {
                                            tachadoCompleto[i] = tachadoBorrado[i];
                                        }
                                    }
                                    break;
                                case 8:
                                    for (int i = 0; i < simpson.length; i++) {
                                        if (simpson[i].isFamoso() == false) {
                                            tachadoCompleto[i] = tachadoBorrado[i];
                                        }
                                    }
                                    break;
                                case 9:
                                    for (int i = 0; i < simpson.length; i++) {
                                        if (simpson[i].isPeloAzul() == true) {
                                            tachadoCompleto[i] = tachadoBorrado[i];
                                        }
                                    }
                                    break;
                                case 10:
                                    for (int i = 0; i < simpson.length; i++) {
                                        if (simpson[i].isPeloAzul() == false) {
                                            tachadoCompleto[i] = tachadoBorrado[i];
                                        }
                                    }
                                    break;
                                case 11://Reestablecer tachado por si nos confundimos al tachar una opción que no es la que queríamos
                                    tachadoCompleto[0] = "Bart";
                                    tachadoCompleto[1] = "Lisa";
                                    tachadoCompleto[2] = "Homer";
                                    tachadoCompleto[3] = "Marge";
                                    tachadoCompleto[4] = "Milhouse";
                                    tachadoCompleto[5] = "Sr. Barns";
                                    tachadoCompleto[6] = "Payaso Krusty";
                                    tachadoCompleto[7] = "Troy McClure";
                                    tachadoCompleto[8] = "Gemelas";
                                    System.out.println("Tablero:");
                                    for (int i = 0; i < simpson.length; i++) {
                                        System.out.println(tachadoCompleto[i]);
                                    }
                                    break;
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Menú de Responder\n");
                        System.out.println("Hora de ver los resultados, ¿Quien crees que es el personaje escogido por la máquina?\n");
                        System.out.println("\tBart - Lisa - Homer - Marge - Milhouse - Barns - Krusty - Troy - Gemelas");
                        String respuestaFinal = sc.next();
                        System.out.println("------------------------------------------------");
                        if (respuestaFinal.equalsIgnoreCase(simpson[aux1].getNombre())) {
                            aux2 = 100;
                        } else {
                            System.out.println("ERROR, Intendalo de nuevo\n - 1,5 Pts de penalización");
                            System.out.println("                             __");
                            System.out.println("                   _ ,___,-'\",-=-.");
                            System.out.println("             _ _,-'_)_  (\"\"`'-._\\ `.");
                            System.out.println("            |,' ,-' __)  ,-     /. |");
                            System.out.println("            |     -'  _)/         `\\");
                            System.out.println("          ,'       ,-'_,`           :");
                            System.out.println("       ,-'       ,(,-(              :");
                            System.out.println("     ,'       ,-' ,    _            ;");
                            System.out.println("    /        ,-._/`---'            /");
                            System.out.println("   /        (____)(----. )       ,'");
                            System.out.println("  /         (      `.__,     /\\ /,");
                            System.out.println(" :           ;-.___         /__\\/|");
                            System.out.println(" |         ,'      `--.      -,\\ |");
                            System.out.println(" :        /            \\    .__/");
                            System.out.println("  \\      (__            \\    |_");
                            System.out.println("   \\       ,`-, *       /   _|,\\");
                            System.out.println("    \\    ,'   `-.     ,'_,-'    \\");
                            System.out.println("   (_\\,-'    ,'\\\")--,'-'       __\\");
                            System.out.println("    \\       /  // ,'|      ,--'  `-.");
                            System.out.println("     `-.    `-/ \\'  |   _,'         `.");
                            System.out.println("        `-._ /      `--'/             \\");
                            System.out.println("-hou-      ,'           |              \\");
                            System.out.println("          /             |               \\");
                            System.out.println("       ,-'              |               /");
                            System.out.println("      /                 |             -'");
                            puntuacion -= 1.5;
                        }
                        break;
                        //Mejorar menú de record, es mejor opción leer del fichero
                    case 4:
                        System.out.println("Menú de Records");
                        for (int i = 0; i < e; i++) {
                            System.out.println(jugadores[i].toString());
                        }
                        break;
                }
            }
            System.out.println("------------------------------------------------");
            System.out.println("¡Premio!, has acertado, has sacado un " + puntuacion);
            System.out.println("------------------------------------------------");
            System.out.println("------------------------------------------------");
            System.out.println("El personaje de la Máquina es: " + simpson[aux1].toString());
            System.out.println("------------------------------------------------");
            System.out.println("Pulse '1' para continuar otra partida o '0' para finalizar todo el juego");
            aux = sc.nextInt();
            jugadores[e].setPuntuacion(puntuacion);
            e++;
        } while (aux != 0);

        //Ordenar el ranking de los jugadores de manera descendiente según sus puntuaciones
        Arrays.sort(jugadores, new Comparator<Players>() {
        @Override
        public int compare(Players p1, Players p2) {
            return Double.compare(p2.getPuntuacion(), p1.getPuntuacion());
        }
        });
        /*
         for (Players jugador : jugadores) {
        System.out.println(jugador.toString());
    }*/
        System.out.println("\tTop Ranking:\n\n");
        for (int i = 0; i < e; i++) {
            System.out.println("\t\t"+jugadores[i].getIniciales() + " tiene " + jugadores[i].getPuntuacion() + " Pts");
        }
        
        //Ficheros
        FileWriter fichero = null;
        PrintWriter pw = null;

    try{    
        fichero = new FileWriter("FullRankin.txt");
        pw = new PrintWriter(fichero);

            for (int i = 0; i < e; i++) {
                pw.println(i+1+":\t"+jugadores[i].getIniciales() + " tiene " + jugadores[i].getPuntuacion() + " Pts");
            }
        } catch (IOException a){
            System.out.println(a);
        }
        finally
    {
        pw.close();
        fichero.close();
    }
    }
}
