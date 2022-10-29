public class Main {

    public static int minJumps(int[] arr){
        int[] jump = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            jump[i] = Integer.MAX_VALUE - 1;
        }
        jump[0] = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] + j >= i) {
                    if (jump[j] + 1 < jump[i]) {
                        jump[i] = jump[j] + 1;
                    }
                }
            }
        }

        return jump[jump.length - 1] == Integer.MAX_VALUE - 1 ? -1 : jump[jump.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        System.out.println(minJumps(arr));
    }
}