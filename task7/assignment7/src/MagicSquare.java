import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquare {
    public static void main(String[] args) throws IOException {
        FileReader fileLuna = new FileReader("./src/Luna.txt");
        FileReader fileMercury = new FileReader("./src/Mercury.txt");
        System.out.println("Luna "+MagicSquareJudge(fileLuna));
        System.out.println("Mercury "+MagicSquareJudge(fileMercury));
    }

    public static String MagicSquareJudge(FileReader file) throws IOException {

        BufferedReader buffer = new BufferedReader(file);

        String line;
        int preSum = -1;
        while ((line = buffer.readLine()) != null) {
            if (!line.trim().isEmpty()) {
                int sum = 0;
                String[] row = {};
                row = line.split("\t");

                for (String character : row) {
                    if (character.isEmpty()) continue;
                    sum = sum + Integer.parseInt(character.trim());
                }
                if (preSum == -1) {
                    preSum = sum;
                } else if (preSum != sum) return "isn't MagicSquare.";
            }
        }
        buffer.close();
        return "is MagicSquare.";
    }
}
