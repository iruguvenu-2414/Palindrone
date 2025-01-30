// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Palindrone {
   public Palindrone() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Welcome to the Palindrome Checker!");
      System.out.print("Enter a string: ");
      String var2 = var1.nextLine();
      String var3 = var2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      if (isPalindrome(var3)) {
         System.out.println("\"" + var2 + "\" is a palindrome!");
      } else {
         System.out.println("\"" + var2 + "\" is not a palindrome.");
      }

      var1.close();
   }

   public static boolean isPalindrome(String var0) {
      int var1 = 0;

      for(int var2 = var0.length() - 1; var1 < var2; --var2) {
         if (var0.charAt(var1) != var0.charAt(var2)) {
            return false;
         }

         ++var1;
      }

      return true;
   }
}
