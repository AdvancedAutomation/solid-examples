package com.jalasoft.yesica.movies.rentalDetails;

import com.jalasoft.yesica.movies.MovieCategory;

import java.util.HashMap;
import java.util.Map;

public class RentalDetailsFactory {

    public static RentalDetails getRentalDetails(final MovieCategory movieCategory, final int rentedDays) {
        Map<MovieCategory, RentalDetails> rentalCalculationsMap = new HashMap<>();
        rentalCalculationsMap.put(MovieCategory.CHILDREN, new ChildrenRentalDetails(rentedDays));
        rentalCalculationsMap.put(MovieCategory.NEW_RELEASE, new NewReleaseRentalDetails(rentedDays));
        rentalCalculationsMap.put(MovieCategory.REGULAR, new RegularRentalDetails(rentedDays));

        return rentalCalculationsMap.get(movieCategory);
    }
}
