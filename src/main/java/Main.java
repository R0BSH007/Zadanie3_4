public class Main {
    public static void main(String[] args) {
        int n = 5; 
        long silnia = 1;

       
        for (int i = 1; i <= n; i++) {
            silnia = silnia * i;
        }

      
        System.out.println("Silnia z " + n + " (" + n + "!) wynosi: " + silnia);
    }
}