package algorithm.algorithm.huawei;

import java.util.Scanner;

/**
 * @author xiehang
 * @create 2022-04-24 23:42
 */
public class HJ5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        //计算机为了区别16进制与10进制，让16进制以0x开头，但在实际进制转换中需要去掉0x，0x只是标识符，没有实际意义。
        //比如输入0xAA，需要去掉0x,做进制转换
        String substring = str.substring(2);
        System.out.println(Integer.parseInt(substring, 16));
    }
}
