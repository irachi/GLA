package com.gildedrose;
import java.util.Locale;

class GildedRose {
  static int minQuality;
  static int maxQuality = 50;
  Item[] items;
  GildedRose(Item[] items) {
    this.items = items;
  }
//Element conjuré

  void qualityofConjuredObject(int i) {
    if (items[i].quality > 0) {
    items[i].quality = (items[i].quality) / 2;
    } else {
    items[i].quality = 0;
    }
  }

  //Controle de la qualité (entre 0 et 50)

  public void qualityControl(int i) {
    if (items[i].quality < minQuality) {
      items[i].quality = minQuality;
    }
    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
      if (items[i].quality > maxQuality) {
        items[i].quality = maxQuality;
      }
    }
  }

  public void sellInControl(int i) {
    if (items[i].sellIn < 0) {
      items[i].sellIn = 0;
      items[i].quality = (items[i].quality) / 2;
    }
  }
  //sellIn des objets :

  public void sellInofObject(int i) {
    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
      items[i].sellIn = (items[i].sellIn) - 1;
      sellInControl(i);
    }
  }

  //Random object

  public void qualityofRandomObject(int i) {
    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {  
      if (items[i].quality > 0) {
        items[i].quality = (items[i].quality) - 1;
      }
    }
  }

  //"Aged Brie" object

  public void qualityofAgedBrieObject(int i) {
    if(items[i].sellIn > 0) {
      items[i].quality = (items[i].quality) + 1;
    }
  }

  //"Backstage passes to a TAFKAL80ETC concert" object

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
  //"Sulfuras, Hand of Ragnaros" object ne bouge pas en qualité et jours restants

  public void updateQuality() {
    for (int i = 0; i < items.length; i++) {
        switch (items[i].name) {
            case "Aged Brie":
            qualityofAgedBrieObject(i);
            break;
                
            case "Backstage passes to a TAFKAL80ETC concert":
            qualityofBACKObject(i);
            break;

            default:
            if(items[i].sellIn > 0) {
              if (items[i].name.toLowerCase(Locale.FRANCE).contains("conjured")) {
                qualityofConjuredObject(i);    
              } else {
                qualityofRandomObject(i);
              }
              break;
            }
        }
      sellInofObject(i);
      qualityControl(i);
        
    }
  }
}
