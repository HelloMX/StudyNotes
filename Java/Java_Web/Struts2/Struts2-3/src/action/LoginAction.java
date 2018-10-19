package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 马昕 on 2018/10/19.
 */
//属性驱动
public class LoginAction extends ActionSupport {
    private String username;
    private String password;


    @Override
    public String execute() throws Exception {
        System.out.println(username);
        System.out.println(password);
        return "success";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
