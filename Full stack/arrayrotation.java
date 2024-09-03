import java.util.ArrayList;
import java.util.Scanner;
public class arrayrotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list:");
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        for (int i = 0; i <= 5; i++) {
            ArrayList<Integer> rotatedList = rotate(list, i);
            System.out.println("Rotation " + i + ": " + rotatedList);
        }
    }
    public static ArrayList<Integer> rotate(ArrayList<Integer> list, int positions) {
        positions = positions % list.size();
        ArrayList<Integer> rotatedList = new ArrayList<>();
        for (int i = list.size() - positions; i < list.size(); i++) {
            rotatedList.add(list.get(i));
        }
        for (int i = 0; i < list.size() - positions; i++) {
            rotatedList.add(list.get(i));
        }
        return rotatedList;
    }
}
