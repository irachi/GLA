
package com.gildedrose;
import java.util.Locale;

class GildedRose {
  static int MINQUALITY;
  static int MAXQUALITY = 50;
  String sulfuras = "Sulfuras, Hand of Ragnaros" ;
  Item[] items;
  GildedRose(Item[] items) {
    this.items = items;
  }

  void qualityofConjuredObject(int i) {
    if (items[i].quality > 0) {
      items[i].quality = (items[i].quality) / 2;
    } else {
      items[i].quality = 0;
    }
  }

  public void qualityControl(int i) {
    if (items[i].quality < MINQUALITY) {
      items[i].quality = MINQUALITY;
    }
    if (!items[i].name.equals(sulfuras)) {
      if (items[i].quality > MAXQUALITY) {
        items[i].quality = MAXQUALITY;
      }
    }
  }

  public void sellInControl(int i) {
    if (items[i].sellIn < 0) {
      items[i].sellIn = 0;
      downQuality(i);
    }
  }

  public void downQuality(int i){
    items[i].quality = (items[i].quality) / 2;
  }

  public void updateSellInofObject(int i) {
    if (!items[i].name.equals(sulfuras)) {
      items[i].sellIn = (items[i].sellIn) - 1;
      sellInControl(i);
    }
  }

  public void upQualityofRandomObject(int i) {
    if (!items[i].name.equals(sulfuras)) {  
      if (items[i].quality > 0) {
        items[i].quality = (items[i].quality) - 1;
      }
    }
  }

  public void upQualityofAgedBrieObject(int i) {
    if(items[i].sellIn > 0) {
      items[i].quality = (items[i].quality) + 1;
    }
  }

  public void qualityofBACKObject(int i) {
      if (items[i].sellIn > 10) {
        items[i].quality = (items[i].quality) + 1;
      }
      if (items[i].sellIn >= 6 && items[i].sellIn <= 10) {
        items[i].quality = (items[i].quality) + 2;
      }
      if (items[i].sellIn >= 1 && items[i].sellIn <= 5) {
        items[i].quality = (items[i].quality) + 3;
      }
      if (items[i].sellIn <= 0) {
        items[i].quality = 0;
      }
    
  }

  public void updateQuality() {
    for (int i = 0; i < items.length; i++) {
        switch (items[i].name) {
            case "Aged Brie":
            upQualityofAgedBrieObject(i);
            break;
                
            case "Backstage passes to a TAFKAL80ETC concert":
            qualityofBACKObject(i);
            break;

            default:
            if(items[i].sellIn > 0) {
              if (items[i].name.toLowerCase(Locale.FRANCE).contains("conjured")) {
                qualityofConjuredObject(i);    
              } else {
                upQualityofRandomObject(i);
              }
              break;
            }
        }
      updateSellInofObject(i);
      qualityControl(i);
        
    }
  }
}
