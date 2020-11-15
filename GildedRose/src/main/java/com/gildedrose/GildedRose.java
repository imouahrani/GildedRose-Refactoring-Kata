package com.gildedrose;

class GildedRose {

    static final String AGED_BRIE = "Aged Brie";
    static final String BACKSTAGE_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    static final String CONJURED = "Conjured Mana Cake";

    static final int MAX_QUALITY = 50;

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    // chaque item a sa propre fonction qui va modifier sa qualité en fonction des jours qui passent

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case AGED_BRIE:
                    updateAgedBrie(item);
                    break;
                case BACKSTAGE_CONCERT:
                    updateBackstageConcert(item);
                    break;
                case SULFURAS:
                    updateSulfuras(item);
                    break;
                case CONJURED:
                    updateConjured(item);
                    break;
                default:
                    updateOther(item);
            }
        }
    }

    /*-------------------------------mise à jour de la qualité spécifique à chaque item-------------------------------*/

    private void updateAgedBrie(Item item) {
        item.sellIn--;
        addQuality(item);
        if (isOutOfDate(item)) {
            addQuality(item);
        }
    }

    private void updateBackstageConcert(Item item) {
        item.sellIn--;
        addQuality(item);
        if (item.sellIn < 10) {
            addQuality(item);
        }
        if (item.sellIn < 5) {
            addQuality(item);
        }
        if (isOutOfDate(item)) {
            item.quality = 0;
        }
    }

    private void updateSulfuras(Item item) {
        item.quality = 80;
    }

    private void updateConjured(Item item) {
        item.sellIn--;
        minusQuality(item);
        minusQuality(item);

        if (isOutOfDate(item)) {
            minusQuality(item);
            minusQuality(item);
        }
    }

    /*-------------------------------------------------------------------------------------*/
    private void updateOther(Item item) {
        item.sellIn--;
        minusQuality(item);
        if (isOutOfDate(item)) {
            minusQuality(item);
        }
    }

    /* ---------- sellIn ---------- */
    private boolean isOutOfDate(Item item) {
        return item.sellIn < 0;
    }

    /* ---------- Quality ---------- */
    private void minusQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    private void addQuality(Item item) {
        if (item.quality < MAX_QUALITY) {
            item.quality++;
        }
    }

}
