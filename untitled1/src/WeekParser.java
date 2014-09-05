/**
 * Created by c.horsch on 03.08.2014.
 */
public class WeekParser {


    private String getWeekday(int day) {
        String[] Weekday = new String[8];

        Weekday[1] = new String("Montag");
        Weekday[2] = new String("Dienstag");
        Weekday[3] = new String("Mittwoch");
        Weekday[4] = new String("Donnerstag");
        Weekday[5] = new String("Freitag");
        Weekday[6] = new String("Samstag");
        Weekday[7] = new String("Sonntag");

        return (Weekday[day]);
    }

    private boolean isCoherent(int[] values) {
        if (values.length == 1) {
            return (true);
        }
        for (int i = 1; i < values.length; i++) {
            if (values[i] != values[i - 1] + 1) {
                return (false);
            }
        }
        return (true);
    }


    public void parse(int[] days) {
        if (!isCoherent(days)) {
            for (int i = 0; i < days.length; i++) {
                System.out.print(getWeekday(days[i]));
                if (i < days.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
                System.out.print(getWeekday(days[0]));
                System.out.print("-");
                System.out.print(getWeekday(days[days.length-1]));
            }
            System.out.println();
        }
    }

