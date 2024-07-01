/**
 * 問1:isEven関数を実行して、以下の配列から偶数だけが出力されるように実装してください。
 */

let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓
function isEven(){

    for(let i = 0; i < numbers.length; i++){
        
        if(numbers[i] % 2 == 0){
            console.log(`${numbers[i]}は偶数です`);
        }

    }

}

//問1:動作検証
isEven();


/**
 * 問2:以下の要件を満たすように実装してください。
 * 【要件】
 * 1. インスタンス化した時にガソリンとナンバーがセットされるようなCarクラスを作成する
 * 2. 「ガソリンは〇〇です。ナンバーは△△です」と出力される「getNumGas」という関数を作成する
 */

class Car{
    constructor(gas, num){
        this.gas = gas;
        this.num = num;
    }

    getNumGas(){
        console.log(`ガソリンは${car.gas}で、ナンバーは${car.num}です。`);
    }
}
//問2:動作検証

let car = new Car(10, 1234);
car.getNumGas();