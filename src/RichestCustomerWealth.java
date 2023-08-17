import org.junit.Test;

/**
 * @author haona
 * @ClassName RichestCustomerWealth
 * @Description 1672. 最富有客户的资产总量
 * 链接：https://leetcode.cn/problems/richest-customer-wealth
 * 输入：accounts = [[1,2,3],[3,2,1]]
 * 输出：6
 * 解释：
 * 第 1 位客户的资产总量 = 1 + 2 + 3 = 6
 * 第 2 位客户的资产总量 = 3 + 2 + 1 = 6
 * 两位客户都是最富有的，资产总量都是 6 ，所以返回 6 。
 * @date 31/3/2023 12:30 下午1
 */
public class RichestCustomerWealth {
    @Test
    public void maximumWealth() {
        int[][] accounts = {{1, 2, 3}, {1, 1}, {2, 2, 2, 2}};
        int totallenth = accounts.length;
        int arrlength1 = accounts[1].length;
        int arrlength2 = accounts[2].length;
        int[] arr = new int[accounts.length];
        //获取每一个数组之和
        for (int i = 0; i < totallenth; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
//            System.out.println(sum);
            arr[i] = sum;
        }
        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }*/
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(arr[arr.length - 1]);
    }

    @Test
    public void bubbleSort() {
        //比较n个数大小
        int[] arr = {6, 2, 8, 15, 20, 0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static int maximumWealth(int[][] accounts) {
        /*int[] arr = new int[accounts.length];
        //获取每一个数组之和
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
//            System.out.println(sum);
            arr[i] = sum;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[arr.length - 1];*/
        int ans = 0;
        /*for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
                System.out.print("sum = " + sum + "\t");
            }
            ans = Math.max(ans, sum);
            System.out.println("ans = " + ans);
        }*/
        for (int[] customerAccounts : accounts) {
            int sum = 0;
            for (int account : customerAccounts)
                sum += account;
            ans = Math.max(sum, ans);
        }
        return ans;
    }

    /*public static void main(String[] args) {
        int[][] accounts = {{2, 8, 7}, {7, 11, 3}, {1, 9, 5}};
        System.out.println(maximumWealth(accounts));
    }*/


    public static void main(String[] args) {
        int[] a = {1, 10, 0, 20, 5};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int b : a) {
            System.out.print(b + "\t");
        }
    }
}
