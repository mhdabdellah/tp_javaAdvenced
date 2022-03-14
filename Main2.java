import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Main2{
    public static void main(String [] args) throws IOException {
        FileInputStream in = new FileInputStream("mohamed.txt");
        FileInputStream in2 = new FileInputStream("abdellahi.txt");
        FileInputStream inAndin2 = new FileInputStream("mohamedabdellahi.txt");

        // pour copier la contenue de deux ficher dans un fichier il fau d'abord copier ses inputStream dans une inputSream
        SequenceInputStream sq = new SequenceInputStream(in,in2);
        FileOutputStream outS = new FileOutputStream("mohamedabdellahi.txt");

        int h=0;
        while((h=sq.read()) != -1){
            outS.write(h);
        }
        System.out.println("two file in one Donne");
        
        int l=0;
        while((l=inAndin2.read()) != -1){
            System.out.print((char)l);
        }
        System.out.println("\n"+"Affiche for two file in one Donne");
        sq.close();
        outS.close();
        in.close();
        in2.close();

    }
}