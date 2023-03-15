package main.java.lession_03;

public class ArrayLearning {
/* khai bao array
datatype [] arrayName = new datatype[arrayLength];
datatype arrayName [] = new datatype[arrayLength];

datatype [] arrayName = new datatype[] {e1,e2,e3};
datatype arrayName [] = {e1,e2,e3};
 */
   public static void main(String[] args) {

       int arrayLength = 5;
       int [] myIntArray = new int[arrayLength];

       for (int index = 0; index < arrayLength; index++) {
           myIntArray[index] = index + 1;
       }
       for (int index = 0; index < arrayLength; index++) {
           System.out.printf("Element at the index %d has value %d\n", index, myIntArray[index]);
           }


       }

           
       }

// sau khi thuc hien assignment (gan' bien') thi moi thuc hien postfix (index++)
// de biet duoc array có bao nhiêu length thì dùng myarray.length
// khi yêu cầu truy cập array cuối cùng thì dùng myarray[arrayLength - 1] = ...;







// su dung enhance for (for.r) khi khong can truy cap, thay doi mà chi cần lấy ra giá trị
/*
    for(int arrayElement : myIntArray) {
    sout(arrayElement) }
 */


