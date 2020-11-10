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
// modification de la fonction updateQuality()
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

    /* -------------------------------------mise à jour de la qualité spécifique à chaque item --------------------------------------------- */

    private void updateAgedBrie(Item item) {
        // augmente sa qualité (`quality`) plus le temps passe (`sellIn`)
        item.sellIn--;
        addQuality(item);
        if (isOutOfDate(item)) {
            addQuality(item);
        }
    }

    private void updateBackstageConcert(Item item) {
        // augmente sa qualité (`quality`) plus le temps passe (`sellIn`)
        item.sellIn--;
        addQuality(item); // +1
        // La qualité augmente de 2 quand il reste 10 jours ou moins
        if (item.sellIn < 10) {
            addQuality(item); // +1 => +2
        }
        // La qualité augmente de 3 quand il reste 5 jours ou moins
        if (item.sellIn < 5) {
            addQuality(item); // +3
        }
        if (isOutOfDate(item)) {
            // mais la qualité tombe à 0 après le concert.
            item.quality = 0;
        }
    }

    // "Sulfuras", étant un objet légendaire, n'a pas de date de péremption et ne perd jamais en qualité (`quality`)
    private void updateSulfuras(Item item) {
        // tel sa qualité est de 80 et il ne change jamais.
        item.quality = 80;
    }

    private void updateConjured(Item item) {
        // les éléments "Conjured" voient leur qualité se dégrader de deux fois plus vite que les objets normaux.
        item.sellIn--;
        minusQuality(item); // -1
        minusQuality(item); // -1 => -2

        // Une fois que la date de péremption est passée, la qualité se dégrade deux fois plus rapidement.
        if (isOutOfDate(item)) {
            minusQuality(item); // -1
            minusQuality(item); // -1 => -2
        }
    }

    /* ------------------------------------------------------------------------------------------------------------------------ */
 /* Pour n'importe quel produit : 
        - plus les jours passent, plus la quaité dimine
        - si le produit est périmé, sa qualité diminue */
    private void updateOther(Item item) {
        item.sellIn--;
        minusQuality(item);
        if (isOutOfDate(item)) {
            minusQuality(item);
        }
    }

    /* ---------- sellIn ---------- */
    // tester si le produit est périmé, c'est à dire le sellin est négatif
    private boolean isOutOfDate(Item item) {
        return item.sellIn < 0;
    }

    /* ---------- Quality ---------- */
    // diminuer la qualité si celle-ci est supérieur à 0
    private void minusQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    // augmenter la qualité si elle est inférieur à son majoron c'est à dire 50
    private void addQuality(Item item) {
        if (item.quality < MAX_QUALITY) {
            item.quality++;
        }
    }

}
