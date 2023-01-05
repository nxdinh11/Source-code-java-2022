package extendd;

public class people {
    protected String hoVaTen;
    protected int namSinh;

    public people (String hovaten, int namsinh){
        this.hoVaTen = hovaten;
        this.namSinh = namsinh;
    }
    public String getHoVaTen(){
        return this.hoVaTen;
    }
    public void setHoVaTen(String x){
        this.hoVaTen = x;
    }
    public int  getNamSinh(){
        return this.namSinh;
    }
    public void setNamSinh(int y){
        this.namSinh = y;
    }
    public String toString (){
        return "{ " +this.namSinh+ this.hoVaTen+ " }";
    }
    public void an(){
        System.out.println("ăn");
    }
    public void ngu(){
        System.out.println("ngủ ");
    }

}
