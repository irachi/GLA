package com.gildedrose;
import java.util.Locale;
/**
 * @author ALI Irachi REMY Romain
 * @version 1.0
 */

class GildedRose {
<<<<<<< HEAD
  static int MINQUALITY;
  static int MAXQUALITY = 50;
  static String sulfuras = "Sulfuras, Hand of Ragnaros";
=======
  static final int MINQUALITY = 0;
  static final int MAXQUALITY = 50;
  static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
>>>>>>> hacherixe
  static int tenDaysOrBelow = 10;
  Item[] items;
  GildedRose(Item[] items) {
    this.items = items;
  }
<<<<<<< HEAD
  /**
   * @param i
   */
  void qualityofConjuredObject(int i) {
    if (items[i].quality > 0) {
      items[i].quality = (items[i].quality) / 2;
    } else {
      items[i].quality = 0;
    }
  }
  /**
   * @param i
   */
  public void qualityControl(int i) {
    if (items[i].quality < MINQUALITY) {
      items[i].quality = MINQUALITY;
    }
    if (!items[i].name.equals(sulfuras)) {
=======

  /**
   * @param i
   */
  public void qualityControlRange(int i) {
    if (items[i].quality < MINQUALITY) {
      items[i].quality = MINQUALITY;
    }
    if (!items[i].name.equals(SULFURAS)) {
>>>>>>> hacherixe
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
<<<<<<< HEAD
      downQuality(i);
    }
  }
  /**
   * @param i
   */
  public void downQuality(int i) {
    items[i].quality = (items[i].quality) / 2;
  }
=======
    }
  }

>>>>>>> hacherixe
  /**
   * @param i
   */
  public void updateSellInofObject(int i) {
<<<<<<< HEAD
    if (!items[i].name.equals(sulfuras)) {
=======
    if (!items[i].name.equals(SULFURAS)) {
>>>>>>> hacherixe
      items[i].sellIn = (items[i].sellIn) - 1;
      sellInControl(i);
    }
  }
  /**
   * @param i
   */

<<<<<<< HEAD
  public void upQualityofRandomObject(int i) {
    if (!items[i].name.equals(sulfuras)) {
      if (items[i].quality > 0) {
        items[i].quality = (items[i].quality) - 1;
      }
=======
  public void downQuality(int i) {
    if (items[i].sellIn > 0) {
      items[i].quality = (items[i].quality) - 1;
    } else {
      items[i].quality = (items[i].quality) - 2;
>>>>>>> hacherixe
    }
  }
  /**
   * @param i
   */
<<<<<<< HEAD
  public void upQualityofAgedBrieObject(int i) {
    if (items[i].sellIn > 0) {
      items[i].quality = (items[i].quality) + 1;
    }
=======
  public void upQuality(int i) {
    items[i].quality = (items[i].quality) + 1;
>>>>>>> hacherixe
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
<<<<<<< HEAD
=======
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
>>>>>>> hacherixe

  public void updateQuality() {
    for (int i = 0; i < items.length; i++) {
      switch (items[i].name) {
        case "Aged Brie":
<<<<<<< HEAD
          upQualityofAgedBrieObject(i);
=======
          qualityOfAgedBrieObject(i);
>>>>>>> hacherixe
          break;
        case "Backstage passes to a TAFKAL80ETC concert":
          qualityofBACKObject(i);
          break;
<<<<<<< HEAD
        default:
          if (items[i].sellIn > 0) {
            if (items[i].name.toLowerCase(Locale.FRANCE).contains("conjured")) {
              qualityofConjuredObject(i);
            } else {
              upQualityofRandomObject(i);
            }
=======
        case SULFURAS:
          break;
        default:
          if (items[i].name.toLowerCase(Locale.FRANCE).contains("conjured")) {
            qualityOfConjuredObject(i);
          } else {
            downQuality(i);
>>>>>>> hacherixe
            break;
          }
      }
      updateSellInofObject(i);
<<<<<<< HEAD
      qualityControl(i);
    }
  }
}
=======
      qualityControlRange(i);
    }
  }
}
>>>>>>> hacherixe
