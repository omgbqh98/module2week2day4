public class NextDayCalculator {

    public static int[] nextDayCalculator(int day, int month, int year  ) {
        int[] nextDay = new int[3];
        if (day < 0 || month < 0 || year < 0) {
            throw new RuntimeException("loi");
        }else if ((isLeapYear(year))){
            if (day == 29 && month == 2) {
                day = 1;
                month ++;
            } else if (day >= 1 && day < 29) {
                day++;
            }
        }
        else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day >= 1 && day < 31) {
                    day++;
                } else if (day == 31 && month < 12) {
                    day = 1;
                    month++;
                } else if (day == 31 && month == 12) {
                    year++;
                    month = 1;
                    day = 1;
                }
            } else {
                if (day >= 1 && day < 30) {
                    day++;
                } else if (day == 30) {
                    day = 1;
                    month++;
                }
            }

            }
        nextDay[0] = day;
        nextDay[1] = month;
        nextDay[2] = year;
        return nextDay;
    }
    public static boolean isLeapYear(int year){
        boolean division4 = year % 4== 0;
        boolean division100 = year % 100== 0;
        boolean division400 = year % 400== 0;
        if (division4){
            if (division100){
                if (division400){
                    return true;
                }
            }
            else return true;
        }
        return false;
    }
}
