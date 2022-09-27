package homework5;

public class App1 {

    public static void main(String[] args) {
        String str = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";

        String[] words = new StringBuilder(str).reverse().toString().split("Z");
        StringBuilder notMoskal = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            notMoskal.append(words[i]).append(" ");
        }

        System.out.println(notMoskal);
    }
}
