/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crawler;

import Pages.monan9;
import Pages.sotaynauan;

public class crawler {

    public static void main(String[] args) {

        sotaynauan sotay = new sotaynauan();
        sotay.scanning("http://sotaynauan.com/");

        monan9 monan = new monan9();
        monan.scanning("http://monan9.com/");
    }
}
