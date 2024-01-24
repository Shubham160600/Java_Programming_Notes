/* Example of Enumeration. */

package shubham;

enum WeekDays { sun, mon, tues, wed, thurs, fri, sat }

class Test {
    public static void main(String args[]) {
        WeekDays wk;
        wk = WeekDays.sun;
        System.out.println("Today is " + wk);
    }
}
