package Resources;

import java.util.ArrayList;

public class Stack {


    private ArrayList<Node> stack_items = new ArrayList<>();

    public Stack(){}

    public void push(Node node){
            this.stack_items.add(node);
    }

    public Node pop(){
        return this.stack_items.remove(0);
    }

    public Boolean isEmpty(){
        return this.stack_items.isEmpty();
    }

    @Override
    public String toString() { return stack_items.toString(); }

}
