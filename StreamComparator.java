import java.util.Comparator;

public class StreamComparator implements Comparator<Stream>{
    @Override
    public int compare(Stream s1, Stream s2){
        //return Integer.compare(s1.getQuantityGroup(), s2.getQuantityGroup());
        if (s1.getQuantityGroup() > s2.getQuantityGroup())
        return 1;
    else if (s1.getQuantityGroup() < s2.getQuantityGroup())
        return -1;
    else
        return 0;
    }
}
