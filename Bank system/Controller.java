import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private static  long balanceNumber = 1000000;
    List<TransactionHistiry> listHistiry = new ArrayList<TransactionHistory>();

    public long getBalanceNumber(){
        return balanceNumber;
    }


    public static long transfer(long money){
        //Kiểm tra nếu số tièn nhỏ hơn 50.000 thì thông báo số tiền chuyển tối thiểu phải là 50.000
        //Nếu số tiền chuyển lơn hơn số dư tài khoản thì báo không đủ
        //Nếu chuyển thành công, thì thông bó chuyển khoản thành công, in ra số dư mới và thêm lịch sử giao dịch mới
        return balanceNumber;

    }

    public void actionTransfer(){
        //Thực hiện các công việc như nhập số tài khoản thụ hưởng, số tiền mô tả tại đây
    }

    public void getHistory(){
        //In danh sách lịch sử giao dịch
    }

    //Định dáng số tiền theo mình mong muốn
    public static String formatMoney(long money){
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        //100000->100,000.00
        return formatter.format(money);
    }
}
