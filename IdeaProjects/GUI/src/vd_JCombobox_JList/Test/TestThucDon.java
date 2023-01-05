package vd_JCombobox_JList.Test;

import javax.swing.UIManager;

import vd_JCombobox_JList.view.ThucDonView;

public class TestThucDon {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new ThucDonView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
