import java.util.ArrayList;

/**
 * Name: sloanwoodberry
 * Lab Name: actorNode
 * Lab Purpose
 * Date: 12/6/18
 * Collaborators: None
 */
public class actorNode extends graphNode{
    public String name;
    public int nameNum;
    ArrayList<movieNode> myMovies;

    public actorNode(String myName){
        isMovie=false;
        name=myName;
        myMovies=new ArrayList<>();
        nameNum=0;
    }
    public void setNameNum(int nameNum) { this.nameNum = nameNum; }

    public void addMovie(movieNode q){myMovies.add(q);}
    public void setMyMovies(){

    }
}
