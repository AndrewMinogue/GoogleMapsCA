/*
import java.util.ArrayList;
import java.util.List;


public class DepthFirstSearch
{
    CostedPath cp;
    public int pathCost=0;
    public List<GraphNode<?>> pathList=new ArrayList<>();

    public DepthFirstSearch()
    {}


    public static <T> List<GraphNode<?>> findPathDepthFirst(GraphNode<?> from, List<GraphNode<?>> encountered, T lookingfor){
        List<GraphNode<?>> result;
        if(from.data.equals(lookingfor)) { //Found it
            result=new ArrayList<>(); //Create new list to store the path info (any List implementation could be used)
            result.add(from); //Add the current node as the only/last entry in the path list
            return result; //Return the path list
        }
        if(encountered==null) encountered=new ArrayList<>(); //First node so create new (empty) encountered list
        encountered.add(from);
        for(GraphNode<?> adjNode : from.adjList1) {
            if (!encountered.contains(adjNode)) {
                result = findPathDepthFirst(adjNode, encountered, lookingfor);
                if (result != null) { //Result of the last recursive call contains a path to the solution node
                    result.add(0, from); //Add the current node to the front of the path list
                    return result; //Return the path list
                }
            }
        }
        return null;
    }


    public static <T> List<List<GraphNode<?>>> findAllPathsDepthFirst(GraphNode<?> from, List<GraphNode<?>> encountered, T lookingfor){
        List<List<GraphNode<?>>> result=null, temp2;
        if(from.data.equals(lookingfor)) { //Found it
            List<GraphNode<?>> temp=new ArrayList<>(); //Create new single solution path list
            temp.add(from); //Add current node to the new single path list
            result=new ArrayList<>(); //Create new "list of lists" to store path permutations
            result.add(temp); //Add the new single path list to the path permutations list
            return result; //Return the path permutations list
        }
        if(encountered==null) encountered=new ArrayList<>(); //First node so create new (empty) encountered list
        encountered.add(from); //Add current node to encountered list
        for(GraphNode<?> adjNode : from.adjList1){
            if(!encountered.contains(adjNode)) {
                temp2=findAllPathsDepthFirst(adjNode,new ArrayList<>(encountered),lookingfor); //Use clone of encountered list
//for recursive call!
                if(temp2!=null) { //Result of the recursive call contains one or more paths to the solution node
                    for(List<GraphNode<?>> x : temp2) //For each partial path list returned
                        x.add(0,from); //Add the current node to the front of each path list
                    if(result==null) result=temp2; //If this is the first set of solution paths found use it as the result
                    else result.addAll(temp2); //Otherwise append them to the previously found paths
                }
            }
        }
        return result;
    }

    public static void findAll()
    {

        GraphNode<Object> waterford = new GraphNode<>("Waterford");
        GraphNode<Object> dublin = new GraphNode<>("Dublin");
        GraphNode<Object> cork = new GraphNode<>("Cork");
        GraphNode<Object> galway = new GraphNode<>("Galway");
        GraphNode<Object> limerick = new GraphNode<>("Limerick");
        GraphNode<Object> killarney = new GraphNode<>("Killarney");
        GraphNode<Object> wexford = new GraphNode<>("Wexford");
        dublin.connectToNodeUndirected1(galway);
        galway.connectToNodeUndirected1(limerick);
        limerick.connectToNodeUndirected1(dublin);
        dublin.connectToNodeUndirected1(waterford);
        waterford.connectToNodeUndirected1(cork);
        dublin.connectToNodeUndirected1(wexford);
        wexford.connectToNodeUndirected1(waterford);
        limerick.connectToNodeUndirected1(killarney);
        cork.connectToNodeUndirected1(killarney);

        System.out.println("This is one single path Permutation:");
        List<GraphNode<?>> path=findPathDepthFirst(waterford,null ,"Cork");
        for(GraphNode<?> n : path) {
            System.out.println(n.data);
        }
        }

    public static void findAll1()
    {

        GraphNode<Object> waterford = new GraphNode<>("Waterford");
        GraphNode<Object> dublin = new GraphNode<>("Dublin");
        GraphNode<Object> cork = new GraphNode<>("Cork");
        GraphNode<Object> galway = new GraphNode<>("Galway");
        GraphNode<Object> limerick = new GraphNode<>("Limerick");
        GraphNode<Object> killarney = new GraphNode<>("Killarney");
        GraphNode<Object> wexford = new GraphNode<>("Wexford");
        dublin.connectToNodeUndirected1(galway);
        galway.connectToNodeUndirected1(limerick);
        limerick.connectToNodeUndirected1(dublin);
        dublin.connectToNodeUndirected1(waterford);
        waterford.connectToNodeUndirected1(cork);
        dublin.connectToNodeUndirected1(wexford);
        wexford.connectToNodeUndirected1(waterford);
        limerick.connectToNodeUndirected1(killarney);
        cork.connectToNodeUndirected1(killarney);

        System.out.println("All solution paths");
        System.out.println("to node containing waterford");
        System.out.println("------------------------------------------");
        List<List<GraphNode<?>>> allPaths=findAllPathsDepthFirst(waterford,null,"Cork");
        int pCount=1;
        for(List<GraphNode<?>> p : allPaths) {
            System.out.println("\nPath "+(pCount++)+"\n--------");
            for(GraphNode<?> n : p)
                System.out.println(n.data);
        }
        }
    }




*/
