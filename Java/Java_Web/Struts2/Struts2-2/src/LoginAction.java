/**
 * Created by 马昕 on 2018/10/19.
 */
public class LoginAction {
    private String username;
    private String password;
    public String execute(){
        if(username.equals("admin")&&password.equals("123")){
            return "success";
        }else {
            return "fail";
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
