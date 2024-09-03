public class EB_Reading {

    public static void main(String[] args) {
        EB_Reading assessor = new EB_Reading();
        int consumedUnits = assessor.reading();
        assessor.calculate(consumedUnits);
    }
    public int reading() {
        int consumedUnits = 200;
        return consumedUnits;
    }
    public void calculate(int consumedUnits) {
        double payment;
        if (consumedUnits <= 100) {
            payment = consumedUnits * 1.5; 
        } else if (consumedUnits <= 200) {
            payment = 100 * 1.5 + (consumedUnits - 100) * 2.0;
        } else {
            payment = 100 * 1.5 + 100 * 2.0 + (consumedUnits - 200) * 3.0; 
        }
        System.out.println("Customer should pay: Rs. " + payment);
    }
}
