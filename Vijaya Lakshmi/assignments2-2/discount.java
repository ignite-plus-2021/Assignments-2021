import java .util.*;


public class discount {
    
    public static void main(String[] args)
    {

        int cp=50;
        int discounpercentage=12;
        double discount=cp*(discounpercentage)/100;
        double sp=cp-discount;
        System.out.println("selling price= "+sp);
        System.out.println("discount= "+discount);

}
}
