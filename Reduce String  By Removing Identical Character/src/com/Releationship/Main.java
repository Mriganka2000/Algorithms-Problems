package com.Releationship;

import java.util.Scanner;
import java.util.Stack;

class Pair {
    public char character;
    public int count;
    public Pair(char character, int count) {
        this.character = character;
        this.count = count;
    }
}

public class Main {

    public static String reduceString(String word, int k) {
        if (k == 1) {
            return "";
        }

        Stack<Pair> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            if (stack.size() == 0) {
                stack.push(new Pair(word.charAt(i), 1));
            }
            else if (stack.peek().character == word.charAt(i)) {
                Pair p = stack.peek();
                stack.pop();
                p.count += 1;
                if (p.count == k) {
                    continue;
                }
                else {
                    stack.push(p);
                }
            }
            else {
                stack.push(new Pair(word.charAt(i), 1));
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            Pair p = stack.peek();
            stack.pop();
            sb.append(p.character);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int k = scanner.nextInt();
        System.out.println(reduceString(word, k));
    }
}
