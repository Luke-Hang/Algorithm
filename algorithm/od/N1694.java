package algorithm.algorithm.od;

/**
 * @author xiehang
 * @create 2022-12-27 14:18
 * 重新格式化电话号码
 * https://leetcode.cn/problems/reformat-phone-number/
 */
public class N1694 {
    public static void main(String[] args) {
//        String number="123 4-5678";
        String number="123 4-5678";
        System.out.println(reformatNumber(number));
    }

    public static String reformatNumber(String number) {
        //删除所有的空格和破折号，删除空格和破折号后，剩下的只有数字，所以先取出所有数字
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char charAt = number.charAt(i);
            //取出所有数字
            if (Character.isDigit(charAt)){
                sb.append(charAt);
            }
        }

        int length = sb.length();
        //将数组从左到右每3个一组分块，直到剩下4个或更少数字
        StringBuilder ans = new StringBuilder();
        while (length > 4) {
            //截取前三个数字，并将他们每3个分成一组,并用"-"将这些块相连
            ans.append(sb.substring(0,3)).append("-");
            //删除已分组的字符
            sb.delete(0,3);
            //并将长减3
            length=length-3;
        }

        //剩下的数字将按下述规定再分块：
        //2 个数字：单个含 2 个数字的块。
        //3 个数字：单个含 3 个数字的块。
        //4 个数字：两个分别含 2 个数字的块。
/*        if (length<=3){
            //2 个数字：单个含 2 个数字的块。
            //3 个数字：单个含 3 个数字的块。
            ans.append(sb.toString());
        }else {
            //剩余4 个数字：两个分别含 2 个数字的块。
            ans.append(sb.substring(0,2)).append("-").append(sb.substring(0,4));
        }*/

        //剩余4 个数字：两个分别含 2 个数字的块。
        if (length==4){
            ans.append(sb.substring(0,2)).append("-").append(sb.substring(2,4));
        }else {
            //2 个数字：单个含 2 个数字的块。
            //3 个数字：单个含 3 个数字的块
            ans.append(sb.toString());
        }
        return ans.toString();
    }
}
