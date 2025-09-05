package Resources;

import java.util.ArrayList;
import java.util.HashMap;

public class Queue {


    private final ArrayList<Node> items = new ArrayList<>();

    public Queue(){}

    public void enqueue(Node node){
        this.items.add(node);
    }

    public Node dequeue(){

        if (this.isEmpty()){
            throw new IllegalStateException("A fila está vazia!");
        }
        return this.items.remove(0);
    }

    public Boolean isEmpty(){
        return this.items.isEmpty();
    }

    @Override
    public String toString() { return items.toString(); }
}
