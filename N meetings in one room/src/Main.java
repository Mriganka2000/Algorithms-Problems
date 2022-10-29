import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Meeting {
    public int start;
    public int end;
    public int pos;

    public Meeting(int start, int end, int pos) {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

class Comparison implements Comparator<Meeting> {

    @Override
    public int compare(Meeting a, Meeting b) {
        if (a.end < b.end) {
            return -1;
        }
        else if (a.end > b.end) {
            return 1;
        }
        return 0;
    }
}

public class Main {

    public static int maxMeetings(int[] start, int[] end, int n) {
        ArrayList<Meeting> meet = new ArrayList<>();
        int count = 0;

        int timeLimit = 0;
        Comparison comparison = new Comparison();

        for (int i = 0; i < start.length; i++) {
            meet.add(new Meeting(start[i], end[i], i));
        }

        Collections.sort(meet, comparison);
        timeLimit = meet.get(0).end;
        count++;

        for (int i = 1; i < meet.size(); i++) {
            if (meet.get(i).start > timeLimit) {
                count++;
                timeLimit = meet.get(i).end;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };

        System.out.println(maxMeetings(start, end, start.length));
    }
}