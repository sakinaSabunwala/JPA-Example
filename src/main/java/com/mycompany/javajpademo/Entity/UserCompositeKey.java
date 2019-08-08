
package com.mycompany.javajpademo.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author sakina
 */
@Embeddable
public class UserCompositeKey implements Serializable{
    
    @Column(name="name")
    private String name;
    
    @Column(name="phone")
    private Long phone;

    public UserCompositeKey() {
    }

    public UserCompositeKey(String name, Long phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "UserCompositeKey{" + "name=" + name + ", phone=" + phone + '}';
    }
    
    
    
}
