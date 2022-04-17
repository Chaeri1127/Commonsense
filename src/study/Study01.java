package study;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Study01 {

	// ���� ����
	static JLabel lbl, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, imgLbl, imgLbl2, imgLbl3, imgLbl4, imgLbl5, imgLbl6, imgLbl7, imgLbl8, imgLbl9;
	static ImageIcon bsImg, rsImg;
	static JButton his, lit, art, sci, mus, phi, rel, pol, nat, ans1, ans2;
	static int que, result; //que: ����(����) result: ����(O=1/X=0)

	// ���̶� �ΰ� ��ü
	static History his1 = new History("����");
	static Literature lit1 = new Literature("����");
	static Art art1 = new Art("�̼�");
	static Science sci1 = new Science("����");
	static Music mus1 = new Music("����");
	static Philosophy phi1 = new Philosophy("�̼�");
	static Religion rel1 = new Religion("����");
	static Politics pol1 = new Politics("��ġ");
	static Nature nat1 = new Nature("�ڿ�");
	static Human h = new Human("me");

	public static void main(String[] args) {

		// ������ �ڵ�

		// �۲� ����
		Enumeration<Object> keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof FontUIResource)
				UIManager.put(key, new FontUIResource("����", Font.PLAIN, 14));
		}

		// [start] ������ ����
		JFrame frm = new JFrame();
		frm.setTitle("���� ��ġ�ϱ�");
		frm.setSize(1400, 600);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.getContentPane().setLayout(null);
		// [end] ������ ����

		// [start] ��ư ����
		his = new JButton(his1.name);
		lit = new JButton(lit1.name);
		art = new JButton(art1.name);
		sci = new JButton(sci1.name);
		mus = new JButton(mus1.name);
		phi = new JButton(phi1.name);
		rel = new JButton(rel1.name);
		pol = new JButton(pol1.name);
		nat = new JButton(nat1.name);
		
		his.setBounds(30, 170, 120, 30);
		lit.setBounds(180, 170, 120, 30);
		art.setBounds(330, 170, 120, 30);
		sci.setBounds(480, 170, 120, 30);
		mus.setBounds(630, 170, 120, 30);
		phi.setBounds(780, 170, 120, 30);
		rel.setBounds(930, 170, 120, 30);
		pol.setBounds(1080, 170, 120, 30);
		nat.setBounds(1230, 170, 120, 30);
		
		frm.getContentPane().add(his);
		frm.getContentPane().add(lit);
		frm.getContentPane().add(art);
		frm.getContentPane().add(sci);
		frm.getContentPane().add(mus);
		frm.getContentPane().add(phi);
		frm.getContentPane().add(rel);
		frm.getContentPane().add(pol);
		frm.getContentPane().add(nat);
		// [end] ��ư ����

		// �� ����(���� ���� ǥ��)
		lbl = new JLabel();
		lbl.setBounds(565, 210, 274, 50);
		lbl.setText("���͸� ����ּ���.");
		lbl.setHorizontalAlignment(JLabel.CENTER); // ���� ��� ����
		frm.getContentPane().add(lbl);

		// ��2 ����(���� ���� ǥ��2)
		lbl2 = new JLabel();
		lbl2.setBounds(565, 240, 274, 50);
		lbl2.setText(h.name + "�� ü���� " + h.hp + "�Դϴ�");
		lbl2.setHorizontalAlignment(JLabel.CENTER); // ���� ��� ����
		frm.getContentPane().add(lbl2);
		
		// ��345 ����(����)
		lbl3 = new JLabel();
		lbl3.setBounds(10, 300, 1400, 50);
		lbl3.setText(" ");
		lbl3.setHorizontalAlignment(JLabel.CENTER); // ���� ��� ����
		frm.getContentPane().add(lbl3);
		lbl4 = new JLabel();
		lbl4.setBounds(10, 320, 1400, 50);
		lbl4.setText(" ");
		lbl4.setHorizontalAlignment(JLabel.CENTER); // ���� ��� ����
		frm.getContentPane().add(lbl4);
		lbl5 = new JLabel();
		lbl5.setBounds(10, 340, 1400, 50);
		lbl5.setText(" ");
		lbl5.setHorizontalAlignment(JLabel.CENTER); // ���� ��� ����
		frm.getContentPane().add(lbl5);
		
		// ��67����(����)
		lbl6 = new JLabel();
		lbl6.setBounds(10, 380, 1400, 50);
		lbl6.setText(" ");
		lbl6.setHorizontalAlignment(JLabel.CENTER); // ���� ��� ����
		frm.getContentPane().add(lbl6);
		lbl7 = new JLabel();
		lbl7.setBounds(10, 400, 1400, 50);
		lbl7.setText(" ");
		lbl7.setHorizontalAlignment(JLabel.CENTER); // ���� ��� ����
		frm.getContentPane().add(lbl7);
		
		// ��8���� (������)
		lbl8 = new JLabel();
		lbl8.setBounds(10, 280, 1400, 50);
		lbl8.setText("------����------");
		lbl8.setHorizontalAlignment(JLabel.CENTER); // ���� ��� ����
		frm.getContentPane().add(lbl8);

		// [start] �̹��� �� ����(����)
		imgLbl = new JLabel();
		bsImg = new ImageIcon(Study01.class.getResource("/study/img/his.png"));
		imgLbl.setIcon(bsImg);
		imgLbl.setBounds(30, 30, 120, 130);
		imgLbl.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl);
		// [end]

		// [start] �̹��� ��2 ����(����)
		imgLbl2 = new JLabel();
		rsImg = new ImageIcon(Study01.class.getResource("/study/img/lit.png"));
		imgLbl2.setIcon(rsImg);
		imgLbl2.setBounds(180, 30, 120, 130);
		imgLbl2.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl2);
		// [end]
		
		// [start] �̹��� ��3 ����(�̼�)
		imgLbl3 = new JLabel();
		rsImg = new ImageIcon(Study01.class.getResource("/study/img/art.png"));
		imgLbl3.setIcon(rsImg);
		imgLbl3.setBounds(330, 30, 120, 130);
		imgLbl3.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl3);
		// [end]
		
		// [start] �̹��� ��4 ����(����)
		imgLbl4 = new JLabel();
		rsImg = new ImageIcon(Study01.class.getResource("/study/img/sci.png"));
		imgLbl4.setIcon(rsImg);
		imgLbl4.setBounds(480, 30, 120, 130);
		imgLbl4.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl4);
		// [end]
		
		// [start] �̹��� ��5 ����(����)
		imgLbl5 = new JLabel();
		rsImg = new ImageIcon(Study01.class.getResource("/study/img/mus.png"));
		imgLbl5.setIcon(rsImg);
		imgLbl5.setBounds(630, 30, 120, 130);
		imgLbl5.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl5);
		// [end]
		
		// [start] �̹��� ��6 ����(ö��)
		imgLbl6 = new JLabel();
		rsImg = new ImageIcon(Study01.class.getResource("/study/img/phi.png"));
		imgLbl6.setIcon(rsImg);
		imgLbl6.setBounds(770, 30, 120, 130);
		imgLbl6.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl6);
		// [end]
		
		// [start] �̹��� ��7 ����(����)
		imgLbl7 = new JLabel();
		rsImg = new ImageIcon(Study01.class.getResource("/study/img/rel.png"));
		imgLbl7.setIcon(rsImg);
		imgLbl7.setBounds(930, 30, 120, 130);
		imgLbl7.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl7);
		// [end]
		
		// [start] �̹��� ��8 ����(��ġ)
		imgLbl8 = new JLabel();
		rsImg = new ImageIcon(Study01.class.getResource("/study/img/pol.png"));
		imgLbl8.setIcon(rsImg);
		imgLbl8.setBounds(1080, 30, 120, 130);
		imgLbl8.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl8);
		// [end]
		
		// [start] �̹��� ��9 ����(�ڿ�)
		imgLbl9 = new JLabel();
		rsImg = new ImageIcon(Study01.class.getResource("/study/img/nat.png"));
		imgLbl9.setIcon(rsImg);
		imgLbl9.setBounds(1230, 30, 120, 130);
		imgLbl9.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl9);
		// [end]
		
		//***�����ư ����****
		JButton ans1 = new JButton("O");
		JButton ans2 = new JButton("X");
		ans1.setBounds(450, 480, 150, 50);
		ans2.setBounds(800, 480, 150, 50);
		frm.getContentPane().add(ans1);
		frm.getContentPane().add(ans2);


		// �������� ���̵��� ����
		frm.setVisible(true);

		// [end]

		// ��ư�� ��������
		his.addActionListener(event -> {
			battle2(rel1);
		});
		lit.addActionListener(event -> {
			lit_question(lit1);
		});
		art.addActionListener(event -> {
			art_question(art1);
		});
		sci.addActionListener(event -> {
			sci_question(sci1);
		});		
		mus.addActionListener(event -> {
			battle2(mus1);
		});		
		phi.addActionListener(event -> {
			battle2(phi1);
		});		
		rel.addActionListener(event -> {
			battle2(rel1);
		});		
		pol.addActionListener(event -> {
			battle2(pol1);
		});		
		nat.addActionListener(event -> {
			battle2(nat1);
		});

	}
	
	public static void lit_question(Monster s) {
		Random rand = new Random();
		que = rand.nextInt(3);
		
		if (que == 1) {
			lbl3.setText("���ӽ� ���̽��� 1922�� ��ǰ [�����ý�]�� 20���� ����� ���� ���� ������ �Ҽ��� �����ް� �ִ�.");
			lbl4.setText("[�����ý�] ��, ���ΰ� ����� �Ƴ� ������ ������ �����ϴ� ������ ���� �����ϱ�� �����ѵ�,");
			lbl5.setText("������ �������� ������ ���� 2�� 4000�� �̻��� �ܾ�� �̷���� �� 8���� �� �������� �����Ǿ� �ִ�.������ �� ���� ����, ������ ������ ���������?");
			lbl6.setText("�׸��� �׷��� ���� �װ� ���� ������ �׷� ���� ����̶�� ���ϰڴ��İ� �׸��� ó������ ���� ���� �� ���� �θ���");
			lbl7.setText("�׷� �׷��� �׸� �� ������ �������� �װ� �� ������ ��⸦ ���� �� �ֵ��� �׷� �׸��� ���� ������ ��ģ ���� �ٰ� �־��� �׷� ���� �׷������ ������.");
		} else if (que == 2) {
			lbl3.setText("20���� �ֿ� �̱� �۰� ��� ��Ͻ�Ʈ ��ֿ���(1899~1961)�� �̽ð� �Ϻο��� ���� ������� ������ ���߿� ������ �����ϸ鼭 ���� ������ �������� �� ���� ����Ҽ��� ���,");
			lbl4.setText("[�¾��� �ٽ� ��������], [���⿩ �� �ְŶ�], [������ ���Ͽ� ���� �︮��], [������ ���Ͽ� ���� �︮��] ���� �� ��ǥ�ߴ�.");
			lbl5.setText(" ");
			lbl6.setText("�̸��� �˷����鼭 ��ֿ��̴� ����, ����, ���, ��� ���� �� �������� ������ �ٷ�� �۰��� ���� ����������. ");
			lbl7.setText("[���ΰ� �ٴ�]���� ������ ������ �� ���� �ɼ��ɶ��� �̾߱� ������ ��ֿ��̴� 1954�� �뺧���л��� �޾Ҵ�.");
		} else {
			lbl3.setText("���̻������� �̷��� �����ϰ� �㱸�� ������̴� �����Ǿ� ������ 21������ �ߴ��� ���� ���� �� �ϳ�����. ");
			lbl4.setText("���ó� ���� �����õǴ� �����Ǿ� �Ҽ��� �ô��� �佽���� [���� �ż���]�̴�. ");
			lbl5.setText("�� �Ҽ��� ��ü ��ġ�� �ƴ� ���а� ����� ���� �߻��ϴ� �Ǹ� ���� ��ȸ�� �׸���.");
			lbl6.setText("[���� �ż���]�� �����ϰ� �߿��� ���� ��ǰ���� �򰡹޴� �� �� �Ǵ� ���� �Ҽ� �� �ϳ��̴�. ");
			lbl7.setText("�������� ���� �б����� �ֿ� ������ �����Ǿ� �԰� ���� �����а� ������ ���� ������ ���� Ŀ���鼭 ���ó����� �ָ�ް� �ִ�.");
		}
	}	
	
	public static void art_question(Monster s) {
		Random rand = new Random();
		que = rand.nextInt(3);
		
		if (que == 1) {
			lbl3.setText("���� ���� ��ȭ�� 1940�� ������ �ߺ��� ���� ��Ƽ�� �αٿ��� �߰ߵǾ���. ");
			lbl4.setText("���� �ȿ��� �ϳ��� �̾��� ���� ���� ���� �߰��ߴµ�, �װ��� 1�� 5000�⿡�� 1�� 700�� ���� �׷��� ������ �����Ǵ� �뷫 1500���� ���� �׸��� �־���.");
			lbl5.setText("���� ���� ��ȭ�� ���ݱ��� �˷��� ���� �ʱ��� ���� ��ǰ �� �ϳ��� ������?");
			lbl6.setText("���� ���� ��ȭ�� ���� ���縦 �� ���, ������ �ô��� ������ �������� 1948�� �Ϲ� ���߿��� �����Ǿ���.");
			lbl7.setText("�׷��� ���� �������鿡�� ����Ǹ� ��ǰ���� �ջ�� �ᱹ ���Ǿ���.");
			
		} else if (que == 2) {
			lbl3.setText("2�������� �����(1750~1850)�� ��ü�� �Ű������ǿ� ���� �������� �߻��ߴ�.");
			lbl4.setText("�Ű������� ���������� �̼�, ������, ����, ���� �� ��������� ��ġ�� ������ �ݸ�, �������� ���������� ȯ��, ����, �ְ���, ���� ���� ������ ������ ������. ");
			lbl5.setText("������. �̱� ��������� ������ ������ ���� ������ �ڱ� ���� ���������ڵ��� ��ȸ�� �Թ����� ������ ������ ������ �����ߴ�.");
			lbl6.setText("���������ڵ��� �ڿ��� ���̷ο�� ���� �ܼ��ϰ� �������� ��ȭ�� ���������� ������ ������. �׸���/�θ� �̼��� �ѷ��� ���� ������� ��ȣ��");
			lbl7.setText("�Ű��������ڵ�� �޸� ���������ڵ��� �̱��� ��ȭ�� �ź�ο�� ��� ������ ���⼺�� �ŷ�Ǿ���.");
		} else {
			lbl3.setText("6.5��Ʈ(�� 2m) ������ �� �������� ��� �׸����� �ķν� ������ ���� ��� �븮������ ���������.");
			lbl4.setText("�θ��ε鿡�Դ� ��ʽ��� �˷��� �ְ� �׸��������� �����ε��׷� �Ҹ��� ����� ���� ������ ������ �� ���̴�. ");
			lbl5.setText("�� �������� �߰ߵ� �� �αٿ��� ����� ����ִ� �� ������ �߰ߵǾ��µ�, ���� ���ڵ��� �� ���� ���� ������ �پ��ִ� ���̶� �����ϰ� �ִ�.");
			lbl6.setText("�з��� ��ʽ��� ������ �̼����� ������� �ñ⿡ ���ؼ��� ������ �к��ϴ�. ��긣 �ڹ��� ����");
			lbl7.setText("�з��� ��ʽ��� �ﷹ���� �ô뿡 ���̶�� ���� ���������� ������ ���� �̻��� ��ǰ���� �����ϰ� �ִ�.");
		}
	}
	
	public static void sci_question(Monster s) {
		Random rand = new Random();
		que = rand.nextInt(3);
		
		if (que == 1) {
			lbl3.setText("1997�⿡ �¾ ������ ��ü�� �Ȱ��� ������ DNA�� ���� ���� �����̴�.");
			lbl4.setText("�ٽ� ���� ������ ������ ������ ������ ���������� ������ �ִ�. ���� ���� �������� �ڶ� �϶��� �ֵ��̿� ���� �Ѹ��� ���� ���̴�.");
			lbl5.setText(" ");
			lbl6.setText("������ ź���� �׾߸��� ���� ������ ������ ������ Ư�� �������� ä���� ������ ������ ��ü�� ���� �� ������ ���а迡 ������ �����ٴ� ���̴�.");
			lbl7.setText("Ư�� ������ ������ ���ο� ������ ������ �ٲٴ� �����α׷����� �����ϴٰ� ������ ���̴�.");
		} else if (que == 2) {
			lbl3.setText("��� �׸����� �����ڵ��� ������ �ձ۴ٰ� �Ͼ���. �׷��� �׵� �� ������ ������ �󸶳� ū�� ���� ���ߴ�.");
			lbl4.setText("�׷��� �� ����� 3���� �˷���帮�� �������� ���� �����佺�׳׽�(����� 276~194)�� ������ ũ�⸦ �����ϴ� ����� ����ߴ�. ");
			lbl5.setText("�׸��� ������ �˾Ƴ��� ����̾��µ�, �̸� �̿��� �� ���� ���̸� 50ȸ �պ��Ѵٸ� ���� �� ������ �ȴ� �Ͱ� ���ٴ� ����� �����.");
			lbl6.setText("�̸� ���� �����ڽ��׳׽��� ��Ȯ�ϰ� ������ �������� �ȵ��� �Ʒù��� ���� �����ڸ� ����ߴ�. �����ڷκ��� ���� ����ġ�� �̿���");
			lbl7.setText("���� �ѷ��� �뷫 2�� 4700�����̶�� �����߰�, �� ������ ����� ����� ������ ������ ������ ��� 2�� 4902�����̶�� ����� ���Դ�.");
		} else {
			lbl3.setText("���ó� ���Ű� �ǻ���� �ָ��̶� ������ ������ ���� �޾Ƶ��̴� ���� ���·� �����Ѵ�.");
			lbl4.setText("�׷��� �װ��� ������ ������⺸�� ������ ���� �� ������.");
			lbl5.setText("���� �ָ鿡 ������ ���̳� �ൿ�� �ƹ� ������ ���� ���� �� ������ ������ ������ ���ϴ� ���� � �͵� �Ϸ��� ���� �ʴ´�. ");
			lbl6.setText("�ָ鿡 �ɸ� ����� ���ΰ���ó�� �ȴٴ� ���� �ƴϴ�.");
			lbl7.setText("�׵��� ������ ������ �����Ѵ�.");
		}
	}
	
	public static void battle1(Monster s) {
		lbl.setText(h.name + "�� ������ ��������");

		// ���� ��� ������ Ŭ����
		if (his1.hp < 1 && lit1.hp < 1 && sci1.hp < 1 && mus1.hp < 1 && phi1.hp < 1 && rel1.hp < 1 && rel1.hp < 1 && pol1.hp < 1 && nat1.hp < 1  ) {

			JOptionPane.showMessageDialog(lbl2, "Game Clear!");
			System.exit(0);
		}
	}
	
	public static void battle2(Monster s) {
		h.attack(s);

		s.attack(h);

		// ���� ��� ������ Ŭ����
		if (his1.hp < 1 && lit1.hp < 1 && sci1.hp < 1 && mus1.hp < 1 && phi1.hp < 1 && rel1.hp < 1 && rel1.hp < 1 && pol1.hp < 1 && nat1.hp < 1  ) {

			JOptionPane.showMessageDialog(lbl2, "Game Clear!");
			System.exit(0);
		}
	}

}
