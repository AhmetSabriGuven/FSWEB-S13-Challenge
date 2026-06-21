package org.example.enums;

public enum Plan {
    BASIC("Basic", 500),
    PREMIUM("Premium", 1000),
    VIP("Vip", 2000);

    private final String name;
    private final Integer price;

    Plan(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}
