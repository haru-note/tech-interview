package net.harunote.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.collections4.comparators.ComparatorChain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ComplexSort {

	private static final Logger logger = LoggerFactory.getLogger(ComplexSort.class);
	private static List<Product> products = new ArrayList<>();
	
	public static void main(String args[]) {
		prepareData();

		ComparatorChain chain = new ComparatorChain();
		//비교할 대상을 각 Comparator로 작성
		chain.addComparator(comparatorPrdId);	// 상품아이디 정렬 
		chain.addComparator(comparatorPrdSize);	// 상품사이즈 정렬 
		
		Collections.sort(products, chain);
		
		consoleLog();
	}

	/*
	public static Comparator<Product> comparatorPrdId = new Comparator<Product>() {
		@Override
		public int compare(Product o1, Product o2) {
			return o1.getPrdId().compareToIgnoreCase(o2.getPrdId());
		}
	};

	public static Comparator<Product> comparatorPrdSize = new Comparator<Product>() {
		@Override
		public int compare(Product o1, Product o2) {
			return o1.getPrdSize().compareTo(o2.getPrdSize());
		}
	};
	 */

	/**
	 * 상품 아이디를 정렬한다. 
	 */
	public static Comparator<Product> comparatorPrdId = (o1, o2) ->
			o1.getPrdId().compareToIgnoreCase(o2.getPrdId());

	/**
	 * 상품의 사이즈를 정렬한다. 
	 */
	public static Comparator<Product> comparatorPrdSize = Comparator.comparing(Product::getPrdSize);

	/**
	 * 대상 객체의 출력 기능 
	 */
	private static void consoleLog() {
		logger.info("########## 출력 시작 #########");
		for (Product product : products) {
			logger.info("Print : {} = {}", product.getPrdId(), product.getPrdSize());
		}
	}

	/**
	 * 미리 데이터를 생성함 
	 */
	private static void prepareData() {
		products.add(new Product("tshirt", 110));
		products.add(new Product("tshirt", 90));
		products.add(new Product("tshirt", 100));
		products.add(new Product("tshirt", 95));
		products.add(new Product("tshirt", 105));
		
		products.add(new Product("shoes", 270));
		products.add(new Product("shoes", 260));
		products.add(new Product("shoes", 275));
		
		products.add(new Product("clothes", 44));
		products.add(new Product("clothes", 55));
		products.add(new Product("clothes", 66));
	}
}