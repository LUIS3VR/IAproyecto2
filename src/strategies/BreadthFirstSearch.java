package strategies;

import eightpuzzle_ia.Node;
import eightpuzzle_ia.Problem;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author eduardo
 */
public class BreadthFirstSearch {
    
    private final Queue<Node> frontier;
    private final HashSet explored;
    public final Stack path;
    public final Stack instructionSet;
    private final Problem problem;
    private int numberOfMoves;
    
    public BreadthFirstSearch(Problem problem){
        frontier = new LinkedList();
        explored = new HashSet();
        path = new Stack();
        instructionSet = new Stack();
        this.problem = problem;
    }
    
    public void search(){
        Node node = new Node();
        Node nextNode;
        node.setState(this.problem.getInitialState());
        node.setPathCost(0);
        frontier.add(node);
        
        while (!frontier.isEmpty()) {

            node = frontier.poll();                
            explored.add(node);

            if (problem.goalTest(node.getState())) {
                feedPath(node);
                numberOfMoves = path.size()-1;
                break;
            }
            
            nextNode = problem.moveLeft(node);
            if (nextNode!=null && !explored.contains(nextNode)) {
                nextNode.setParent(node);
                try {
                    nextNode.setPathCost(node.getParent().getPathCost()+1);
                } catch (Exception e) {}
                frontier.add(nextNode);
                explored.add(nextNode);
            }
            
            nextNode = problem.moveUp(node);
            if (nextNode!=null && !explored.contains(nextNode)) {
                nextNode.setParent(node);
                try {
                    nextNode.setPathCost(node.getParent().getPathCost()+1);
                } catch (Exception e) {}
                frontier.add(nextNode);
                explored.add(nextNode);
            }
            
            nextNode = problem.moveRight(node);
            if (nextNode!=null && !explored.contains(nextNode)) {
                nextNode.setParent(node);
                try {
                    nextNode.setPathCost(node.getParent().getPathCost()+1);
                } catch (Exception e) {}
                frontier.add(nextNode);
                explored.add(nextNode);
            }
            
            nextNode = problem.moveDown(node);
            if (nextNode!=null && !explored.contains(nextNode)) {
                nextNode.setParent(node);
                try {
                    nextNode.setPathCost(node.getParent().getPathCost()+1);
                } catch (Exception e) {}
                frontier.add(nextNode);
                explored.add(nextNode);
            }
        }
    }//end search
    
    private void feedPath(Node node){
        path.add(node.getAction());
        try {
            feedPath(node.getParent());
        } catch (Exception e){}
    }//end feedPath
    
    public Stack getSolution(){
        this.path.pop();
        while (!path.isEmpty()) {            
            instructionSet.add(path.pop());
        }
        return this.instructionSet;
    }//end getSolution
    
    public int getNumberOfMoves(){
        return this.numberOfMoves;
    }
    
    public int getFrontierSize(){
        return this.frontier.size();
    }
}//end class BreadthFirstSearch