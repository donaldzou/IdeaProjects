package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	String home, guest;
	int homescore, guestscore, add, minus, menu, menu2;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Plese enter the name of home team:");
	home = keyboard.nextLine();
	System.out.print("Plese enter the name of guest team:");
	guest = keyboard.nextLine();
	homescore = 0;
	guestscore = 0;
	System.out.println("Game Start!");
	System.out.print(""+home+":");
	System.out.println(homescore);
	System.out.print(""+guest+":");
	System.out.println(guestscore);
	System.out.println("");
	System.out.println("Add Score press 1, minus score press 2");
	System.out.print("Your input: ");
	menu = keyboard.nextInt();
	for (int i = 1; i < 100000; i++)
	    if(menu == 1) {
                System.out.print("Home - 1 or Guest - 2?");
                menu2 = keyboard.nextInt();
                if (menu2 == 1) {
                    System.out.print("Adding score: ");
                    add = keyboard.nextInt();
                    homescore = homescore + add;
                    System.out.println("------");
                    System.out.println("Score updated!");
                    System.out.print(""+home+":");
                    System.out.println(homescore);
                    System.out.print(""+guest+":");
                    System.out.println(guestscore);
                    System.out.println("");
                    add = 0;
                    System.out.println("Add Score press 1, minus score press 2");
                    System.out.print("Your input: ");
                    menu = keyboard.nextInt();
                } else {
                    System.out.print("Adding score: ");
                    add = keyboard.nextInt();
                    guestscore = guestscore + add;
                    System.out.println("------");
                    System.out.println("Score updated!");
                    System.out.print(""+home+":");
                    System.out.println(homescore);
                    System.out.print(""+guest+":");
                    System.out.println(guestscore);
                    System.out.println("");
                    add = 0;
                    System.out.println("Add Score press 1, minus score press 2");
                    System.out.print("Your input: ");
                    menu = keyboard.nextInt();
                }

            }
        else{
                System.out.print("Home - 1 or Guest - 2?");
                menu2 = keyboard.nextInt();
                if (menu2 == 1) {
                    System.out.print("Minus score: ");
                    minus = keyboard.nextInt();
                    homescore = homescore - minus;
                    System.out.println("------");
                    System.out.println("Score updated!");
                    System.out.print(""+home+":");
                    System.out.println(homescore);
                    System.out.print(""+guest+":");
                    System.out.println(guestscore);
                    System.out.println("");
                    minus = 0;
                    System.out.println("Add Score press 1, minus score press 2");
                    System.out.print("Your input: ");
                    menu = keyboard.nextInt();
                } else {
                    System.out.print("Minus score: ");
                    add = keyboard.nextInt();
                    guestscore = guestscore - add;
                    System.out.println("------");
                    System.out.println("Score updated!");
                    System.out.print(""+home+":");
                    System.out.println(homescore);
                    System.out.print(""+guest+":");
                    System.out.println(guestscore);
                    System.out.println("");
                    minus = 0;
                    System.out.println("Add Score press 1, minus score press 2");
                    System.out.print("Your input: ");
                    menu = keyboard.nextInt();
                }

            }
        }

    }

