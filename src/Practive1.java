import java.util.Date;

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

    }
}
