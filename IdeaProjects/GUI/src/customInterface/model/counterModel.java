package customInterface.model;

public class counterModel {
    private int value;

    public counterModel(){
        this.value = 1;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void increment(){
        this.value++;
    }
    public void decrement(){
        this.value--;
    }
    public void reset(){
        this.value = 0;
    }
}
