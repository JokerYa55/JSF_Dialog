/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf_dialog.jsf_dialog;

import java.util.logging.Logger;

/**
 *
 * @author vasil
 */
class Car {

    private Long id;
    private String name;
    private static final Logger LOG = Logger.getLogger(Car.class.getName());

    public Car() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", name=" + name + '}';
    }

    
}
