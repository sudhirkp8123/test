package com.java.examplejava8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class StreamBuilders {
    public static void main(String[] args){
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p -> System.out.print(p+" "));
        System.out.println("\n****************************************");
        Stream<Integer> stream1 = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        stream1.forEach(p -> System.out.print(p+" "));
        System.out.println("\n****************************************");
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream2 = list.stream();
        stream2.forEach(p -> System.out.print(p+" "));
        System.out.println("\n****************************************");
        
        Stream<Date> stream3 = Stream.generate(() -> { return new Date();});
        stream3.forEach(p -> System.out.print(p+" "));
    }
}
