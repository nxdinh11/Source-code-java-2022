package Vd_Error.control;


import Vd_Error.view.ThucDonView;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

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

        String soTien_chuoi = (String) JOptionPane.showInputDialog(
                thucDonView,
                thucDonView.jLabel_ThongTin.getText()+"\ninput money:",
                "Nofitication"
                , JOptionPane.PLAIN_MESSAGE);

        try{
            double soTien = Double.parseDouble(soTien_chuoi);
            JOptionPane.showMessageDialog(thucDonView,"cash in return: "+ (soTien - this.thucDonView.thucDonModel.getTongTien()),
                    "cash in return", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e2){
            JOptionPane.showMessageDialog(thucDonView, "Input wrong value!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
