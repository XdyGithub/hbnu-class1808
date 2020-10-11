package cn.hbnu.edu.uml;

/**
 *  用户信息
 */
public class User extends BasePojo {
    private Long id; // 用户id
    private String username; // 用户名
    private String password; // 用户密码
    private String phone; // 用户联系方式
    private String email; // 用户邮箱
    private Cart cart; // 用户购物车

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getOrder(Order order) {

    }
}
