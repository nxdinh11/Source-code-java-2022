package vd_JCombobox_JList.control;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;


import vd_JCombobox_JList.view.ThucDonView;

public class ThucDonController implements ActionListener{
    private final ThucDonView thucDonView;

    public ThucDonController(ThucDonView thucDonView) {
        this.thucDonView = thucDonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String monChinh = Objects.requireNonNull(this.thucDonView.jComboBox_MonChinh.getSelectedItem()).toString();


        StringBuilder monPhu = new StringBuilder();
        Object[] luachonMonPhu = this.thucDonView.jList_MonPhu.getSelectedValues();
        for (Object o : luachonMonPhu) {
            monPhu.append(o.toString()).append(";");
        }


        thucDonView.thucDonModel.setLuaChon_MonChinh(monChinh);
        thucDonView.thucDonModel.setLuaChon_MonPhu(String.valueOf(monPhu));
        thucDonView.thucDonModel.tinhTongTien();
        thucDonView.hienThiKetQua();
    }

}
