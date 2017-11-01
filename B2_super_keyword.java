class A{
    int a,b;
    A(int x,int y){
        a=x;
        b=y;
    }
    void maxOf2(){
        if (a>b) System.out.println(a);
        else System.out.println(b);
    }
}

class B extends A{
    int c;
    B(int x,int y,int z){
        super(x,y);
        c=z;
    }
    void maxOf3(){
        if(a>b && a>c) System.out.println(a);
        else if(b>a && b>c) System.out.println(c);
        else System.out.println(c);
    }
}

class B2_super_keyword{
    public static void main(String[] args) {
        B ob1=new B(100,11,99);
        ob1.maxOf2();
        ob1.maxOf3();
    }
}