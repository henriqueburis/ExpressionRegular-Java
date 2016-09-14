/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.exemplo.buris.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author luiz.buris
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String text = "Informações: teste:<div id=\"idSituacaoatual\"><span style=\"font-size:15px;font-family:Calibri; font-style:normal;text-align:justify;\">Os acumulados de precipitação são de até 999 mm em  99 hora(s) e de  99 mm em  99 hora(s) teste.</span></div>";

        Pattern pEx = Pattern.compile(";\">(.*?)<\\/span>");
        Matcher mEx = pEx.matcher(text.trim());

        while (mEx.find()) {

            String text2 = mEx.group().replaceFirst(";\">", "").replaceFirst("</span>", "");

            System.out.println(text2);

        }
        
    }
    
}
