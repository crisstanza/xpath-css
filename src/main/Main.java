package main;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.w3c.dom.NodeList;

public final class Main {

	public static final String FILE_PATH = "/input/input.html";

	public static void main(final String[] args) throws Exception {
		css();
		xpath();
	}

	private static void xpath() throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		InputStream input = Main.class.getResourceAsStream(FILE_PATH);
		org.w3c.dom.Document doc = builder.parse(input);
		XPathFactory xpathfactory = XPathFactory.newInstance();
		XPath xpath = xpathfactory.newXPath();
		
		XPathExpression expr = xpath.compile("//h1/text()");
        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        
        NodeList nodes = (NodeList) result;
        for (int i = 0; i < nodes.getLength(); i++) {
            System.out.println(nodes.item(i).getNodeValue());
        }
	}

	private static void css() throws Exception {
		InputStream input = Main.class.getResourceAsStream(FILE_PATH);
		Document doc = Jsoup.parse(input, "UTF-8", "http://example.com/");

		Elements links = doc.select("a:not([href=''])");
		System.out.println(links);
	}

}
