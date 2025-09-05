package Resources;

import java.util.Objects;

public class Node {

    private final String  name;

    public Node(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Node node)) return false;
        return Objects.equals(name, node.name);
    }

    @Override
    public String toString(){
        return name;
    }
}
