public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.subtract();
        calc.multiply(); 
        calc.divide(); 
    }
    public void subtract() {
        System.out.println(30 - 40);
    }
    public void multiply() {
        System.out.println(10 * 20);
    }
    public void divide() {
        System.out.println(40 / 20);
    }
}
