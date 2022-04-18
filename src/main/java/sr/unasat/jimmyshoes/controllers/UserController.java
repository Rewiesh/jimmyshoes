package sr.unasat.jimmyshoes.controllers;

import sr.unasat.jimmyshoes.dao.UserDao;
import sr.unasat.jimmyshoes.dao.UserTypeDao;
import sr.unasat.jimmyshoes.entities.User;
import sr.unasat.jimmyshoes.jpaconfig.JPAConfiguration;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
public class UserController {

    private final UserDao userDao = new UserDao(JPAConfiguration.getEntityManager());
    private static final UserTypeDao userTypeDao = UserTypeDao.getInstance();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @GET
    @Path("/{userTypeName}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUsersByType(@PathParam("userTypeName") String userTypeName) {
        return userTypeDao.getUsersByUserTypeName(userTypeName);
    }


}
