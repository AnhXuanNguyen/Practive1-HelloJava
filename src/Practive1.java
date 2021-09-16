import java.util.Date;
import java.util.Scanner;

public class Practive1 {
    public static void main(String[] args) {
        Date now = new Date(); //Lấy ra thời gian hiện tại gồm có thứ ngày tháng năm giờ phút giây
        System.out.println("Date now "+ now); // Hiển thị ra cmd
        int i = 10;//khai báo biến i kiểu số nguyên ing có giá trị là 10
        float f = 20.5f;//khai báo biến f kiểu số thực float có giá trị là 20.5
        double d = 20.5;//khai báo biến d có kiểu số thực double có giá trị là 20.5
        boolean b = true;//khai báo biến b có kiểu boolean có giá trị là true
        char c = 'a';//khai bao biến c có kiểu dữ kiệu ký tự có giá trị là 'a'
        String s = "Hà Nội";//khai báo biến s có kiểu dữ liệu là chuỗi String
        System.out.println("i = "+i); // in ra màn cmd giá trị biến i
        System.out.println("f = "+f);//tương tự với các biến khác
        System.out.println("d = "+d);//và cả biến này nữa ok
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("s = "+s);
        //Thực hành sử dụng toán tử
        float width; // khai báo biến width có kiểu dữ liệu float
        float height;//khai báo biến height có kiểu dữ liệu float
        float area;//khai báo biến area có kiểu dữ liệu float

        Scanner scanner = new Scanner(System.in);//tạo đối tượng scanner từ lớp Scanner

        System.out.println("Enter width: ");//cú pháp in ra màn hình
        width = scanner.nextFloat();//gán biến width = với phương thức nextFloat() trong đối tượng scanner để người dùng nhập vào giá trị

        System.out.println("Enter height");//cú pháp in ra màn hình
        height = scanner.nextFloat();//gán height = phương thức nextFloat() trong đối tượng scanner để người dùng nhập vào

        area = width*height;//biến area = với width x height

        System.out.println("Area is: "+area);//in ra màn hình oh ngạc nhiên
    }
}
