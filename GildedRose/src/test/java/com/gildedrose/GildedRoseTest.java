package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

       
    //==============SULFURAS==================
    
    //===qual
    
    @Test
        void Sulfuras_qual_0() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(80));
    }
        
    
    @Test
        void Sulfuras_qual_neg() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -1, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(80));
    }
        
    @Test
        void Sulfuras_qual_pos() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 1, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(80));
    }
        
    //===sell
        
    @Test
        void Sulfuras_sell_0() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(0));
    }
        
    
    @Test
        void Sulfuras_sell_neg() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -1, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-1));
    }
        
    @Test
        void Sulfuras_sell_pos() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 1, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(1));
    }
        
        
    //==============Whatever==================
    //===qual
    @Test
        void Whatever_qual_pos() {
        Item[] items = new Item[] { new Item("Whatever", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(9));
    }
      
    
    @Test
        void Whatever_qual_0() {
        Item[] items = new Item[] { new Item("Whatever", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(8));
    }    
        
       
    @Test
        void Whatever_qual_neg1() {
        Item[] items = new Item[] { new Item("Whatever", 10, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }
        
        @Test
        void Whatever_qual_neg1htd() {
        Item[] items = new Item[] { new Item("Whatever", 10, -10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(-10));
    }
        
    
    @Test
        void Whatever_qual_neg2() {
        Item[] items = new Item[] { new Item("Whatever", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }    
        
        
    //===sell
    @Test
        void Whatever_sell_pos() {
        Item[] items = new Item[] { new Item("Whatever", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(9));
    }
      
    
    @Test
        void Whatever_sell_0() {
        Item[] items = new Item[] { new Item("Whatever", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-1));
    }    
        
       
    @Test
        void Whatever_sell_neg() {
        Item[] items = new Item[] { new Item("Whatever", -50, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-51));
    }
        
   
    //=====================AGED BRIE==================
    
    //=====qual
        
    @Test
        void AB_qual_pos() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(11));
    }
        
    @Test
        void AB_qual_0() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(12));
    }
        
    @Test
        void AB_qual_neg() {
        Item[] items = new Item[] { new Item("Aged Brie", -10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(12));
    }
        
    //=====qual 50
        
    @Test
        void AB_qual_pos_50() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }
        
    @Test
        void AB_qual_0_50() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }
        
    @Test
        void AB_qual_0_49() {
        Item[] items = new Item[] { new Item("Aged Brie",  0, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }
        
    //=====sell
        
    @Test
        void AB_sell_pos() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(9));
    }
        
    @Test
        void AB_sell_0() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-1));
    }
        
    @Test
        void AB_sell_neg() {
        Item[] items = new Item[] { new Item("Aged Brie", -10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-11));
    }
      
      
    //================Backstage passes to a TAFKAL80ETC concert==============
        
    //===qual
    
    @Test
        void BS_qual_sup10() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(11));
    }
        
    
    @Test
        void BS_qual_10() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(12));
    }
        
    
    @Test
        void BS_qual_entre_10_5() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 8, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(12));
    } 
        
    @Test
        void BS_qual_5() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(13));
    } 
        
    @Test
        void BS_qual_inf_5() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 3, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(13));
    } 
        
    @Test
        void BS_qual_0() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    } 
        
    @Test
        void BS_qual_neg() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }
        
    //===qual 50
    
    @Test
        void BS_qual_sup10_plus50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }
    
    @Test
        void BS_qual_10_plus50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }
    
    @Test
        void BS_qual_entre_10_5_plus50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 8, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }
        
    @Test
        void BS_qual_5_plus50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    } 
        
    @Test
        void BS_qual_inf_5_49() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 3, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    } 
        
    @Test
        void BS_qual_0_49() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    } 
        
    @Test
        void BS_qual_neg_plus50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -10, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }
        
        
    //===sell
        
    @Test
        void BS_sell_pos() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(9));
    } 
        
    @Test
        void BS_sell_0() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-1));
    } 
        
    @Test
        void BS_sell_neg() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-11));
    }
        
    
    //==========CONJURED=============
        
    //===qual
     
    @Test
        void Conjured_qual_pos() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(8));
    }
        
    @Test
        void Conjured_qual_0() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(6));
    }
        
    @Test
        void Conjured_qual_neg() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", -10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(6));
    }
        
        
    //===sell
        
    @Test
        void Conjured_sell_pos() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(9));
    }
        
    @Test
        void Conjured_sell_0() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-1));
    }
        
    @Test
        void Conjured_sell_neg() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", -10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(-11));
    }

}
