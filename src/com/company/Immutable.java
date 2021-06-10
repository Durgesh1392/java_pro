package com.company;

public final class Immutable {
    private final int id;
    private final String str;

    public Immutable(int id, String str) {
        this.id = id;
        this.str = str;
    }

    public int getId() {
        return id;
    }
    public String getStr()
    {
        return str;
    }
}
class Test {
    public static void main(String[] args) {

        Immutable i1 = new Immutable(101, "hello");
        System.out.println(i1.getId());
        System.out.println(i1.getStr());
    }
}