
package lab5;

import java.util.Arrays;

/**
 *
 * @author Stepan Babaev
 */
public class Lab5 {

  
    public static void main(String[] args) {
       
        Box[] boxes = {
            new Box(10, 1, 1),
            new Box(1,10,10),
            new Box(2, 2, 2)
                
        };
        
        Arrays.sort(boxes); // сортировка по Volume
        
       

        for (Box box : boxes) {
            System.out.println(box);
            
        }
        
        System.out.println("Сортировка по стороне a - при сохранении по Volume:");
        //Сортировка по стороне a - при сохранении по Volume
        Box.CompareByA c = new Box(0, 0, 0).new CompareByA();
        Arrays.sort(boxes, c);
        for (Box box : boxes) {
            System.out.println(box);
        
        }
        
        //Через статический внутренний класс 
        //Arrays.sort(boxes, new Box.CompareByA());
                
        
        System.out.println("Через метод:");
        //Через метод
        Arrays.sort(boxes, Box.compareByA()); //3 способ сортировки
        
        
        for (Box box : boxes) {
            System.out.println(box);
        
        }
        
        //Анонимный класс - 5 вариант
       /*
        Arrays.sort(boxes, new Comparator<Box> () {
            @Override
            public int compare(Box b1, Box b2) {
                return b1.getA() - b2.getA();
            }
        });
       */
     //Лямбда выражения - преобразование Анонимного класса - 6 варинт 
     System.out.println("Лямбда выражения:");
     Arrays.sort(boxes, (Box b1, Box b2) -> b1.getA() - b2.getA());
      
     
     for (Box box : boxes) {
            System.out.println(box);
        
        }
       
        
    }
    
}
