import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //ArrayList arr1 = new ArrayList(); non_generic  kieu cu
        ArrayList<String> arr1 = new ArrayList<String>(/*soPhanTu*/);//generic kieu moi
        //add elements to Arraylist with add().

        arr1.add("Nguyen");
        arr1.add("Xuan");
        arr1.add("Dinh");

        System.out.println("--- Display all elements of ArrayList by its name:---");
        System.out.println(arr1);

        System.out.println("--- Display all elements of ArrayList with for-loop:---");
        for(int i = 0; i<arr1.size(); i++){
            System.out.print(arr1.get(i)+ " ");
        }
        System.out.println("");

        System.out.println("--- Display all elements of ArrayList with for-each:---");
        for(String getArr : arr1){
            System.out.print(getArr+ " ");
        }
        System.out.println("");

        System.out.println("--- Display all elements of ArrayList with iterator:---");
        Iterator<String> iterator1 = arr1.iterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()+ " ");
        }
        System.out.println("");

        System.out.println("--- addAll---");
        ArrayList<String> arr2 =  new ArrayList<String>();
        arr2.add("22ITE");
        arr2.add("VKU");
        arr2.add("Dinh");
        arr1.addAll(arr2);
        System.out.println(arr1);//arr1 nhận tất cả giá trị của arr2

        System.out.println("--- retainAll---");//xoa phan tu cua a ma khong thuoc b
        arr1.retainAll(arr2);
        System.out.println(arr1);

        System.out.println("--- removeAll---");// xoa toan bo phan tu thuoc b khoi a
        arr1.removeAll(arr2);
        System.out.println(arr1);

        System.out.println("--- Access to elements of ArraysList with get()---");
        System.out.println(arr2);
        System.out.println("_elements of index 2 is:_  "+arr2.get(2));

        System.out.println("--- Update elements with set(int index, new elements)---");
        arr2.set(2, "2k4");
        System.out.println(arr2);

        System.out.println("--- xoa 1 phan tu voi remove()---");
        arr2.remove(0);
        arr2.remove("2k4");
        System.out.println(arr2);

        arr2.add("22ITE");
        arr2.add("Dinh");
        arr2.add("Dinh");

        System.out.println("--- Research a element with contains()---");
        boolean a = arr2.contains("VKU");
        System.out.println("Do b exist in ArrayList: "+a);
        System.out.println("");

        System.out.println("--- ");
        int b = arr2.indexOf("Dinh");
        System.out.println(arr2);
        System.out.println("index of Dinh: "+ b);

        System.out.println("--- Research the last index of elements in ArraysList with lastIndexOf()---");
        int c = arr2.lastIndexOf("Dinh");
        System.out.println("the last index of elements is: "+ c);
        System.out.println("");

        System.out.println("--- convert ArrayList to Array---");
        Object [] d = arr2.toArray();
        System.out.println("Duyet phan tu trong array: ");
        for(Object array: d){
            System.out.println(array);
        }
        System.out.println("");

        System.out.println("--- remove all elements in ArraysList with clear()---");
        System.out.println("arr2: "+ arr2);
        arr2.clear();
        System.out.println(arr2+" con cai nit!!");


    }
}