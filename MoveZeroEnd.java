public class MoveZeroEnd
{
    public static void moveZeroEnd(int arr[]) {
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            } 
        } 
        
        while (count < arr.length) {
            arr[count++] = 0;
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        } 
    }
    
	public static void main(String[] args) {
	    int arr[] = {1, 0, 2, 0, 3, 0, 4, 5, 0};
	    moveZeroEnd(arr);
	}
}
