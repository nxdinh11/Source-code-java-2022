package film_management;

public class main {
    public static void main(String[] args) {


        manufacturer manufacturer/*biến nhận các giá trị sau new*/ = new manufacturer/*cho giá trị vào class*/("Nguyen Xuan Dinh", "Vietnam");
        show_date show_da = new show_date(4, 5, 2022);
        film fil = new film("Titanic", 1980, 15, show_da, manufacturer);

        manufacturer manufacturer1 = new manufacturer("Nguyen Xuan Dinh", "Vietnam");
        show_date show_date1 = new show_date(9, 5, 2022);
        film film1 = new film("Captain America", 2001, 16, show_date1, manufacturer1);

        manufacturer manufacturer2 = new manufacturer("Nguyen Xuan Dinh", "Vietnam");
        show_date show_date2 = new show_date(11, 5, 2022);
        film film2 = new film("Iron Man 2", 2002, 19, show_date2, manufacturer2);

        System.out.println("Kiểm tra xem giá vé film " + fil.getNameFlim() + " có rẻ hơn" + film1.getCost()  + " không " +  fil.checkCost(film1));
        System.out.println("Hãng sản xuất phim " + fil.getNameFlim() +" là " + fil.getManufacturer().getManufacturer_name());

        System.out.println("phim " + film1.getNameFlim() + " giá phòng vé là " + film1.getCost() + " Sale 20% chỉ còn " + film1.sale());
        System.out.println("Sale 20% chỉ còn "  + film2.sale());
        System.out.println("Sale 20% chỉ còn "  + fil.sale());

        System.out.println(fil.getCost());
        System.out.println(fil.getManufacturer());
    }
}
