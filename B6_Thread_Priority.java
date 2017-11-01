class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread A Run "+i);
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread B Run "+i);
        }
    }
}

class C extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread C Run "+i);
        }
    }
}

class B6_Thread_Priority{
    public static void main(String[] args) {
        A ob1=new A();
        B ob2=new B();
        C ob3=new C();
        
        ob1.setPriority(Thread.MAX_PRIORITY);
        ob3.setPriority(Thread.MIN_PRIORITY);
        
        ob1.start();
        ob2.start();
        ob3.start();

    }
}