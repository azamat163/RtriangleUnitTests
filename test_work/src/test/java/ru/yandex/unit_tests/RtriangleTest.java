package ru.yandex.unit_tests;

import junit.framework.AssertionFailedError;
import org.junit.Test;
import ru.yandex.Rtriangle;
import ru.yandex.RtriangleProvider;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;
import ru.yandex.utils.get_max;

import static org.junit.Assert.assertEquals;

/**
 * Created by azamat on 08.02.17.
 */
public class RtriangleTest {
    private Rtriangle rtriangle = RtriangleProvider.getRtriangle();
    private int a;
    private int b;
    private int c;
    private int max;


    @Severity(SeverityLevel.CRITICAL)
    @Title("Проверка с помощью теоремы Пифагора")
    @Step("Проверка с помощью теоремы Пифагора")
    @Test
    public void check_triangle_Pifagora() throws  Throwable{
        try{
            /* вычисляем стороны */
            a = (int) Math.pow(rtriangle.getApexX1() - rtriangle.getApexX2(),2) + (int) Math.pow(rtriangle.getApexY1() - rtriangle.getApexY2(),2);
            b = (int) Math.pow(rtriangle.getApexX2() - rtriangle.getApexX3(),2) + (int) Math.pow(rtriangle.getApexY2() - rtriangle.getApexY3(),2);
            c = (int) Math.pow(rtriangle.getApexX3() - rtriangle.getApexX1(),2) + (int) Math.pow(rtriangle.getApexY3() - rtriangle.getApexY1(),2);

            max = new get_max().getMax(a,b,c);

            if (max == a) {
           int sumPowBC  = b + c;
           int sumPowA = a;
                assertEquals("The sum of the squares of the legs must be equal to the square of the hypotenuse",sumPowBC,sumPowA);
            }else if (max == b){
                int sumPowAC  = a + c;
                int sumPowB = b;
                assertEquals("The sum of the squares of the legs must be equal to the square of the hypotenuse",sumPowAC,sumPowB);
            }else if (max == c){
                int sumPowAB  = a + b;
                int sumPowC = c;
                assertEquals("The sum of the squares of the legs must be equal to the square of the hypotenuse",sumPowAB,sumPowC);
            }
        }catch(AssertionFailedError e){
            e.printStackTrace();
            throw e;
        }
    }
}
