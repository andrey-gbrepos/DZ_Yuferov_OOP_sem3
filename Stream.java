
import java.util.Iterator;


public class Stream implements Iterator<String>{
    private String name;
    private Integer numStream;
    private Integer startYearStream;
    private Integer quantityGroup;

    public Stream(String name, Integer numStream, Integer startYearStream, Integer quantityGroup) {
        this.name = name;
        this.numStream = numStream;
        this.startYearStream = startYearStream;
        this.quantityGroup = quantityGroup;
    }

    public Stream() {
        this.name = "unknown";
        this.numStream = 0;
        this.startYearStream = 2000;
        this.quantityGroup = 0;
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

    public void setQuantityGroup(Integer quantityGroup) {
        this.quantityGroup = quantityGroup;
    }

    public Integer getQuantityGroup() {
        return quantityGroup;
    }

}
