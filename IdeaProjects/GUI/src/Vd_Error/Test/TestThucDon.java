package Vd_Error.Test;

import Vd_Error.view.ThucDonView;

import javax.swing.*;

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
