package edu.njtu.service;

import edu.njtu.httpbody.restaurant.*;

public interface RestaurantService {

    RestaurantListDBody getRestaurantList(RestaurantListABody restaurantListABody) throws Exception;

    RestaurantInsertDBody restaurantInsert(RestaurantInsertABody restaurantInsertABody);

    RestaurantUpdateDBody restaurantUpdate(RestaurantUpdateABody restaurantUpdateABody);

    RestaurantDetailDBody restaurantDetail(RestaurantDetailABody restaurantDetailABody);
}
