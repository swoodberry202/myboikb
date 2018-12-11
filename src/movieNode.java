import java.util.ArrayList;

/**
 * Name: sloanwoodberry
 * Lab Name: movieNode
 * Lab Purpose
 * Date: 12/6/18
 * Collaborators: None
 */
public class movieNode extends graphNode{
    public String name;
    ArrayList<actorNode> myActors;

    public movieNode(String myName){
        name=myName;
        isMovie=true;
        myActors=new ArrayList<>();
    }
    public void addActor(actorNode actor){ myActors.add(actor);}

}
