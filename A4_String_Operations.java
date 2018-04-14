class A4_String_Operations {
    public static void main(String[] args) {
        String str1=new String("NewHorizon");
        String str2=new String("JavaProgramming");
        System.out.println("First string is: "+str1);
        System.out.println("Second string is: "+str2);
        System.out.println("length of str1: "+str1.length());
        System.out.println("Equal?: "+str1.equals(str2));
        System.out.println("Upper str1: "+str1.toUpperCase());
        System.out.println("Lower str1: "+str1.toLowerCase());
        System.out.println("Substring str1 from given index till end of string: "+str1.substring(3));
        System.out.println("Substring str1 from begin-index till end-index-1) : "+str1.substring(1,5));
        System.out.println("String comparison: "+str1.compareTo(str2));
        System.out.println("character at given index: "+str1.charAt(3));
        System.out.println("Index of first occurence specified character: "+str1.indexOf('H'));
        System.out.println("String concatenation: "+str1.concat(str2));
        System.out.println("Replacing a character in str1: "+str1.replace('e', 'o'));
    }
}