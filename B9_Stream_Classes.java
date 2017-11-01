import java.io.*;

class B9_Stream_Classes{
    public static void main(String[] args) {
        byte b[]={'J','A','V','A'};
        int i;
        try{
            FileOutputStream fos = new FileOutputStream("B9_text.txt");
            fos.write(b);
            fos.close();

            FileInputStream fis = new FileInputStream("B9_text.txt");
            while((i=fis.read()) != -1){
                System.out.print((char)i);
            }
            fis.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}