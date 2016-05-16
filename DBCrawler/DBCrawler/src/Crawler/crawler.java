/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Crawler;

import Pages.sotaynauan;
import Pages.webnauan;

/**
 *
 * @author SONY
 */
public class crawler {
    
    public static void main(String[] args) {
        
        sotaynauan sotay = new sotaynauan();
        sotay.scanning("http://sotaynauan.com/");
        
        webnauan web = new webnauan();
        web.scanning("http://webnauan.net/");
    }
}
