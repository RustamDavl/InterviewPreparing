package com.rustdv.reflectionRepeating;

import com.rustdv.reflectionRepeating.annotation.Column;
import com.rustdv.reflectionRepeating.annotation.Table;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReflectionTesting {

    private static final String INSERT_QUERY = """
                        
            INSERT INTO %s.%s (%s) VALUES (%s)
                        
            """;

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {




        Car car = new Car("Toyota", "Corolla");

        var table = car.getClass().getAnnotation(Table.class);
        var column = car.getClass().getAnnotation(Column.class);

        String collect = Arrays.stream(car.getClass().getDeclaredFields())
                .map(field -> {
                    field.setAccessible(true);
                    return field.getAnnotation(Column.class).value();
                }).collect(Collectors.joining(", "));

        String collect1 = Arrays.stream(car.getClass().getDeclaredFields())
                .map(field -> {
                            field.setAccessible(true);
                            try {
                                return String.valueOf(field.get(car));
                            } catch (IllegalAccessException e) {
                                throw new RuntimeException(e);
                            }
                        }
                ).collect(Collectors.joining(", "));

        String formatted = INSERT_QUERY.formatted(table.schema(), table.table(), collect, collect1);
        System.out.println(formatted);


    }
}
