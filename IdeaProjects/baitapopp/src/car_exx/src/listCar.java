import java.util.Scanner;
public class listCar{
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int choice;
        car_in4[] arr = new car_in4[5];
        arr[0] = new car_in4();
        arr[1] = new car_in4();
        arr[2] = new car_in4();
        arr[3] = new car_in4();
        arr[4] = new car_in4();

        do {
            System.out.println("========Menu========");
            System.out.println("1. Add 5 objects car to list");
            System.out.println("2. Print out list car");
            System.out.println("3. Print out list car has priceForSale greater than 20");
            System.out.println("4. Cal total of car in list");
            System.out.println("5. Press 5 to exit program");
            System.out.print("Your choice is ");choice = key.nextInt();

            switch (choice){
                case 1:
                    int idd, quantityy;
                    double pricee, extraout;
                    String namee;
                    for(car_in4 obj : arr){
                        System.out.println("Nhap id");
                        obj.setId(idd = key.nextInt());
                        key.nextLine();
                        System.out.println("Nhap name");
                        obj.setName(namee = key.nextLine());
                        System.out.println("Nhap price");
                        obj.setPrice(pricee = key.nextDouble());
                        System.out.println("Nhap extraOut");
                        obj.setExtraOut(extraout = key.nextDouble());
                        System.out.println("Nhap quantity");
                        obj.setQuantity(quantityy = key.nextInt());}
                        break;
                case 2:
                    for (car_in4 obj:arr) {
                        System.out.println(obj);
                    }
                    break;

                case 3:
                    for (car_in4 obj : arr){
                        if(obj.priceForSale() >= 20) {
                            System.out.println(obj + " and price for sale is"+obj.priceForSale());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Total car is: " + arr.length);
                    break;
                default:
                    System.out.println("Reselect!!!");
            }

        }
        while(choice !=5);



    }
}