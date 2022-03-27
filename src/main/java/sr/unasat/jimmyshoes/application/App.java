package sr.unasat.jimmyshoes.application;

import sr.unasat.jimmyshoes.dao.UserDao;
import sr.unasat.jimmyshoes.entities.User;
import sr.unasat.jimmyshoes.jpaconfig.JPAConfiguration;

import javax.ws.rs.client.Client;

public class App {

    private static UserDao userDao = new UserDao(JPAConfiguration.getEntityManager());

    public static void main(String[] args) {
        System.out.println("Hello World.");
//
        userDao.insertUser(new User("rewiesh", "rewiesh", "rewiesh", "ramcharan", "diwish", 000000 ,1111));
//
//        String uri = "https://localhost:8080/JimmyShoes/api/hello-world";
//        String returnValue;
//
//        try{
//            Client client;
//            WebResource
//
//        }
    }
}
