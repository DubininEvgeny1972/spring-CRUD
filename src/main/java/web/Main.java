package web;


import web.model.User;
import web.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<User> listUser = new ArrayList<>();
    public static void main(String[] args) throws SQLException {
        UserServiceImpl service = new UserServiceImpl();
//        service.createUsersTable();
        service.saveUser("Ivan", "Ivanov", (byte) 25);
        service.saveUser("Jon", "Lennon", (byte) 35);
        service.saveUser("Bob", "Dillan", (byte) 52);
        service.saveUser("Kirk", "Duglas", (byte) 48);
        System.out.println(service.getAllUsers());
        service.removeUserById(3L);
        System.out.println(service.getAllUsers());
        service.cleanUsersTable();
        System.out.println(service.getAllUsers());

    }
}
