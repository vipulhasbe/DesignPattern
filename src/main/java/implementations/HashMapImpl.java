package implementations;

import java.util.LinkedList;

public class HashMapImpl {

    class HMNode{
        String key;
        Integer value;

        HMNode(String key, Integer value){
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<HMNode>[] bucketArrays;

    private  int size;

    public HashMapImpl(){
        this(5);
    }

    public  HashMapImpl(Integer n){
        this.bucketArrays = new LinkedList[n];
        this.size = 0;

        for(int i=0;i<bucketArrays.length; i++){
            bucketArrays[i] = new LinkedList<HMNode>();
        }
    }
}
