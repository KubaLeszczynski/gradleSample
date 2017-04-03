package pl.akademiakodu;

public class SimpleTest {
    public static void main(String[] args) {
        // Miłego kodzenia Oskar!
    }


    public int divise(int a, int b){
        if(b == 0) throw new ArithmeticException("Nie dziel przez 0");
        return a / b;
    }
}