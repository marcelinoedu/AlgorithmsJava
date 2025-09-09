package Resources;

import java.util.ArrayList;

public class Stack {


    private final ArrayList<Node> stackItems = new ArrayList<>();

    public Stack(){}

    public void push(Node node){
            this.stackItems.add(node);
    }

    public Node pop(){
        return this.stackItems.remove(0);
    }

    public Boolean isEmpty(){
        return this.stackItems.isEmpty();
    }

    @Override
    public String toString() { return stackItems.toString(); }

}
