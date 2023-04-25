package ObjectOrientedProgramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String message = input.nextLine();
        System.out.println("Enter 1 for this message to be Encrypted or 2 if you want it Decrypted: ");
        int choice = input.nextInt();
        int shift = 0;
        System.out.println("Enter shift key:");
        shift = input.nextInt();

        CaesarCipher cc = new CaesarCipher();

        if(choice == 1){
            System.out.println("Encrypted message is: " + cc.encrypt(message));
        }
        else if(choice == 2){
            System.out.println(cc.decrypt(message));
        }
        else{
            System.out.println("Invalid Input, Please Try Again!");
        }
    }
}