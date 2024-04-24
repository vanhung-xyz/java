public class ValidateAccount {
    //Kiểm tra đăng nhập
    public final String MOBILE = "0989999999";
    public final String PASSWORD = "Nguyen Van Hung";
    public boolean checkAccount(String mobile, String password) {
        if (password.equals(MOBILE)){
            if (password.equals(PASSWORD)){
                System.out.println("Đăng nhập thành công");
                return true;
            }else {
                System.out.println("Mật khẩu sai, vui lòng nhập lại");
                return false;
            }
            }else {
                System.out.println("Kiểm tra lại số điện thoại hoặc passworld");
                return false;
            }
        }
    }
