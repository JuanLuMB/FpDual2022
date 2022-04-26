package edu.fpdual.jdbc.ejemplojdbc.main;

import edu.fpdual.jdbc.ejemplojdbc.connector.MySQLConnector;
import edu.fpdual.jdbc.ejemplojdbc.dao.City;
import edu.fpdual.jdbc.ejemplojdbc.manager.impl.CityManagerImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Set;

public class principal {
        public static void main(String[] args) throws SQLException, ClassNotFoundException {
            ejemploPreparedStatement();
        }

        private static void ejemploStatement() throws SQLException, ClassNotFoundException {
            MySQLConnector connector = new MySQLConnector();

            try (Connection connection = connector.getMySQLConnection();
                 Statement stm = connection.createStatement()) {
                ResultSet result = stm.executeQuery("SELECT Id, Name, District FROM world.city where CountryCode = 'ESP'");

                int counter = 0;
                result.beforeFirst();
                while (result.next()) {
                    int id = result.getInt("Id");
                    String name = result.getString("Name");
                    String district = result.getString("District");
                    System.out.println(id + " " + name + " " + district);
                    counter++;
                }
                System.out.println("Total de elementos: " + counter);
            }
        }

        private static void ejemploPreparedStatement() throws SQLException, ClassNotFoundException {
            Scanner sc = new Scanner(System.in);
            System.out.println("Que quiere hacer: ");
            System.out.println("1 - Buscar todas las ciudades");
            System.out.println("2 - Actualizar la ciudad");
            System.out.println("3 - Insertar una ciudad");
            System.out.println("4 - Poder borar una ciudad");
            String nameCyti = sc.nextLine();


            Connection connection = new MySQLConnector().getMySQLConnection();
            CityManagerImpl cityManager = new CityManagerImpl();
            Set<City> cities = cityManager.findCityByCountryCodeBetweenPopulation(connection, "Madrid","ESP" , 100000, 250000);
            System.out.println(cities);
            System.out.println("Total de elementos: " + cities.size());
        }
    }