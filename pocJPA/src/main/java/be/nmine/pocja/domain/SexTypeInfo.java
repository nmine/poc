package be.nmine.pocja.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "deposit_type_info")
public class SexTypeInfo {

    @Id
    @Column(name = "code")
    private int code;

    @Column(name = "desc_nl")
    private String descriptionDutch;

    @Column(name = "desc_fr")
    private String descriptionFrench;

    @Column(name = "desc_de")
    private String descriptionGerman;

    public int getCode() {
	return code;
    }

    public void setCode(int code) {
	this.code = code;
    }

    public String getDescriptionDutch() {
	return descriptionDutch;
    }

    public String getDescriptionFrench() {
	return descriptionFrench;
    }

    public String getDescriptionGerman() {
	return descriptionGerman;
    }

    public void setDescriptionDutch(String descriptionDutch) {
	this.descriptionDutch = descriptionDutch;
    }

    public void setDescriptionFrench(String descriptionFrench) {
	this.descriptionFrench = descriptionFrench;
    }

    public void setDescriptionGerman(String descriptionGerman) {
	this.descriptionGerman = descriptionGerman;
    }

}
