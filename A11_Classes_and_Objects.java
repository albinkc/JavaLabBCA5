class ABC{
    int a,b;
    void get(int x,int y){
        a=x;
        b=y;
    }
    void max(){
        if (a>b) System.out.println(a);
        else System.out.println(b);
    }
}

class B1_Classes_and_Objects{
    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.get(22,7);
        obj.max();
    }
}