package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        TowerOfHanoi hanoi = new TowerOfHanoi();System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int discs = scanner.nextInt();
        hanoi.solve(discs, "1", "2", "3");
    }
}
