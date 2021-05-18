package FRQs.shipingitem;
/** Programmer : Alankrit Verma
 * Date created : Tue May 18 2021
 * File name : InsuredShippingItem.java
 * Purpose : 
 * Comments :  
 */


/**
 * InsuredShippingItem
 */
public class InsuredShippingItem extends ShippingItem{
    private double insuredAmt;
    
    public InsuredShippingItem(double w , double iamt){
        super(w);
        insuredAmt = iamt;
    }
    public double getCost(){
        double cost = super.getCost() + insuredAmt;
        return cost;
    }
} 