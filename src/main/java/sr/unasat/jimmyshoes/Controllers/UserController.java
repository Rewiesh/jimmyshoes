package sr.unasat.jimmyshoes.Controllers;

import sr.unasat.jimmyshoes.dao.UserDao;
import sr.unasat.jimmyshoes.entities.User;
import sr.unasat.jimmyshoes.jpaconfig.JPAConfiguration;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
public class UserController {

    private UserDao userDao = new UserDao(JPAConfiguration.getEntityManager());
//    @GET
//    @Produces
//    public String test() {
//        return "Hello World";
//    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

}
