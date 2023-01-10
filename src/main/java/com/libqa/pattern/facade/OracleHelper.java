package com.libqa.pattern.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;


public class OracleHelper {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static Connection getOracleDBConnection() {
		// get DB connection using connection parameters
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con) {
        //get data from table and generate pdf report
		logger.info("get Oracle data from table and generate pdf report");
    }

    public void generateOracleHTMLReport(String tableName, Connection con) {
        //get data from table and generate pdf report
		logger.info("get Oracle data from table and generate html report");
    }

    public String generateOracleJsonReport(String tableName, Connection connection) {
        logger.info("get Oracle data from table and generate json report");
        return null;
    }
}