package Chapter_6;

public class DisplayCurrentDateAndTime {
    public static void main(String[] args){
        System.out.println(currentTime() + "  " + currentDate());
    }
    public static String currentDate(){
        String date = "" + currentDay() + "." + currentMonth()+ "." + currentYear();
        return date;
    }
    public static long currentDay(){
        long days = currentHour() / 24;
        return days;
    }
    public static String currentMonth(){

    }
    public static long currentYear(){
        int startYear = 1970;
        int year = 0;
        int totalDays = 0;
        for (;totalDays < ; i++) {
            if((startYear + year) % 4 == 0 && (startYear + year) % 100 != 0)
                year++;
        }



    }

    public static String currentTime(){
        String time = "" + (currentHour() % 24) + ":" + (currentMinutes() % 60) + ":" + (currentSeconds() % 60);

    }
    public static long currentHour(){
        long hours = currentMinutes() / 60;
        return hours;

    }
    public static long currentMinutes(){
        long mins = (int)(currentSeconds() / 60);
        return mins;


    }
    public static long currentSeconds(){
        long secs = (int)(System.currentTimeMillis() / 1000);
        return secs;
    }

}
