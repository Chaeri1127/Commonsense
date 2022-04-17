// Slime.java

package study;

import javax.swing.JOptionPane;

public class Monster {

	String name;
	int hp = 80;

	// 생성자
	public Monster(String n) {

		name = n;

	}

	// 공격
	public void attack(Human h) {
		attack(h, 10);
	}

	public void attack(Human h, int damage) {

		if (hp > 0) {

			h.hp = h.hp - damage;

			if (h.hp < 1) {
				JOptionPane.showMessageDialog(null, "Game Over");
				System.exit(0);
			}
			
			if(damage < 30) {
				Study01.lbl2.setText(name + "의 공격. " + h.name + "의 체력은 " + h.hp + ".");
			}else {
				Study01.lbl2.setText(name + "의 강한 공격. " + h.name + "의 체력은 " + h.hp + ".");
			}
			
		}

	}

}

class History extends Monster {

	// 생성자
	History(String n) {
		super(n);
	}

	@Override
	public void attack(Human h) {

		int num = (int)(Math.random()*6) +1;
		attack(h, num);

	}


}

class Literature extends Monster {

	// 생성자
	Literature(String n) {
		super(n);
	}
	
	@Override
	public void attack(Human h) {

		int num = (int)(Math.random()*6) +1;
		attack(h, num);
		

	}

}

class Art extends Monster {

	// 생성자
	Art(String n) {
		super(n);
	}

	@Override
	public void attack(Human h) {

		int num = (int)(Math.random()*6) +1;
		attack(h, num);

	}

}

class Science extends Monster {

	// 생성자
	Science(String n) {
		super(n);
	}

	@Override
	public void attack(Human h) {

		int num = (int)(Math.random()*6) +1;
		attack(h, num);

	}

}

class Music extends Monster {

	// 생성자
	Music(String n) {
		super(n);
	}

	@Override
	public void attack(Human h) {

		int num = (int)(Math.random()*6) +1;
		attack(h, num);

	}

}

class Philosophy extends Monster {

	// 생성자
	Philosophy(String n) {
		super(n);
	}

	@Override
	public void attack(Human h) {

		int num = (int)(Math.random()*6) +1;
		attack(h, num);

	}

}

class Religion extends Monster {

	// 생성자
	Religion(String n) {
		super(n);
	}

	@Override
	public void attack(Human h) {

		int num = (int)(Math.random()*6) +1;
		attack(h, num);

	}

}

class Politics extends Monster {

	// 생성자
	Politics(String n) {
		super(n);
	}

	@Override
	public void attack(Human h) {

		int num = (int)(Math.random()*6) +1;
		attack(h, num);

	}

}

class Nature extends Monster {

	// 생성자
	Nature(String n) {
		super(n);
	}

	@Override
	public void attack(Human h) {

		int num = (int)(Math.random()*6) +1;
		attack(h, num);

	}

}