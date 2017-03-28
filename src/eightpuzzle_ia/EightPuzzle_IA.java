package eightpuzzle_ia;

import strategies.BreadthFirstSearch;

/**
 * 
 * @author eduardo
 */
public class EightPuzzle_IA {
    public static void main(String[] args) {        
        //Problem myProblem = new Problem("032564817");
        Problem myProblem = new Problem("874320651"); //caro whats
        BreadthFirstSearch bfs = new BreadthFirstSearch(myProblem);
        bfs.search();
        System.out.println(bfs.getSolution());
        System.out.println(bfs.getFrontierSize());
        System.out.println(bfs.getNumberOfMoves()+" moves");
    }//end main
    
}//end class EightPuzzle_IA