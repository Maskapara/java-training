package clas;

public class Character {

	//身体的特徴
	private String name;
	private int age;
	private short height;
	private short weight;
	private int[] three_size;
	private char blood_type;

	//性格
//	private String[] taste;
//	private String[] Hate;
//	private String ability;
//	private String work;
//	private String[] catch_copy;

	public Character(String name,int age,char blood_type){
		this.name = name;
		this.age = age;
		this.blood_type = blood_type;
	}

	//setter
	public void set_name(String name) {
		this.name = name;
	}

	public void set_age(int age) {
		this.age = age;
	}

	private void set_height(short height) {
		this.height = height;
	}

	public void set_weight(short weight) {
		this.weight = weight;
	}

	public void set_three_size(int b,int w,int h) {
		this.three_size[0] = b;
		this.three_size[1] = w;
		this.three_size[2] = h;
	}

	public void set_blood_type(char blood_type) {
		this.blood_type = blood_type;
	}

//	getter

	public String get_name() {
		return this.name;
	}

	public int get_age() {
		return this.age;
	}

	public short get_height() {
		return this.height;
	}

	public short get_weight() {
		return this.weight;
	}


}
