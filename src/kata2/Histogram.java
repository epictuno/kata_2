package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tanay
 */
public class Histogram {
    private final Integer[] data;

    public Histogram(Integer[] dato) {
        this.data = dato;
    }
    public Map getHistogram(){
        Map<Integer,Integer> histogram;
        histogram = new HashMap<>();
        int dats; 
        for (Integer i : data) {
            dats = histogram.containsKey(i)? histogram.get(i)+1:1;
            histogram.put(i,dats);}
        return histogram;
    }
    public Integer[] getHistogramGenerator(){
        return this.data;
    }
    }
