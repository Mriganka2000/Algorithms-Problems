import java.util.ArrayList;

public class Main {

    public static void rearrange(int[] arr, int n) {
        ArrayList<Integer> pve = new ArrayList<>();
        ArrayList<Integer> nve = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                nve.add(arr[i]);
            }
            else {
                pve.add(arr[i]);
            }
        }

        int i = 0, j = 0, k = 0;
        while (i < pve.size() && j < nve.size()) {
            arr[k++] = pve.get(i++);
            arr[k++] = nve.get(j++);
        }

        while (i < pve.size()) {
            arr[k++] = pve.get(i++);
        }
        while (j < nve.size()) {
            arr[k++] = nve.get(j++);
        }
    }

    public static void main(String[] args) {
        int N = 9;
        int[] arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        rearrange(arr, N);

        for (int item : arr) {
            System.out.println(item);
        }
    }
}