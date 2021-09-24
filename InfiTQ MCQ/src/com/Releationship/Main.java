package com.Releationship;

import java.util.*;

public class Main
{
// 	public static void main(String[] args) {
// 		List<String> list = new ArrayList<>();
// 		list.add("I");
// 		list.add("love");
// 		list.add("Java");
// 		list.add("language");
// 		Iterator<String> iter = list.iterator();
// 		while(iter.hasNext()) {
// 		    System.out.println(iter.next().toString() + " ");
// 		}
// 		System.out.println();
// 	}

// 	public static void main(String[] args) {
//         int[] tempList = {1, -1, -2};
//         int[] numList = {-2, -1, 1};
//         int length = numList.length;
//         for(int value:tempList) {
//             int tempValue = value;
//             if(value < 0) {
//                 tempValue = length - Math.abs(value);
//             }
//             if(value == tempList[tempValue]) {
//                 if(value < 0) {
//                     numList[length - tempValue] = value;
//                 }
//                 else {
//                     numList[tempValue] = value;
//                 }
//             }
//             else {
//                 numList[0] = value;
//             }
//         }

//         for(int item:tempList) {
//             System.out.println(item);
//         }

//         System.out.println();

//         for(int item:numList) {
//             System.out.println(item);
//         }
// 	}

    // public void checkException(int num1, int num2) {
    //     int[] intArr = {1, 2, 3};
    //     String str = null;
    //     System.out.println("Before Exception");
    //     try {
    //         str.charAt(0);
    //         System.out.println(num1 / num1);
    //         System.out.println("No Exception");
    //     }
    //     catch(ArithmeticException e) {
    //         System.out.println("ArithmeticException handler");
    //     }
    //     catch(NullPointerException e) {
    //         System.out.println("NullPointerException handler");
    //     }
    //     catch(Exception e) {
    //         System.out.println("Exception handler");
    //     }
    //     finally {
    //         System.out.println("Finally Block");
    //     }
    //     System.out.println("After handler Exception");
    // }

// 	public static void main(String[] args) {
//         Main m = new Main();
//         try {
//             m.checkException(2, 0);
//         }
//         catch(ArithmeticException e) {
//             System.out.println("ArithmeticException handler in main");
//         }
//         System.out.println("After main");
// 	}

//    public static ArrayDeque<String> compareString(Queue inQueue, String isString) {
//        ArrayDeque<String> outStack = new ArrayDeque<>();
//        String tempString = "Empty";
//        while (!inQueue.isEmpty()) {
//            if(!inQueue.dequeue())
//        }
//    }

    public static void main(String[] args) {
        int counter = 0;
        while(counter <= 7) {
            if(counter % 2 == 0) {
                counter += 1;
                continue;
            }
            else {
                counter += 1;
            }
            System.out.println(counter);
        }

        // int i = 0;
        // for(; i <= 3; i++) {
        //     if(i++ % 2 == 0) {
        //         System.out.println("i = " + i);
        //     }
        // }
        // System.out.println("after loop " + i);

        // int num1 = 0;
        // int num2 = 0;
        // for(int i = 0; i < 5; i++) {
        //     if((++num1 > 2) && (++num2 > 2)) {
        //         num1++;
        //     }
        // }
        // System.out.println(num1 + " " + num2);
    }
}

