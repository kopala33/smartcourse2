package Java_Loops;

public class JavaLoops {
    public static void main(String[] args) {
        /**
         *   Java Loops ციკლები
         */

        // While Loop
        // შევქმენით ნული (int i = 0) ნული ნაკლებია 5-ზე --> while (i < 5) დაპრინტავს 0-ს და მერე შეხვდება i++
        // 0 დაუმატებს 1-ს ჩამოვა და ისევ გააკეთებს ერთ ციკლს-ბრუნს. ეხლა 1 ნაკლები იქნება 5-ზე  ესე იტრიალებს 4-მდე 5 ხო ვერ იქნება ნაკლები 5-ძე
        // i++-ის დაწერა რომ დაგავიწყდეს კომპიუტერი ჩაიციკლება. ისეთი ლოგიკა უნდა დაწერო რომ სადგაც უნდა ჩერდებოდეს

        int i = 0;
        while (i < 5){
            System.out.println(i);  // ჯერ ადარებს მერე აკეთებს----> პასუხი 0 1 2 3 4
            i++;
        }

        // Do/While Loop
        // აკეთებს იგივე ნაირად ოღონდ იწერება სხვანაირად. (do) ანუ გამიკეთებს დამიპრინტავს (j) მიუმატებს j++; მერე მოზდევს პირობა როცა j მეტია 5-ზე while (j <  5)
        // Do/While შემთხვევაში რაღაცა ერთი მონაცემი მაინც იქნება

        int j = 0;
        do {
            System.out.println(j); // აქ პირიქით ჯერ აკეთბს და მერე ადარებს ---> პასუხი 0 1 2 3 4
            j++;
        } while (j < 5);


        // For Loop
        // ესეც იგივეა ოღონდ ერთ ხაზში იწერება ასე რომ (s++) არასდროს არ დაგავიწყდებათ

        for (int s = 0; s < 5; s++){  // პასუხი ---> 0 1 2 3 4
            System.out.println(s);
        }

        // კიდევ ერთი მაგალითი // დავბეჭდოთ მხოლოდ ლუწი რიცხვები 0 დან 20 ჩათვლით //
        // შევქმენი int dato = 0 ანუ ჩემი საწყისი სატრიალებელი არის (0)-ანი შემდეგი პირობა არის სად უნდა დასრულდეს ანუ 20 ჩათვლით -
        // dato <= 20 მაგიტომ არის მოცემული (<=) და dato += 2 ნიშნავს რომ მიუმატოს 2 (+=) მეტია თუ ტოლია

        for (int dato = 0; dato <= 20; dato+=2){
            System.out.println(dato); // პასუხი ---> 2 4 6 8 9 10 12 13 14 15 16 18 20
        }

        for (int r = 0; r <= 20; r++) {
            if (r % 2 == 0) {
                System.out.println(r + "-----"); // პასუხი 0 2 4 6 8 10 12 14 16 18 20
            }
        }
    }
}