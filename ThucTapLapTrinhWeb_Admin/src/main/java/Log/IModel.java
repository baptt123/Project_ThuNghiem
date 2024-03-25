package Log;

import java.sql.SQLException;
import java.util.logging.Logger;

public interface IModel <T>{
    void insert(Logger obj) throws SQLException;

    void update(Logger obj) throws SQLException;

    void remove(Logger obj) throws SQLException;
//    public void insert(T obj) throws SQLException;
//    public void display(T obj) throws SQLException;
//    public void update(T obj) throws SQLException;
//    public void remove(T obj) throws SQLException;
}
