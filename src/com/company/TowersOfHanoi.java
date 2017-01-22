package com.company;

/**
 * Created by emimo on 1/17/2017.
 */
public class TowerOfHanoi {

    public void solve(int discs, String a, String b, String c) {
        if (discs == 1) {
            System.out.println("Move one disk from tower " + a + " to " + c);
        } else {
            solve(discs - 1, a, c, b);
            System.out.println("Move one disk from tower " + a + " to " + c);
            solve(discs - 1, b, a, c);
        }
    }
}
