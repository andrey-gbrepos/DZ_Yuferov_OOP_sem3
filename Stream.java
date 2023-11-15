
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Stream implements Iterator<String>{
    private String name;
    private Integer numStream;
    private Integer startYearStream;
    private List <String> groups;
    private Integer quantityGroup;

    public Stream(String name, Integer numStream, Integer startYearStream, List<String> groups) {
        this.name = name;
        this.numStream = numStream;
        this.startYearStream = startYearStream;
        this.groups = new ArrayList<>(groups);
        quantityGroup = groups.size();
    }

    public Stream() {
        this.name = "unknown";
        this.numStream = 0;
        this.startYearStream = 2000;
        this.groups = new ArrayList<>();
        quantityGroup = 0;
    }

    int index = 0;
    @Override
    public boolean hasNext(){
        return index++ < 4;
    }

    @Override 
    public String next(){
        switch(index){
            case 0: return name;
            case 1: return Integer.toString(numStream);
            case 2: return Integer.toString(startYearStream);
            case 3: return Integer.toString(quantityGroup);
            case 4: return groups.toString();
            default: return "";
        }
        
    }

    @Override 
    public String toString(){
        return String.format("\n%s %d  %d  %d", name, numStream, startYearStream, quantityGroup);
    }
   
    public void setName(String name) {
        this.name = name;
    }

    public void setNumStream(Integer numStream) {
        this.numStream = numStream;
    }

    public void setStartYearStream(Integer startYearStream) {
        this.startYearStream = startYearStream;
    }

    public String getName() {
        return name;
    }

    public Integer getNumStream() {
        return numStream;
    }

    public Integer getStartYearStream() {
        return startYearStream;
    }

    public void setListGroups(List<String> groups) {
        this.groups = groups;
    }

    public List<String> getListGroups() {
        return groups;
    }

    public Integer getQuantityGroup() {
        return quantityGroup;
    }

}
