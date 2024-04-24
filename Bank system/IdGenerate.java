import java.util.concurrent.locks.ReentrantLock;

public class IdGenerate {
    private  static Long id = 0L;
    private static ReentrantLock lock = new ReentrantLock();

    public static Long getNewID() {
        Long result;
        lock.lock(); //Khóa biến id lại chỉ cho duy nhất một thread được truy cập
        //để tránh tình trạng Dât Racing !
        try {
            result = ++id; //Tang rồi gán vào result
        }finally {
            lock.unlock(); //tăng rồi thì ở lock cho thread khác cùng truy cập
            //Nhiều như mình dùng xong nhà vệ sinh thì đi ra thôi.
        }
        return result;
    }
    private IdGenerate(){}
}
