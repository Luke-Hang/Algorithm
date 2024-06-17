package com.algorithm.od;

/**
 * @author xiehang
 * @create 2022-12-27 15:28
 * 按总出勤计，学生缺勤（'A'）严格少于两天。
 * 学生不会存在连续3天或 连续3天以上的迟到（'L'）记录
 * https://leetcode.cn/problems/student-attendance-record-i/
 */
public class N551 {
    public static void main(String[] args) {
        String s = "PPALLP";
        System.out.println(checkRecord(s));
    }

    public static boolean checkRecord(String s) {
        int absent=0;
        int late=0;
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);

            if (charAt=='A'){
                absent++;
                //按 总出勤计，学生缺勤（'A'）严格少于两天。
                //缺席两次以上，返回false
                if (absent>=2){
                    return false;
                }
            }

            //学生不会存在连续3天或 连续3天以上的迟到（'L'）记录
            if (charAt=='L'){
                late++;
                //连续迟到三次
                if (late>=3){
                    return false;
                }
            }else {
                //如果迟到不是连续的，在下一次L出现前将late置0，重新开始计数
                late=0;
            }
        }
        return true;
    }
}
