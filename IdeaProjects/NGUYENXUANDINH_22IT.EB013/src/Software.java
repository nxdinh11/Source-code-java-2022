public class Software {
    private String name;
    private double size;
    private int releaseYear;
    private String platform;

    public Software(){}
    public Software(String name , double size, int releaseYear, String platform){
        this.name = name;
        this.size = size;
        this.releaseYear =releaseYear;
        this.platform = platform;
    }

    public String  getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Software{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", releaseYear=" + releaseYear +
                ", platform='" + platform + '\'' +
                '}';
    }
}
