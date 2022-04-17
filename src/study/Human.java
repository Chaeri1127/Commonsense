package study;

import javax.swing.ImageIcon;

class Human {

	String name;
	int hp = 100;

	public Human(String n) {
		name = n;
	}

	public void attack(Monster s) {

		s.hp = s.hp - 30;

		//버튼 비활성화
		if (s.hp < 1) {
			if (s == Study01.his1) {
				Study01.his.setEnabled(false);
			} else if (s == Study01.lit1) {
				Study01.lit.setEnabled(false);
			} else if (s == Study01.art1) {
				Study01.art.setEnabled(false);
			} else if (s == Study01.sci1) {
				Study01.sci.setEnabled(false);
			} else if (s == Study01.mus1) {
				Study01.mus.setEnabled(false);
			} else if (s == Study01.phi1) {
				Study01.phi.setEnabled(false);
			} else if (s == Study01.rel1) {
				Study01.rel.setEnabled(false);
			} else if (s == Study01.pol1) {
				Study01.pol.setEnabled(false);
			} else if (s == Study01.nat1) {
				Study01.nat.setEnabled(false);
			}
			Study01.lbl.setText(s.name + "은(는) 사망했다");
			Study01.lbl2.setText("");

		} else {
			Study01.lbl.setText(name + "의 공격. " + s.name + "의 체력은 " + s.hp + ".");

		}

	}

}
