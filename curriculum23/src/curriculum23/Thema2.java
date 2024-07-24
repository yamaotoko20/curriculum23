package curriculum23;

public class Thema2 {

	// TODO 自動生成されたメソッド・スタブ
			/*
		 	
		 	下記がコンソールに出力されるように作成してください
		 	※thisとsetterとgetterとフィールドを使ってください
		 	
		  	動物名：ライオン
			体長：2.1m
			速度：80km/h
		 	
		 */
	private String animalName;
	private Double bodyLength; // Double型を使用してnullを許容
	private Integer speed; // Integer型を使用してnullを許容
	
	
	
	public String getAnimalName() {	//：動物の名前を取得するためのゲッターメソッド
        return animalName;
    }

    public void setAnimalName(String animalName) { //動物の名前を設定するためのセッターメソッド
        this.animalName = animalName;
    }

    public Double getBodyLength() {	//体長を取得するためのゲッターメソッド
        return bodyLength;
    }

    public void setBodyLength(Double bodyLength) { //体長を設定するためのセッターメソッド
        this.bodyLength = bodyLength;
    }

    public Integer getSpeed() { //速度を取得するためのゲッターメソッド
        return speed;
    }

    public void setSpeed(Integer speed) { //速度を設定するためのセッターメソッド
        this.speed = speed; 
    }

    
	
	public static void main(String[] args) {
		Thema2 lion = new Thema2();
        lion.setAnimalName("ライオン");
        lion.setBodyLength(2.1);
        lion.setSpeed(80);

        if (lion.getAnimalName() != null && lion.getBodyLength() != null && lion.getSpeed() != null) {
            System.out.println("動物名：" + lion.getAnimalName());
            System.out.println("体長：" + lion.getBodyLength() + "m");
            System.out.println("速度：" + lion.getSpeed() + "km/h");
        } else {
            System.out.println("動物情報にnullが含まれています。処理を続行できません。");
        }
    }
		
}
