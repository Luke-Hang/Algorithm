package com.algorithm.od;

/**
 * @author xiehang
 * @create 2022-12-16 9:36
 * 一年中的第几天
 * 给你一个字符串 date ，按 YYYY-MM-DD 格式表示一个 现行公元纪年法 日期。返回该日期是当年的第几天。
 * https://leetcode.cn/problems/day-of-the-year/
 */
public class N1154 {
    public static void main(String[] args) {
/*        String bb="abcdefgh";
        //public String substring(int beginIndex, int endIndex)
        // beginIndex -- 起始索引（包括）,endIndex -- 结束索引（不包括）
        //输出bc
        System.out.println(bb.substring(1,3));

        //public String substring(int beginIndex)
        //beginIndex -- 起始索引（包括），输出defgh
        System.out.println(bb.substring(3));*/

        String date="2019-02-10";
//        System.out.println(dayOfYear(date));
        System.out.println(dayOfYear("2019-01-09"));

    }


    /**
     *
     * @param date
     * @return
     */
    public static int dayOfYear(String date) {
        //date = "2019-01-09"
        //首先从给定的字符串中提取年，月，日
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));

        //使用一个长度为 1212 的数组，预先记录每一个月的天数
        int[] amount={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //如果year是闰年，那么二月份就会多出一天，闰年的判定方法为：year是400的倍数，或者year是4的倍数且不是100的倍数
        if (year%400==0||(year%4==0&&year%100!=0)){
            //闰年二月份加一天
            ++amount[1];
        }

        int ans=0;
        //从第一个月开始(第一个月为0)，到前一个月[i<(month-1)]+本月天数day，就是这一年的第几天
        for (int i = 0; i < month-1; i++) {
            ans+=amount[i];
        }
        return ans+day;
    }
}
