import java.util.*;

public class UseStack {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Stack<Integer> stackInt = new Stack<>();
        Stack<String> stackString = new Stack<>();
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random()*10);
            stackInt.push(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 10; i++) {
            arr[i] = stackInt.pop();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("###########################");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String stReverse = "";
        String st = scanner.nextLine();
        for (int i = 0; i < st.length(); i++) {
            stackString.push("" + st.charAt(i));
        }
        for (int i = 0; i < st.length(); i++) {
            stReverse += stackString.pop();
        }
        System.out.println(stReverse);
    }
}
