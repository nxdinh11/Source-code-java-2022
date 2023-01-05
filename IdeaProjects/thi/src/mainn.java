public class mainn {
    public static void main(String[] args) {
        hihiahha [] arr = new hihiahha[2];

        arr[0] = new hihiahha();
        arr[1] = new hihiahha();
//        arr[2] = new hihiahha("nguyen xuan dinh", 2004);
//        arr[3] = new hihiahha("phan van b", 1999);

        System.out.println("Input In4: \n");
        for (int i = 0 ; i < arr.length; i++){
        arr[i].nhapThongTin();
        System.out.println("");
        }


        System.out.println(arr[0]);
        System.out.println(arr[1]);


    }
}
