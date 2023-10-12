
public class PrimesMod {
    public static void main(String[] args) {
        int n = 70;

        Loop: 
        for (int i = 2; i <= n; i++) {
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue Loop; 
                }
            }

            System.out.println(i);
        }
    }
}
