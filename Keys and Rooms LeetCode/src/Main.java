import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public boolean canVisitAllRoomsDFS(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        Stack<Integer> stack = new Stack();
        stack.push(0);

        //At the beginning, we have a todo list "stack" of keys to use.
        //'seen' represents at some point we have entered this room.
        while (!stack.isEmpty()) { // While we have keys...
            int node = stack.pop(); // Get the next key 'node'
            for (int nei: rooms.get(node)) {// For every key in room # 'node'...
                if (!seen[nei]) { // ...that hasn't been used yet
                    seen[nei] = true; // mark that we've entered the room
                    stack.push(nei); // add the key to the todo list
                }
            }
        }

        for (boolean v: seen) { // if any room hasn't been visited, return false
            if (!v) return false;
        }

        return true;
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[rooms.size()];
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int item : rooms.get(temp)) {
                if (!visited[item]) {
                    queue.add(item);
                    visited[item] = true;
                }
            }
        }

        for (boolean item : visited) {
            if (!item) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        List<List<Integer>> rooms = new LinkedList<>();

        List<Integer> room0 = new LinkedList<>();
        room0.add(1);
        room0.add(3);
        rooms.add(room0);
        List<Integer> room1 = new LinkedList<>();
        room1.add(3);
        room1.add(0);
        room1.add(1);
        rooms.add(room1);
        List<Integer> room2 = new LinkedList<>();
        room2.add(2);
        rooms.add(room2);
        List<Integer> room3 = new LinkedList<>();
        room3.add(0);
        rooms.add(room3);

        System.out.println(canVisitAllRooms(rooms));
    }
}