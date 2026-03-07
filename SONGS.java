import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int N = sc.nextInt();
            int X = sc.nextInt();

            int totalSongs = N / X;
            int countC = totalSongs / 3;

            System.out.println(countC);
        }
    }
}