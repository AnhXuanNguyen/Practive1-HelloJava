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


        //Phuong trinh bac nhat
        System.out.println("Linear Equation Resolver");//in ra màn hình dòng thông báo
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        System.out.println("a: ");
        double soA = scanner.nextDouble();//Nhập vào biến soA có kiểu double

        System.out.println("b: ");
        double soB = scanner.nextDouble();

        System.out.println("c: ");
        double soC = scanner.nextDouble();
        if (soA != 0){
            double answer = (soC - soB)/ soA;
            System.out.printf("Equation pass with x = %f!\n", answer); //in ra answer được gán vào %f với \n là xuống dòng
        }else{
            if (soB == soC){
                System.out.println("The solution is all x!");
            }else{
                System.out.println("No solution");
            }
        }

        //Các tháng có 30 ngày hay 31 ngày
        System.out.println("Enter month number");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month){
            case 2: daysInMonth = "28 or 29"; break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: daysInMonth = "31"; break;
            case 4:
            case 6:
            case 9:
            case 11: daysInMonth = "30"; break;
            default: daysInMonth = "";
        }
        if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days!\n", month, daysInMonth);//Nếu chuỗi daysInMonth khác với chuỗi ""(rỗng) tức là không rơi vào trường hợp default
        //println để in ra text, printf để in ra text có kèm biến gán biến số nguyên month vào %d và biến chuỗi daysInMonth vào %s
        else System.out.print("Invalid input!");

        //Kiểm tra năm nhuận
        System.out.println("Enter year number");
        int year = scanner.nextInt();
        boolean isLeapYear = false; //bạo một biến isLeapYear có kiểu dữ liệu boolean cho giá trị là false

        boolean isDivisibleBy4 = year % 4 == 0; //tạo biến boolean isDivisibleBy4 = biểu thức để kiểm tra xem là true hay false
        if (isDivisibleBy4){//Nếu biến isDivisibleBy4 trả về true
            boolean isDivisible100 = year % 100 == 0; //Thì tạo biến isDivisible100 = biểu thức để kiểm tra
            if (isDivisible100){//Nếu biến trên trả về true
                boolean isDivisible400 = year % 400 == 0;//Tạo tiếp biến isDivisible400 = biểu thức để kiểm tra
                if (isDivisible400){//Nếu biến trên vẫn đúng
                    isLeapYear = true;//Thì thay đổi biến isLeapYear = true
                }
            }else{//Còn nếu điều kiện isDivisible100 trả về false
                isLeapYear = true;//Thì isLeapYear = false
            }
        }
        if (isLeapYear){
            System.out.printf("%d is a leap year\n",year);
        }else{
            System.out.printf("%d is NOT a leap year\n",year);
        }

        //Tính chỉ số cân nặng cơ thể
        double weight, height1, bmi;
        System.out.print("Your weight (in kilogram): ");
        weight = scanner.nextDouble();
        System.out.print("Your height (in meter): ");
        height1 = scanner.nextDouble();
        bmi = weight/Math.pow(height1, 2);//bmi = cân nặng chia cho chiều cao mũ 2
        System.out.printf("%-20s%s","bmi","Interpretation\n");

        boolean bmi1 = bmi < 18;
        boolean bmi2 = bmi < 25.0;
        boolean bmi3 = bmi < 30.0;

        if (bmi1)
            System.out.printf("%-10.2f%s", bmi, "Underweight\n");
        else if (bmi2)
            System.out.printf("%-20.2f%s", bmi, "Nomal");
        else if (bmi3)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
