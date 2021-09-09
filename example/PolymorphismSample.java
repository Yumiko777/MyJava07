package example;

// キーボードから入力を受け取るには、java.utilパッケージのScannerクラスを利用する。
// まずScannerクラスのインスタンスを作成して変数に入れておき、nextLineメソッドで1行分
// を受け取る。
// nextLineメソッドを呼び出すとその段階でプログラムは入力待ちになる
import java.util.Scanner;

public class PolymorphismSample {
    public static void main(String[] args) {
        // Petインターフェース型の変数petを宣言
        Pet pet;

        System.out.println("触れ合いたいペットを選んでください");
        System.out.println("  1:猫、 2:犬　(1 or 2 どちらかを入力してEnter):");

        Scanner keyInput = new Scanner(System.in);
        String inputStr = keyInput.nextLine();

        if (inputStr.equals("1")) {
            // Catクラスのインスタンスを生成
            pet = new Cat();
            System.out.println("<猫が選択されました>");
        } else if (inputStr.equals("2")) {
            pet = new Dog();
            System.out.println("<犬が選択されました>");
        } else {
            pet = new Cat();
            System.out.println("<1,2以外が入力されたので、猫（デフォルト）を選択します>");
        }

        System.out.println();
        System.out.println("--- 選択されたペットにご飯を与えます ---");
        // petインスタンスに対してeat()メソッドを呼び出す
        pet.eat();

        System.out.println();
        System.out.println("--- 選択されたペットにおもちゃを与え、遊ばせます ---");
        pet.playToy();

        System.out.println();
        System.out.println("--- 選択されたペットに大好きなペットフードを与えます ---");
        pet.eat("大好きなペットフード");

        System.out.println();
        System.out.println("--- 選択されたペットにボールを与え、遊ばせます ---");
        pet.playToy("ボール");

    }
    
}
