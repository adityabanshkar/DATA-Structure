package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class duplicateElement {
    public static void main(String[] args) {
        int[] a={1,2,1,3,4,5,6,4,7,7,8,7};
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i:a){
            if(map.containsKey(i)){
               map.put(i,map.get(i) +1);
            }
            else{
            map.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            //System.out.println(e.getKey()+"--->"+e.getValue());
            if(e.getValue()>1)
                {
                    System.out.println("Dublicate Element  :"+e.getKey()+" fequency :"+e.getValue());
                }
        }
        
    }
}
