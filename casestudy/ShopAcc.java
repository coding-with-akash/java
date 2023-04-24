package casestudy;

public abstract class ShopAcc {
	private final int accNo;
	private String accNm;
	private final float charges;

	/*
	 * public ShopAcc() { this.charges = 0; System.out.println("default"); }
	 */
	public ShopAcc(int accNo, String accNm, float charges) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;

	}

	public int getAccNo() {
		return accNo;
	}

	/*
	 * public void setAccNo(int accNo) { this.accNo = accNo; }
	 */
	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getCharges() {
		return charges;
	}
//	public void setCharges(float charges) {
//		this.charges = charges;
//	}

	public abstract void bookProduct(float book);

//	public abstract void items(float item);

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}

}
