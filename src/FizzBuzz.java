import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haona
 * @ClassName FizzBuzz
 * @Description 给你一个整数 n ，找出从 1 到 n 各个整数的 Fizz Buzz 表示，并用字符串数组 answer（下标从 1 开始）返回结果，其中：
 * answer[i] == "FizzBuzz" 如果 i 同时是 3 和 5 的倍数。
 * answer[i] == "Fizz" 如果 i 是 3 的倍数。
 * answer[i] == "Buzz" 如果 i 是 5 的倍数。
 * answer[i] == i （以字符串形式）如果上述条件全不满足。
 * @date 4/4/2023 5:58 下午
 */
public class FizzBuzz {
    @Test
    public void fizzBuzz() {//List<String>
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                result.add(String.valueOf(i));
                continue;
            }
            if (i % 3 == 0 && i % 5 != 0) {
                result.add("Fizz");
                continue;
            }
            if (i % 3 != 0 && i % 5 == 0) {
                result.add("Buzz");
                continue;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
                continue;
            }
        }
        System.out.println(result);
//        return result;
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int n = 15;
        fizzBuzz(n);
    }
}
