package be.nmine.util;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

import com.google.gson.Gson;

import be.nmine.domain.MyBean;

public class MarshallerUtil {
	
	public static void main(String[] args) throws JAXBException {
		printMyBeanJSON();
	}
	
	public static void printMyBean() throws JAXBException {
		MyBeanBuilder beanBuilder = new MyBeanBuilder();
		MyBean myBean = beanBuilder.withAnyInt(3).withAnyString("toto").build();
		JAXBElement<MyBean> element = new JAXBElement<MyBean>(new QName(""), MyBean.class, myBean);
		Marshaller marshaller = JAXBContext.newInstance(MyBean.class).createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
		Unmarshaller unmarshaller = JAXBContext.newInstance(MyBean.class).createUnmarshaller();
		StringWriter writer = new StringWriter();
		marshaller.marshal(element, writer);
		System.out.println(writer.toString());
		unmarshaller.unmarshal(new StringReader(writer.toString()));
	}
	public static void printMyBeanJSON() throws JAXBException {
		MyBeanBuilder beanBuilder = new MyBeanBuilder();
		MyBean myBean = beanBuilder.withAnyInt(3).withAnyString("toto").build();
		String myBeanJson = new Gson().toJson(myBean);
		System.out.println(myBeanJson);
	}

}
