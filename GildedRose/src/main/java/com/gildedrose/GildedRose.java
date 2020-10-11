package com.gildedrose;

class GildedRose 
{
    Item[] items;
    
    public GildedRose(Item[] items) {
        this.items = items;
    }

//Element conjuré

    public void qualityofConjuredObject(int i)
    {
        if(items[i].name.toLowerCase().contains("conjured"))
        {
            if(items[i].quality > 0)
            {
                if(items[i].quality % 2 == 0)
                {
                    items[i].quality = (items[i].quality)/2;
                }
                else
                {
                    items[i].quality = ((items[i].quality + 1)/2);
                }
            }
            else
            {
                items[i].quality = 0;
            }
        }
    }

//Controle de la qualité (entre 0 et 50)

public void qualityControl(int i)
{
    if(!items[i].name.equals("Sulfuras, Hand of Ragnaros"))
    {
        if(items[i].quality < 0)
        {
            items[i].quality = 0;
        }
        if(items[i].quality > 50)
        {
            items[i].quality = 50;
        }
    }
}

//sellIn des objets :

public void sellInofObject(int i)
{
    if(!items[i].name.equals("Sulfuras, Hand of Ragnaros"))
    {
        items[i].sellIn = (items[i].sellIn) - 1;
    }
}

//Random object

    public void qualityofRandomObject(int i)
    {
        if(!items[i].name.equals("Aged Brie") && 
           !items[i].name.toLowerCase().contains("conjured") &&
           !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert") &&
           !items[i].name.equals("Sulfuras, Hand of Ragnaros"))
        {
            if(items[i].quality > 0)
            {
                items[i].quality = (items[i].quality) - 1;
            }
        }
    }

//"Aged Brie" object

    public void qualityofAgedBrieObject(int i)
    {
        if(items[i].name.equals("Aged Brie"))
        {
            if(items[i].sellIn > 0)
            {
                items[i].quality = (items[i].quality) + 1;
            }
            else
            {
                items[i].quality = (items[i].quality) + 2;
            }
        }
    }

//"Backstage passes to a TAFKAL80ETC concert" object

public void qualityofBACKObject(int i)
    {
        if(items[i].name.equals("Backstage passes to a TAFKAL80ETC concert"))
        {
            if(items[i].sellIn > 10)
            {
                items[i].quality = (items[i].quality) + 1;
            }
            
            if(items[i].sellIn >= 6 & items[i].sellIn <= 10 )
            {
                items[i].quality = (items[i].quality) + 2;
            }
            
            if(items[i].sellIn >= 1 & items[i].sellIn <= 5 )
            {
                items[i].quality = (items[i].quality) + 3;
            }
            
            if(items[i].sellIn <= 0 )
            {
                items[i].quality = 0;
            }
        }
    }


//"Sulfuras, Hand of Ragnaros" object ne bouge pas en qualité et jours restants

    public void updateQuality() 
    {
        for (int i = 0; i < items.length; i++) 
        { /*
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

            qualityofConjuredObject(i);
            qualityControl(i);*/
            
            qualityofRandomObject(i);
            qualityofAgedBrieObject(i);
            qualityofBACKObject(i);
            qualityofConjuredObject(i);
            sellInofObject(i);
            qualityControl(i);
        }
    }
}