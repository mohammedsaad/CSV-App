package com.north.csvreader;
 *
 * @author mohammed
 */
 
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;



public class Controller {

    // get file from classpath, resources folder
    public File getFileFromResources(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }

    public Measurements getMeasurements(File file) {

        if (file == null) {
            return null;
        }
        Measurements measurements = new Measurements();
        try {
            Reader in = new FileReader(file);
            Iterable<CSVRecord> records = CSVFormat.EXCEL.withDelimiter(';').withHeader("Time", "Value", "Comment").withSkipHeaderRecord().parse(in);
            for (CSVRecord record : records) {
                String time = record.get("Time");
                String value = record.get("Value");
                String comment = record.get("Comment");
                measurements.getMeasurements().
                        add(new DataUnit(Integer.parseInt(time),
                                Double.parseDouble(value),
                                comment));
            }
        } catch (IOException ex) {
            Logger.getLogger(CSVApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return measurements;
    }

}
