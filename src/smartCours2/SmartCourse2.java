package smartCours2;

public class SmartCourse2 {
    public static void main(String[] args) {

        /**
         *  String Lenght
         *  String-ის ერთი მეთოდი არის lenght რომლის მეშვეობითაც შეგვიძლია ტექსტის ზომის გაგება
         *  მაგალითად  "SmartAcademy" ზომა არის 12
         */

        String txt = "SmartAcademy";
        System.out.println("The Lenght of the txt string is: " + txt.length());
        int number = txt.length();


        /**
         *  String-ის სხვა მეთოდები
         *  toUpperCase()  თუ გინდა რომ შენი სიტყვა გადაიყვანოს ---> (SmartAcademy) დიდი ასოებით -->(SMAERTACADEMY)
         *  toLowerCase()  ან თუ გინდა რომ შენი სიტყვა გადაიყვანოს --> (SmartAcademy) პატარა ასოებით-->(smartacademy)
         */

        String txt_1 = "SmartAcademy";
        System.out.println(txt_1.toUpperCase());
        System.out.println(txt_1.toLowerCase());

        /**
         *  String-ში კონკრეტული სიმბოლოს პოვნა ანუ ინდექსაცია რომელიც იწყება მხოლოდ ნოლიდან
         *  ქვემოთ მოცემულ მაგალითში ათვლა იწყება -->(f)-დან (find 'my) პრობელიც (find_'-იც ითვლება) გამოდის მე-6ე
         *  იმ შემთხვევაში თუ კი გინდა კონკრეტულად მიუთითო -->(y) მაშინ იქნება დათვლის როგორც მე-(7)დეს
         */

        String txt_2 = "find 'my location";
        System.out.println("Character Position is " + txt_2.indexOf("my")); // მაგ--> Character Position is 6


        /**
         *  String-ის გაერთიანების მეთოდი პლიუსის გარეშე რომელიც არ არის პრაქტიკული მაგრამ ...
         *  ქვემოთ მოცემული მაგალითიდან ჩანს (firstName.concat(lastName)
         *  პლიუსის მაგალითი System.out.println(firstName + lastName)); რომელიც ამოიბეჭდება იგივე ნაირად
         */

        String firstName = "Data ";
        String lastName = "Kopala";
        System.out.println(firstName.concat(lastName));


        /**
         * სპეციალური სიმბოლოების დამატება შიგნით ბრჭყალებში არ შეიძლება
         * მაგალითად ამ  String txt_3 = "my hose \'position\' is 5"; ბრჭყალების წინ უნდა დაუსვა დახრილი ხაზი
         * რომ ამომიპრინტეროს, სხვა შემთხვევაში იქნება შეცდომა ანუ ვერ გაიგებს ბრჭყალების შიგნით კიდევ ბრჭყალებს
         * ან მაგალითად ჩემი სახლის ნომერია String txt_3 = "my hose number is 5\2"; ამ შემთხვევაში (5\\2) წინ უმატებთ (\)
         * ამოაპრინტეროს ანუ აღიქვას სწორად მაგ--> "my hose number is 5\\2"
         */

        String txt_3 = "my hose \'position\' is 5";
        System.out.println(txt_3);


        /**
         *  Java Math შეგვიძლია გამოვიყენოთ int-float-double-თან
         *  მათემატიკური მეეთოდები
         */

        Math.max(10,20); //--> რომელიან მაქსიმალური ციფრი ----> პსუხი 20
        Math.min(10,20); //--> რომელიან მანიმალური ციფრი -----> პასუხი 10
        Math.sqrt(9);    //--> ფესვის ამოღება ------->
        Math.random();   //--> ნულიდან 1 ჩათვლით რანდომულათ ანუ თვითონ ირჩეეეეევს გაძლევს ციფრებს ---> პასუხი 0.1242647894765
        Math.abs(-5.4);  //--> უარყოფითი რიცხვის აბსოლიტურ დადებით მნიშვნელობას აბრუნებს -5.4 გან მოგცემს 5.4-ს ---> პასუხი 5.4


        /**
         *  Java Conditions and If Statements
         *  if ----> თუ პირობა შეეესრულეებულია ჭეშმარიტად ანუ -- true
         *  else ----> თუ პირობა შეეესრულეებულია მცდარად ანუ -- false
         *  else if --->  თუ გამოყენეება ახალი პირობის დამატებულად, სრულდეება იმ შეემთხვევაში თუ ეს პირველი (if)-ი მცდარია
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

        for (int r = 0; r <= 20; r++){
            if (r % 2 == 0){
                System.out.println(r + "-----"); // პასუხი 0 2 4 6 8 10 12 14 16 18 20
            }
        }

        /**
         * Java break and continue
         */

        // break; წყვეტს ერთ ციკლს მივა 4-მდე და დაა-break-ებს დაატორმუზებს :)))

        for (int w = 0; w < 10; w++){
            if (w == 4){
                break;
            }
            System.out.println(w);  // პასუხი 0 1 2 3
        }

        // continue: მხოლოდ გაწყვეთს ერთ იტერაციას, ანუ რომ მივა 4 == 4 გაუტოლდება 4-ს და გადაახტება და გააგრძელებს

        for (int w = 0; w < 10; w++){
            if (w == 4){
                continue;
            }
            System.out.println(w); // პასუხი 0 1 2 -(4-ს გადაახტა)- 3 5 6 7 8 9
        }

        /**
         *  Arrays - მასივები:     არაპრიმიტიულია ანუ არ არის მარტივი. მაგალითად თუ მინდა შევინახო ერთად ან (String-ბი) (int-ბი) (char-ბი) ან (float-ბი) ასშ
         *
         *  1 მაგალითი: String[] შევქმენი ცვლადი-->(Family) = და შევქმენი მასივი -->{"father", "mother", "kids", "Brother", "Sister"} მინდა ვიპოვნო ამ მასივში
         *  მაგალითად რომელ იდექსე არის "mother" და მიუთითე --->(Family[1]) ---- System.out.println(Family[1]); ინდექსის ათვლა ყოველთვის იწყება 0-დან
         *  ასე რომ ("father" არის 0 ინდექსზე)  ("mother" იმყოფება 1 ინდექსზე)
         *
         *  2 მაგალითი:
         *  თუ მინდა შეცვლა ან გატოლება რომელიმე  ინდექსის ანუ 2-რე მაგალითის შემთხვევაში ("mother")-ის შეცვლა ("kids")-ზე ვწერ სვლადის სახელს -->(Family_1[1] = "kids";)
         *
         */

        String[] Family = {"father", "mother", "kids", "Brother", "Sister"};
        System.out.println(Family[1]);

        String[] Family_1 = {"father", "mother", "kids", "Brother", "Sister"};
        Family_1[1] = "kids";
        System.out.println(Family_1[1]);


        /**
         *  Array Lenght -- მასივის სიგრძე:
         *  ამ შემთხვევაში თუ გვინდა გავიგოთ მასივის სიგრძე უწერთ მხოლოდ (Family_2.length) და იქნება 5-თი
         */


        String[] Family_2 = {"father", "mother", "kids", "Brother", "Sister"};
        System.out.println(Family_2.length);

        /**
         * Multidimensional Array მრავალგანზომილებიანი მასივი:
         *  მრავალ განზომილებიანის შემთხვევასი იწერება [][] და ფიგურული ბრჩხილებში ანუ მთლიან მასივში შიიგნით კიდევ ფიგურული ფრხილებით 2 პატარა მასივია
         *  [0][1] ეს ნიშნავს რომ ეს 2 პატარა მასივებია და ამითი-->[0] აღინიშნება რომ 1 მასივის {1, 2, 3, 4,} ირველი რიცხვი 1,
         *  მაგალითად ჩვენ რომ გვინდოდეს 2-რე შიდა მასივის 7,-ანის მოძებნა მაგ შემთხვევაში იქნებოდა int x = myNumbers[1][2]--> {5, 6, 7}
         */

        int[][] myNumbers = {{1, 2, 3, 4,}, {5, 6, 7}};
        int x = myNumbers[0][0];
        System.out.println();

        // სხვა მაგალითი: მინდა დავბეჭდო ერთგაზომილებიანი მასივის ყველა ელემენტი ერთად //
        // ქვემოთ მოცემული მაგალითს ვწერთ for-ით იმიტომ რომ მოცემულობაშია რომ უნდა დავთვალოთ მასივის ყველა ელემენტი
        //int h = 0 ვიწყებთ ნულიდან (h)არის ნული, მერე ნულს ვაკლებთ h < array-ს იმიტომ რომ array-ი არის მთლიანი მასივის სახელი-
        //- უსვამთ წერტილს რომ გამოვიწახოთ ბიბლიოთეკიდან (length-სი ანუ სიგრძის აღმნიშვნელი ბრძანება) მერე h++ იმიტომ რომ ნულმა-
        // დაუმატოს 1-თით თავის თავს და დატრიალდეს ციკლი 5-თამდე იმიტომ რომ {"father", "mother", "kids", "Brother", "Sister"}5თია
        // პრინტელენში ვწერთ array[h] (array) არის როგორც ზემოთ ვახსენე მთლიანი მასივის სახელი და (h) არის საწყისი ანუ 0

        String[] array = {"father", "mother", "kids", "Brother", "Sister"};
        for (int h = 0; h < array.length; h++){
            System.out.println(array[h]);
        }























    }
}