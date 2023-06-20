import java.util.ArrayList;
import java.util.List;

public class soal07 {
    public static void main(String[] args) {
        String[] texts = {"kipas", "pena", "laptop", "kabel", "botol",};

        List<Integer> indices = searchTextLength(texts, 5);

        if (indices.isEmpty()) {
            System.out.println("Teks dengan panjang 5 karakter tidak ditemukan dalam array.");
        } else {
            System.out.println("Indeks teks dengan panjang 5 karakter:");
            for (int index : indices) {
                System.out.println(index);
            }
        }
    }
    public static List<Integer> searchTextLength(String[] texts, int length) {
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < texts.length; i++) {
            String text = texts[i];

            if (text.length() == length) {
                indices.add(i);
            }
        }

        return indices;
    }
}