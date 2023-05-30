package calendar;

/**
 *
 * @author Babaev Stepan
 */
public class Calendar {

    
    public static void main(String[] args) {
        int year=2023;
        int dayNum =150;
        int [] daysInMonths={31,28,31,30,31,30,31,31,30,31,30,31};
        String []months={"январь","февраль","март","апрель","май","июнь","июль","август","сентябрь","октябрь","ноябрь","декабрь"};
        
        int monthNum=0;
        boolean isLeapYear=(year%4==0)&& (year%100!=0 || year%400==0);
        
            for(int days : daysInMonths){
                if (isLeapYear && days==28) ++days;
                if (dayNum<=days) break;
                
                dayNum -=   days;
                monthNum++;
            }
        System.out.printf("%d %s \n", dayNum, months[monthNum]);
    }
    
}
