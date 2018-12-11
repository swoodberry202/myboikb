import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Name: sloanwoodberry
 * Lab Name: driver
 * Lab Purpose
 * Date: 12/6/18
 * Collaborators: None
 */
public class driver {
    public static void main(String[] args) throws FileNotFoundException{
       Scanner nameBasics = new Scanner(new File("name.basics.tsv"));

        Scanner titlePrincipals = new Scanner(new File("title.principals.tsv"));
        actorNode myBoiKB=new actorNode("Kevin Bacon");

        for (int i=0;i<103;i++){
            String line=nameBasics.nextLine();
            if (i==102){
                String films= line.substring(line.indexOf("tt0"));

                while (films.contains(",")){

                    System.out.println(films);
                    String q=films.substring(0,films.indexOf(",")+1);
                    films=films.substring(films.indexOf(",")+1);
                    myBoiKB.addMovie(new movieNode(q));

                }
                myBoiKB.addMovie(new movieNode(films));

            }
        }
        //System.out.println(titlePrincipals.nextLine());



        ArrayList <String> names= new ArrayList<>();
        ArrayList<String> titles=new ArrayList<>();
        nameBasics.nextLine();
        //nameBasics.hasNextLine()
for (int i=1; i<20;i++){
    String line =nameBasics.nextLine();
    String myName= line.substring(10);
        myName=myName.substring(0,myName.indexOf('\t'));
        String myTitle=line.substring(line.indexOf("tt0"));

         names.add(myName);
         titles.add(myTitle);

        }
    }
}
