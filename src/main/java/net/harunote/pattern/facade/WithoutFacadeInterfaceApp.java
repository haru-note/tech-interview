package net.harunote.pattern.facade;

import java.sql.Connection;

/**
 * @author edell.lee
 * @version 2022/12/28
 * @implNote Facade(표면, 외관, 창구) 패턴은 복잡한 하위 시스템에 대한 단순화된 상위 인터페이스를 제공한다.
 */

public class WithoutFacadeInterfaceApp {
    public static void main(String[] args) {
        String tableName="Company";

        //generating MySql HTML report and Oracle PDF report without using Facade
        Connection con = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, con);

        Connection con1 = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, con1);
    }
}
