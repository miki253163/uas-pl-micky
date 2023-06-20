import java.util.ArrayList;
import java.util.List;

public class soal06 {
    public static void main(String[] args) {
        String[] texts = {"nur", "adi", "ihsan", "zaki", "micky"};
        String searchTerm = "nur";

        List<Integer> indices = searchText(texts, searchTerm);

        if (indices.isEmpty()) {
            System.out.println("Teks tidak ditemukan dalam array.");
        } else {
            System.out.println("teks  ditemukan di indeks :");
            for (int index : indices) {
                System.out.println(index);
            }
        }
    }

    public static List<Integer> searchText(String[] texts, String searchTerm) {
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < texts.length; i++) {
            String text = texts[i];

            if (text.equals(searchTerm)) {
                indices.add(i);
            }
        }

        return indices;
    }
}