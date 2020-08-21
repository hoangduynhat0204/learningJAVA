/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

/**
 *
 * @author Hoang Duy Nhat
 */
public class Software extends Product{
    private String version;
    
    public Software() {
        super();
        version="";
        count++;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return super.toString() + " " + version;
    }
    
    
    
}
