/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.north.csvreader;

import java.io.File;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author mohammed
 */
public class CSVApp {

    private static final Logger LOG = LoggerFactory.getLogger(CSVApp.class);

    public static void main(String[] args) {

        try {
            Controller controller = new Controller();
            File file = controller.getFileFromResources("file1.csv");
            ObjectMapper objectMapper = new ObjectMapper();
            System.out.println(objectMapper.writeValueAsString(controller.getMeasurements(file)));
        } catch (JsonProcessingException ex) {
            LOG.info(ex.getMessage());
        }

    }

}
