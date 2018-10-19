package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import pojo.Users;

/**
 * Created by 马昕 on 2018/10/19.
 */
public class MLoginAction extends ActionSupport implements ModelDriven<Users> {
    private Users user=new Users();
    @Override
    public String execute() throws Exception {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return "success";
    }

    @Override
    public Users getModel() {
        return user;
    }
    //当请求发送到action前
    //调用MLoginAction类中getModel()获取要将数据表单封装到哪个实例化的对象中
    //获得该对象后，我们可以获得类的类型
    //获得类的类型之后，获得类中的属性
    //request.getParameters获得表单提交的所有数据名
    //从而获得值
    //如果表单提交的name值与实体类中的属性名一致
    //那么我们将获得表单中的数据 封装到user对象中去
}
