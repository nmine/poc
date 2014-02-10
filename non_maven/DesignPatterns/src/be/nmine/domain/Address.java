package be.nmine.domain;

import java.util.Map;

import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;

public class Address {

    public enum Region {
	FR, NL, DE;
    }

    private String postalCode;
    private Region region;
    private String streetName;
    private Integer streetId;

    public String getPostalCode() {
	return postalCode;
    }

    public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
    }

    public Region getRegion() {
	return region;
    }

    public void setRegion(Region region) {
	this.region = region;
    }

    public String getStreetName() {
	return streetName;
    }

    public void setStreetName(String streetName) {
	this.streetName = streetName;
    }

    public Integer getStreetId() {
	return streetId;
    }

    public void setStreetId(Integer streetId) {
	this.streetId = streetId;
    }

    // Utility methods

    // public boolean isEmpty() {
    // return (postalCode == null || postalCode.trim().isEmpty()) && (municipalityName == null || municipalityName.trim().isEmpty()) && (region == null)
    // && (streetName == null || streetName.trim().isEmpty()) && (streetCode == null || streetCode.trim().isEmpty()) && (streetId == null)
    // && (houseNumber == null || houseNumber.trim().isEmpty());
    // }

    public enum AddressField {
	REGION, POSTALCODE, STREET_NAME, STREET_ID;
    }

    @Override
    public boolean equals(Object obj) {
	if (obj == null)
	    return false;
	if (obj == this)
	    return true;
	if (!(obj instanceof Address))
	    return false;

	Address other = (Address) obj;
	Map<AddressField, Object> mapAddress = Maps.newHashMap();
	Map<AddressField, Object> mapOtherAddress = Maps.newHashMap();

	MapDifference<AddressField, Object> diff = getMapDifference(mapAddress, mapOtherAddress, other);

	if (diff.entriesDiffering().size() == 0)
	    return true;
	return false;
    }

    private MapDifference<AddressField, Object> getMapDifference(Map<AddressField, Object> mapAddress, Map<AddressField, Object> mapOtherAddress, Address otheraddress) {
	mapAddress.put(AddressField.REGION, getRegion());
	mapAddress.put(AddressField.POSTALCODE, getPostalCode());
	mapAddress.put(AddressField.STREET_ID, getStreetName());
	mapAddress.put(AddressField.STREET_NAME, getStreetId());

	mapOtherAddress.put(AddressField.REGION, otheraddress.getRegion());
	mapOtherAddress.put(AddressField.POSTALCODE, otheraddress.getPostalCode());
	mapOtherAddress.put(AddressField.STREET_ID, otheraddress.getStreetName());
	mapOtherAddress.put(AddressField.STREET_NAME, otheraddress.getStreetId());
	MapDifference<AddressField, Object> diff = Maps.difference(mapAddress, mapOtherAddress);
	return diff;
    }

    // public List<AddressField> getDifferencesField(Address addressToCompare) {
    // List<AddressField> addressFieldsEqual = Arrays.asList();
    // Map<AddressField, Object> mapAddress = Maps.newHashMap();
    // Map<AddressField, Object> mapOtherAddress = Maps.newHashMap();
    //
    // MapDifference<AddressField, Object> diff = getMapDifference(mapAddress, mapOtherAddress, addressToCompare);
    //
    // for (Entry<AddressField, ValueDifference<Object>> entry : diff.entriesDiffering().entrySet())
    // addressFieldsEqual.add(entry.getKey());
    // return addressFieldsEqual;
    // }

    // public List<AddressField> getDifferencesField(Address addressToCompare) {
    // List<AddressField> addressFieldsEqual = Arrays.asList();
    // Map<AddressField, Object> mapAddress = Maps.newHashMap();
    // Map<AddressField, Object> mapOtherAddress = Maps.newHashMap();
    //
    // MapDifference<AddressField, Object> diff = getMapDifference(mapAddress, mapOtherAddress, addressToCompare);
    //
    // for (Entry<AddressField, ValueDifference<Object>> entry : diff.entriesInCommon().entrySet()) {
    // switch (AddressField) {
    // case value:
    //
    // break;
    //
    // default:
    // break;
    // }
    // addressFieldsEqual.add(entry.getKey());
    // }
    // return addressFieldsEqual;
    // }

    // TODO redefine hashcode method
}
