//Swap using Constructor Overloading
class Swap {
    Swap(int x,int y) {
        System.out.println("Before swapping(int): x = "+x+" and y = "+y);
        int t;
        t=x;
        x=y;
        y=t;
        System.out.println("After swapping(int): x = "+x+" and y = "+y);
    }
    Swap(double x,double y) {
        System.out.println("Before swapping(double): x = "+x+" and y = "+y);
        double t;
        t=x;
        x=y;
        y=t;
        System.out.println("After swapping(double): x = "+x+" and y = "+y);
    }
    Swap(char x,char y) {
        System.out.println("Before swapping(char): x = "+x+" and y = "+y);
        char t;
        t=x;
        x=y;
        y=t;
        System.out.println("After swapping(char): x = "+x+" and y = "+y);
    }
}
class A6_Constructor_Overloading {
    public static void main(String[] args) {
        Swap ob1=new Swap(10,15);
        Swap ob2=new Swap(22.4,55.77);
        Swap ob3=new Swap('a','b');
    }
}