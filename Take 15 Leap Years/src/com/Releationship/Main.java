package com.Releationship;

// import java.util.Scanner;

// public class Main {

//     public String toUpper(String s) {
//         char[] arr = s.toCharArray();
//         for (int i = 0; i < arr.length; i++) {
//             if((int)arr[i] >= 97 && (int)arr[i] <= 126) {
//                 arr[i] = (char)(arr[i] - 32);
//             }
//         }
//         StringBuilder sb = new StringBuilder();
//         for (char item : arr) {
//             sb.append(item);
//         }
//         return sb.toString();
//     }

// 	public static void main(String[] args) {
// 	    Main m = new Main();
// 	    Scanner sc = new Scanner(System.in);
// 	    System.out.println("Enter the String :- ");
// 	    String str = sc.nextLine();
// 		System.out.println(m.toUpper(str));
// 	}
// }

// class Student{
//     private int[] mark;
//     private char[] grade;

//     Student(int[] marks) {
//         mark = new int[marks.length];
//         for (int i = 0; i < marks.length; i++) {
//             this.mark[i] = marks[i];
//         }
//         grade = new char[marks.length];
//     }

//     public void findGrade() {
//         for (int i = 0; i < mark.length; i++) {
//             if (mark[i] >= 92) {
//                 grade[i] = 'E';
//             }
//             else if (mark[i] >= 85 && mark[i] < 92) {
//                 grade[i] = 'A';
//             }
//             else if (mark[i] >= 70 && mark[i] < 85) {
//                 grade[i] = 'B';
//             }
//             else if (mark[i] >= 65 && mark[i] < 70) {
//                 grade[i] = 'C';
//             }
//             else if (mark[i] < 65) {
//                 grade[i] = 'D';
//             }
//         }
//     }

//     public char[] getGrade() {
//         return grade;
//     }
// }

// public class Main{
// 	public static void main(String[] args) {
// 		int[] marks = { 79, 87, 97, 65, 78, 99, 66 };
// 		Student student = new Student(marks);
// 		student.findGrade();
//         System.out.println("Grades corresponding to the marks are : ");
// 		char[] grades = student.getGrade();
// 		for (int index = 0; index < grades.length; index++) {
// 			System.out.print(grades[index] + " ");
// 		}
// 	}
// }

// public class Main{

//     public static String moveSpecialCharacters(String str){
// 		char[] arr = str.toCharArray();
// 		int count = 0;
// 		for (int i = 0; i < arr.length; i++) {
// 		    if ((int)arr[i] >= 65 && (int)arr[i] <= 91 || (int)arr[i] >= 97 && (int)arr[i] <= 126) {
// 		        count ++;
// 		    }
// 		}
// 		char[] special = new char[arr.length - count];
// 		char[] normal = new char[count];
// 		int n = 0, m = 0;
// 		for (int i = 0; i < arr.length; i++) {
// 		    if ((int)arr[i] >= 65 && (int)arr[i] <= 91 || (int)arr[i] >= 97 && (int)arr[i] <= 126) {
// 		        normal[n++] = arr[i];
// 		    }
// 		    else {
// 		        special[m++] = arr[i];
// 		    }
// 		}

// 		StringBuilder sb = new StringBuilder();

// 		for (char item : normal) {
// 		    sb.append(item);
// 		}
// 		for (char item : special) {
// 		    sb.append(item);
// 		}

//         return sb.toString();
// 	}

// 	public static void main(String args[]){
// 	    String str = "He@#$llo!*&";
// 	    System.out.println(moveSpecialCharacters(str));
// 	}

// }

// public class Main{
//     public static boolean checkPalindrome(String str) {
// 	    char[] arr = str.toCharArray();
// 	    for (int i = 0; i < arr.length; i++) {
// 	        if(arr[i] != arr[arr.length - 1 - i]) {
// 	            return false;
// 	        }
// 	    }
//         return true;
// 	}

// 	public static void main(String args[]) {
// 		String str = "abcd";
// 		if(checkPalindrome(str))
// 			System.out.println("The string is a palindrome!");
// 		else
// 			System.out.println("The string is not a palindrome!");
// 	}
// }

// import java.util.Stack;
// import java.util.Scanner;

// public class Main {
//     public static String reverseEachWord(String str){
// 	    Stack<Character> stack = new Stack<>();
// 	    char[] arr = str.toCharArray();
// 	    StringBuilder sb = new StringBuilder();

// 	    for (int i = 0; i < arr.length; i++) {
// 	        if(arr[i] != ' ') {
// 	            stack.push(arr[i]);
// 	        }
// 	        else {
// 	            while (!stack.isEmpty()) {
// 	                sb.append(stack.pop());
// 	            }
// 	            sb.append(' ');
// 	        }
// 	    }

// 	    while (!stack.isEmpty()) {
// 	        sb.append(stack.pop());
// 	    }

// 	    return sb.toString();
// 	}

// 	public static void main(String args[]){
// 	    Scanner sc = new Scanner(System.in);
// 	    System.out.print("Enter the text :- ");
// 	    String str = sc.nextLine();
// 	    System.out.println(reverseEachWord(str));
// 	}
// }

// import java.util.HashMap;

// public class Main {

// 	public static int findHighestOccurrence(String str){
// 		HashMap<Character, Integer> hashmap = new HashMap<>();
// 		char[] arr = str.toCharArray();

// 		for (int i = 0; i < arr.length; i++) {
// 		    if (hashmap.containsKey(arr[i])) {
// 		        int val = hashmap.get(arr[i]);
// 		        val++;
// 		        hashmap.put(arr[i], val);
// 		    }
// 		    else {
// 		        hashmap.put(arr[i], 1);
// 		    }
// 		}
// 		int max = 0;
// 		for (char item : hashmap.keySet()) {
// 		    if (hashmap.get(item) > max) {
// 		        max = hashmap.get(item);
// 		    }
// 		}
// 		return max;
// 	}

// 	public static void main(String args[]){
// 	    String str = "success";
// 	    System.out.println(findHighestOccurrence(str));
// 	}
// }

// public class Main{
//     public static boolean contains(char arr[], char c) {
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i] == c) {
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static String removeDuplicatesandSpaces(String str){
//         char[] arr = new char[str.length()];
//         int n = 0;
//         for (int i = 0; i < str.length(); i++) {
//             if (!contains(arr, str.charAt(i)) && str.charAt(i) != ' ') {
//                 arr[n++] = str.charAt(i);
//             }
//         }
//         StringBuilder sb = new StringBuilder();
//         for (char item : arr) {
//             sb.append(item);
//         }
//         return sb.toString();
// 	}

// 	public static void main(String args[]){
// 	    String str = "geeks for geeks";
// 	    System.out.println(removeDuplicatesandSpaces(str));
// 	}
// }

// public class Main {

//     public static double[] findDetails(double[] salary) {
//         double[] result = new double[3];
//         double sum = 0;
//         for (double item : salary) {
//             sum += item;
//         }
//         result[0] = sum / salary.length;
//         result[1] = 0.0;
//         result[2] = 0.0;
//         for (double item : salary) {
//             if (item > result[0]) {
//                 result[1] ++;
//             }
//             else if (item < result[0]) {
//                 result[2] ++;
//             }
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
//         double[] details = findDetails(salary);

//         System.out.println("Average salary: "+ details[0]);
//         System.out.println("Number of salaries greater than the average salary: "+ details[1]);
//         System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
//     }
// }

//import java.util.Scanner;
//
//public class Main {
//
//    public static boolean check(int year) {
//        boolean leap = false;
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0)
//                    leap = true;
//                else
//                    leap = false;
//            }
//            else
//                leap = true;
//        }
//        else
//            leap = false;
//
//        return leap;
//    }
//
//    public static int[] findLeapYears(int year){
//        int[] result = new int[15];
//        int n = 0;
//        while(n < 15) {
//            if (check(year)) {
//                result[n++] = year;
//            }
//            year += 1;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the start year :- ");
//        int year = sc.nextInt();
//        int[] leapYears;
//        leapYears=findLeapYears(year);
//        for ( int index = 0; index<leapYears.length; index++ ) {
//            System.out.println(leapYears[index]);
//        }
//    }
//}

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            int[] b = new int[1001];
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n-1; i++) {
                b[arr[i]]++;
                if(arr[i] == arr[i+1]) {
                    i++;
                }
            }

            int max = b[0], x = 0;
            for (int i = 1; i < 1001; i++) {
                if (b[i] > max) {
                    max = b[i];
                    x = i;
                }
            }

            System.out.println();
            System.out.println(x);

            t--;
        }
    }
}

// public class Main
// {
// 	public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while (t != 0) {
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int c = sc.nextInt();
//             int x = sc.nextInt();
//             int y = sc.nextInt();

//             if ((a+b+c) != (x+y)) {
//                 System.out.println("NO");
//             }
//             else {
//                 if(x < Math.min(a, Math.min(b, c)) || y < Math.min(a, Math.min(b, c))) {
//                     System.out.println("NO");
//                 }
//                 else {
//                     System.out.println("YES");
//                 }
//             }

//             t--;
//         }
// 	}
// }