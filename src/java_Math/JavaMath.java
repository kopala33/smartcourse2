package java_Math;

public class JavaMath {
    public static void main(String[] args) {
        /**
         *  Java Math შეგვიძლია გამოვიყენოთ int-float-double-თან
         *  მათემატიკური მეეთოდები
         */

        Math.max(10,20); //--> რომელიან მაქსიმალური ციფრი ----> პასუხი 20
        Math.min(10,20); //--> რომელიან მანიმალური ციფრი -----> პასუხი 10
        Math.sqrt(9);    //--> ფესვის ამოღება ------->
        Math.random();   //--> ნულიდან 1 ჩათვლით რანდომულათ ანუ თვითონ ირჩეეეეევს, გაძლევს ციფრებს ---> პასუხი 0.1242647894765
        Math.abs(-5.4);  //--> უარყოფითი რიცხვის აბსოლიტურ დადებით მნიშვნელობას აბრუნებს (-5.4-გან) მოგცემს (5.4-ს) ---> პასუხი 5.4


        /**
         *  Java Conditions and If Statements
         *  if ----> თუ პირობა შესრულეებულია ჭეშმარიტად ანუ -- true
         *  else ----> თუ პირობა შესრულეებულია მცდარად ანუ -- false
         *  else if --->  თუ გამოიყენება ახალი პირობის დამატებულად, სრულდეება იმ შეემთხვევაში თუ ეს პირველი (if)-ი მცდარია
         *  switch ---> გამოიყენება იმ შემთხვევაში თუ ბეევრი
         */

        // if statement
        // თუ 45 მეტია 38-ზე აუცილებლად უნდა ქონდეს ორი მნიშვნელობა ან true ან false აუცილებლად უნდა იყოს შედარების ოპერატორი


        if (45 > 38); {
            System.out.println("45 is greater then 38"); // თუ იქნება ---> (true) მაგ შემთხვევაში შემოვა მეთოდის ბრჩხილებში

        }

        int a = 30;
        int b = 15;
        if (a != b){   // პასუხი ---> (int a = 30) და (int b = 15) განსხვავებული ციფრები: შესაძლებელია აქ იყოს + - / ასშ
            System.out.println("a and b is different integers");
        }

        int age = 25;
        if (age > 18){
            System.out.println("teenager"); // პასუხი არის ---> ("teenager") იმიტომ რომ 25 მეტია 18-ზე (age > 18)
        }else {
            System.out.println("other");
        }

        int age1 = 16;
        if (age < 18){
            System.out.println("teenager"); // პასუხი ---> ("other") იმიტომ რომ 16 ნაკლებია 18-ზე (age < 18)
        } else {
            System.out.println("other");
        }

        int age_2 = 16;
        if (age_2 < 18){
            System.out.println("teenager"); // პასუხი -->("teenager") თუ იქნებოდა (int age_2 = 20) პასუხი -->("yong") 30 შემთხვევაში იქნებოდა ("other")
        } else if (age_2 < 30) {
            System.out.println("yong");
        } else {
            System.out.println("other");
        }

        // Short Hand If...Else (Ternary Operators)
        // თუ გვაქვს მარტივი if და else-s მაგალითი შეგვიძლია დავწერო ერთ ხაზზე
        int age3 = 16;
        String result = age3 < 18 ? "teenager" : "other"; // (?)ნიშანი არის თუ არის true და თუ არის false აღინიშნება -->(:)  პასუხია--> (?)  "teenager"
        System.out.println(result);
    }
}
