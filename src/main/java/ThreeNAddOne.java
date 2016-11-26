/**
 * Created by ScorpionOrange on 2016/11/23.
 *
 * 卡拉兹(Callatz)猜想：
 * 对任何一个自然数n，如果它是偶数，那么把它砍掉一半；
 * 如果它是奇数，那么把(3n+1)砍掉一半。
 * 这样一直反复砍下去，最后一定在某一步得到n=1。
 * 卡拉兹在1950年的世界数学家大会上公布了这个猜想，
 * 传说当时耶鲁大学师生齐动员，拼命想证明这个貌似很傻很天真的命题，
 * 结果闹得学生们无心学业，一心只证(3n+1)，
 * 以至于有人说这是一个阴谋，卡拉兹是在蓄意延缓美国数学界教学与科研的进展……
 * 这个题目不是证明卡拉兹猜想，而是对给定的任一不超过1000的正整数n，
 * 简单地数一下，需要多少步（砍几下）才能得到n=1？
 */
public class ThreeNAddOne {
    public static void main(String[] args){
        System.out.println(new Solution().ThreeNAndOne(7));
    }
}

class Solution{
    public int ThreeNAndOne(int input){
        int times = 0;
        while (input > 1){
            if(input % 2 == 0){
                input = input / 2;
            }
            else {
                input = 3 * input + 1;
            }
            times++;
        }
        return times;
    }
}
