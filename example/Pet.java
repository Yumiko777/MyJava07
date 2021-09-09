// ポリモーフィズム（多態性）は似たようなクラスを統一的に扱えるようにするか考え方　同じように扱っても態度が変わるから多態性

// インターフェース内で定義できるのは抽象メソッドだけ。処理を書くためのブロックを持たない。　
// クラスがどんなメソッドを持つかを表し、実際の処理は、インターフェースを実装したクラスの中に書く
// abstructを省略している

package example;

public interface Pet {
    public void eat();

    public void eat(String food);

    public void playToy();

    public void playToy(String toy);
       
}
