package clas;

public class Gamer extends Character {

	private String[] game_title;
	private int having_money;


	public Gamer(String name,int age,char blood_type){
		super(name,age,blood_type);
	}

	public void set_game_title(String ... titles) {

//		配列確保
		this.game_title = new String[titles.length];

//		for(int j = 0;j < titles.length;j++) {
//			this.game_title[j] = titles[j];
//		}

		System.out.println(get_game_title()[0]);

		System.out.println(titles[0].getClass());

	}

	public void set_having_money(int money) {
		this.having_money = money;
	}

	public String[] get_game_title() {
		return this.game_title;
	}

	public int get_having_money() {
		return this.having_money;
	}

}
