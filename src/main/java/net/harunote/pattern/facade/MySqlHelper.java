package net.harunote.pattern.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;

public class MySqlHelper {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static Connection getMySqlDBConnection(){
		// get DB connection using connection parameters
		return null;
	}
	
	public void generateMySqlPDFReport(String tableName, Connection con){
		logger.info("get MySql data from table and generate pdf report");
	}
	
	public void generateMySqlHTMLReport(String tableName, Connection con){
		logger.info("get MySql data from table and generate html report");
	}
}