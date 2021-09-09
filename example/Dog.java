// Petインターフェースを実装したもう一つのクラスを作成
package example;

public class Dog implements Pet {
    @Override
    public void eat() {
        eat("ご飯");
    }

    @Override
    public void eat(String food) {
        System.out.println(food + "を食べるよ！おいしいワン");
        System.out.println("お腹が一杯になったワン");
    }

    @Override
    public void playToy() {
        playToy("おもちゃ");
    }

    @Override
    public void playToy(String toy) {
        System.out.println(toy + "で遊ぶよ。楽しいワン！");
        System.out.println("遊んでお腹が減ったワン");
    }    
}

