/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf_dialog.jsf_dialog;

/**
 *
 * @author vasil
 */
public class Users {

    private Long id;
    private String name;

    public Users() {
    }

    public Users(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", name=" + name + '}';
    }

}
