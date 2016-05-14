package com.wisdom.shoppingcar.business;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.wisdom.shoppingcar.function.business.Shopping;
import com.wisdom.shoppingcar.function.model.Coupon;
import com.wisdom.shoppingcar.function.model.Goods;

public class ShoppingTest 
{
	@Test
    public void shouldReturnRightAmountWhenCaseA()
    {	
    	double expectedAmount = 3083.60;
    	
    	Goods goods = new Goods();
    	 
    	int goodsNum = 1;
    	
    	Map<Goods, Integer> orderMap = new HashMap<Goods, Integer>();
    	orderMap.put(goods, goodsNum);
    	
    	Coupon coupon = new Coupon(); 
    	
    	Shopping shopping = new Shopping();
    	double amount = shopping.account(orderMap, coupon);
    	
    	Assert.assertTrue(expectedAmount == amount);
    }
}
