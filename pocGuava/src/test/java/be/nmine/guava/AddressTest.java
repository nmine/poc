package be.nmine.guava;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import be.nmine.guava.domain.Address;
import be.nmine.guava.domain.Address.Region;

@SuppressWarnings("deprecation")
public class AddressTest {

    private final Address originalBelgianAddress = new Address();

    private final Address belgianAddress = new Address();

    @Before
    public void setUp() throws Exception {
	populateBelgianAddress(originalBelgianAddress);
    }

    @Test
    public void testFilledAddresses() {
	populateBelgianAddress(belgianAddress);
	assertEquals(originalBelgianAddress, belgianAddress);
	// different postal code
	belgianAddress.setPostalCode("1");
	originalBelgianAddress.setPostalCode("2");
	assertFalse(originalBelgianAddress.equals(belgianAddress));
	ResetDefaultsAddressesAndTestEqualities();
	// Region
	belgianAddress.setRegion(Region.DE);
	originalBelgianAddress.setRegion(Region.FR);
	assertFalse(originalBelgianAddress.equals(belgianAddress));
	ResetDefaultsAddressesAndTestEqualities();
	// StreetId
	belgianAddress.setStreetId(1);
	originalBelgianAddress.setStreetId(2);
	assertFalse(originalBelgianAddress.equals(belgianAddress));
	ResetDefaultsAddressesAndTestEqualities();
	// StreetName
	belgianAddress.setStreetName("StreetName");
	originalBelgianAddress.setStreetName("StreetName2");
	assertFalse(originalBelgianAddress.equals(belgianAddress));
	// ValidAddress
	assertFalse(originalBelgianAddress.equals(belgianAddress));
	ResetDefaultsAddressesAndTestEqualities();

    }

    @Test
    public void testNullAddresses() {
	populateBelgianAddress(belgianAddress);
	assertEquals(originalBelgianAddress, belgianAddress);
	// different postal code
	belgianAddress.setPostalCode(null);
	originalBelgianAddress.setPostalCode(null);
	assertTrue(originalBelgianAddress.equals(belgianAddress));
	ResetDefaultsAddressesAndTestEqualities();
	// MunicipalityId
	assertTrue(originalBelgianAddress.equals(belgianAddress));
	ResetDefaultsAddressesAndTestEqualities();
	// MunicipalityName
	assertTrue(originalBelgianAddress.equals(belgianAddress));
	ResetDefaultsAddressesAndTestEqualities();
	// Region
	belgianAddress.setRegion(null);
	originalBelgianAddress.setRegion(null);
	assertTrue(originalBelgianAddress.equals(belgianAddress));
	ResetDefaultsAddressesAndTestEqualities();
	// StreetCode
	assertTrue(originalBelgianAddress.equals(belgianAddress));
	ResetDefaultsAddressesAndTestEqualities();
	// StreetId
	belgianAddress.setStreetId(null);
	originalBelgianAddress.setStreetId(null);
	assertTrue(originalBelgianAddress.equals(belgianAddress));
	ResetDefaultsAddressesAndTestEqualities();
	// StreetName
	belgianAddress.setStreetName(null);
	originalBelgianAddress.setStreetName(null);
	assertTrue(originalBelgianAddress.equals(belgianAddress));
	// ValidAddress
	belgianAddress.setRegion(null);
	originalBelgianAddress.setRegion(null);
	assertTrue(originalBelgianAddress.equals(belgianAddress));
	ResetDefaultsAddressesAndTestEqualities();
    }

    @Test
    public void testPartialNullAddresses() {
	populateBelgianAddress(belgianAddress);
	assertEquals(originalBelgianAddress, belgianAddress);
	// different postal code
	belgianAddress.setPostalCode(null);
	originalBelgianAddress.setPostalCode("pc");
	assertFalse(originalBelgianAddress.equals(belgianAddress));
	ResetDefaultsAddressesAndTestEqualities();
	// Region
	belgianAddress.setRegion(Region.DE);
	originalBelgianAddress.setRegion(null);
	assertFalse(originalBelgianAddress.equals(belgianAddress));
	ResetDefaultsAddressesAndTestEqualities();
	// StreetId
	belgianAddress.setStreetId(1);
	originalBelgianAddress.setStreetId(null);
	assertFalse(originalBelgianAddress.equals(belgianAddress));
	ResetDefaultsAddressesAndTestEqualities();
	// StreetName
	belgianAddress.setStreetName(null);
	originalBelgianAddress.setStreetName("name");
	assertFalse(originalBelgianAddress.equals(belgianAddress));
	// ValidAddress
	belgianAddress.setRegion(Region.DE);
	originalBelgianAddress.setRegion(null);
	assertFalse(originalBelgianAddress.equals(belgianAddress));
	ResetDefaultsAddressesAndTestEqualities();

    }

    private void ResetDefaultsAddressesAndTestEqualities() {
	populateBelgianAddress(originalBelgianAddress);
	populateBelgianAddress(belgianAddress);
	assertEquals(originalBelgianAddress, belgianAddress);
    }

    @Test
    public void testNullityAddresses() {
	belgianAddress.setRegion(Region.DE);
	assertFalse(originalBelgianAddress.equals(belgianAddress));
    }

    private void populateBelgianAddress(Address addressToPopulate) {
	addressToPopulate.setPostalCode("PostalCode");
	addressToPopulate.setRegion(Region.DE);
	addressToPopulate.setStreetId(0);
	addressToPopulate.setStreetName("StreetName");
    }

    // TODO debug
    // @Test
    // public void testGetDifferentFieldsAddresses() {
    // belgianAddress.setRegion(Region.FR);
    // assertEquals(AddressField.REGION, originalBelgianAddress.getDifferencesField(belgianAddress).get(0));
    // ResetDefaultsAddressesAndTestEqualities();
    // }
}
