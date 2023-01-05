package cadres;

public class congNhann extends canBo{
    private int levels;

    public congNhann(String hoTen, int tuoi, boolean gioiTinh, String diaChi, int levels){
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.levels = levels;
    }
    public congNhann(){

    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }
    public String toString() {
        return "congNhann{" +
                "levels=" + levels +
                '}';
    }

}
