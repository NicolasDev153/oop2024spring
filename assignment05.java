public class assignment05 {
    public static void main(String[] args) {
        int lvl = 4;
        
        for (int i = 1; i <= lvl; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
