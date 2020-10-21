package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

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
        int si = 1;
        Item[] items = new Item[] { new Item("Aged Brie", si, qu) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }

    @Test
    void qualityPositiveOfAgedBrienameSINegative() {
        int qu = 6;
        int si = -2;
        Item[] items = new Item[] { new Item("Aged Brie", si, qu) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(qu/2));
    }

    @Test
    void qualityNegativeOfAgedBrienameSINegative() {
        int qu = -16;
        int si = -5;
        Item[] items = new Item[] { new Item("Aged Brie", si, qu) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
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
        int ql = -6;
        int si = 1;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
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
        int ql = -7;
        int si = 10;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
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
        int si = 0;
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
        assertThat(app.items[0].quality, is(0));
    }

    @Test
    void qualityPositiveNameRandomSIPos() {
        int ql = 1;
        int si = 1;
        Item[] items = new Item[] { new Item("test", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql-1));
    }

    @Test
    void qualityNegativeNameRandomSIPos() {
        int ql = -1;
        int si = 1;
        Item[] items = new Item[] { new Item("test", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }

    @Test
    void qualityPositiveNameRandomSINeg() {
        int ql = 4;
        int si = -1;
        Item[] items = new Item[] { new Item("test", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql/2));
    }

    @Test
    void qualityNegativeNameRandomSINeg() {
        int ql = -1;
        int si = -1;
        Item[] items = new Item[] { new Item("test", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }

    @Test
    void qualityPositiveNameSulfurasSIPos() {
        int ql = 5;
        int si = 5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql));
    }
    
    @Test
    void qualityNegativeNameSulfurasSIPos() {
        int ql = -1;
        int si = 5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    } 

    @Test
    void qualityPositiveNameSulfurasSINeg() {
        int ql = 5;
        int si = -5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(ql));
    }
    
    @Test
    void qualityNegativeNameSulfurasSINeg() {
        int ql = -1;
        int si = -5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    } 

    //Test unitaires sur le nom : Name

    @Test
    void nameRandomQualityPositiveSIPos() {
        int ql = 1;
        int si = 5;
        String n = "abc";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    } 

    @Test
    void nameRandomQualityPositiveSINeg() {
        int ql = 1;
        int si = -5;
        String n = "abc";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void nameRandomQualityNegativeSIPos() {
        int ql = -1;
        int si = 5;
        String n = "abc";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    } 

    @Test
    void nameRandomQualityNegativeSINeg() {
        int ql = 1;
        int si = -5;
        String n = "abc";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void nameAgedBrieQualityPositiveSIPos() {
        int ql = 1;
        int si = 5;
        String n = "Aged Brie";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void nameAgedBrieQualityPositiveSINeg() {
        int ql = 1;
        int si = -5;
        String n = "Aged Brie";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void nameAgedBrieQualityNegativeSIPos() {
        int ql = -1;
        int si = 5;
        String n = "Aged Brie";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    } 

    @Test
    void nameAgedBrieQualityNegativeSINeg() {
        int ql = -1;
        int si = -5;
        String n = "Aged Brie";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void nameBackstageQualityPositiveSIPos() {
        int ql = 1;
        int si = 5;
        String n = "Backstage passes to a TAFKAL80ETC concert";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void nameBackstageQualityPositiveSINeg() {
        int ql = 1;
        int si = -5;
        String n = "Backstage passes to a TAFKAL80ETC concert";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void nameBackstageQualityNegativeSIPos() {
        int ql = -1;
        int si = 5;
        String n = "Backstage passes to a TAFKAL80ETC concert";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void nameBackstageQualityNegativeSINeg() {
        int ql = -1;
        int si = -5;
        String n = "Backstage passes to a TAFKAL80ETC concert";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void nameSulfurasQualityPositiveSIPos() {
        int ql = 1;
        int si = 5;
        String n = "Sulfuras, Hand of Ragnaros";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void nameSulfurasQualityPositiveSINeg() {
        int ql = 1;
        int si = -5;
        String n = "Sulfuras, Hand of Ragnaros";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void nameSulfurasQualityNegativeSIPos() {
        int ql = -1;
        int si = 5;
        String n = "Sulfuras, Hand of Ragnaros";
        Item[] items = new Item[] { new Item(n, si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is(n));
    }

    @Test
    void nameSulfurasQualityNegativeSINeg() {
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
    void siPositiveNamerandomQualityPos() {
        int ql = 1;
        int si = 5;
        Item[] items = new Item[] { new Item("abc", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void siNegativeNamerandomQualityPos() {
        int ql = 1;
        int si = -5;
        Item[] items = new Item[] { new Item("abc", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(0));
    }

    @Test
    void siPositiveNamerandomQualityNeg() {
        int ql = -1;
        int si = 5;
        Item[] items = new Item[] { new Item("abc", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void siNegativeNamerandomQualityNeg() {
        int ql = 1;
        int si = -5;
        Item[] items = new Item[] { new Item("abc", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(0));
    }

    @Test
    void siPositiveNameAgedBrieQualityPos() {
        int ql = 1;
        int si = 5;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void siNegativeNameAgedBrieQualityPos() {
        int ql = 1;
        int si = -5;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(0));
    }

    @Test
    void siPositiveNameAgedBrieQualityNeg() {
        int ql = -1;
        int si = 5;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void siNegativeNameAgedBrieQualityNeg() {
        int ql = -1;
        int si = -5;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(0));
    }

    @Test
    void siPositiveNameBackstageQualityPos() {
        int ql = 1;
        int si = 5;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    }

    @Test
    void siNegativeNameBackstageQualityPos() {
        int ql = 1;
        int si = -5;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert ", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(0));
    }

    @Test
    void siPositiveNameBackstageQualityNeg() {
        int ql = -1;
        int si = 5;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si-1));
    } 

    @Test
    void siNegativeNameBackstageQualityNeg() {
        int ql = -1;
        int si = -5;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(0));
    }

    @Test
    void siPositiveNameSulfurasQualityPos() {
        int ql = 1;
        int si = 5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si));
    }

    @Test
    void siNegativeNameSulfurasQualityPos() {
        int ql = 1;
        int si = -5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si));
    }

    @Test
    void siPositiveNameSulfurasQualityNeg() {
        int ql = -1;
        int si = 5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si));
    }

    @Test
    void siNegativeNameSulfurasQualityNeg() {
        int ql = -1;
        int si = -5;
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(si));
    }


//Test sur la limitation de la qualité : toujours inférieure à 50
// Backstage passes to a TAFKAL80ETC concert
    @Test
    void qualityPositive2Lim50NameBackstageSIPos()
    {
        int ql = 49;
        int si = 10;
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }

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
    {
        int ql = 49;
        int si = 10;
        Item[] items = new Item[] { new Item("Aged Brie", si, ql) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(50));
    }


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
        assertThat(app.items[0].quality, is(ql/2));
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
        assertThat(app.items[0].quality, is(ql/2));
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