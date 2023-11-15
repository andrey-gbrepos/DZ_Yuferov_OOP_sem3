// - Создать класс Поток содержащий в себе список УчебныхГрупп и
// реализующий интерфейс Iterator
// - Создать класс StreamComparator, реализующий сравнение количества групп
// входящих в Поток
// - Создать класс ПотокСервис, добавив в него метод сортировки списка
// потоков, используя созданный StreamComparator
// - Модифицировать класс Контроллер, добавив в него созданный сервис
// -  Модифицировать класс Контроллер, добавив в него метод сортирующий
// список потоков, путем вызова созданного сервиса


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Main
 */

public class Main {
  /**
   * Создает список потоков и рандомно их заполняет
   * @param lstream
   */
   private static void fillStreams (List <Stream> lstream){
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
        lstream.add(new Stream("Поток", 
                              rnd.nextInt(100, 200), 
                              rnd.nextInt(2000, 2023), 
                              rnd.nextInt(15,30))); 
        }
      }
      /**
       * Рапечатывает список через итератор класса Stream (Поток)
       * @param lstream
       */
      private static void streamPrint (List <Stream> lstream){
      System.out.println("№ потока Год нач.  Кол.групп");
        for (int i = 0; i < lstream.size(); i++) {
          Stream stream = new Stream (lstream.get(i).getName(), 
                                      lstream.get(i).getNumStream(),
                                      lstream.get(i).getStartYearStream(),
                                      lstream.get(i).getQuantityGroup());
          Iterator <String> str =  stream;
          while (str.hasNext()) {
            System.out.print(str.next() + "      ");
          }
          System.out.println();   
        }
      }
      
    public static void main(String[] args) {

      List <Stream> lstream = new ArrayList<>();
      
      System.out.println("Исходный список потоков");
      fillStreams(lstream);// Заполнение списка потоков
      streamPrint(lstream); // печать через итератор

      System.out.println("Сортировка с помощью вызова сервиса из класса Controller");
      Controller controller = new Controller(new StreamService (lstream));
      controller.serviceLst(); //Сортировка
      streamPrint(lstream);
    }     
}