import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Queen> queens = new ArrayList<>();
        queens.add(new Queen('a', 3));
        queens.add(new Queen('h', 2));
        queens.add(new Queen('c', 7));
        queens.add(new Queen('f', 4));

        char kingL = 'e';
        int kingN = 5;
        String check = "";

        for (Queen queen : queens) {
            if((queen.getLetter()==kingL)||(queen.getNumber()==kingN) ||
            (Math.abs(queen.getLetter()-kingL))==(Math.abs(queen.getNumber()-kingN))) {
                check = "Y";
            }
        }
        System.out.println(check);
    }
}
