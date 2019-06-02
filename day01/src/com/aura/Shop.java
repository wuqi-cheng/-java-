package com.aura;

public class Shop {
	public static void main(String[] args) {
		String macBrand = "macbook";
		double macSize = 12.8;
		double macPrice = 6800.98;
		int macCount = 5;
		
		String LenoveBrand = "Lenovebook";
		double LenoveSize = 14.6;
		double LenovePrice = 5600.88;
		int LenoveCount = 8;
		
		String AsusBrand = "Asusmacbook";
		double AsusSize = 15.8;
		double AsusPrice = 4800.98;
		int AsusCount = 5;
		
		String ThinkPadBrand = "ThinkPadbook";
		double ThinkPaddSize = 14.8;
		double ThinkPadPrice = 3800.98;
		int ThinkPadCount = 5;
		
		int TotalCount = macCount+LenoveCount+AsusCount+ThinkPadCount;
		double TotalPrice = macCount*macPrice +LenoveCount*LenovePrice+AsusCount*AsusPrice+ThinkPadCount*ThinkPadPrice;
		
		System.out.println("-------------商品库存-------------");
		System.out.println("产品                           规格                价格                   数量");
		System.out.println(macBrand+"    "+macSize+"      "+macPrice+"  "+macCount);
		System.out.println(LenoveBrand+"    "+LenoveSize+"      "+LenovePrice+"  "+LenoveCount);
		System.out.println(AsusBrand+"     "+AsusSize+"      "+AsusPrice+"  "+AsusCount);
		System.out.println(ThinkPadBrand+"     "+ThinkPaddSize+"     "+ThinkPadPrice+"  "+ThinkPadCount);
		System.out.println("--------------------------------");
		System.out.println("库存总数："+TotalCount);
		System.out.println("库存总价值："+TotalPrice);
	}

}
