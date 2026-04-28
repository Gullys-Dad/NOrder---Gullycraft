package com.notpatch.nOrder.model;

public enum OrderSortType {
    HIGHLIGHTED,
    NAME,
    PRICE_ASC,
    PRICE_DESC,
    DATE,
    CUSTOM_ITEM;

    public OrderSortType next() {
        OrderSortType[] values = values();
        return values[(ordinal() + 1) % values.length];
    }
}
