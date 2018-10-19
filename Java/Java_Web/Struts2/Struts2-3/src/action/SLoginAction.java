package action;

import com.opensymphony.xwork2.ActionSupport;
import pojo.Users;

/**
 * Created by 马昕 on 2018/10/19.
 */
public class SLoginAction  extends ActionSupport{
    //无需实例化
    private Users user;

    @Override
    public String execute() throws Exception {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return "success";
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
