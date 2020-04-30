package com.tyq.misc;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public abstract class Application {
    protected abstract void run();

    public static void main(String[] args) throws IOException {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        int sum = list.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
        System.out.println(sum);
    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list)  {
            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }

}
