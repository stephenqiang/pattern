package com.tyq.misc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Application {
    static class Animal {
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        private int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;

        @Override
        public String toString() {
            return "Animal{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public Animal(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }


    public static void main(String[] args) throws IOException {
        List<Animal> aniList = Arrays.asList(new Animal(1, "aaa"), new Animal(2, "bbb"), new Animal(3, "ccc"));
        Map<Integer, Animal> res = aniList.stream().collect(Collectors.toMap(Animal::getId, animal -> animal));
        System.out.println(res.get(3));
    }

}
