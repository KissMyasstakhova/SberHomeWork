import java.util.Iterator;
import java.util.Scanner;

public class NumberIter implements Iterable<String> {
    private String str;

    public NumberIter(String str) {
        this.str = str;
    }

    @Override
    public Iterator<String> iterator() {
        return new NumberIterator();
    }


    class NumberIterator implements Iterator<String> {
        //private int pos; прямой порядок
        private int pos = str.length() - 1;

        @Override
        public boolean hasNext() {
            // для прямого полрядка
            //       return pos < str.length();
            return pos >= 0;
        }

        @Override
        public String next() {

            //для прямого порядка
            //   return String.valueOf(str.charAt(pos++));
            return String.valueOf(str.charAt(pos--));
        }
    }
}


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberIter line = new NumberIter(scanner.nextLine());

        for (var i : line) {
            System.out.println(i);

        }
    }

}