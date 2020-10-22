package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

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
        int si = 5;
        Item[] items = new Item[] { new Item("Aged Brie", si, qu) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(qu+1));
    }

    @Test
    void qualityPositiveOfAgedBrienameSINegative() {
        int qu = 5;
        int si = -2;
        Item[] items = new Item[] { new Item("Aged Brie", si, qu) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(qu+2));
    }

    @Test
    void qualityNegativeOfAgedBrienameSINegative() {
        int qu = -1;
        int si = -5;
        Item[] items = new Item[] { new Item("Aged Brie", si, qu) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(qu+2));
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
        int ql = -1;
        int si = 1;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql+3));
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
        int ql = -1;
        int si = 10;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql+2));
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
        int si = -1;
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
        assertThat(app.items[0].quality, is(ql+1));
    }

    @Test
    void nameRandomQualityPositiveSIPos() {
        int ql = 1;
        int si = 1;
        Item[] items = new Item[] { new Item("test", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql-1));
    }

    @Test
    void nameRandomQualityNegativeSIPos() {
        int ql = -1;
        int si = 1;
        Item[] items = new Item[] { new Item("test", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql));
    }

    @Test
    void nameRandomQualityPositiveSINeg() {
        int ql = 1;
        int si = -1;
        Item[] items = new Item[] { new Item("test", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql-1));
    }

    @Test
    void nameRandomQualityNegativeSINeg() {
        int ql = -1;
        int si = -1;
        Item[] items = new Item[] { new Item("test", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql));
    }

    @Test
    void nameSulfurasQualityPositiveSIPositive() {
        int ql = 5;
        int si = 5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql));
    }
    
    @Test
    void nameSulfurasQualityNegativeSIPositive() {
        int ql = -1;
        int si = 5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql));
    } 

    @Test
    void nameSulfurasQualityPositiveSINegative() {
        int ql = 5;
        int si = -5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql));
    }
    
    @Test
    void nameSulfurasQualityNegativeSINegative() {
        int ql = -1;
        int si = -5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql));
    } 

    //Test unitaires sur le nom : Name

    @Test
    void NamerandomQualityPositiveSIPositive() {
        int ql = 1;
        int si = 5;
        String n = "abc";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    } 

    @Test
    void NamerandomQualityPositiveSINegative() {
        int ql = 1;
        int si = -5;
        String n = "abc";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void NamerandomQualityNegativeSIPositive() {
        int ql = -1;
        int si = 5;
        String n = "abc";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    } 

    @Test
    void NamerandomQualityNegativeSINegative() {
        int ql = 1;
        int si = -5;
        String n = "abc";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void NameAgedBrieQualityPositiveSIPositive() {
        int ql = 1;
        int si = 5;
        String n = "Aged Brie";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void NameAgedBrieQualityPositiveSINegative() {
        int ql = 1;
        int si = -5;
        String n = "Aged Brie";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void NameAgedBrieQualityNegativeSIPositive() {
        int ql = -1;
        int si = 5;
        String n = "Aged Brie";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    } 

    @Test
    void NameAgedBrieQualityNegativeSINegative() {
        int ql = -1;
        int si = -5;
        String n = "Aged Brie";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void NameBackstageQualityPositiveSIPositive() {
        int ql = 1;
        int si = 5;
        String n = "Backstage passes to a TAFKAL80ETC concert";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void NameBackstageQualityPositiveSINegative() {
        int ql = 1;
        int si = -5;
        String n = "Backstage passes to a TAFKAL80ETC concert";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void NameBackstageQualityNegativeSIPositive() {
        int ql = -1;
        int si = 5;
        String n = "Backstage passes to a TAFKAL80ETC concert";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void NameBackstageQualityNegativeSINegative() {
        int ql = -1;
        int si = -5;
        String n = "Backstage passes to a TAFKAL80ETC concert";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void NameSulfurasQualityPositiveSIPositive() {
        int ql = 1;
        int si = 5;
        String n = "Sulfuras, Hand of Ragnaros";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void NameSulfurasQualityPositiveSINegative() {
        int ql = 1;
        int si = -5;
        String n = "Sulfuras, Hand of Ragnaros";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void NameSulfurasQualityNegativeSIPositive() {
        int ql = -1;
        int si = 5;
        String n = "Sulfuras, Hand of Ragnaros";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void NameSulfurasQualityNegativeSINegative() {
        int ql = -1;
        int si = -5;
        String n = "Sulfuras, Hand of Ragnaros";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    //Test unitaires sur les jours restants : SellIn

    @Test
    void SIPositiveNamerandomQualityPositive() {
        int ql = 1;
        int si = 5;
        Item[] items = new Item[] { new Item("abc", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void SINegativeNamerandomQualityPositive() {
        int ql = 1;
        int si = -5;
        Item[] items = new Item[] { new Item("abc", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void SIPositiveNamerandomQualityNegative() {
        int ql = -1;
        int si = 5;
        Item[] items = new Item[] { new Item("abc", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void SINegativeNamerandomQualityNegative() {
        int ql = 1;
        int si = -5;
        Item[] items = new Item[] { new Item("abc", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void SIPositiveNameAgedBrieQualityPositive() {
        int ql = 1;
        int si = 5;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void SINegativeNameAgedBrieQualityPositive() {
        int ql = 1;
        int si = -5;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void SIPositiveNameAgedBrieQualityNegative() {
        int ql = -1;
        int si = 5;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void SINegativeNameAgedBrieQualityNegative() {
        int ql = -1;
        int si = -5;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void SIPositiveNameBackstageQualityPositive() {
        int ql = 1;
        int si = 5;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void SINegativeNameBackstageQualityPositive() {
        int ql = 1;
        int si = -5;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert ", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void SIPositiveNameBackstageQualityNegative() {
        int ql = -1;
        int si = 5;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    } 

    @Test
    void SINegativeNameBackstageQualityNegative() {
        int ql = -1;
        int si = -5;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void SIPositiveNameSulfurasQualityPositive() {
        int ql = 1;
        int si = 5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si));
    }

    @Test
    void SINegativeNameSulfurasQualityPositive() {
        int ql = 1;
        int si = -5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si));
    }

    @Test
    void SIPositiveNameSulfurasQualityNegative() {
        int ql = -1;
        int si = 5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si));
    }

    @Test
    void SINegativeNameSulfurasQualityNegative() {
        int ql = -1;
        int si = -5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si));
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
