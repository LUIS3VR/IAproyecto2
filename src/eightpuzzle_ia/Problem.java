package eightpuzzle_ia;

/**
 *
 * @author eduardo
 */
public class Problem {
    
    private final String initialState;
    
    public Problem(String initialState){
        this.initialState = initialState;
    }//end constructor
    
    public boolean goalTest(String state){
        return state.equals("123456780");
    }//end goalTest

    public String getInitialState() {
        return initialState;
    }//end getInitialState

    public Node moveLeft(Node node){
        String state = node.getState();
        Node nextNode = null;
        int index = state.indexOf('0');
        
        switch(index){
            case 0:
                break;
            case 1:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(0)));
                nextNode.setAction(Actions.LEFT);
                break;
            case 2:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(1)));
                nextNode.setAction(Actions.LEFT);
                break;
            case 3:
                break;
            case 4:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(3)));
                nextNode.setAction(Actions.LEFT);
                break;
            case 5:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(4)));
                nextNode.setAction(Actions.LEFT);
                break;
            case 6:
                break;
            case 7:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(6)));
                nextNode.setAction(Actions.LEFT);
                break;
            case 8:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(7)));
                nextNode.setAction(Actions.LEFT);
                break;
        }
        return nextNode;
    }//end moveLeft
    
    public Node moveRight(Node node){
        String state = node.getState();
        Node nextNode = null;
        int index = state.indexOf('0');
        
        switch(index){
            case 0:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(1)));
                nextNode.setAction(Actions.RIGHT);
                break;
            case 1:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(2)));
                nextNode.setAction(Actions.RIGHT);
                break;
            case 2:
                break;
            case 3:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(4)));
                nextNode.setAction(Actions.RIGHT);
                break;
            case 4:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(5)));
                nextNode.setAction(Actions.RIGHT);
                break;
            case 5:
                break;
            case 6:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(7)));
                nextNode.setAction(Actions.RIGHT);
                break;
            case 7:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(8)));
                nextNode.setAction(Actions.RIGHT);
                break;
            case 8:
                break;
        }
        return nextNode;
    }//end moveRight
    
    public Node moveUp(Node node){
        String state = node.getState();
        Node nextNode = null;
        int index = state.indexOf('0');
        
        switch(index){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(0)));
                nextNode.setAction(Actions.UP);
                break;
            case 4:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(1)));
                nextNode.setAction(Actions.UP);
                break;
            case 5:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(2)));
                nextNode.setAction(Actions.UP);
                break;
            case 6:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(3)));
                nextNode.setAction(Actions.UP);
                break;
            case 7:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(4)));
                nextNode.setAction(Actions.UP);
                break;
            case 8:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(5)));
                nextNode.setAction(Actions.UP);
                break;
        }
        return nextNode;
    }//end moveUp    
    
    public Node moveDown(Node node){
        String state = node.getState();
        Node nextNode = null;
        int index = state.indexOf('0');
        
        switch(index){
            case 0:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(3)));
                nextNode.setAction(Actions.DOWN);
                break;
            case 1:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(4)));
                nextNode.setAction(Actions.DOWN);
                break;
            case 2:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(5)));
                nextNode.setAction(Actions.DOWN);
                break;
            case 3:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(6)));
                nextNode.setAction(Actions.DOWN);
                break;
            case 4:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(7)));
                nextNode.setAction(Actions.DOWN);
                break;
            case 5:
                nextNode = new Node();
                nextNode.setState(swap(state, state.charAt(8)));
                nextNode.setAction(Actions.DOWN);
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
        return nextNode;
    }//end moveDown
    
    private String swap(String state, char oldChar){
        state = state.replace(oldChar, 'A');
        state = state.replace('0', oldChar);
        state = state.replace('A', '0');
        return state;
    }//end swap
}//end class