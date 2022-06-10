import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataBase {
    private ArrayList <Queen> queens = new ArrayList<>();
    private Queen king;

    public static final DataBase instance = new DataBase();


    private DataBase() {

        try (BufferedReader br = new BufferedReader(new FileReader("szachownica.txt"))) {
            String line;
            for (char i = 'a'; i <'i'; i++) {
                line = br.readLine();
                for (int j = 0; j <8; j++) {
                    if(line.charAt(j)=='Q'){
                        Queen queen = new Queen(i, j+1);
                        this.queens.add(queen);
                    } else if (line.charAt(j)=='K'){
                        this.king = new Queen(i, j+1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    public static DataBase getInstance(){ return instance; }

    public ArrayList<Queen> getQueens() {
        return queens;
    }

    public Queen getKing() {
        return king;
    }
}
