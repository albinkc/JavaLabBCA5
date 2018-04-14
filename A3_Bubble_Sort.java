class A3_Bubble_Sort {
    public static void main(String[] args) {
        int a[]=new int[args.length];
        for(int i=0;i<args.length;i++) {
            a[i]=Integer.parseInt(args[i]);
        }
        int len = a.length;
        System.out.println("Before Sorting");
        for(int i=0;i<len;i++) {
            System.out.println(a[i]);
        }
        //sorting
        for(int i=0;i<len-1;i++) {
            for(int j=0;j<(len-i-1);j++) {
                //change sign for greater
                if(a[j]>a[j+1]) {
                    //swapping
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }   
        }
        System.out.println("After sorting");
        for(int i=0;i<len;i++) {
            System.out.println(a[i]);
        }
    }
}