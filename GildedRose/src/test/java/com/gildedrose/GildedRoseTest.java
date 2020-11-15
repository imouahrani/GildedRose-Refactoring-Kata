package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {


    //==============SULFURAS==================

    //===qual

    @Test
        void Sulfuras_qual_S0_Q80() {
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", 0, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(80));
    }

    @Test
        void Sulfuras_qual_Sneg_Q80() {
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", -1, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(80));
    }

    @Test
        void Sulfuras_qual_Spos_Q80() {
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", 1, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(80));
    }

    //===sell

    @Test
        void Sulfuras_sell_S0_Q80() {
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", 0, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(0));
    }

    @Test
        void Sulfuras_sell_Sneg_Q80() {
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", -1, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-1));
    }

    @Test
        void Sulfuras_sell_Spos_Q80() {
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", 1, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(1));
    }


    //==============Whatever==================

    //===qual

    @Test
        void Whatever_qual_Spos_Qpos() {
        Item[] items = new Item[] {new Item("Whatever", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(9));
    }

    @Test
        void Whatever_qual_S0_Qpos() {
        Item[] items = new Item[] {new Item("Whatever", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(8));
    }

    @Test
        void Whatever_qual_Spos_Q0() {
        Item[] items = new Item[] {new Item("Whatever", 10, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }

    @Test
        void Whatever_qual_Spos_Qneg() {
        Item[] items = new Item[] {new Item("Whatever", 10, -10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(-10));
    }

    @Test
        void Whatever_qual_S0_Q0() {
        Item[] items = new Item[] {new Item("Whatever", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }


    //===sell

    @Test
        void Whatever_sell_Spos_Qpos() {
        Item[] items = new Item[] {new Item("Whatever", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(9));
    }

    @Test
        void Whatever_sell_S0_Qpos() {
        Item[] items = new Item[] {new Item("Whatever", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-1));
    }

    @Test
        void Whatever_sell_Sneg_Qpos() {
        Item[] items = new Item[] {new Item("Whatever", -50, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-51));
    }


    //=====================AGED BRIE==================

    //=====qual 10

    @Test
        void AB_qual_Spos_Qpos() {
        Item[] items = new Item[] {new Item("Aged Brie", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(11));
    }

    @Test
        void AB_qual_S0_Qpos() {
        Item[] items = new Item[] {new Item("Aged Brie", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(12));
    }

    @Test
        void AB_Squal_Qneg() {
        Item[] items = new Item[] {new Item("Aged Brie", -10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(12));
    }

    //=====qual 50

    @Test
        void AB_qual_Spos_Q50() {
        Item[] items = new Item[] {new Item("Aged Brie", 10, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }

    @Test
        void AB_qual_S0_Q50() {
        Item[] items = new Item[] {new Item("Aged Brie", 0, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }

    @Test
        void AB_qual_S0_Q49() {
        Item[] items = new Item[] {new Item("Aged Brie",  0, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }


    //=====sell

    @Test
        void AB_sell_Spos_Qpos() {
        Item[] items = new Item[] {new Item("Aged Brie", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(9));
    }

    @Test
        void AB_sell_S0_Qpos() {
        Item[] items = new Item[] {new Item("Aged Brie", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-1));
    }

    @Test
        void AB_sell_Sneg_Qpos() {
        Item[] items = new Item[] {new Item("Aged Brie", -10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-11));
    }


    //================Backstage passes to a TAFKAL80ETC concert==============

    //===qual

    @Test
        void BS_qual_Ssup10_Q10() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 15, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(11));
    }

    @Test
        void BS_qual_S10_Q10() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(12));
    }

    @Test
        void BS_qual_Sbtw_5_10_Q10() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 8, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(12));
    }

    @Test
        void BS_qual_S5_Q10() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(13));
    }

    @Test
        void BS_qual_Sbtw_0_5_Q10() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 3, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(13));
    }

    @Test
        void BS_qual_S0_Q10() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }

    @Test
        void BS_qual_Sneg_Q10() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", -10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }

    //===qual 50

    @Test
        void BS_qual_Ssup10_Q50() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 15, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }

    @Test
        void BS_qual_S10_Q50() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }

    @Test
        void BS_qual_Sbtw_5_10_Q50() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 8, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }

    @Test
        void BS_qual_S5_Q50() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }

    @Test
        void BS_qual_Sbtw_5_0_Q49() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 3, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }

    @Test
        void BS_qual_S0_Q49() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 0, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }

    @Test
        void BS_qual_Sneg_Q49() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", -10, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }


    //===sell

    @Test
        void BS_sell_Spos_Qpos() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(9));
    }

    @Test
        void BS_sell_S0_Qpos() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-1));
    }

    @Test
        void BS_sell_Sneg_Qpos() {
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", -10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-11));
    }


    //==========CONJURED=============

    //===qual

    @Test
        void Conjured_qual_Spos_Qpos() {
        Item[] items = new Item[] {new Item("Conjured Mana Cake", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(8));
    }

    @Test
        void Conjured_qual_S0_Qpos() {
        Item[] items = new Item[] {new Item("Conjured Mana Cake", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(6));
    }

    @Test
        void Conjured_qual_Sneg_Qpos() {
        Item[] items = new Item[] {new Item("Conjured Mana Cake", -10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(6));
    }


    //===sell

    @Test
        void Conjured_sell_Spos_Qpos() {
        Item[] items = new Item[] {new Item("Conjured Mana Cake", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(9));
    }

    @Test
        void Conjured_sell_S0_Qpos() {
        Item[] items = new Item[] {new Item("Conjured Mana Cake", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-1));
    }

    @Test
        void Conjured_sell_Sneg_Qpos() {
        Item[] items = new Item[] {new Item("Conjured Mana Cake", -10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-11));
    }

    //==========ToString=============

    @Test
        void testToString() {
        Item[] items = new Item[] {new Item("Conjured Mana Cake", 10, 10) };
        GildedRose app = new GildedRose(items);

        assertThat(app.items[0].toString(), is("Conjured Mana Cake, 10, 10"));
    }

}
