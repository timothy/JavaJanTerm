/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_7;

/**
 *
 * @author tbradford16
 */
public class CookieSale {

    final int ThinMints = 3;
    final int Samoas = 4;
    final int ChocolateChip = 5;
    int totalMint;
    int totalSamoans;
    int tatalChip;

    CookieSale() {
        this.totalMint = 0;
        this.totalSamoans = 0;
        this.tatalChip = 0;
    }

    void sell(String s) {
        switch (s) {
            case "ThinMints":
                this.totalMint += ThinMints;
            case "Samoas":
                this.totalSamoans += Samoas;
            case "ChocolateChip":
                this.tatalChip += ChocolateChip;
            default:
               // System.err.print(s + " is not valid");
        }
    }

    String total(String s) {
        switch (s) {
            case "ThinMints":
                return String.valueOf("Thin Mints Total:" + this.totalMint);
            case "Samoas":
                return String.valueOf("Samoas Total:" + this.totalSamoans);
            case "ChocolateChip":
                return String.valueOf("Chocolate Chip Total:" + this.tatalChip);
            default:
                return "Not Valid";
        }
    }
}
