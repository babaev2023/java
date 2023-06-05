
package lab5;

import java.util.Comparator;

/**
 *
 * @author Stepan Babaev
 */
public class Box implements Comparable<Box> {
    
    private int a, b, c;

    public Box(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }
    
    

    @Override
    public String toString() {
        return "Box{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    public int volume() {
        return a*b*c;
    }

    @Override
    public int compareTo(Box rValue) {
        //return 0;
        return volume() - rValue.volume();
    }
   
    //Через метод сортировка
    
    public static Comparator<Box> compareByA() {
        class CMP implements Comparator<Box> {
            @Override
            public int compare(Box b1, Box b2) {
                return b1.b - b2.b;
        }
        
    }
        return new CMP();
    }
    
    // 4 вариант вместо 3го
    /*
    public static Comparator<Box> compareByA() {
        return new Comparator<Box>() {
            {
                //....
            }
    //Инициализация экземпляром
            @Override
            public int compare(Box b1, Box b2) {
                return b1.c -b2.c;
            }
        };
    }
    
    */
    
    
    //Внутренний класс
    //public static class CompareByA implements Comparator<Box> { - второй вариант
    public  class CompareByA implements Comparator<Box> {
        
        @Override
        public int compare(Box b1, Box b2) {
            return b1.a - b2.a;
        }
        
    }
}

