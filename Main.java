import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Main{
    

    public static void main(String [] args) throws IOException {

        // la flux de sortire ou d'ecriture et est un fichier C'EST a dire la ou on vas ecrire nos messages et les messages peuvent etre des text images videos ...etc
        FileOutputStream out = new FileOutputStream("mohamed.txt");
        FileOutputStream out2 = new FileOutputStream("abdellahi.txt");
        FileOutputStream outI = new FileOutputStream("imageCopieSql.png");// sortir une image ou ecrire une image 
        FileOutputStream outS = new FileOutputStream("mohamedabdellahi.txt");// pour ecrire la contenue de deux fichier dans meme fichier
        // la flux d'entrer pour lire les donnes d'une file et les donnees peuvent etre des text images videos ...etc
        FileInputStream in = new FileInputStream("mohamed.txt");
        FileInputStream in2 = new FileInputStream("abdellahi.txt");
        FileInputStream inI = new FileInputStream("sql server project5.png"); // pour prendre une image comme entree 
        FileInputStream inAndin2 = new FileInputStream("mohamedabdellahi.txt");
        // pour copier la contenue de deux ficher dans un fichier il fau d'abord copier ses inputStream dans une inputSream
        SequenceInputStream sq = new SequenceInputStream(in,in2);

        String str = "My name is Mohamed";
        // un objet ou variable byte dans la quelle on vas transformer le text ou message en byte pour pouvoire l'ecrire sur la flux de sortir
        //  comme on a un text de plusier character on est donc obliger d'utilser un tableau de byte pour stocket tous les caracters
        byte b[] = str.getBytes();
        out.write(b);
        out.close();
        System.out.println("Ecritir Donne");

        
        String str2 = "My name is Abdellahi";
        // un objet ou variable byte dans la quelle on vas transformer le text ou message en byte pour pouvoire l'ecrire sur la flux de sortir
        //  comme on a un text de plusier character on est donc obliger d'utilser un tableau de byte pour stocket tous les caracters
        byte c[] = str2.getBytes();
        out2.write(c);
        out2.close();
        System.out.println("Ecritir Donne");

        // pour les donnes a partir d'un fichier
        int i=0;
        while((i=in.read()) != -1){
            // l'afficher character character et chaque caracter dans un ligne 
            // System.out.println((char)i);
            // pour l'affichee dans un meme ligne il faut faire
            System.out.print((char)i);
        }
        System.out.println("\n Lire Donne");
        // in.close();

        int k=0;
        while((k=in2.read()) != -1){
            // l'afficher character character et chaque caracter dans un ligne 
            // System.out.println((char)i);
            // pour l'affichee dans un meme ligne il faut faire
            System.out.print((char)k);
        }
        System.out.println("\n Lire Donne");
        // in2.close();

        int j=0;
        while((j=inI.read()) != -1){
            outI.write((byte)j);
            
        }
        System.out.println("Copie of image Donne");
        inI.close();
        outI.close();

        int h=0;
        while((h=sq.read()) != -1){
            outS.write(h);
        }
        System.out.println("two file in one Donne");
        
        int l=0;
        while((l=inAndin2.read()) != -1){
            System.out.print((char)l);
        }
        System.out.println("Affiche for two file in one Donne");
        sq.close();
        outS.close();
        in.close();
        in2.close();

    }
}