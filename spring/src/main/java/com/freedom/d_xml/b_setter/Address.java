package com.freedom.d_xml.b_setter;

/**
 * Created by kuiyuxiang on 2017/4/21.
 */
public class Address {
    private String addr;
    private String tel;

    public String getAddr() {
        return addr;
    }

    public String getTel() {
        return tel;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addr='" + addr + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
