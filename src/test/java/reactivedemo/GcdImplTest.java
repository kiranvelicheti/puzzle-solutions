package reactivedemo;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class GcdImplTest {

    @Test
    public void gcdImpl() {
        GcdImpl gcd = new GcdImpl();
        assertEquals(gcd.generalizedGCD(4, IntStream.of(2, 4, 6, 8).toArray()), 2);
    }

    @Test
    public void gcdImpl_odd() {
        GcdImpl gcd = new GcdImpl();
        assertEquals(gcd.generalizedGCD(4, IntStream.of(2, 3, 6, 8).toArray()), 1);
    }

    @Test
    public void gcdImpl_odd_prime() {
        GcdImpl gcd = new GcdImpl();
        assertEquals(gcd.generalizedGCD(5, IntStream.of(12, 24, 4, 16, 18).toArray()), 2);
    }
}