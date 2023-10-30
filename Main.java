package org.example;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.*;

import static java.lang.Integer.*;


public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box();
        Box<Orange> orangeBox = new Box();
        Box<GoldenApple> goldenAppleBox = new Box();
        System.out.println("Ящик с яблоками" + "-" + appleBox.getWeight());
        System.out.println("Ящик с апельсинами" + "-" + orangeBox.getWeight());
        System.out.println("Ящик с золотыми яблоками" + "-" + goldenAppleBox.getWeight());
        appleBox.add(new Apple(2));
        appleBox.add(new Apple(4));
//        appleBox.add(new Orange(4)); не компилируется
//        orangeBox.add(new Apple(2)); не компилируется
        orangeBox.add(new Orange(20));
        goldenAppleBox.add(new GoldenApple(33));
//        goldenAppleBox.add(new Apple(20)); не компилируется
        System.out.println("Ящик с яблоками" + "-" + appleBox.getWeight());
        System.out.println("Ящик с апельсинами" + "-" + orangeBox.getWeight());
        System.out.println("Ящик с золотыми яблоками" + "-" + goldenAppleBox.getWeight());
        //            orangeBox.move(appleBox); не компилируется
        //       appleBox.move(orangeBox); не компилируется
        //      goldenAppleBox.move(appleBox); не компилируется
        appleBox.move(appleBox);
    }
}



