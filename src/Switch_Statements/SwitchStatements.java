package Switch_Statements;

public class SwitchStatements {
    public static void main(String[] args) {
        /**
         *   Switch Statements
         *   ყველა კეის ააქვს თავისი ნუმერაცია და იმ ნომერით პოულობს. თუ მაგალითად იქნებოდა შექმნილი (int weekday = 6) და ქეისი 5-ა მაშინ გადაახტება ყველას--
         *   და ჩავა ბოლოში default: ("Weekday not found")
         *   ყველა System.out.println ქვემოთ უნდა მიუწეროთ (break) გადაახტება თავისას და გაჩერდება შემდეგზე სადაც დახვდება (break) თუ არცერთზე არ შეხვდა--
         *   (break) მაშინ დაბეჭდავს ყველას
         */

        int weekday = 2;
        switch (weekday){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday"); // პასუხია ეს იმიტომ რომ იპოვა 2 ანუ -->("Tuesday") ამისგან --> (int weekday = 2)
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekday not found");

        }
    }
}
