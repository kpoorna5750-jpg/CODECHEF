 import java.util.Scanner;

class Palindrome1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of test cases:");
        int t = sc.nextInt();

        for(int j = 0; j < t; j++){
            String s1 = sc.next();
            String rev = "";

            for(int i = s1.length() - 1; i >= 0; i--){
                rev += s1.charAt(i);
            }

            if(rev.equals(s1)){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not a palindrome");
            }
        }
    }
}