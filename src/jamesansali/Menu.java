/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jamesansali;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class MainMenu {
    private config dbConfig;
    private Scanner scanner;
    private PetManager petManager;
    private AppointmentManager appointmentManager;
    private CustomerManager customerManager;
    private ReportManager reportManager;

    public MainMenu(config dbConfig, Scanner scanner) {
        this.dbConfig = dbConfig;
        this.scanner = scanner;
        petManager = new PetManager(dbConfig, scanner);
        appointmentManager = new AppointmentManager(dbConfig, scanner);
        customerManager = new CustomerManager(dbConfig, scanner);
        reportManager = new ReportManager(dbConfig, scanner);
    }
}