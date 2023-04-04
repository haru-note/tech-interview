package net.harunote.pattern.facade;

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
		logger.info("오라클 DB의 테이블에서 PDF를 생성한다.");
    }

    public void generateOracleHTMLReport(String tableName, Connection con) {
        //get data from table and generate pdf report
        logger.info("오라클 DB의 테이블에서 HTML를 생성한다.");
    }

    public String generateOracleJsonReport(String tableName, Connection connection) {
        logger.info("오라클 DB의 테이블에서 JSON 데이터를 생성한다.");
        return null;
    }
}