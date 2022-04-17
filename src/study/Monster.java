// Slime.java

package study;

import javax.swing.JOptionPane;

public class Monster {

	String name;
	int hp = 80;

	// ������
	public Monster(String n) {

		name = n;

	}

	// ����
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
				Study01.lbl2.setText(name + "�� ����. " + h.name + "�� ü���� " + h.hp + ".");
			}else {
				Study01.lbl2.setText(name + "�� ���� ����. " + h.name + "�� ü���� " + h.hp + ".");
			}
			
		}

	}

}

class History extends Monster {

	// ������
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

	// ������
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

	// ������
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

	// ������
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

	// ������
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

	// ������
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

	// ������
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

	// ������
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

	// ������
	Nature(String n) {
		super(n);
	}

	@Override
	public void attack(Human h) {

		int num = (int)(Math.random()*6) +1;
		attack(h, num);

	}

}