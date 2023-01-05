public class THREE {// cộng 2 số phức
    int real, imag;
    public THREE(int r, int i) {
        this.real = r;
        this.imag = i;
    }
    public static THREE value(THREE c1, THREE c2){
        THREE temp = new THREE(0 ,0);
        temp.real = c1.real + c2.real;
        temp.imag = c1.imag + c2.imag;
        return temp;
    }
    public static void main(String[] args) {
        THREE c1 = new THREE(4, 3);
        THREE c2 = new THREE(5, 2);
        THREE temp = value(c1, c2);
        System.out.println(temp.real  + " + "+ temp.imag+ "i");
    }
}
