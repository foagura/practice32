interface aIF {
    void methodA();
}

interface bIF {
    void methodB();
}

interface cIF extends aIF, bIF {    // インタフェースを複数まとめて継承している
    void methodC();
}

class Test implements cIF {    // サブインタフェースから実装クラスを作成
    public void methodA() {    // 抽象メソッドを実装
        System.out.println("methodAです");
    }

    public void methodB() {    // 抽象メソッドを実装
        System.out.println("methodBです");
    }

    public void methodC() {    // 抽象メソッドを実装
        System.out.println("methodCです");
    }
}

public class Practice32 {
    public static void main(String[] args) {
        Test obj = new Test();

        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
