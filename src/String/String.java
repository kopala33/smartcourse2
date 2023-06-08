package String;

public class String {
    public static void main(java.lang.String[] args) {
        /**
         *  String Lenght
         *  String-ის ერთი მეთოდი არის lenght რომლის მეშვეობითაც შეგვიძლია ტექსტის ზომის გაგება
         *  მაგალითად  "SmartAcademy" ზომა არის 12
         */

        java.lang.String txt = "SmartAcademy";
        System.out.println("The Lenght of the txt string is: " + txt.length());
        int number = txt.length();


        /**
         *  String-ის სხვა მეთოდები
         *  toUpperCase()  თუ გინდა რომ შენი სიტყვა გადაიყვანოს ---> (SmartAcademy) დიდი ასოებით -->(SMAERTACADEMY)
         *  toLowerCase()  ან თუ გინდა რომ შენი სიტყვა გადაიყვანოს --> (SmartAcademy) პატარა ასოებით-->(smartacademy)
         */

        java.lang.String txt_1 = "SmartAcademy";
        System.out.println(txt_1.toUpperCase());
        System.out.println(txt_1.toLowerCase());

        /**
         *  String-ში კონკრეტული სიმბოლოს პოვნა ანუ ინდექსაცია რომელიც იწყება მხოლოდ ნოლიდან
         *  ქვემოთ მოცემულ მაგალითში ათვლა იწყება -->(f)-დან (find 'my) პრობელიც (find_'-იც ითვლება) გამოდის მე-6ე
         *  იმ შემთხვევაში თუ კი გინდა კონკრეტულად მიუთითო -->(y) მაშინ იქნება დათვლის როგორც მე-(7)დეს
         */

        java.lang.String txt_2 = "find 'my location";
        System.out.println("Character Position is " + txt_2.indexOf("my")); // მაგ--> Character Position is 6


        /**
         *  String-ის გაერთიანების მეთოდი პლიუსის გარეშე რომელიც არ არის პრაქტიკული მაგრამ ...
         *  ქვემოთ მოცემული მაგალითიდან ჩანს (firstName.concat(lastName)
         *  პლიუსის მაგალითი System.out.println(firstName + lastName)); რომელიც ამოიბეჭდება იგივე ნაირად
         */

        java.lang.String firstName = "Data ";
        java.lang.String lastName = "Kopala";
        System.out.println(firstName.concat(lastName));


        /**
         * სპეციალური სიმბოლოების დამატება შიგნით ბრჭყალებში არ შეიძლება
         * მაგალითად ამ  String txt_3 = "my hose \'position\' is 5"; ბრჭყალების წინ უნდა დაუსვა დახრილი ხაზი
         * რომ ამომიპრინტეროს, სხვა შემთხვევაში იქნება შეცდომა ანუ ვერ გაიგებს ბრჭყალების შიგნით კიდევ ბრჭყალებს
         * ან მაგალითად ჩემი სახლის ნომერია String txt_3 = "my hose number is 5\2"; ამ შემთხვევაში (5\\2) წინ უმატებთ (\)
         * ამოაპრინტეროს ანუ აღიქვას სწორად მაგ--> "my hose number is 5\\2"
         */

        java.lang.String txt_3 = "my hose \'position\' is 5";
        System.out.println(txt_3);
    }


}
