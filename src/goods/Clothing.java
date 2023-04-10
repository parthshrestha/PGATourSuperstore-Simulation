package goods;

import enums.Enums;

import java.util.ArrayList;
import java.util.Random;

public class Clothing extends Item{
    String[] clothingBrands={"Chubbies","Nike","Puma"};
    protected String size;
    ArrayList<String>[] clothingModels = new ArrayList[clothingBrands.length];
    String[] sizes = {"S","M","L","XL","XXL"};
    public Clothing()
    {
        super();
        generateModels();
        Random rand = new Random();
        int choiceBrand = rand.nextInt(clothingBrands.length);
        int choiceModels = rand.nextInt(clothingModels[choiceBrand].size());
        brand = clothingBrands[choiceBrand];
        model = clothingModels[choiceBrand].get(choiceModels);
        type = Enums.Goods.Clothing;
        size = sizes[rand.nextInt(sizes.length)];
        generatePrice();
        price = initialPrice;
    }
    public Clothing(String _size)
    {
        super();
        generateModels();
        Random rand = new Random();
        int choiceBrand = rand.nextInt(clothingBrands.length);
        int choiceModels = rand.nextInt(clothingModels[choiceBrand].size());
        brand = clothingBrands[choiceBrand];
        model = clothingModels[choiceBrand].get(choiceModels);
        type = Enums.Goods.Clothing;
        size = _size;
        generatePrice();
        price = initialPrice;
    }

    @Override
    public void generatePrice() {
        initialPrice = ((Math.random() * (100.0 - 20.0)) + 20.0);
    }

    @Override
    public void generateModels() {
        clothingModels[0].add("Polo");

        //Nike
        clothingModels[1].add("Polo");
        clothingModels[2].add("Polo");

    }
}
