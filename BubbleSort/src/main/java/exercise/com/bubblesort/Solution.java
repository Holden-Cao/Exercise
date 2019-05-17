package exercise.com.bubblesort;

public class Solution {

    public boolean Find(int[][] array,int target){
        //定义多为数组的行数
        int m=array.length-1;
        //定义多维数组的列数
        int i=0;
        while (m >=0&&i<array[0].length){
            if (array[m][i]>target){
                m--;
            }else if(array[m][i]<target){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int[][] b={{1,2,3},{4,5,6}};
        //测试一个两行3列的数组,目标值为0
        System.out.println(s.Find(b,0));
    }
}