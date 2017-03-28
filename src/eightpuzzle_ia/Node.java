package eightpuzzle_ia;

/**
 *
 * @author eduardo
 */
public class Node {
    
    private String state;
    private Node parent;
    private Actions action;
    private int pathCost;
    
    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPathCost() {
        return pathCost;
    }

    public void setPathCost(int pathCost) {
        this.pathCost = pathCost;
    }

    public Actions getAction() {
        return action;
    }

    public void setAction(Actions action) {
        this.action = action;
    }
    
    @Override
    public int hashCode() {
        return Integer.valueOf(state);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node) {
            return this.state.equals(((Node) obj).getState());
        }
        return false;
    }
}//end class