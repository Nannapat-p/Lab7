package Lib;


/**
 * จะโยน Exception ก็ต่อเมื่อลบสินค้าไม่สำเร็จ
 */
public class InvalidOperationException extends Exception {
    public InvalidOperationException(String message){
        super(message);
    }
}
