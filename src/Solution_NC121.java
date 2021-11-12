import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/**
 * 描述
 * 输入一个长度为 n 字符串，打印出该字符串中字符的所有排列，你可以以任意顺序返回这个字符串数组。
 * 例如输入字符串ABC,则输出由字符A,B,C所能排列出来的所有字符串ABC,ACB,BAC,BCA,CBA和CAB。
 */
public class Solution_NC121 {

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str == null || str.length() == 0){
            return  list;
        }
        char[]chars = str.toCharArray();
        helper(list,chars,0);
        System.out.print(new String(chars));
        Collections.sort(list);
        return list;
        //a bcd

    }

    private void helper(ArrayList<String> strings,char[]chars,int n){
        String res = new String(chars);
        if (!strings.contains(res)){
            strings.add(new String(chars));
        }
        if (n == chars.length){
            return;
        }

        //0,2
        for (int i = n;i<chars.length;i++){
            swap(chars,n,i);
            helper(strings,chars,n+1);
            swap(chars,n,i);
        }

    }

    private void swap(char[]chars,int a,int b){
        char temp = chars[a];
        chars[a]  = chars[b];
        chars[b]  = temp;
    }
}
