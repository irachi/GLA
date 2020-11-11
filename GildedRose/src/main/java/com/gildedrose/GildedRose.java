package com.gildedrose;
import java.util.Locale;
/**
 * @author ALI Irachi REMY Romain
 * @version 1.0
 */

class GildedRose {
  static int MINQUALITY;
  static int MAXQUALITY = 50;
  static String sulfuras = "Sulfuras, Hand of Ragnaros";
  static int tenDaysOrBelow = 10;
  Item[] items;
  GildedRose(Item[] items) {
    this.items = items;
  }

  /**
   * @param i
   */
  public void qualityControlRange(int i) {
    if (items[i].quality < MINQUALITY) {
      items[i].quality = MINQUALITY;
    }
    if (!items[i].name.equals(sulfuras)) {
      if (items[i].quality > MAXQUALITY) {
        items[i].quality = MAXQUALITY;
      }
    }
  }
  /**
   * @param i
   */
  public void sellInControl(int i) {
    if (items[i].sellIn < 0) {
      items[i].sellIn = 0;
    }
  }

  /**
   * @param i
   */
  public void updateSellInofObject(int i) {
    if (!items[i].name.equals(sulfuras)) {
      items[i].sellIn = (items[i].sellIn) - 1;
      sellInControl(i);
    }
  }
  /**
   * @param i
   */

  public void downQuality(int i) {
    if(!items[i].name.equals(sulfuras)){
      if(items[i].sellIn > 0){
        items[i].quality = (items[i].quality) - 1;
      } else {
        items[i].quality = (items[i].quality) - 2;
      }
    }
  }
  /**
   * @param i
   */
  public void upQuality(int i) {
    if (items[i].sellIn > 0) {
      items[i].quality = (items[i].quality) + 1;
    }
  }
  /**
   * @param i
   */
  public void qualityofBACKObject(int i) {
    if (items[i].sellIn > tenDaysOrBelow) {
      items[i].quality = (items[i].quality) + 1;
    }
    if (items[i].sellIn >= 6 && items[i].sellIn <= tenDaysOrBelow) {
      items[i].quality = (items[i].quality) + 2;
    }
    if (items[i].sellIn >= 1 && items[i].sellIn <= 5) {
      items[i].quality = (items[i].quality) + 3;
    }
    if (items[i].sellIn <= 0) {
      items[i].quality = 0;
    }
  }
  /**
   * @param i
   */
  void qualityOfConjuredObject(int i) {
    downQuality(i);
    downQuality(i);
  }

  /**
   * @param i
   */
  void qualityOfAgedBrieObject(int i) {
    if (items[i].sellIn > 0) {
      upQuality(i);
    } else {
      downQuality(i);
    }
  }

  public void updateQuality() {
    for (int i = 0; i < items.length; i++) {
      switch (items[i].name) {
        case "Aged Brie":
          qualityOfAgedBrieObject(i);
          break;
        case "Backstage passes to a TAFKAL80ETC concert":
          qualityofBACKObject(i);
          break;
        case "Sulfuras, Hand of Ragnaros":
          break;
        default:
            if (items[i].name.toLowerCase(Locale.FRANCE).contains("conjured")) {
              qualityOfConjuredObject(i);
            } else {
              downQuality(i);
            break;
          }
      }
      updateSellInofObject(i);
      qualityControlRange(i);
    }
  }
}
