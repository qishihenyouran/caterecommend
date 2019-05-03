package edu.njtu.service.impl;

import com.github.pagehelper.PageHelper;
import edu.njtu.httpbody.restaurant.*;
import edu.njtu.mapper.BusinessMapper;
import edu.njtu.mapper.RecommendDefaultMapper;
import edu.njtu.mapper.RecommendUserMapper;
import edu.njtu.mapper.UserMapper;
import edu.njtu.model.*;
import edu.njtu.service.RestaurantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("restaurantService")
public class RestaurantServiceImpl implements RestaurantService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private BusinessMapper businessMapper;

    @Resource
    private RecommendDefaultMapper recommendDefaultMapper;
    @Resource
    private RecommendUserMapper recommendUserMapper;

    @Resource
    private UserMapper userMapper;

    @Override
    public RestaurantListDBody getRestaurantList(RestaurantListABody restaurantListABody) throws Exception {
        RestaurantListDBody restaurantListDBody = new RestaurantListDBody();
        BusinessExample businessExample = new BusinessExample();
        int pageNumber = restaurantListABody.getPageNumber();
        int pageSize = restaurantListABody.getPageSize();

        switch ( null == restaurantListABody.getOptType()? 0:restaurantListABody.getOptType()) {
            case 2://获取默认推荐的  商家列表
                List<Business> businessDefaultRecommendList = getRecommandDefaultRestaurantList(businessExample,restaurantListABody.getPageNumber(),restaurantListABody.getPageSize());
                restaurantListDBody.setBusinessDefaultRecommendList(businessDefaultRecommendList);
                break;
            case 3://获取根据用户推荐的  商家列表
                User user = LoginServiceImpl.getUserById(userMapper,restaurantListABody.getUserId(),null);

                List<Business> businessUserRecommendList = getRecommandUserRestaurantList(businessExample, user.getUserIdInt(),pageNumber,pageSize);
                restaurantListDBody.setBusinessUserRecommendList(businessUserRecommendList);
                break;
            case 4://同时获取原生+用户推荐 商家列表, pageSize和pageNumber只作用于  原生 的商户列表
            case 5://同时获取原生+默认推荐
                //原生
                List<Business> businessesList2 = getRestaurantList(restaurantListABody, businessExample);
                restaurantListDBody.setBusinessList(businessesList2);
                if(4 == restaurantListABody.getOptType()){
                    List<Business> businessDefaultRecommendList2 = getRecommandDefaultRestaurantList(businessExample,1,10);
                    //默认推荐
                    restaurantListDBody.setBusinessDefaultRecommendList(businessDefaultRecommendList2);

                    break;
                }else{
                    User user2 = LoginServiceImpl.getUserById(userMapper,restaurantListABody.getUserId(),null);

                    List<Business> businessUserRecommendList2 = getRecommandUserRestaurantList(businessExample, user2.getUserIdInt(),1,10);
                    restaurantListDBody.setBusinessUserRecommendList(businessUserRecommendList2);
                    break;
                }
            case 1://获取原生的  商户列表
            default:
                List<Business> businessesList = getRestaurantList(restaurantListABody, businessExample);
                restaurantListDBody.setBusinessList(businessesList);
                break;
        }

        //成功
        restaurantListDBody.setCode("10000");
        restaurantListDBody.setMsg("SUCCESS");
        return restaurantListDBody;
    }



    private List<Business> getRestaurantList(RestaurantListABody restaurantListABody, BusinessExample businessExample) {
        PageHelper.startPage(restaurantListABody.getPageNumber(),restaurantListABody.getPageSize(),false);
        return businessMapper.selectByExample(businessExample);
    }

    private List<Business> getRecommandDefaultRestaurantList(BusinessExample businessExample,int pageNumber,int pageSize) {
        List<Business> businessDefaultRecommendList = new ArrayList<Business>();
        List<RecommendDefault> recommendDefaultList = RecommendServiceImpl.getRecommandDefaultRestaurant(recommendDefaultMapper, pageNumber, pageSize);
        for (RecommendDefault recommendDefault : recommendDefaultList) {
            businessExample.clear();
            businessExample.createCriteria().andBusinessIdEqualTo(recommendDefault.getBusinessId());
            Business business = businessMapper.selectByExample(businessExample).get(0);
            businessDefaultRecommendList.add(business);
        }
        return businessDefaultRecommendList;
    }

    private List<Business>  getRecommandUserRestaurantList(BusinessExample businessExample, Long userId,int pageNumber,int pageSize) {
        List<Business> businessUserRecommendList = new ArrayList<Business>();
        List<RecommendUser> recommendUserList = RecommendServiceImpl.getRecommandUserRestaurant(recommendUserMapper, userId, pageNumber, pageSize);
        for (RecommendUser recommendUser : recommendUserList) {
            businessExample.clear();
            logger.info(recommendUser.toString());
            businessExample.createCriteria().andBusinessIdIntEqualTo(recommendUser.getBusinessIdInt());
            Business business = businessMapper.selectByExample(businessExample).get(0);
            businessUserRecommendList.add(business);
        }
        return businessUserRecommendList;
    }


    @Override
    public RestaurantInsertDBody restaurantInsert(RestaurantInsertABody restaurantInsertABody) {
        return null;
    }

    @Override
    public RestaurantUpdateDBody restaurantUpdate(RestaurantUpdateABody restaurantUpdateABody) {
        return null;
    }

    @Override
    public RestaurantDetailDBody restaurantDetail(RestaurantDetailABody restaurantDetailABody) {
        return null;
    }
}
