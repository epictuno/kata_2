package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tanay
 */
public class Histogram<T> {
    private final T[] data;

    public Histogram(T[] dato) {
        this.data = dato;
    }
    public Map getHistogram(){
        Map<T,Integer> histogram;
        histogram = new HashMap<>();
        int dats; 
        for (T i : data) {
            dats = histogram.containsKey(i)? histogram.get(i)+1:1;
            histogram.put(i,dats);}
        return histogram;
    }
    public T[] getHistogramGenerator(){
        return this.data;
    }
    }