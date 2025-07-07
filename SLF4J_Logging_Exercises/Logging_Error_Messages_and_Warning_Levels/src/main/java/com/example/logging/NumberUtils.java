package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberUtils {
    private static final Logger logger = LoggerFactory.getLogger(NumberUtils.class);

    public static boolean isPrime(int n) {
        if (n <= 1) {
            logger.error("Invalid input for prime check: {}", n);
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                logger.warn("{} is divisible by {}, not a prime number.", n, i);
                return false;
            }
        }

        logger.info("{} is a prime number.", n);
        return true;
    }
}
