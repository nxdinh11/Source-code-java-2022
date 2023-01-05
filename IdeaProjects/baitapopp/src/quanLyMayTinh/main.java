package quanLyMayTinh;

public class main {
    public static void main(String[] args) {
        ngay day = new ngay(4, 7, 2000);
        national nationa = new national(" vietnam ", " +84 ");
        manufacturer manu = new manufacturer("Apple ", nationa);
        computer comp = new computer(manu, day, 1000, 24.5 , "MacBook " );

        ngay date = new ngay(4, 7, 2000);
        national nation = new national(" chinese ", " +86 ");
        manufacturer manuu = new manufacturer("huawei ", nationa);
        computer compu = new computer(manu, day, 1200, 27 , "MacBeek " );

        System.out.println("Chiec "+ comp.getTenMayTinh() + " san xuat tai "+ comp.getManufacturer().getNational().getTenQuocGia()+ " co gia "+ comp.getGiaBan()+ " time bao hanh la "+ comp.getNgay().toString()) ;
        System.out.println("Chiec "+ compu.getTenMayTinh() + " san xuat tai "+ compu.getManufacturer().getNational().getTenQuocGia()+ " co gia "+ compu.getGiaBan()+ " time bao hanh la "+ compu.getNgay().toString()) ;

        System.out.println(comp.checkCost(compu.getGiaBan()));


    }
}
