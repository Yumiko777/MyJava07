package example;

// クラスにインターフェースを実装する
// アクセス修飾子　class クラス名　implements インターフェース名　implementsは実装するという意味
public class Cat implements Pet {

    // インターフェースを実装したクラスでは、インターフェースに定義されている抽象メソッドをオーバーライドしたメソッドを定義しないといけない。
    // オーバーライドとは、元のメソッドと同じメソッド名、戻り値、引数のメソッドを定義すること
    @Override
    public void eat() {
        // void eat(String food)メソッドを呼び出す
        eat("ご飯");
    }

    @Override
    public void eat(String food) {
        System.out.println(food + "を食べるよ！おいしににゃー");
        System.out.println("お腹が一杯になったにゃー");
    }

    @Override
    public void playToy() {
        playToy("おもちゃ");
    }

    @Override
    public void playToy(String toy) {
        System.out.println(toy + "で遊ぶよ。楽しいにゃー！");
        System.out.println("遊んでお腹が減ったにゃー");
    }    
}
