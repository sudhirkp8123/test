package com.java.xml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author Sudhir Kumar
 * 
 */
public class XMLReaderExample {

	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder;
		Document doc = null;

		try {
			builder = factory.newDocumentBuilder();
			doc = builder.parse("employees.xml");

			// Create XPathFactory object
			XPathFactory xpathFactory = XPathFactory.newInstance();

			// Create XPath object
			XPath xpath = xpathFactory.newXPath();

			String name = getEmployeeNameById(doc, xpath, 4);
			System.out.println("Name: " + name);

			List<String> names = getEmployeeNamewithAge(doc, xpath, 30);
			System.out.println("\nEmployees with 'age>30' are:"
					+ Arrays.toString(names.toArray()));

		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param doc
	 * @param xpath
	 * @param id
	 * @return
	 */
	private static String getEmployeeNameById(Document doc, XPath xpath, int id) {
		String name = null;
		try {
			XPathExpression exp = xpath.compile("/Employees/Employee[@id='"
					+ id + "']/name/text()");
			name = (String) exp.evaluate(doc, XPathConstants.STRING);
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return name;
	}

	/**
	 * @param doc
	 * @param xpath
	 * @param age
	 * @return
	 */
	private static List<String> getEmployeeNamewithAge(Document doc,
			XPath xpath, int age) {
		List<String> list = new ArrayList<>();
		try {
			XPathExpression exp = xpath.compile("/Employees/Employee[age>"
					+ age + "]/name/text()");
			NodeList nodeList = (NodeList) exp.evaluate(doc,
					XPathConstants.NODESET);
			for (int i = 0; i < nodeList.getLength(); i++) {
				list.add(nodeList.item(i).getNodeValue());
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return list;
	}
}