package com.company.RSA;

public class Calculate_e {
    public static long Calculate_e(long d, long m) {
        long e = 10;

        while (true)
        {
            if ((e * d) % m == 1)
                break;
            else
                e++;
        }

        return e;
    }
}
