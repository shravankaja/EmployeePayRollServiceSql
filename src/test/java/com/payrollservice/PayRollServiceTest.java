package com.payrollservice;

import org.junit.jupiter.api.*;

import java.util.*;

public class PayRollServiceTest {
    PayRollService payRollService = new PayRollService();

    @Test
    void whenInitlializedProgramWeShouldBeAbleToLoadSqlDriverClass() {
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll_services?useSSL=false";
        String userName = "root";
        String password = "Addtexthere25";
        String result = payRollService.connectToDatabase(jdbcURL, userName, password);
        Assertions.assertEquals("com.mysql.jdbc.JDBC4Connection@34251ec", result);
    }


    @Test
    void whenJdbcDriverClassIsLoadedWeShouldBeAbleToObtainListOfDrivers() {
        ArrayList<String> listOfDriversTest = new ArrayList<>();
        listOfDriversTest.add("com.mysql.jdbc.Driver");
        listOfDriversTest.add("com.mysql.fabric.jdbc.FabricMySQLDriver");
        Assertions.assertEquals(listOfDriversTest, payRollService.listDrivers());
    }
}

