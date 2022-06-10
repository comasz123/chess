import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        char kingL = DataBase.getInstance().getKing().getLetter();
        int kingN = DataBase.getInstance().getKing().getNumber();
        String check = "";

        for (Queen queen : DataBase.getInstance().getQueens()) {
            if((queen.getLetter()==kingL)||(queen.getNumber()==kingN) ||
            (Math.abs(queen.getLetter()-kingL))==(Math.abs(queen.getNumber()-kingN))) {
                check = "Y";
            }
        }
        System.out.println(check);
    }
}
