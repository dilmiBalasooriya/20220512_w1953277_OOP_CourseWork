
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shoppingplatform;

import javax.swing.*;
import java.util.Scanner;

public class ShoppingPlatform {

    public static void main(String[] args) {
        System.out.println("************ Welcome to the Westminster Shopping Manager ************");
        systemManager();
    }

    private static void customer(WestminsterShoppingManager westminsterShoppingManager) {

        SwingUtilities.invokeLater(() -> {
            ShoppingGUI shoppingGUI = new ShoppingGUI(westminsterShoppingManager);
            shoppingGUI.setVisible(true);
            });


    }

    private static void systemManager() {
        WestminsterShoppingManager shoppingManager =new WestminsterShoppingManager();
        Scanner input=new Scanner(System.in);
        int option=1;
        ( shoppingManager).readFromFile(); //printing the menu
        while (option !=0){
            System.out.println("\n==========================================");
            System.out.println("Please Select an option from the list: ");
            System.out.println("1) Add a new Product");
            System.out.println("2) Delete a Product");
            System.out.println("3) Print the list of products");
            System.out.println("4) Save to file ");
            System.out.println("5) User Interface");
            System.out.println("0) Quit ");
            System.out.println("=============================================");
            do{ //option validation
                System.out.print("Enter an option: ");
                if (input.hasNextInt()){
                    option= input.nextInt();
                    if (option<6 && option>-1){
                        break;
                    }
                }input.nextLine();
                System.out.println("Invalid input.Enter a valid option");
            }while (true);
            switch (option) {
                case 1 -> shoppingManager.addProductToSystem();
                case 2 -> shoppingManager.removeProductFromSystem();
                case 3 -> shoppingManager.printProductListInSystem();
                case 4 -> shoppingManager.saveToFile();
                case 5 -> customer(shoppingManager);
            }
        }
    }
}
