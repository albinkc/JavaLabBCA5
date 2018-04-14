import java.util.*;

class B3_Vector_Methods {
    public static void main(String[] args) {
        Vector<String> v=new Vector<String>();
        int l=args.length;
        for(int i=0;i<args.length;i++) {
            v.addElement(args[i]);
        }
        System.out.println(v.size());
        v.insertElementAt("xyz", 2);
        System.out.println(v.elementAt(1));
        int s=v.size();
        String str[]=new String[s];
        v.copyInto(str);
        for(int i=0;i<s;i++) {
            System.out.print(str[i]+" ");
        }
    }
}