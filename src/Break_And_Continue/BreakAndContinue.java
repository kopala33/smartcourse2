package Break_And_Continue;

public class BreakAndContinue {
    public static void main(String[] args) {
        /**
         * Java break and continue
         *
         */

        // break; წყვეტს ერთ ციკლს მივა 4-მდე და დაა-break-ებს დაატორმუზებს :)))

        for (int w = 0; w < 10; w++) {
            if (w == 4) {
                break;
            }
            System.out.println(w);  // პასუხი 0 1 2 3
        }

        // continue: მხოლოდ გაწყვეთს ერთ იტერაციას, ანუ რომ მივა 4 == 4 გაუტოლდება 4-ს და გადაახტება და გააგრძელებს

        for (int w = 0; w < 10; w++) {
            if (w == 4) {
                continue;
            }
            System.out.println(w); // პასუხი 0 1 2 -(4-ს გადაახტა)- 3 5 6 7 8 9
        }
    }
}
