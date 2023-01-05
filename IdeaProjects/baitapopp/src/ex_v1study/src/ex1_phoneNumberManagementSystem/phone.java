package ex1_phoneNumberManagementSystem;

public abstract class phone {
    public abstract void insertPhone(String name, String phone);
    public abstract void removePhone(String name);
    public abstract void updatePhone(String name, String newPhone);
    public abstract String searchPhone(String name);
    public abstract void sort();
}
