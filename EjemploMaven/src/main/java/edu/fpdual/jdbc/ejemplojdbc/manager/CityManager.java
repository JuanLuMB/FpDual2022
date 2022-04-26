package edu.fpdual.jdbc.ejemplojdbc.manager;

import edu.fpdual.jdbc.ejemplojdbc.connector.MySQLConnector;
import edu.fpdual.jdbc.ejemplojdbc.dao.City;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;

/**
 * Interface that contains all query to city entity.
 * @author jose.m.prieto.villar
 */
public interface CityManager {

    /**
     * Find all cities of a country between a range of population
     * @param nameCity   the name of the city that you are looking for
     * @param countyCode the code od the country
     * @param startLimit the start limit of the range
     * @param endLimit   the end limit of the range
     * @return {@code Set} of {@code City}
     */

    public Set<City> findCityByCountryCodeBetweenPopulation(Connection con, String nameCity, String countyCode, int startLimit, int endLimit) throws SQLException;
}
