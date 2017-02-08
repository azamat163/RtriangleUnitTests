package ru.yandex.utils;

/**
 * Created by azamat on 08.02.17.
 */
public class get_max {
    public int max;
    public int getMax(int a,int b,int c) throws Throwable{
        try{
            max = 0;
            if ((a > b) && (a > c)) {
                max = a;
            }else if ((b > a) && (b > c)){
                max = b;
            }else if ((c > a) && (c > b)){
                max = c;
            }
        }catch(Exception e){
            e.printStackTrace();
            throw e;
        }
        return max;
    }
}
