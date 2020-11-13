import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Player{
    private String name;
    private int mark;
    private boolean finPlay;

    public Player(String name) {
        this.name = name;
        this.mark = 0;
        this.finPlay = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public boolean isFinPlay() {
        return finPlay;
    }

    public void setFinPlay(boolean finPlay) {
        this.finPlay = finPlay;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите стартовое слово");
        Scanner scanner = new Scanner(System.in);
        var startWord = scanner.nextLine().toLowerCase();
        Set<Character> alpha = getChars(startWord);
        var history = new HashSet<String>();


        System.out.println("Введите имя игрока 1:");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя игрока 2");
        Player player2 = new Player(scanner.nextLine());
        Player currentPlayyer = player1;
        System.out.println("Ход игрока : "+currentPlayyer.getName());

        var inputWord = scanner.nextLine().toLowerCase();

        while (!player1.isFinPlay() && !player2.isFinPlay()) {
            if (inputWord.isBlank()) {
                currentPlayyer.setFinPlay(true);
                currentPlayyer = newCurrent(currentPlayyer, player1, player2);
            }
            else  {
                var inputLetters = getChars(inputWord);
                if (!isContainsAll(alpha, inputLetters)) {
                    System.out.println("Слово не состоит из букв первого слова");
                } else if (history.contains(inputWord)) {
                    System.out.println("Данное слово уже было введено");
                } else {
                    System.out.println("Слово засчитано");
                    history.add(inputWord);
                    currentPlayyer.setMark(currentPlayyer.getMark() + inputWord.length());
                    currentPlayyer = newCurrent(currentPlayyer, player1, player2);
                }

            }
            System.out.println("Ход игрока : "+currentPlayyer.getName());
            inputWord = scanner.nextLine().toLowerCase();

        }
        System.out.println("Игра окончена : Счет");
        System.out.println(player1.getName()+" : "+ player1.getMark());
        System.out.println(player2.getName()+" : "+ player2.getMark());

    }

    private static Player newCurrent(Player currentPlayer,Player player1, Player player2) {
        if (player1.isFinPlay() || currentPlayer.equals(player1)) return player2;
         return player1;

    }

    private static boolean isContainsAll(Set<Character> alpha, Set<Character> inputLetters) {
        for (var elem : inputLetters) {
            if (!alpha.contains(elem))
                return false;
        }
        return true;
    }

    private static Set<Character> getChars(String startWord) {
        startWord.toLowerCase();
        var alpha = new HashSet<Character>();
        for (int i = 0; i < startWord.length(); i++) {
            alpha.add(startWord.charAt(i));
        }
        return alpha;
    }
}
