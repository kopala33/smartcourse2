package Array_Masivebi;

public class Array {
    public static void main(String[] args) {

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
        System.out.println(Family_2.length + "------------> 5 names");

        /**
         * Multidimensional Array მრავალგანზომილებიანი მასივი:
         *  მრავალ განზომილებიანის შემთხვევასი იწერება [][] და ფიგურული ბრჩხილებში ანუ მთლიან მასივში შიიგნით კიდევ ფიგურული ფრხილებით 2 პატარა მასივია
         *  [0][1] ეს ნიშნავს რომ ეს 2 პატარა მასივებია და ამითი-->[0] აღინიშნება რომ 1 მასივის {1, 2, 3, 4,} ირველი რიცხვი 1,
         *  მაგალითად ჩვენ რომ გვინდოდეს 2-რე შიდა მასივის 7,-ანის მოძებნა მაგ შემთხვევაში იქნებოდა int x = myNumbers[1][2]--> {5, 6, 7}
         */

        int[][] myNumbers = {{1, 2, 3, 4,}, {5, 6, 7}};
        int x = myNumbers[0][0];
        System.out.println(myNumbers[0][0] + "----->");

        // მინდა დავბეჭდო მრავალგანზომილებიანი მასივის ყველა ელემენტი ერთად
        //  Array: მეორე მაგალითი მრავალგანზომილებიანი მასივის

        // int[][] myNumbers = {{1, 2, 3, 4,}, {5, 6, 7}};
        // for (int i = 0; i < myNumbers.length; i++){
          //for (int j = 0; j < myNumbers[i].length; j++){
               //System.out.println(myNumbers[i][j]);



        // სხვა მაგალითი: მინდა დავბეჭდო ერთგაზომილებიანი მასივის ყველა ელემენტი ერთად //
        // ქვემოთ მოცემული მაგალითს ვწერთ for-ით იმიტომ რომ მოცემულობაშია რომ უნდა დავთვალოთ მასივის ყველა ელემენტი
        //int h = 0 ვიწყებთ ნულიდან (h)არის ნული, მერე ნულს ვაკლებთ h < array-ს იმიტომ რომ array-ი არის მთლიანი მასივის სახელი-
        //- უსვამთ წერტილს რომ გამოვიწახოთ ბიბლიოთეკიდან (length-სი ანუ სიგრძის აღმნიშვნელი ბრძანება) მერე h++ იმიტომ რომ ნულმა-
        // დაუმატოს 1-თით თავის თავს და დატრიალდეს ციკლი 5-თამდე იმიტომ რომ {"father", "mother", "kids", "Brother", "Sister"}5თია
        // პრინტელენში ვწერთ array[h] (array) არის როგორც ზემოთ ვახსენე მთლიანი მასივის სახელი და (h) არის საწყისი ანუ 0

        String[] array = {"father", "mother", "kids", "Brother", "Sister"};
        for (int h = 0; h < array.length; h++) {
            System.out.println(array[h]);
        }
    }
}
