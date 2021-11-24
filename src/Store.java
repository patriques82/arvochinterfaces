public class Store {
    public static void printOpenHours(Weekday day) {
        String s;
        switch(day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                s = "08:00-17:00";
                break;
            case SATURDAY:
            case SUNDAY:
                s = "10:00-14:00";
                break;
            default:
                s = "hello whatsup !";
                break;
        }
        System.out.println(s);
    }
}
