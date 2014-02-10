package be.nmine.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MyBean {
    @XmlElement
    private String anyString;
    @XmlElement
    private int anyNumber;
 
 
    // empty constructor needed for deserialization by JAXB
    public MyBean() {
    }
 
    @Override
    public String toString() {
        return "MyBean{" +
            "anyString='" + anyString + '\'' +
            ", anyNumber=" + anyNumber +
            '}';
    }

	public String getAnyString() {
		return anyString;
	}

	public void setAnyString(String anyString) {
		this.anyString = anyString;
	}

	public int getAnyNumber() {
		return anyNumber;
	}

	public void setAnyNumber(int anyNumber) {
		this.anyNumber = anyNumber;
	}
    
    
}
