import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> controlList = new ArrayList<>();
        MyArrayList myList = new MyArrayList();

        System.out.println("------ add test ------");

        controlList.add("1");
        controlList.add("2");

        myList.add("1");
        myList.add("2");

        System.out.println("ArrayList size: " + controlList.size());
        System.out.println("MyArrayList size: " + myList.size());
        System.out.println("ArrayList index 1: " + controlList.get(1));
        System.out.println("MyArrayList index 1: " + myList.get(1));


        System.out.println("------ add with index test ------"); // index 1'e yeni eleman ekleniyor, önceki index 1 sağa kaymalı.

        controlList.add(1, "new val");
        myList.add(1, "new val");

        System.out.println("ArrayList -> index 1: " + controlList.get(1) + " index 2: " + controlList.get(2));
        System.out.println("MyArrayList   -> index 1: " + myList.get(1) + " index 2: " + myList.get(2));


        System.out.println("------ indexOf and contains test ------");

        System.out.println("ArrayList: " + controlList.contains("new val") + " index: " + controlList.indexOf("new val"));
        System.out.println("MyArrayList: " + myList.contains("new val") + " index: " + myList.indexOf("new val"));


        System.out.println("------ remove test ------"); // 0. indeksteki eleman siliniyor, kalanlar sola kaymalı
        controlList.remove(0);
        myList.remove(0);

        System.out.println("ArrayList index 0: " + controlList.get(0));
        System.out.println("MyArrayList index 0: " + myList.get(0));


        System.out.println("------ clear and isEmpty test------");
        controlList.clear();
        myList.clear();

        System.out.println("ArrayList: " + controlList.isEmpty());
        System.out.println("MyArrayList: " + myList.isEmpty());


    }
}