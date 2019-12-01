package com.company.RSA;

public class Calculate_d {
    public static long Calculate_d(long m)
    {
        long d = m - 1;

        for (long i = 2; i <= m; i++)
            if ((m % i == 0) && (d % i == 0)) //если имеют общие делители
            {
                d--;
                i = 1;
            }

        return d;
    }
}
