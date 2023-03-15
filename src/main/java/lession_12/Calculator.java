package main.java.lession_12;

import java.io.IOException;

public class Calculator {

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        try{
            System.out.println(new Calculator().divide(4, 2));
            System.out.println(new Calculator().divide(4, 0));
        } catch (ArithmeticException e){
            throw new IllegalArgumentException("Second number can't be zero");
        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("See you again");
        }
    }
}
// Exception thì lỗi nào cũng bắt
// ArithmeticException thi bat loi toan hoc
// Co the multiple catch, try phai dung cung catch
// try khong nhat thiet phai co finally
// finally block chi co the co 1 finally
/* Neu nguoi ta hoi Exception trong java la gi
thi minh search exception hierachy
UnChecked Exception: handle cung duoc, khong cung khong sao
xay ra tai thoi diem runtime minh moi phat hien ra
Checked Exception:
xay ra tai thoi diem compile time (luc minh code)


/
 */