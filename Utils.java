import java.util.List;

public class Utils {
    /***
     * 用于打印List参数的每个值
     *
     * @param list 输入List参数
     */
    public static void print(List<? extends Object> list) {
        list.forEach(System.out::println);
    }


    /***
     * 用于打印int数组的每个值
     *
     * @param array int数组
     */
    public static void print(int[] array) {
        for (int a : array) {
            System.out.println(a);
        }
    }
}
