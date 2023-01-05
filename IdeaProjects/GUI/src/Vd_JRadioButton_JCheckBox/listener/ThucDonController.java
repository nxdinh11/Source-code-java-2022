package Vd_JRadioButton_JCheckBox.listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;

import Vd_JRadioButton_JCheckBox.view.ThucDonView;

public class ThucDonController implements ActionListener{
    private final ThucDonView thucDonView;

    public ThucDonController(ThucDonView thucDonView) {
        this.thucDonView = thucDonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String monChinh = "";
        Enumeration<AbstractButton> buttons_monChinh =  thucDonView.buttonGroup_MonChinh.getElements();
        while(buttons_monChinh.hasMoreElements()) {
            AbstractButton b = buttons_monChinh.nextElement();
            if(b.isSelected()) {
                monChinh = b.getText();
            }
        }

        StringBuilder monPhu = new StringBuilder();
        for (AbstractButton b : thucDonView.list_buttonGroup_MonPhu) {
            if(b.isSelected()) {
                monPhu.append(b.getText()).append("; ");
            }
        }


        thucDonView.thucDonModel.setLuaChon_MonChinh(monChinh);
        thucDonView.thucDonModel.setLuaChon_MonPhu(monPhu.toString());
        thucDonView.thucDonModel.tinhTongTien();
        thucDonView.hienThiKetQua();
    }

}