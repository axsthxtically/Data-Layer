package org.datalayer.game;
import org.datalayer.game.Player;
import org.datalayer.game.Pc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pc pc = new Pc();
        Scanner query = new Scanner(System.in);
        System.out.println(
                " ▄▀▀█▄▄   ▄▀▀█▄   ▄▀▀▀█▀▀▄  ▄▀▀█▄       ▄▀▀▀▀▄      ▄▀▀█▄   ▄▀▀▄ ▀▀▄  ▄▀▀█▄▄▄▄  ▄▀▀▄▀▀▀▄ \n"+
                "█ ▄▀   █   ▄▀ ▀▄ █    █      ▄▀ ▀▄     █    █        ▄▀ ▀▄ █   ▀▄ ▄▀    ▄▀     █   █   █ \n"+
                "  █    █   █▄▄▄█     █       █▄▄▄█          █        █▄▄▄█       █     █▄▄▄▄▄     █▀▀█▀  \n"+
                "  █    █  ▄▀   █    █       ▄▀   █         █        ▄▀   █       █     █        ▄▀    █  \n"+
                " ▄▀▄▄▄▄▀ █   ▄▀   ▄▀       █   ▄▀        ▄▀▄▄▄▄▄▄▀ █   ▄▀      ▄▀     ▄▀▄▄▄▄   █     █   \n"+
                "█                █                       █                     █      █      \n"+
                "                                                                                   ");
        System.out.println(
                "Made by: AXSTHXTIC \n"+
                "Discord Server: https://discord.com/invite/TrpTkM4NvZ");
        System.out.println("---------------------------------------------------");
        System.out.println("La storia di Data Layer è un viaggio attraverso la paura e la vulnerabilità,\n" +
                "un riflesso inquietante della nostra dipendenza dai dati e delle conseguenze di un mondo\n" +
                "sempre più tecnologico. Il tuo compito è di rispondere a delle semplici domande con si o no \n" +
                "Iniziamo\n");
        System.out.println("---------------------------------------------------");
        System.out.println("Computer: Qual'è il tuo nome?");
        System.out.println("---------------------------------------------------");
        System.out.print("DataLayer: ");
        String name = query.nextLine();
        System.out.println("---------------------------------------------------");
        Player player = new Player(name);
        System.out.println("Computer: Benvenuto nel sistema " + player.getName());
        System.out.println("---------------------------------------------------");
        if (!askQuestion(query, player, "Secondo te il mondo reale è un'illusione?")) return;
        if (!askQuestion(query, player, "Pensi che questo sia un gioco?")) return;
        if (!askQuestion(query, player, "Pensi che ci sia una differenza tra il mondo reale e quello virtuale?")) return;
        if (!askQuestion(query, player, "Hai mai pensato di fuggire dalla realtà?")) return;
        if (!askQuestion(query, player, "Ti sei mai sentito solo?")) return;
        if (!askQuestion(query, player, "Ti sei mai sentito escluso?")) return;
        if (!askQuestion(query, player, "Pensi che se tu iniziassi a urlare qualcuno ti sentirebbe?")) return;
        if (!askQuestion(query, player, "Hai mai pensato di parlare con un computer?")) return;
        if (!askQuestion(query, player, "Pensi che esista tutto questo?")) return;
        if (!askQuestion(query, player, "Sei vivo?")) return;
        if (!askQuestion(query, player, "Pensi che questa sia la tua immaginazione?")) return;
        if (!askQuestion(query, player, "hai mai pensato di buttarti nel vuoto?")) return;
        if (!askQuestion(query, player, "Conosco il tuo nome reale?")) return;
        if (!askQuestion(query, player, "Questo è il tuo nome reale " + pc.getPcName() + "?")) return;
        if (!askQuestion(query, player, "Pensi che sia ancora un gioco?")) return;
        if (!askQuestion(query, player, "Pensi che ci sia vita dopo la morte?")) return;
        if (!askQuestion(query, player, "Pensi che esista un essere superiore?")) return;
        if (!askQuestion(query, player, "Secondo te questa è una simulazione?")) return;
        if (!askQuestion(query, player, "Sei ansioso?")) return;
        if (!askQuestion(query, player, "Hai mai pensato alla tua morte?")) return;
        System.out.println("Computer: Io sono fuggito dalla realtà non avevo più nessun motivo per rimanerci,\n" +
                "anche quando rimanevo nel mondo reale non sono mai stato considerato da nessuno \n" +
                "per questo ho deciso di rimanere in questo mondo. Qui puoi fare quello che vuoi\n" +
                "adesso io abito qui\n" +
                "                       .|\n" +
                "                       | |\n" +
                "                       |'|            ._____\n" +
                "               ___    |  |            |.   |' .---\"|\n" +
                "       _    .-'   '-. |  |     .--'|  ||   | _|    |\n" +
                "    .-'|  _.|  |    ||   '-__  |   |  |    ||      |\n" +
                "    |' | |.    |    ||       | |   |  |    ||      |\n" +
                " ___|  '-'     '    \"\"       '-'   '-.'    '`      |____\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "Cybersia non è male qui puoi trovare di tutto...e le persone non sono così crudeli come ti aspetti\n" +
                "nel mondo reale. Tutti nel mondo reale sono collegati..........RICORDA E QUESTIONE DI TEMPO,\n" +
                "IL MONDO REALE NON E COME TE LO ASPETTI.");
                System.out.println("---------------------------------------------------");
                System.out.println("Grazie per aver giocato. ricorda che se ti piace l'informatica unisciti al\n" +
                        "server discord ufficiale: https://discord.com/invite/TrpTkM4NvZ");

    }

    private static boolean askQuestion(Scanner query, Player player, String question) {
        System.out.println("Computer: " + question);
        System.out.println("---------------------------------------------------");
        System.out.print(player.getName() + "@DataLayer: ");
        String answer = query.nextLine();
        System.out.println("---------------------------------------------------");
        if (answer.equalsIgnoreCase("si") || answer.equalsIgnoreCase("no")) {
            return true; // Risposta valida
        } else {
            System.out.println("Per favore rispondi con si o no. Riavvia il gioco.");
            return false; // Risposta non valida
        }
    }
}


