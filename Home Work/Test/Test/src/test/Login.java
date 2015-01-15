/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tbradford16
 */
public class Login {

    FileIO f = new FileIO("C:\\Users\\tbradford16\\Desktop\\tim.txt");
    String login = "";


    Login() {
    }

    Login(String s) {
        this.login = s;
    }

    
    int getStartAmount(String s) {
        if(f.read(s)== ""){
        f.write("Login->" + s + "500?\">");
        }
        String theWholeTextFile = f.read(s);
        try {
            Pattern p = Pattern.compile("Login->" + s + "(.*)?\">");
            Matcher m = p.matcher(theWholeTextFile);
            while (m.find()) {
                return Integer.parseInt(m.group(1));
            }
        } catch (Exception exp) {
            f.append(Boolean.TRUE);
            f.write("Login->" + s + "500?\">");
            return 500;
        }
        return 500;
    }
    
       void setStartAmount(String s, double d) {
        if(f.read(s)== ""){
        f.write("Login->" + s + "500?\">");
        }
        String theWholeTextFile = f.read(s);
        try {
            Pattern p = Pattern.compile("Login->" + s + "(.*)?\">");
            Matcher m = p.matcher(theWholeTextFile);
            while (m.find()) {
                 m.group(1).replaceAll("Login->" + s + "(.*)?\">", String.valueOf(d));
            }
        } catch (Exception exp) {
//            f.append(Boolean.TRUE);
//            f.write("Login->" + s + "500?\">");
        }

    }

    void setLogin(String s) {
        this.login = s;
    }

    String getLogin() {
        return login;
    }
}
