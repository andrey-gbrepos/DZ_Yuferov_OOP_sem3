import java.util.ArrayList;

import java.util.List;

public class StreamService  {
   private List <Stream> lst = new ArrayList<Stream>();
   
   public StreamService(List <Stream> lst) {
    this.lst = lst;    
}

public StreamService() {
    this.lst = null;
}

/**
 * Сортировка списка с элементами Stream с использованием StreamComporator
 */
public void sortStream (){
    this.lst.sort(new StreamComparator());
    }

public List<Stream> getLst() {
    return lst;
}

public void setLst(List<Stream> lst) {
    this.lst = lst;
}

}
