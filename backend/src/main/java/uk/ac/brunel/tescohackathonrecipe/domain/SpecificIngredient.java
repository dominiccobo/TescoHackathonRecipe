package uk.ac.brunel.tescohackathonrecipe.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.List;

/**
 * Model adhering to tesco's product retrieval.
 */
@Getter
@Setter
@NoArgsConstructor
public class SpecificIngredient {

    private String image;
    private String tpnb;
    private String PromotionDescription;
    private String ContentsMeasureType;
    private String name;
    private String UnitOfSale;
    private String AverageSellingUnitWeight;
    private List<String> description;
    private String UnitQuantity;
    private String id;
    private String ContentsQuantity;
    private String price;
    private String unitprice;
    private String IsSpecialOffer;

    public SpecificIngredient(String image, String tpnb, String promotionDescription, String contentsMeasureType,
                              String name, String unitOfSale, String averageSellingUnitWeight, List<String> description,
                              String unitQuantity, String id, String contentsQuantity, String price, String unitprice,
                              String isSpecialOffer) {
        this.image = image;
        this.tpnb = tpnb;
        this.PromotionDescription = promotionDescription;
        this.ContentsMeasureType = contentsMeasureType;
        this.name = name;
        this.UnitOfSale = unitOfSale;
        this.AverageSellingUnitWeight = averageSellingUnitWeight;
        this.description = description;
        this.UnitQuantity = unitQuantity;
        this.id = id;
        this.ContentsQuantity = contentsQuantity;
        this.price = price;
        this.unitprice = unitprice;
        this.IsSpecialOffer = isSpecialOffer;
    }
}
