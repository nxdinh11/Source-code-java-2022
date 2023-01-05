package Vd_Error.model;

import java.util.StringTokenizer;

public class ThucDonModel {
    private String luaChon_MonChinh;
    private String luaChon_MonPhu;
    private double tongTien;

    public ThucDonModel() {
        this.luaChon_MonChinh = "";
        this.luaChon_MonPhu = "";
        this.tongTien = 0;
    }

    public String getLuaChon_MonChinh() {
        return luaChon_MonChinh;
    }

    public void setLuaChon_MonChinh(String luaChon_MonChinh) {
        this.luaChon_MonChinh = luaChon_MonChinh;
    }

    public String getLuaChon_MonPhu() {
        return luaChon_MonPhu;
    }

    public void setLuaChon_MonPhu(String luaChon_MonPhu) {
        this.luaChon_MonPhu = luaChon_MonPhu;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public void tinhTongTien() {
        this.tongTien = 0;
        switch (this.luaChon_MonChinh) {
            case "CƠM" -> tongTien += 20000;
            case "PHỞ" -> tongTien += 50000;
            case "BÁNH MÌ" -> tongTien += 15000;
        }


        StringTokenizer stk = new StringTokenizer(this.luaChon_MonPhu, ";");
        while(stk.hasMoreElements()) {
            String monPhu = stk.nextToken();
            monPhu = monPhu.trim();
            switch (monPhu) {
                case "TRÀ SỮA" -> this.tongTien += 5000;
                case "COCACOLA" -> this.tongTien += 10000;
                case "BÁNH NGỌT" -> this.tongTien += 15000;
                case "NEM" -> tongTien += 20000;
            }
        }
    }

}

