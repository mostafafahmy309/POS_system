package com.example.POS;

public class ItemLine {
    private int idItemLine;
    private Item item;
    private int count;

    public ItemLine(int idItemLine,Item item, int count) {
        this.idItemLine=idItemLine;
        this.item = item;
        this.count = count;
    }

    public Item getItem() {
        return item;
    }

    public int getCount() {
        return count;
    }

    public int getIdItemLine() {
        return idItemLine;
    }

    public void setIdItemLine(int idItemLine) {
        this.idItemLine = idItemLine;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
