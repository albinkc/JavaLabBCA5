class A2_Prime_Numbers_in_given_range {
    boolean isPrime(int x) {
        if(x==0 || x==1) return false;
        for(int i=2;i<=x/2;i++) {
            if(x%i==0) return false;
        }
        return true;
    }
    int printPrime(int begin,int end) {
        //zero negative numbers to reduce cpu cycles.
        if(begin<0) begin=0;
        if(end<0) end=0;
        if(m==0 && n==0) System.out.println("Prime numbers cannot exist in the given range");
        if(begin<end) {
            for(int i=begin;i<=end;i++) {
                if(this.isPrime(i))
                    System.out.println(i);
            }
        }
        else {
            for(int i=begin;i>=end;i--) {
                if(this.isPrime(i))
                    System.out.println(i);
            }
        }
        return 0;

    }
    public static void main(String a[]) throws Exception {
        int m,n;
        try {
            m=Integer.parseInt(a[0]);
            n=Integer.parseInt(a[1]);
        }
        catch(NumberFormatException nfe) {
            throw new IllegalArgumentException("Integers only");
        }
        A2_Prime_Numbers_in_given_range obj = new A2_Prime_Numbers_in_given_range();
        obj.printPrime(m,n);
    }
}