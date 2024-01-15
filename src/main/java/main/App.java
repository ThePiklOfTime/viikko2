package main;

import java.util.Scanner;
//katsoin viikon 2 lähdekoodia selvittääkseni javan syntaxia
public class App 
{
    public static void main( String[] args )
    {
        Boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        var hedgehog = new Hedgehog();

        while (!exit) {
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");
            
            if(scanner.hasNext()){
                int i = Integer.parseInt(scanner.nextLine());
            
            switch (i) {
                case 1:
                    System.out.println("Mitä siili sanoo:");
                    String sanominen = scanner.nextLine();
                    hedgehog.Speak(sanominen);
                    break;
                case 2:
                    System.out.println("Anna siilin nimi:");
                    String name = scanner.nextLine();
                    System.out.println("Anna siilin ikä:");
                    int age = Integer.parseInt(scanner.nextLine());
                    hedgehog = new Hedgehog(name, age);
                    break;
                case 3:
                    System.out.println("Kuinka monta kierrosta?");
                    int howManyTurns = Integer.parseInt(scanner.nextLine());
                    hedgehog.run(howManyTurns); 
                
                
                case 0:
                    exit = true;
                    break;
                
                default:
                    System.out.println("Syöte oli väärä");
                    break;
            
            
                }
        }
    }
    System.out.println("Kiitos ohjelman käytöstä.");
    scanner.close();
    }
}
