/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Hoang Duy Nhat
 */
public class Person {

    private int personNo;
    private String name;
    private String email;

    public Person() {
    }

    public Person(int personNo, String name, String email) {
        this.personNo = personNo;
        this.name = name;
        this.email = email;
    }

    public int getPersonNo() {
        return personNo;
    }

    public void setPersonNo(int personNo) {
        this.personNo = personNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name " + name);
        sb.append("ID: " + personNo);
        return sb.toString();
    }

}
