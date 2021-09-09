package example;

public abstract class InterfaceSample {
    public static void main(String[] args) {
        // mainメソッドの中でCatクラスのデフォルトコンストラクターでインスタンスを生成
        Cat cat = new Cat();

        System.out.println("---　cat.eat()を呼び出す ---");
        cat.eat();

        System.out.println();
        System.out.println("--- cat.eat(\"贅沢なキャットフード\")を呼び出す ---");
        cat.eat("贅沢なキャットフード");

        System.out.println();
        System.out.println("--- cat.playToy()を呼び出す ---");
        cat.playToy();

        System.out.println();
        System.out.println("--- cat.playToy(\"猫じゃらし¥\")を呼び出す ---");
        cat.playToy("猫じゃらし");

    }
}
