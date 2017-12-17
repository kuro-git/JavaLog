package jp.techacademy.shintarou.nakajima.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("ももちゃん", 30);     // 名前を、年齢30歳で、humanのインスタンスを作る

        human.say();  // ももちゃんがいいます（ログ出力）
        Log.d("javatest", "人の名前は" + human.name + "です。");
        Log.d("javatest", "人の年齢は" + human.age + "歳です。");

        Human.introduce();
        Log.d("javatest", Human.to_jp + "のクラス変数です。");

        human.think();

        Human human2 = new Human("yukiちゃん", 4);     // 名前を、年齢30歳で、human2のインスタンスを作る

        human2.say();  // yukiちゃんがいいます（ログ出力）
        Log.d("javatest", "人の名前は" + human2.name + "です。");
        Log.d("javatest", "人の年齢は" + human2.age + "歳です。");

        Human.introduce();
        Log.d("javatest", Human.to_jp + "のクラス変数です。");

        human2.think();
    }

}
