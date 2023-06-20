import java.util.ArrayList;
import java.util.List;

public class soal08 {
    public static void main(String[] args) {
        String[] texts = {"kipas", "pena", "laptop", "kabel", "tes", };
        int minLength = 4;
        int maxLength = 6;

        List<Integer> indices = searchTextRange(texts, minLength, maxLength);

        if (indices.isEmpty()) {
            System.out.println("Tidak ditemukan teks dengan panjang di dalam rentang yang ditentukan.");
        } else {
            System.out.println("Indeks teks dengan panjang di dalam rentang yang ditentukan:");
            for (int index : indices) {
                System.out.println(index);
            }
        }
    }

    public static List<Integer> searchTextRange(String[] texts, int minLength, int maxLength) {
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < texts.length; i++) {
            String text = texts[i];
            int length = text.length();

            if (length >= minLength && length <= maxLength) {
                indices.add(i);
            }
        }

        return indices;
    }
}