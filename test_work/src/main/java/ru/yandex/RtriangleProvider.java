package ru.yandex;

import ru.yandex.Rtriangle;

import java.util.Random;

/**
 * Created by azamat on 08.02.17.
 */

public final class RtriangleProvider  {
    public static Rtriangle getRtriangle() {
        return new Rtriangle() {

            public int getApexX1() { return (new Random().nextInt(20) + 1); }

            public int getApexY1() { return (new Random().nextInt(20) + 1); }

            public int getApexX2() {
                return (new Random().nextInt(20) + 1);
            }

            public int getApexY2() {
                return (new Random().nextInt(20) + 1);
            }

            public int getApexX3() {
                return (new Random().nextInt(20) + 1);
            }

            public int getApexY3() {
                return (new Random().nextInt(20) + 1);
            }

        };
    }
}
