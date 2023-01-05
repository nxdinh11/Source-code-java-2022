package extendd;

public class vietnamese extends people {

    public vietnamese(String hovaten, int namsinh) {
        super(hovaten, namsinh);// truyền dữ liệu từ constructor vào super để đưa sang class people
    }
    public String xinChao(){
        return "chao";
    }

}
