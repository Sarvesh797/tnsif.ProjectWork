import java.util.ArrayList;
public class arrareverse{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        for (int i = 0; i < arr.size(); i++) {
            ArrayList<Integer> rotatedList = rotate(arr, i);
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

