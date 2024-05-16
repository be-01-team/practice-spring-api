package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C001", "장보고"));
        customers.add(new Customer("C002", "최수종"));
        customers.add(new Customer("C003", "핑클"));
        customers.add(new Customer("C004", "옥주현"));

        // Q) StringUtils의 isLongName static 메소드를 이용하여 긴 이름의 손님들 이름을 출력
        customers.stream()
                .map(customer -> customer.name)
                .filter(StringUtils::isLongName)
//                .forEach(name -> System.out.println(name))
                .forEach(System.out::println);

        List<String> customerNames = Arrays.asList(
                "장보고",
                "민지",
                "옥ㅅㅅ",
                "최수종"
        );

        // Q) 손님들 이름을 가지고, 새로운 Customer List를 만들어라.
        List<Customer> customerList = customerNames.stream()
//                                                   .map(name -> new Customer(name))
                .map(Customer::new)
                .collect(Collectors.toList());

        System.out.println("customerList: " + customerList);
    }
}