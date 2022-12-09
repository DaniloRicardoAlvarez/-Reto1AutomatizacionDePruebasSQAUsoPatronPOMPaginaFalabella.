package co.com.falabella.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DatosExcel {

    private XSSFWorkbook libro;
    private FileInputStream file;
    /*
    Este metodo se llama leer datos de excel el especifica que requiere datos String
    recibe parametros como la ruta donde yo voy a encontrar ese excel, la hoja especifica del excel que se este
    utilizando la fila es decir el numero de la fila del excel(rowValue),y el numero de la hoja
    la excepcion es para avisar si no llegase a encontrar ni el libro ni la fila el orden de los parametros
    no importa pueden estar en desorden
     */
    public String leerDatosExcel (String ruta,String hoja, int rowValue, int cellValue) throws IOException {

        String valor = null;
        //Nombre de la fila
        file = new FileInputStream(new File(ruta));
        //se especifica el nombre del libro
        libro = new XSSFWorkbook(file);
        Sheet sheet = libro.getSheet(hoja);
        //fila
        Row row = sheet.getRow(rowValue);
        //celda
        Cell cell = row.getCell(cellValue);
        valor=cell.getStringCellValue();
        libro.close();
        file.close();
        return valor;




    }
}
