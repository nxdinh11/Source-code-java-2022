package ex1_phoneNumberManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class phoneBook extends phone{
    ArrayList<String> phoneArrayList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        if(phoneArrayList.isEmpty()){
            phoneArrayList.add(name +"," + phone);
        }
        else {
            String ob = searchPhone(name);
            if(ob != null){
                if(!ob.contains(phone)){
                    phoneArrayList.set(phoneArrayList.indexOf(ob), ob + "  " + phone);
                }
            }else {
                phoneArrayList.add(name + "," + phone);
            }
        }
    }

    @Override
    public void removePhone(String name) {
        if(phoneArrayList.isEmpty()){
            System.out.println("danh ba trong");
        }else{
            String ob = searchPhone(name);
            if(ob != null){
                phoneArrayList.remove(ob);
                    System.out.println("da xoa nguoi dung "+ name+ " va sdt khoi danh ba");

            }else
                System.out.println("not found user " + name+ "trong danh ba" );

        }
    }
    @Override
    public void updatePhone(String name, String newPhone) {
        if(phoneArrayList.isEmpty()){
            System.out.println("Danh ba trong!!");
        }else{
            String ob = searchPhone(name);
            if(ob != null){
                if(!ob.contains(newPhone)){
                    //"ABCD, 087434434 : 0343565654" => "ABCD, " + newphone
                    phoneArrayList.set(phoneArrayList.indexOf(ob), ob.split(",")[0]+"," + newPhone );
                }
                else{
                    System.out.println("not found user " + name+ "trong danh ba de update" );
                }
            }
        }
    }


    @Override
    public String searchPhone(String name) {
        for(String obj : phoneArrayList){
            if(obj.split("," )[0].equals(name)){
                return obj;
            }
        }
        return  null;
    }

    @Override
    public void sort() {
        if(phoneArrayList.isEmpty()){
            System.out.println("danh ba trong khong the sap xep");
        }else{
            //sap xep tang dan
            System.out.println("Sap xep tang dan");
            Collections.sort(phoneArrayList, new Comparator<String>(){
                public int compare(String o1, String o2){
//                    return o1.compareTo(o2);
                    if(o1.compareTo(o2) > 0){
                        return 1;
                    } else if (o1.compareTo(o2) == 0) {
                        return 0;
                    }else return -1;
                }
            });
            System.out.println(phoneArrayList);
            System.out.println("Sap xep giam dan");
            phoneArrayList.sort(Comparator.reverseOrder());
            System.out.println(phoneArrayList);
        }
    }
    public void in(){
        for(String obj : phoneArrayList){
            System.out.println(obj);
        }
    }
}
