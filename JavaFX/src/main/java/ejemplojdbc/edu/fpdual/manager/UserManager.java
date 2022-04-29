package ejemplojdbc.edu.fpdual.manager;

import java.sql.Connection;

public interface UserManager {

    public boolean findUser(Connection con, String Nombre, String Contraseña);
}