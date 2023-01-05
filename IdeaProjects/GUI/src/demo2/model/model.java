package demo2.model;

public class model {




    private float value_1;
    private float value_2;
    private float total;

    public model() {
        this.value_1 = 0;
        this.value_2 = 0;
        this.total = 0;
    }

    public float getValue_1() {
        return value_1;
    }

    public void setValue_1(float value_1) {
        this.value_1 = value_1;
    }

    public float getValue_2() {
        return value_2;
    }

    public void setValue_2(float value_2) {
        this.value_2 = value_2;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    public void times(){
        this.total = this.value_1*this.value_2;
    }
    public void divide(){
        this.total = this.value_1/this.value_2;
    }

    public void plus(){
        this.total = this.value_1+this.value_2;
    }

    public void minus(){
        this.total = this.value_1-this.value_2;
    }



}
