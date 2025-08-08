package Lib;



/**
 * จะโยน Exception ออกไปเมื่อหาสินค้าไม่เจอใน ID
 */
public class ProductNotFoundException extends Exception {
    public  ProductNotFoundException(String message){
        super(message);
    }
}
