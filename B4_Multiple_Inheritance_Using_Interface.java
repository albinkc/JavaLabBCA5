class A {
    int rno;
    void get(int x) {
        rno=x;
    }
    void put() {
        System.out.println(rno);
    }
}

class B extends A {
    int s1,s2;
    void read(int x,int y) {
        s1=x;
        s2=y;
    }
    void write() {
        System.out.println(s1);
        System.out.println(s2);
    }
}

interface C {
    float spwt=10.5F;
    void display();
}

class D extends B implements C {
    float total;
    public void display() {
        total=s1+s2+spwt;
        get(251);
        read(60,90);
        total=s1+s2+spwt;
        put();
        write();
        System.out.println("Total = "+total);
    }
}

class B4_Multiple_Inheritance_Using_Interface {
    public static void main(String[] args) {
        D ob = new D();
        ob.display();
    }
}