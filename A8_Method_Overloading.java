abstract class Dept{
    double salary,bonus;
    abstract void calcBonus(double sal);
    void displayBonus(){
        System.out.println("Salary = "+salary);
        System.out.println("Bonus = "+bonus);
    }
}

class Sales extends Dept{
    void calcBonus(double sal){
        salary=sal;
        bonus=salary*0.2;
    }
}

class Purchases extends Dept{
    void calcBonus(double sal){
        salary=sal;
        bonus=salary*0.4;
    }
}

class A8_Method_Overloading{
    public static void main(String[] args) {
        Sales ob1=new Sales();
        ob1.calcBonus(30000);
        ob1.displayBonus();
        Purchases ob2=new Purchases();
        ob2.calcBonus(28000);
        ob2.displayBonus();
    }
}