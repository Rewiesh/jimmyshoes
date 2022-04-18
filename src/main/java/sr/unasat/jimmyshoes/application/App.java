package sr.unasat.jimmyshoes.application;

import sr.unasat.jimmyshoes.dao.ShoeDao;
import sr.unasat.jimmyshoes.dao.UserDao;
import sr.unasat.jimmyshoes.dao.UserTypeDao;
import sr.unasat.jimmyshoes.entities.Shoe;
import sr.unasat.jimmyshoes.entities.User;
import sr.unasat.jimmyshoes.entities.UserType;
import sr.unasat.jimmyshoes.jpaconfig.JPAConfiguration;

import javax.ws.rs.client.Client;
import java.util.List;

public class App {

    private static UserTypeDao userTypeDao = UserTypeDao.getInstance();
    private static UserDao userDao = new UserDao(JPAConfiguration.getEntityManager());
    private static ShoeDao shoeDao = new ShoeDao(JPAConfiguration.getEntityManager());

    public static void main(String[] args) {
        System.out.println("Hello World.");

//        List<UserType> userTypeList = userTypeDao.getAllUserTypes();
//        for (UserType userType : userTypeList) {
//            System.out.println("User Type: " + userType.toString());
//
//            List<User> userList = userType.getUserList();
//            for (User user : userList) {
//            System.out.println("    " + user.toString());
//            }
//        }
//
//        userDao.insertUser(new User("rewiesh", "rewiesh", "rewiesh", "ramcharan", "diwish", 000000 ,1111));
//        List<User> userList = userTypeDao.getUsersByUserTypeName("Admin");
        List<Shoe> shoeList = shoeDao.getAllShoes();
//
//
//        for (User user : userList) {
//            System.out.println(user.toString());
//        }

//        Shoe shoe = new Shoe(null, "schoen 1", new Long(100), "te koop", 15, userDao.getUserById(new Long(3)));
//        shoeDao.insertShoe(shoe);
        for (Shoe shoe : shoeList) {
            System.out.println(shoe.toString());
        }

    }
}
