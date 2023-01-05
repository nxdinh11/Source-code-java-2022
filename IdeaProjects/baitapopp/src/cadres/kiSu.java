package cadres;

public class kiSu extends canBo{
    private String chuyenNganh;
    public kiSu(String chuyenNganh){
        super();
        this.chuyenNganh = chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    @Override
    public String toString() {
        return "kiSu{" +
                "chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }
}

