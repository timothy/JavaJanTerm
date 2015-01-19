/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantreviewer;

/**
 *
 * @author tbradford16
 */
public class Reviewer {

    // include name, address, the user’s notes, and a 5-star rating.
    private String name;
    private String address;
    private String notes;
    private String rating;

    Reviewer() {
        name = "";
        address = "";
        notes = "";
        rating = "";
    }

    String getName() {
        return this.name;
    }

    String getAddress() {
        return this.address;
    }

    String getNotes() {
        return this.notes;
    }

    String getRating() {
        return this.rating;
    }

    void setName(String s) {
        this.name = s;
    }

    void setAddress(String s) {
        this.address = s;
    }

    void setNotes(String s) {
        this.notes = s;
    }

    void setRating(String s) {
        this.rating = s;
    }
}
