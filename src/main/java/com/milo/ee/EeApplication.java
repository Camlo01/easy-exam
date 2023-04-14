package com.milo.ee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileOutputStream;

@SpringBootApplication
public class EeApplication  implements CommandLineRunner{

	private static final String fileName = "file.xls";
	private static final String downloadPath = "C:\\Users\\"+System.getProperty("user.name")+"\\Desktop\\"+ fileName;

	private final Log Logger = LogFactory.getLog(EeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EeApplication.class, args);

		Workbook workbook = new com.milo.ee.model.question.workbook.Workbook().getWorkbook();

//		Trying to create save in the path the Excel file
		try {

			// Object FileOutputStream created to save the Excel file
			FileOutputStream fileOut = new FileOutputStream(downloadPath);

			workbook.write(fileOut);
			fileOut.close();

			System.out.println("El archivo se ha creado correctamente en la ruta " + downloadPath);
		} catch (Exception e) {
			System.out.println("Error al crear el archivo: " + e.getMessage());
		}
	}

	@Override
	public void run(String... args) {
		Logger.info("------------------------------");
		Logger.info("INITIALIZED SUCCESSFULLY! :D  ");
		Logger.info("------------------------------");
	}
}
