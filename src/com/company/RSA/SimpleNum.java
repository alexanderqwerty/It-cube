package com.company.RSA;

public class SimpleNum {
    public static int SimpleNum(int n) {
        if (n < 2)
            return 0;
        if (n == 2)
            return 1;
        for (long i = 2; i < n; i++)
            if (n % i == 0)
                return 0;

        return 1;

    }
}
