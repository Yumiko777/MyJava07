package example;

public abstract class InterfaceSample2 {
    public static void main(String[] args) {
        // Catクラス型のインスタンスを生成し、Petインターフェース型の変数petに代入
        Pet pet = new Cat();

        System.out.println("---　pet.eat()を呼び出す[petにはCatクラス型のインスタンスが入っている] ---");
        pet.eat();

        // Dogクラス型のインスタンスを作成
        pet = new Dog();

        System.out.println("--- pet.eat()を呼び出す[petにはDogクラス型のインスタンスが入っている]---");
        pet.eat();

    }
}
