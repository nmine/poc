package be.nmine.designpatterns.creational.builder;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: mgrzejszczak
 * Date: 03.01.13
 * Time: 23:02
 */
public class SomeBigPojoBuilderNoMatchersAndNoRefactoringTest {

    private SomeBigPojoBuilder objectUnderTest;

    @Before
    public void setUp() {
        objectUnderTest = new SomeBigPojoBuilder();
    }

    @Test
    public void testCreateSomeBigPojoWithBuilder() throws Exception {
        SomeBigPojo someBigPojo = objectUnderTest
                .setBooleanField1(true)
                .setStringField0("1")
                .setStringField1("12")
                .setStringField2("123")
                .setStringField3("1234")
                .setStringField4("12345")
                .setStringField5("123456")
                .setStringField6("1234567")
                .setStringField7("12345678")
                .setStringField8("123456789")
                .setStringField9("1234567890")
                .createSomeBigPojoWithBuilder();

        isPojoProperlyBuilt(someBigPojo);
    }

    @Test(expected = AssertionError.class)
    public void testCreateSomeBigPojoWithBuilderWrongFields() throws Exception {
        SomeBigPojo someBigPojo = objectUnderTest
                .setStringField0("0")
                .setStringField1("Too long")
                .createSomeBigPojoWithBuilder();

        isPojoProperlyBuilt(someBigPojo);
    }

    private void isPojoProperlyBuilt(SomeBigPojo someBigPojo) {
       

    }
}
