import java.util.Scanner;
import java.util.Stack;
public class CekPalindromStack{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukan kata atau kalimat :");
        String teksAsli=input.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < teksAsli.length(); i++) {
            stack.push(teksAsli.charAt(i));
        }

        StringBuilder teksTerbalik= new StringBuilder();
        while (!stack.isEmpty()) {
            teksTerbalik.append(stack.pop()); 
        }

        String hasilBalik = teksTerbalik.toString();

        System.out.println("\n---HASIL---");
        System.out.println("Teks Asli   :" + teksAsli);
        System.out.println("Teks Terbalik   : + hasilBalik");

        if (teksAsli.equalsIgnoreCase(hasilBalik)) {
            System.out.println("Status   : PALINDROM");
        }else {
            System.out.println("Status   : BUKAN PALINDROM");
        }

        input.close();

    }

}