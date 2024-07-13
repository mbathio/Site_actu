package serviceWebSoap;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;



@XmlRootElement(name = "User")  //cette classe peut être liée à l'élément XML racine nommé "User". 
@XmlAccessorType(XmlAccessType.FIELD)   // les propriétés de la classe seront accédées par leurs champs 
@XmlType(propOrder = {"name", "password"})    //name sera sérialisé avant password.
public class User implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private String password;

    public User() {}

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
