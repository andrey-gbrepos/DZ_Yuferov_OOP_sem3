

public class Controller {
    private StreamService streamService = new StreamService() ;

    public Controller(StreamService lst) {
        streamService = lst;
    }
    public Controller() {
        streamService = null;
    }
    /**
     * Испольльзование метода сортировки из класса StreamService
     */
    public  void serviceLst (){
    this.streamService.sortStream();
   }

    public StreamService getLst() {
        return streamService;
    }
    public StreamService getControllst() {
        return streamService;
    }
   
}
