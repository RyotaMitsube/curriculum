/*
 * バブルソート
 * チェックテスト-Java３章
 *
 */
public class Main{
  public static void main(String[] args){
    /*
    * 問1
    * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
    */
    int[] data = {3, 1, 2, 7, 5};

    /*
    * 問2
    * 以下のfor文を完成させなさい
    */
    //配列の全要素をfor文で表示
    for(int i = 0; i < data.length; i++){
      System.out.print(data[i] + " ");
    }
      
    System.out.println();

    //配列の要素数分をfor文で繰り返す。
    for (int i = 0; i < data.length; i++) {

      /*
      -- 前提 --
      ・int i は 配列変数data内のターゲット要素を取得するインデックス番号として用いる。
      ・int j は ターゲット要素(int i)以降の 配列内要素を取得するインデックス番号として用いる。
      
      -- 条件式要件 --
      ・ターゲット要素(int i) 以降の 配列要素(int j)がある場合 要素数の大小判定に進む。

      -- for文条件式内容 --
      ・変数j に 配列要素の最大インデックス数を代入; 変数j が変数iより大きければ実行; 変数j から1減算;
      ※ 変数j から1減算するのは int i 以降の 配列要素を後ろから順番に比較していくため。
      */
      for (int j = data.length -1; j > i; j--) {

        /*
        * 問3
        * 以下、配列の添字を入れてソートを完成させなさい
        */

        /*
        -- 前提 --
        ・配列dataの要素を小さい順に並べ替える

        -- if文 条件式要件 --
        ・ターゲット要素(int i) 以降に 配列要素(int j)がある場合 要素数の大小判定へ進む。
        */
        if(data[i] > data[j]){
          //下記の処理要件 - int i の配列要素と int j の配列要素を入れ替える

          //int jの配列要素をコピーした int box を宣言。
          int box = data[j];
          // 配列要素 int j の値 を 配列要素 int i の値で上書き。
          data[j] = data[i];
          // 配列要素 int i の値 を int jの配列要素をコピーした int boxの値で上書き。
          data[i] = box;
        }
      }
    }

    //配列の全要素をfor文で表示
    for(int i = 0; i < data.length; i++){
      System.out.print(data[i] + " ");
    }
  }
}