package Ch10.Ch10_7;
// Ch10_7, 透過父類別變數cir呼叫show() 函數
class Circle{    			// 父類別Circle
    protected static double pi=3.14;
    protected double radius;
    
    public Circle(double r){   
       radius=r;
    }
    public void show(){		// 父類別裡的show() 函數   
       System.out.println("radius="+radius);
    }
}   
class Coin extends Circle{	// 子類別Circle
    private int value;
    
    public Coin(double r,int v){
       super(r);
       value=v;
    }
    public void show(){		 // 子類別裡的show() 函數   
        System.out.println("radius="+radius+", value="+value);
    }
    public void showValue(){   // showValue() 函數,此函數只存在於子類別   
        System.out.println("value="+value);
    }   
}
public class Ch10_7{
    public static void main(String args[]){
        Circle cir=new Coin(2.0,5); // 宣告父類別變數cir，並將它指向物件
        cir.show();                   // 利用父類別變數cir呼叫show()
        //cir.showValue();            //只能存在子類別,父類別內無showValue
    }
}   