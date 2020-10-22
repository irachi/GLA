package com.gildedrose;
import java.util.Locale;
/**
 * @author ALI Irachi REMY Romain
 * @version 1.0
 */
class GildedRose 
{
    Item[] items;
    
    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) //Si le nom est différent des 2
            {
                if (items[i].quality > 0) // si la quality est positive
                {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) // Si le nom est différént de celui la
                    {
                        items[i].quality = items[i].quality - 1; //décrémenter la quantité et fin
                    }
                }
            } 
            else { //Sinon
                if (items[i].quality < 50) //Si la quantité est inférieur à 50
                {
                    items[i].quality = items[i].quality + 1; // on incrémente la qualité

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) // Si le nom est égal
                    {
                        if (items[i].sellIn < 11) // si la quantité vendu est inférieur à 11
                        {
                            if (items[i].quality < 50) // si la qualité est inférieur à 50
                            {
                                items[i].quality = items[i].quality + 1; // on incrémente on incrémente la qualité
                            }
                        }

                        if (items[i].sellIn < 6) // si la quantité est inférieur à 6
                        {
                            if (items[i].quality < 50) // si la qualité est égal à 50
                            {
                                items[i].quality = items[i].quality + 1; // on incrémente la qualité
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) 
            {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) 
            {
                if (!items[i].name.equals("Aged Brie")) 
                {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) 
                    {
                        if (items[i].quality > 0) 
                        {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) 
                            {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } 
                    else 
                    {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } 
                else 
                {
                    if (items[i].quality < 50) 
                    {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
}