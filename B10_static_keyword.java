class ABC{
    int a;
    //static variables are initialized to zero in Java
    static int k;
    void get(int x){
        a=x;
        k++;
    }
    void put(){
        System.out.println("Normal Function");
        System.out.println(a);
    }
    static void show(){
        System.out.println("Static Function");
        System.out.println(k);
    }
}

class B10_static_keyword{
    public static void main(String[] args) {
        ABC ob1=new ABC();
        ob1.get(100);
        ABC ob2=new ABC();
        ob2.get(200);
        ob1.put();
        ob2.put();
        ABC.show();
    }
}