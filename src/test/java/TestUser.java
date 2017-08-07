import com.gsy.controller.rest.UserController;
import com.gsy.model.User;


public class TestUser {
    public static void main(String[] args){
        UserController userController = new UserController();
        //User user = userController.getUser(1);
        User user = new User("2","zz",12,"aaa","1234");
        userController.register(user);
    }
}
