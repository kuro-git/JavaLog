package jp.techacademy.shintarou.nakajima.javalog;

/**
 * Created by nakajimashintarou on 2017/12/17.
 */

import android.util.Log;

class Human extends Animal implements Thinkable {
    // クラス変数
    static String to_jp = "人";

    // 変数
    String name;      // 名前
    int age;    // 年齢

    // 引数付きコンストラクタ
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // クラス関数
    public static void introduce () {
        Log.d("javatest", "これは人クラスです。");
    }

    // メソッド
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ニャンニャン」");
    }

    @Override
    public void think() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で愛した。");
    }

}
