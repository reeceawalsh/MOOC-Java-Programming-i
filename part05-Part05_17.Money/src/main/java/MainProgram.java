
public class MainProgram {

    public static void main(String[] args) {
        Money a = new Money(10, 0);
        Money b = new Money(7, 40);

        Money c = a.minus(b);

        System.out.println(c);  // 6.50e
        System.out.println(c.euros());
        }
}
