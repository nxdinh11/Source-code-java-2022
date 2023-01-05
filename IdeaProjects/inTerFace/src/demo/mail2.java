package demo;

public interface mail2 {
    default void method3(){
        System.out.println("default method có phần thân chương trình hoặc không, nhưng vẫn khởi tạo hàm để khai báo");
    }
    void method4();
    static void method5(){
        System.out.println("Static method không cần tạo đối tượng để khai báo");
    }
}
