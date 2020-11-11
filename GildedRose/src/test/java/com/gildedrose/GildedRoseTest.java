package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

<<<<<<< HEAD
    Item[] items = new Item[] 
        {
            new Item("+5 Dexterity Vest", 10, 20), //
            new Item("Aged Brie", 2, 0), //
            new Item("Elixir of the Mongoose", 5, 7), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 3, 6) 
        };

=======
>>>>>>> hacherixe
    // Tests unitaires sur la Qualité
    
    @Test
    void qualityPositiveOfAgedBrienameSIPositive() {
        //int qu = items[1].quality;
        int qu = 3;
        int si = 9;
        Item[] items = new Item[] { new Item("Aged Brie", si, qu) };
        //this.items = items;
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        
        //assertThat(app.items[1].quality, is(qu+1));
        assertThat(app.items[0].quality, is(qu+1));
    }

    @Test
    void qualityNegativeOfAgedBrienameSIPositive() {
        int qu = -1;
<<<<<<< HEAD
        int si = 5;
        Item[] items = new Item[] { new Item("Aged Brie", si, qu) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(qu+1));
=======
        int si = 1;
        Item[] items = new Item[] { new Item("Aged Brie", si, qu) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
>>>>>>> hacherixe
    }

    @Test
    void qualityPositiveOfAgedBrienameSINegative() {
<<<<<<< HEAD
        int qu = 5;
=======
        int qu = 6;
>>>>>>> hacherixe
        int si = -2;
        Item[] items = new Item[] { new Item("Aged Brie", si, qu) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
<<<<<<< HEAD
        assertThat(app.items[0].quality, is(qu+2));
=======
        assertThat(app.items[0].quality, is(qu-2));
>>>>>>> hacherixe
    }

    @Test
    void qualityNegativeOfAgedBrienameSINegative() {
<<<<<<< HEAD
        int qu = -1;
=======
        int qu = -16;
>>>>>>> hacherixe
        int si = -5;
        Item[] items = new Item[] { new Item("Aged Brie", si, qu) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
<<<<<<< HEAD
        assertThat(app.items[0].quality, is(qu+2));
=======
        assertThat(app.items[0].quality, is(0));
>>>>>>> hacherixe
    }

    @Test
    void qualityPositiveOfBackstagepassestoaTAFKAL80ETCconcertnameSI1to5() {
        int ql = 31;
        int si = 1;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql+3));
    }

    @Test
    void qualityNegativeOfBackstagepassestoaTAFKAL80ETCconcertnameSI1to5() {
<<<<<<< HEAD
        int ql = -1;
=======
        int ql = -6;
>>>>>>> hacherixe
        int si = 1;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
<<<<<<< HEAD
        assertThat(app.items[0].quality, is(ql+3));
=======
        assertThat(app.items[0].quality, is(0));
>>>>>>> hacherixe
    }


    @Test
    void qualityPositiveOfBackstagepassestoaTAFKAL80ETCconcertnameSI6to10() {
        int ql = 31;
        int si = 9;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql+2));
    }

    @Test
    void qualityNegativeOfBackstagepassestoaTAFKAL80ETCconcertnameSI6to10() {
<<<<<<< HEAD
        int ql = -1;
=======
        int ql = -7;
>>>>>>> hacherixe
        int si = 10;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
<<<<<<< HEAD
        assertThat(app.items[0].quality, is(ql+2));
=======
        assertThat(app.items[0].quality, is(0));
>>>>>>> hacherixe
    }

    @Test
    void qualityPositiveOfBackstagepassestoaTAFKAL80ETCconcertnameSINegative() {
        int ql = 31;
        int si = -1;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql-ql));
    }

    @Test
    void qualityNegativeOfBackstagepassestoaTAFKAL80ETCconcertnameSINegative() {
        int ql = -1;
<<<<<<< HEAD
        int si = -1;
=======
        int si = 0;
>>>>>>> hacherixe
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql-ql));
    }

    @Test
    void qualityPositiveOfBackstagepassestoaTAFKAL80ETCconcertnameSIaboveAndEgalto11() {
        int ql = 31;
        int si = 11;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql+1));
    }

    @Test
    void qualityNegativeOfBackstagepassestoaTAFKAL80ETCconcertnameSIaboveAndEgalto11() {
        int ql = -1;
        int si = 12;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
<<<<<<< HEAD
        assertThat(app.items[0].quality, is(ql+1));
    }

    @Test
    void nameRandomQualityPositiveSIPos() {
=======
        assertThat(app.items[0].quality, is(0));
    }

    @Test
    void qualityPositiveNameRandomSIPos() {
>>>>>>> hacherixe
        int ql = 1;
        int si = 1;
        Item[] items = new Item[] { new Item("test", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql-1));
    }

    @Test
<<<<<<< HEAD
    void nameRandomQualityNegativeSIPos() {
=======
    void qualityNegativeNameRandomSIPos() {
>>>>>>> hacherixe
        int ql = -1;
        int si = 1;
        Item[] items = new Item[] { new Item("test", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
<<<<<<< HEAD
        assertThat(app.items[0].quality, is(ql));
    }

    @Test
    void nameRandomQualityPositiveSINeg() {
        int ql = 1;
=======
        assertThat(app.items[0].quality, is(0));
    }

    @Test
    void qualityPositiveNameRandomSINeg() {
        int ql = 4;
>>>>>>> hacherixe
        int si = -1;
        Item[] items = new Item[] { new Item("test", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
<<<<<<< HEAD
        assertThat(app.items[0].quality, is(ql-1));
    }

    @Test
    void nameRandomQualityNegativeSINeg() {
=======
        assertThat(app.items[0].quality, is(ql-2));
    }

    @Test
    void qualityNegativeNameRandomSINeg() {
>>>>>>> hacherixe
        int ql = -1;
        int si = -1;
        Item[] items = new Item[] { new Item("test", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
<<<<<<< HEAD
        assertThat(app.items[0].quality, is(ql));
    }

    @Test
    void nameSulfurasQualityPositiveSIPositive() {
=======
        assertThat(app.items[0].quality, is(0));
    }

    @Test
    void qualityPositiveNameSulfurasSIPos() {
>>>>>>> hacherixe
        int ql = 5;
        int si = 5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql));
    }
    
    @Test
<<<<<<< HEAD
    void nameSulfurasQualityNegativeSIPositive() {
=======
    void qualityNegativeNameSulfurasSIPos() {
>>>>>>> hacherixe
        int ql = -1;
        int si = 5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
<<<<<<< HEAD
        assertThat(app.items[0].quality, is(ql));
    } 

    @Test
    void nameSulfurasQualityPositiveSINegative() {
=======
        assertThat(app.items[0].quality, is(0));
    } 

    @Test
    void qualityPositiveNameSulfurasSINeg() {
>>>>>>> hacherixe
        int ql = 5;
        int si = -5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql));
    }
    
    @Test
<<<<<<< HEAD
    void nameSulfurasQualityNegativeSINegative() {
=======
    void qualityNegativeNameSulfurasSINeg() {
>>>>>>> hacherixe
        int ql = -1;
        int si = -5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
<<<<<<< HEAD
        assertThat(app.items[0].quality, is(ql));
=======
        assertThat(app.items[0].quality, is(0));
>>>>>>> hacherixe
    } 

    //Test unitaires sur le nom : Name

    @Test
<<<<<<< HEAD
    void NamerandomQualityPositiveSIPositive() {
=======
    void nameRandomQualityPositiveSIPos() {
>>>>>>> hacherixe
        int ql = 1;
        int si = 5;
        String n = "abc";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    } 

    @Test
<<<<<<< HEAD
    void NamerandomQualityPositiveSINegative() {
=======
    void nameRandomQualityPositiveSINeg() {
>>>>>>> hacherixe
        int ql = 1;
        int si = -5;
        String n = "abc";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
<<<<<<< HEAD
    void NamerandomQualityNegativeSIPositive() {
=======
    void nameRandomQualityNegativeSIPos() {
>>>>>>> hacherixe
        int ql = -1;
        int si = 5;
        String n = "abc";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    } 

    @Test
<<<<<<< HEAD
    void NamerandomQualityNegativeSINegative() {
=======
    void nameRandomQualityNegativeSINeg() {
>>>>>>> hacherixe
        int ql = 1;
        int si = -5;
        String n = "abc";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
<<<<<<< HEAD
    void NameAgedBrieQualityPositiveSIPositive() {
=======
    void nameAgedBrieQualityPositiveSIPos() {
>>>>>>> hacherixe
        int ql = 1;
        int si = 5;
        String n = "Aged Brie";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
<<<<<<< HEAD
    void NameAgedBrieQualityPositiveSINegative() {
=======
    void nameAgedBrieQualityPositiveSINeg() {
>>>>>>> hacherixe
        int ql = 1;
        int si = -5;
        String n = "Aged Brie";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
<<<<<<< HEAD
    void NameAgedBrieQualityNegativeSIPositive() {
=======
    void nameAgedBrieQualityNegativeSIPos() {
>>>>>>> hacherixe
        int ql = -1;
        int si = 5;
        String n = "Aged Brie";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    } 

    @Test
<<<<<<< HEAD
    void NameAgedBrieQualityNegativeSINegative() {
=======
    void nameAgedBrieQualityNegativeSINeg() {
>>>>>>> hacherixe
        int ql = -1;
        int si = -5;
        String n = "Aged Brie";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
<<<<<<< HEAD
    void NameBackstageQualityPositiveSIPositive() {
=======
    void nameBackstageQualityPositiveSIPos() {
>>>>>>> hacherixe
        int ql = 1;
        int si = 5;
        String n = "Backstage passes to a TAFKAL80ETC concert";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
<<<<<<< HEAD
    void NameBackstageQualityPositiveSINegative() {
=======
    void nameBackstageQualityPositiveSINeg() {
>>>>>>> hacherixe
        int ql = 1;
        int si = -5;
        String n = "Backstage passes to a TAFKAL80ETC concert";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
<<<<<<< HEAD
    void NameBackstageQualityNegativeSIPositive() {
=======
    void nameBackstageQualityNegativeSIPos() {
>>>>>>> hacherixe
        int ql = -1;
        int si = 5;
        String n = "Backstage passes to a TAFKAL80ETC concert";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
<<<<<<< HEAD
    void NameBackstageQualityNegativeSINegative() {
=======
    void nameBackstageQualityNegativeSINeg() {
>>>>>>> hacherixe
        int ql = -1;
        int si = -5;
        String n = "Backstage passes to a TAFKAL80ETC concert";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
<<<<<<< HEAD
    void NameSulfurasQualityPositiveSIPositive() {
=======
    void nameSulfurasQualityPositiveSIPos() {
>>>>>>> hacherixe
        int ql = 1;
        int si = 5;
        String n = "Sulfuras, Hand of Ragnaros";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
<<<<<<< HEAD
    void NameSulfurasQualityPositiveSINegative() {
=======
    void nameSulfurasQualityPositiveSINeg() {
>>>>>>> hacherixe
        int ql = 1;
        int si = -5;
        String n = "Sulfuras, Hand of Ragnaros";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
<<<<<<< HEAD
    void NameSulfurasQualityNegativeSIPositive() {
=======
    void nameSulfurasQualityNegativeSIPos() {
>>>>>>> hacherixe
        int ql = -1;
        int si = 5;
        String n = "Sulfuras, Hand of Ragnaros";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
<<<<<<< HEAD
    void NameSulfurasQualityNegativeSINegative() {
=======
    void nameSulfurasQualityNegativeSINeg() {
>>>>>>> hacherixe
        int ql = -1;
        int si = -5;
        String n = "Sulfuras, Hand of Ragnaros";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    //Test unitaires sur les jours restants : SellIn
<<<<<<< HEAD

    @Test
    void SIPositiveNamerandomQualityPositive() {
=======
    @Test
    void siPositiveNamerandomQualityPos() {
>>>>>>> hacherixe
        int ql = 1;
        int si = 5;
        Item[] items = new Item[] { new Item("abc", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
<<<<<<< HEAD
    void SINegativeNamerandomQualityPositive() {
=======
    void siNegativeNamerandomQualityPos() {
>>>>>>> hacherixe
        int ql = 1;
        int si = -5;
        Item[] items = new Item[] { new Item("abc", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
<<<<<<< HEAD
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void SIPositiveNamerandomQualityNegative() {
=======
        assertThat(app.items[0].sellIn, is(0));
    }

    @Test
    void siPositiveNamerandomQualityNeg() {
>>>>>>> hacherixe
        int ql = -1;
        int si = 5;
        Item[] items = new Item[] { new Item("abc", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
<<<<<<< HEAD
    void SINegativeNamerandomQualityNegative() {
=======
    void siNegativeNamerandomQualityNeg() {
>>>>>>> hacherixe
        int ql = 1;
        int si = -5;
        Item[] items = new Item[] { new Item("abc", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
<<<<<<< HEAD
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void SIPositiveNameAgedBrieQualityPositive() {
=======
        assertThat(app.items[0].sellIn, is(0));
    }

    @Test
    void siPositiveNameAgedBrieQualityPos() {
>>>>>>> hacherixe
        int ql = 1;
        int si = 5;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
<<<<<<< HEAD
    void SINegativeNameAgedBrieQualityPositive() {
=======
    void siNegativeNameAgedBrieQualityPos() {
>>>>>>> hacherixe
        int ql = 1;
        int si = -5;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
<<<<<<< HEAD
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void SIPositiveNameAgedBrieQualityNegative() {
=======
        assertThat(app.items[0].sellIn, is(0));
    }

    @Test
    void siPositiveNameAgedBrieQualityNeg() {
>>>>>>> hacherixe
        int ql = -1;
        int si = 5;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
<<<<<<< HEAD
    void SINegativeNameAgedBrieQualityNegative() {
=======
    void siNegativeNameAgedBrieQualityNeg() {
>>>>>>> hacherixe
        int ql = -1;
        int si = -5;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
<<<<<<< HEAD
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void SIPositiveNameBackstageQualityPositive() {
=======
        assertThat(app.items[0].sellIn, is(0));
    }

    @Test
    void siPositiveNameBackstageQualityPos() {
>>>>>>> hacherixe
        int ql = 1;
        int si = 5;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
<<<<<<< HEAD
    void SINegativeNameBackstageQualityPositive() {
=======
    void siNegativeNameBackstageQualityPos() {
>>>>>>> hacherixe
        int ql = 1;
        int si = -5;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert ", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
<<<<<<< HEAD
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void SIPositiveNameBackstageQualityNegative() {
=======
        assertThat(app.items[0].sellIn, is(0));
    }

    @Test
    void siPositiveNameBackstageQualityNeg() {
>>>>>>> hacherixe
        int ql = -1;
        int si = 5;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    } 

    @Test
<<<<<<< HEAD
    void SINegativeNameBackstageQualityNegative() {
=======
    void siNegativeNameBackstageQualityNeg() {
>>>>>>> hacherixe
        int ql = -1;
        int si = -5;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
<<<<<<< HEAD
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void SIPositiveNameSulfurasQualityPositive() {
=======
        assertThat(app.items[0].sellIn, is(0));
    }

    @Test
    void siPositiveNameSulfurasQualityPos() {
>>>>>>> hacherixe
        int ql = 1;
        int si = 5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si));
    }

    @Test
<<<<<<< HEAD
    void SINegativeNameSulfurasQualityPositive() {
=======
    void siNegativeNameSulfurasQualityPos() {
>>>>>>> hacherixe
        int ql = 1;
        int si = -5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si));
    }

    @Test
<<<<<<< HEAD
    void SIPositiveNameSulfurasQualityNegative() {
=======
    void siPositiveNameSulfurasQualityNeg() {
>>>>>>> hacherixe
        int ql = -1;
        int si = 5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si));
    }

    @Test
<<<<<<< HEAD
    void SINegativeNameSulfurasQualityNegative() {
=======
    void siNegativeNameSulfurasQualityNeg() {
>>>>>>> hacherixe
        int ql = -1;
        int si = -5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si));
    }
<<<<<<< HEAD
    // On vérifie que lorsque la qualité est a 49 mais que le SI est a 10 ou moins,
    // la qualité augmente bien de 1 et non de 2.
    @Test
    void SIPositiveNameBackstageQualityPositive2Lim50()
=======


//Test sur la limitation de la qualité : toujours inférieure à 50
// Backstage passes to a TAFKAL80ETC concert
    @Test
    void qualityPositive2Lim50NameBackstageSIPos()
>>>>>>> hacherixe
    {
        int ql = 49;
        int si = 10;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }
<<<<<<< HEAD
    @Test
    void SIPositiveNameAgedBrieQualityPositive2Lim50()
=======

    @Test
    void qualityPositive3Lim50NameBackstageSIPos()
    {
        int ql = 48;
        int si = 5;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }
    
    //Aged Brie

    @Test
    void qualityPositive2Lim50NameAgedBrieSIPos()
>>>>>>> hacherixe
    {
        int ql = 49;
        int si = 10;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }

<<<<<<< HEAD
    @Test
    void SINegativeNameBackstageQualityPositive2Lim50()
    {
        int ql = 49;
        int si = -10;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }
    @Test
    void SINegativeNameAgedBrieQualityPositive2Lim50()
    {
        int ql = 49;
        int si = -10;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }

    // On vérifie que la qualité augmente de 2 lorsqu'il reste 10 jours ou moins.
    @Test
    void SIPositiveNameBackstageQualityPositive2()
    {
        int ql = 40;
        int si = 10;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(42));
    }

    // On vérifie que la qualité augmente de 3 lorsqu'il reste 5 jours ou moins.
    @Test
    void SIPositiveNameBackstageQualityPositive3()
    {
        int ql = 40;
        int si = 5;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(43));
    }

    // On vérifie que lorsque la qualité est a 49 mais que le SI est a 10 ou moins,
    // la qualité augmente bien de 1 et non de 2.
    @Test
    void SIPositiveNameBackstageQualityPositive2Lim50()
    {
        int ql = 49;
        int si = 10;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }

    // On vérifie que lorsque la qualité est a 48 mais que le SI est a 5 ou moins,
    // la qualité augmente bien de 2 et non de 3.
    @Test
    void SIPositiveNameBackstageQualityPositive3Lim50()
    {
        int ql = 48;
        int si = 5;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }
    
    // On vérifie que lorsque la qualité est a 49 mais que le SI est a 5 ou moins,
    // la qualité augmente bien de 1 et non de 3.
    @Test
    void SIPositiveNameBackstageQualityPositive3Lim50_2()
    {
        int ql = 49;
        int si = 5;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }

    // On vérifie que la qualité augmente de 2 lorsqu'il reste 10 jours ou moins.
    @Test
    void SIPositiveNameAgedBrieQualityPositive2()
    {
        int ql = 40;
        int si = 10;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(41));
    }

    // On vérifie que la qualité augmente de 3 lorsqu'il reste 5 jours ou moins.
    @Test
    void SIPositiveNameAgedBrieQualityPositive3()
    {
        int ql = 40;
        int si = 5;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(41));
    }

    // On vérifie que lorsque la qualité est a 49 mais que le SI est a 10 ou moins,
    // la qualité augmente bien de 1 et non de 2.
    @Test
    void SIPositiveNameAgedBrieQualityPositive2Lim50()
    {
        int ql = 49;
        int si = 10;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }

    // On vérifie que lorsque la qualité est a 48 mais que le SI est a 5 ou moins,
    // la qualité augmente bien de 2 et non de 3.
    @Test
    void SIPositiveNameAgedBrieQualityPositive3Lim50()
    {
        int ql = 48;
        int si = 5;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(49));
    }
    
    // On vérifie que lorsque la qualité est a 49 mais que le SI est a 5 ou moins,
    // la qualité augmente bien de 1 et non de 3.
    @Test
    void SIPositiveNameAgedBrieQualityPositive3Lim50_2()
    {
        int ql = 49;
        int si = 5;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }
    
    
    //Elements "conjured"
    //A implementer par la suite
    void SINegativeNameConjuredQualityPositive()
    {
        int ql = 49;
        int si = -10;
        Item[] items = new Item[] { new Item("Conjured Mana cake", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }
}
=======

    @Test
    void qualityPositive3Lim50NameAgedBrieSIPos()
    {
        int ql = 48;
        int si = 5;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(49));
    }
    
    //Elements "conjured"

    @Test
    void qualityPositiveSINegativeNameConjured()
    {
        int ql = 48;
        int si = -10;
        Item[] items = new Item[] { new Item("Conjured Mana cake", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql-4));
    }

    @Test
    void qualityNegativeSINegativeNameConjured()
    {
        int ql = -3;
        int si = -10;
        Item[] items = new Item[] { new Item("Conjured Mana cake", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }

    @Test
    void qualityNegativeSIPositiveNameConjured()
    {
        int ql = -3;
        int si = 10;
        Item[] items = new Item[] { new Item("Conjured Mana cake", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }

    @Test
    void qualityPositiveSIPositiveNameConjured()
    {
        int ql = 3;
        int si = 10;
        Item[] items = new Item[] { new Item("Conjured Mana cake", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql-2));
    }

    @Test
    void siNegativeNameConjuredQualityPos()
    {
        int ql = 48;
        int si = -10;
        Item[] items = new Item[] { new Item("Conjured Mana cake", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(0));
    }

    @Test
    void siNegativeNameConjuredQualityNeg()
    {
        int ql = -3;
        int si = -10;
        Item[] items = new Item[] { new Item("Conjured Mana cake", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(0));
    }

    @Test
    void siPositiveNameConjuredQualityNeg()
    {
        int ql = -3;
        int si = 10;
        Item[] items = new Item[] { new Item("Conjured Mana cake", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void siPositiveNameConjuredQualityPos()
    {
        int ql = 3;
        int si = 10;
        Item[] items = new Item[] { new Item("Conjured Mana cake", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void nameCojuredQualityPositiveSIPos() {
        int ql = 1;
        int si = 5;
        String n = "Conjured mana Cake";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void nameCojuredQualityNegativeSIPos() {
        int ql = -2;
        int si = 6;
        String n = "Conjured mana Cake";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void nameCojuredQualityPositiveSINeg() {
        int ql = 13;
        int si = -9;
        String n = "Conjured mana Cake";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void nameCojuredQualityNegativeSINeg() {
        int ql = -1;
        int si = -5;
        String n = "Conjured mana Cake";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    
}
>>>>>>> hacherixe
