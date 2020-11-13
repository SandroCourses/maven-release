package nl.idgis.mavenrelease;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

public class App {

	public static void main(String[] args) throws IOException {
		ByteArrayInputStream initialStream = new ByteArrayInputStream(new byte[] { 0, 1, 2 });
		
		byte[] targetArray = IOUtils.toByteArray(initialStream);
		
		System.out.println(targetArray);
	}

}
