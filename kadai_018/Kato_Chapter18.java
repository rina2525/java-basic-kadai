package kadai_018;

public abstract class Kato_Chapter18 {
	String familyName ="加藤"; //姓を表す
	String givenName; //名を表す
	String address = "住所は東京都中野区〇×です"; //住所を表す
	
	
	
	//共通紹介を出力する
	public void commonIntroduce() {
		System.out.println("名前は"+familyName + givenName+"です");
		System.out.println(address);
		
		
	}
	
	//個別の紹介を出力する
	abstract public void eachIntroduce();
		
	
	public void execIntroduce() {
	commonIntroduce();
	eachIntroduce();
	}
	
}
