public class A1_Factorial_Command_Line_Arguments{
    public static void main(String[] args) {
        int num[] = new int[args.length];
        if(args.length==0){
            System.out.println("Error! No arguments");
        }
        else{
            for(int i=0;i<args.length;i++){
                num[i]=Integer.parseInt(args[i]);
                if(num[i]<0){
                    System.out.println("Error! "+num[i]+" is not a positive integer");
                }
                else{
                    int fact=1;
                    for(int j=1;j<=num[i];j++){
                         fact=fact*j;
                    }
                    System.out.println(num[i]+"! = "+fact);
                }
            }
        }
    }
}