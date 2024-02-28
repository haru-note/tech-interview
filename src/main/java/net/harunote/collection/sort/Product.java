package net.harunote.collection.sort;

public class Product {

	public Product(String prdId, Integer prdSize) {
		this.prdId = prdId;
		this.prdSize = prdSize;
	}
	
	private String prdId;
	private Integer prdSize;
	
	public String getPrdId() {
		return prdId;
	}
	public void setPrdId(String prdId) {
		this.prdId = prdId;
	}
	public Integer getPrdSize() {
		return prdSize;
	}
	public void setPrdSize(Integer prdSize) {
		this.prdSize = prdSize;
	}	
}