package ejemplojdbc.edu.fpdual.dao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.ResultSet;
import java.sql.SQLException;

@Getter
@Setter
@ToString
public class User {

    String Nombre;
    String Contraseña;

    public User() {

    }

    public User(ResultSet result) {
        try {
            this.Nombre = result.getString("username");
            this.Contraseña = result.getString("password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User(int id, String username, String password) {
        this.Nombre=username;
        this.Contraseña=password;
    }

}