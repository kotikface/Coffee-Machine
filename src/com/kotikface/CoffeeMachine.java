package com.kotikface;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int coffee = 120;
        int cups = 9;
        int money= 550;
        while (true){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String a = scanner.next();
            if("exit".equals(a))
                break;
            switch (a){
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String buyCoffee = scanner.next();
                    switch (buyCoffee){
                        case "1":
                            if(water-250>=0 && milk>=0 && coffee-16 >=0 && cups-1>=0){
                                System.out.println("I have enough resources, making you a coffee!");
                                water-=250;
                                coffee-=16;
                                cups-=1;
                                money+=4;
                            } else {
                                if(water-250<0)
                                    System.out.println("Sorry, not enough water!");
                                else if(coffee-16<0)
                                    System.out.println("Sorry, not enough coffee beans!");
                                else if(cups-1<0)
                                    System.out.println("Sorry, not enough disposable cups");
                            }
                            break;
                        case "2":
                            if(water-350>=0 && milk-75>=0 && coffee-20 >=0 && cups-1>=0){
                                System.out.println("I have enough resources, making you a coffee!");
                                water-=350;
                                milk-=75;
                                coffee-=20;
                                cups-=1;
                                money+=7;
                            } else {
                                if(water-350<0)
                                    System.out.println("Sorry, not enough water!");
                                else if(milk-75<0)
                                    System.out.println("Sorry, not enough milk!");
                                else if(coffee-20<0)
                                    System.out.println("Sorry, not enough coffee beans!");
                                else if(cups-1<0)
                                    System.out.println("Sorry, not enough disposable cups");
                            }

                            break;
                        case "3":

                            if(water-200>=0 && milk-100>=0 && coffee-12 >=0 && cups-1>=0){
                                System.out.println("I have enough resources, making you a coffee!");
                                water-=200;
                                milk-=100;
                                coffee-=12;
                                cups-=1;
                                money+=6;
                            } else {
                                if(water-200<0)
                                    System.out.println("Sorry, not enough water!");
                                else if(milk-100<0)
                                    System.out.println("Sorry, not enough milk!");
                                else if(coffee-12<0)
                                    System.out.println("Sorry, not enough coffee beans!");
                                else if(cups-1<0)
                                    System.out.println("Sorry, not enough disposable cups");
                            }

                            break;
                        case "back":
                            break;
                        default:
                            break;
                    }
                    break;
                case "fill":
                    water+=scanner.nextInt();
                    milk+=scanner.nextInt();
                    coffee+=scanner.nextInt();
                    cups+=scanner.nextInt();
                    break;
                case "take":
                    System.out.printf("I gave you $%d",money);
                    money=0;
                    break;
                case "remaining":
                    sysOut(water,milk,coffee,cups,money);
                default:
                    break;
            }
        }
    }
    private static  void sysOut(int water, int milk, int coffee, int cups, int money){
        System.out.println("The coffee machine has:");
        System.out.printf("%d of water\n",water);
        System.out.printf("%d of milk\n",milk);
        System.out.printf("%d of coffee beans\n",coffee);
        System.out.printf("%d of disposable cups\n",cups);
        System.out.printf("%d of money\n",money);
    }
}
