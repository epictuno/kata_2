package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer [] data={9,2,3,4,5,8,1,2,3,9,5,3,6,2,7,3,6,0};
        Histogram histo=new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        Iterator<Map.Entry<Integer,Integer>> iterador=histogr.entrySet().iterator();
        while(iterador.hasNext()){
            Map.Entry entry = (Map.Entry) iterador.next();
            Integer key = (Integer)entry.getKey();
            Integer value = (Integer)entry.getValue();
            System.out.println(key + "==>" + value);
        }
    }
}
