package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        Histogram histo=new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        Iterator<Map.Entry<Integer,Integer>> iterador=histogr.entrySet().iterator();
        while(iterador.hasNext()){
            Map.Entry entry = (Map.Entry) iterador.next();
            String key = (String)entry.getKey();
            Integer value = (Integer)entry.getValue();
            System.out.println(key + "==>" + value);
        }
    }
}
