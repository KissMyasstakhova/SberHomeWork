import java.util.ArrayList;
import java.util.Scanner;

public class Work {

    public static void main(String[] args) {
        System.out.print("Введите слово");
        Scanner scanner = new Scanner(System.in);
        String strPolCheck = scanner.next();
        var list = new ArrayList<Integer>();
        initList(list);
        int[] a = {8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Задача 1 : является ли палиндромом слово " + strPolCheck + " " + checkPol(strPolCheck, 0, strPolCheck.length() - 1));
        System.out.println("Задача 2 : удалить дублирующиеся элементы из списка ");
        for (int i : list) {
            System.out.print(i + " ");
        }

        delDoubleList(list);

        System.out.println("\n" + "Решение ");
        for (int i : list) {
            System.out.print(i + " ");
        }

        System.out.println("\n"+"Задача 3 : перевернуть массив ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        a = reversMas(a, a.length);

        System.out.println("\n" + "Решение ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
    //n - длина слова
    // F(i) = F(n - i) где i = [0, n/2]
    public static boolean checkPol(String string, int start, int finish) {
        if (start >= finish) return true;
        else if (string.charAt(start) != string.charAt(finish)) return false;
        else return checkPol(string, start + 1, finish - 1);

    }

    public static int[] reversMas(int[] mas, int n) {
        int tmp;
        for (int i = 0; i < n / 2; i++) {
            tmp = mas[i];
            mas[i] = mas[n - i - 1];
            mas[n - i - 1] = tmp;
        }

        return mas;

    }
    public static void initList(ArrayList list){
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    }

    public static void delDoubleList(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j >= i + 1; j--) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }

    }
}
