package com.nashtech.functions.util;

public class CarUtil {

    /**
     * Converts the given mileage value from miles to kilometers per mile.
     *
     * @param mileage the mileage value in miles
     * @return the updated mileage value in kilometers per mile
     */
    public static Double updateMileage(final Double mileage) {
        Double mileageInKmps=mileage*1.6093440006147;
        return mileageInKmps;
    }

    /**
     * Converts the given price value to rupees.
     *
     * @param price the price value
     * @return the updated price value in rupees
     */
    public static Double updatePrice(final Double price) {
        Double priceInRupees=price*82.10;
        return priceInRupees;
    }
}