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

	// 전역 변수
	static JLabel lbl, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, imgLbl, imgLbl2, imgLbl3, imgLbl4, imgLbl5, imgLbl6, imgLbl7, imgLbl8, imgLbl9;
	static ImageIcon bsImg, rsImg;
	static JButton his, lit, art, sci, mus, phi, rel, pol, nat, ans1, ans2;
	static int que, result; //que: 질문(종류) result: 정답(O=1/X=0)

	// 몹이랑 인간 객체
	static History his1 = new History("역사");
	static Literature lit1 = new Literature("문학");
	static Art art1 = new Art("미술");
	static Science sci1 = new Science("과학");
	static Music mus1 = new Music("음악");
	static Philosophy phi1 = new Philosophy("미술");
	static Religion rel1 = new Religion("종교");
	static Politics pol1 = new Politics("정치");
	static Nature nat1 = new Nature("자연");
	static Human h = new Human("me");

	public static void main(String[] args) {

		// 디자인 코드

		// 글꼴 통일
		Enumeration<Object> keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof FontUIResource)
				UIManager.put(key, new FontUIResource("굴림", Font.PLAIN, 14));
		}

		// [start] 프레임 설정
		JFrame frm = new JFrame();
		frm.setTitle("몬스터 퇴치하기");
		frm.setSize(1400, 600);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.getContentPane().setLayout(null);
		// [end] 프레임 설정

		// [start] 버튼 설정
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
		// [end] 버튼 설정

		// 라벨 설정(전투 정보 표시)
		lbl = new JLabel();
		lbl.setBounds(565, 210, 274, 50);
		lbl.setText("몬스터를 골라주세요.");
		lbl.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
		frm.getContentPane().add(lbl);

		// 라벨2 설정(전투 정보 표시2)
		lbl2 = new JLabel();
		lbl2.setBounds(565, 240, 274, 50);
		lbl2.setText(h.name + "의 체력은 " + h.hp + "입니다");
		lbl2.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
		frm.getContentPane().add(lbl2);
		
		// 라벨345 설정(문제)
		lbl3 = new JLabel();
		lbl3.setBounds(10, 300, 1400, 50);
		lbl3.setText(" ");
		lbl3.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
		frm.getContentPane().add(lbl3);
		lbl4 = new JLabel();
		lbl4.setBounds(10, 320, 1400, 50);
		lbl4.setText(" ");
		lbl4.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
		frm.getContentPane().add(lbl4);
		lbl5 = new JLabel();
		lbl5.setBounds(10, 340, 1400, 50);
		lbl5.setText(" ");
		lbl5.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
		frm.getContentPane().add(lbl5);
		
		// 라벨67설정(보기)
		lbl6 = new JLabel();
		lbl6.setBounds(10, 380, 1400, 50);
		lbl6.setText(" ");
		lbl6.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
		frm.getContentPane().add(lbl6);
		lbl7 = new JLabel();
		lbl7.setBounds(10, 400, 1400, 50);
		lbl7.setText(" ");
		lbl7.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
		frm.getContentPane().add(lbl7);
		
		// 라벨8설정 (가로줄)
		lbl8 = new JLabel();
		lbl8.setBounds(10, 280, 1400, 50);
		lbl8.setText("------문제------");
		lbl8.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
		frm.getContentPane().add(lbl8);

		// [start] 이미지 라벨 생성(역사)
		imgLbl = new JLabel();
		bsImg = new ImageIcon(Study01.class.getResource("/study/img/his.png"));
		imgLbl.setIcon(bsImg);
		imgLbl.setBounds(30, 30, 120, 130);
		imgLbl.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl);
		// [end]

		// [start] 이미지 라벨2 생성(문학)
		imgLbl2 = new JLabel();
		rsImg = new ImageIcon(Study01.class.getResource("/study/img/lit.png"));
		imgLbl2.setIcon(rsImg);
		imgLbl2.setBounds(180, 30, 120, 130);
		imgLbl2.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl2);
		// [end]
		
		// [start] 이미지 라벨3 생성(미술)
		imgLbl3 = new JLabel();
		rsImg = new ImageIcon(Study01.class.getResource("/study/img/art.png"));
		imgLbl3.setIcon(rsImg);
		imgLbl3.setBounds(330, 30, 120, 130);
		imgLbl3.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl3);
		// [end]
		
		// [start] 이미지 라벨4 생성(과학)
		imgLbl4 = new JLabel();
		rsImg = new ImageIcon(Study01.class.getResource("/study/img/sci.png"));
		imgLbl4.setIcon(rsImg);
		imgLbl4.setBounds(480, 30, 120, 130);
		imgLbl4.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl4);
		// [end]
		
		// [start] 이미지 라벨5 생성(음악)
		imgLbl5 = new JLabel();
		rsImg = new ImageIcon(Study01.class.getResource("/study/img/mus.png"));
		imgLbl5.setIcon(rsImg);
		imgLbl5.setBounds(630, 30, 120, 130);
		imgLbl5.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl5);
		// [end]
		
		// [start] 이미지 라벨6 생성(철학)
		imgLbl6 = new JLabel();
		rsImg = new ImageIcon(Study01.class.getResource("/study/img/phi.png"));
		imgLbl6.setIcon(rsImg);
		imgLbl6.setBounds(770, 30, 120, 130);
		imgLbl6.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl6);
		// [end]
		
		// [start] 이미지 라벨7 생성(종교)
		imgLbl7 = new JLabel();
		rsImg = new ImageIcon(Study01.class.getResource("/study/img/rel.png"));
		imgLbl7.setIcon(rsImg);
		imgLbl7.setBounds(930, 30, 120, 130);
		imgLbl7.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl7);
		// [end]
		
		// [start] 이미지 라벨8 생성(정치)
		imgLbl8 = new JLabel();
		rsImg = new ImageIcon(Study01.class.getResource("/study/img/pol.png"));
		imgLbl8.setIcon(rsImg);
		imgLbl8.setBounds(1080, 30, 120, 130);
		imgLbl8.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl8);
		// [end]
		
		// [start] 이미지 라벨9 생성(자연)
		imgLbl9 = new JLabel();
		rsImg = new ImageIcon(Study01.class.getResource("/study/img/nat.png"));
		imgLbl9.setIcon(rsImg);
		imgLbl9.setBounds(1230, 30, 120, 130);
		imgLbl9.setHorizontalAlignment(JLabel.CENTER);
		frm.getContentPane().add(imgLbl9);
		// [end]
		
		//***정답버튼 여기****
		JButton ans1 = new JButton("O");
		JButton ans2 = new JButton("X");
		ans1.setBounds(450, 480, 150, 50);
		ans2.setBounds(800, 480, 150, 50);
		frm.getContentPane().add(ans1);
		frm.getContentPane().add(ans2);


		// 프레임이 보이도록 설정
		frm.setVisible(true);

		// [end]

		// 버튼을 눌렀을때
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
			lbl3.setText("제임스 조이스의 1922년 작품 [율리시스]는 20세기 영어로 쓰인 가장 위대한 소설로 인정받고 있다.");
			lbl4.setText("[율리시스] 중, 주인공 블룸의 아내 몰리의 생각을 묘사하는 마지막 장은 난해하기로 유명한데,");
			lbl5.setText("몰리의 몽상적인 독백은 무려 2만 4000개 이상의 단어로 이루어진 단 8개의 긴 문장으로 구성되어 있다.마지막 몇 줄을 보아, 몰리는 남편을 사랑했을까?");
			lbl6.setText("그리고 그러고 나서 그가 내게 물었지 그래 나의 들꽃이라고 말하겠느냐고 그리고 처음으로 나는 그의 목에 팔을 두르고");
			lbl7.setText("그래 그렇게 그를 내 쪽으로 끌어당겼지 그가 내 가슴의 향기를 느낄 수 있도록 그래 그리고 그의 심장이 미친 듯이 뛰고 있었고 그래 나는 그러리라고 말했지.");
		} else if (que == 2) {
			lbl3.setText("20세기 주요 미국 작가 가운데 어니스트 헤밍웨이(1899~1961)는 미시건 북부에서 보낸 유년기의 여름과 나중에 유럽을 여행하면서 얻은 경험을 바탕으로 수 편의 단편소설을 썼고,");
			lbl4.setText("[태양은 다시 떠오른다], [무기여 잘 있거라], [누구를 위하여 종은 울리나], [누구를 위하여 종은 울리나] 등을 써 발표했다.");
			lbl5.setText(" ");
			lbl6.setText("이름이 알려지면서 헤밍웨이는 전쟁, 투우, 사냥, 대어 낚시 등 마초적인 주제를 다루는 작가로 명성을 다져나갔다. ");
			lbl7.setText("[노인과 바다]에서 보여준 부인할 수 없이 능수능란한 이야기 전개로 헤밍웨이는 1954년 노벨문학상을 받았다.");
		} else {
			lbl3.setText("반이상향적인 미래를 묘사하고 허구를 끌어들이는 디스토피아 문학은 21세기의 중대한 문학 혁신 중 하나였다. ");
			lbl4.setText("오늘날 가장 문제시되는 디스토피아 소설은 올더스 헉슬리의 [멋진 신세계]이다. ");
			lbl5.setText("이 소설은 전체 정치가 아닌 과학과 기술에 의해 발생하는 악몽 같은 사회를 그린다.");
			lbl6.setText("[멋진 신세계]는 꾸준하게 중요한 문학 작품으로 평가받는 몇 안 되는 과학 소설 중 하나이다. ");
			lbl7.setText("오랫동안 여러 학교에서 주요 도서로 선정되어 왔고 생물 윤리학과 복제에 대한 관심이 점차 커지면서 오늘날까지 주목받고 있다.");
		}
	}	
	
	public static void art_question(Monster s) {
		Random rand = new Random();
		que = rand.nextInt(3);
		
		if (que == 1) {
			lbl3.setText("라스코 동굴 벽화는 1940년 프랑스 중부의 마을 몽티냑 인근에서 발견되었다. ");
			lbl4.setText("동굴 안에서 하나로 이어진 여러 개의 방을 발견했는데, 그곳엔 1만 5000년에서 1만 700년 전에 그려진 것으로 추정되는 대략 1500점의 동물 그림이 있었다.");
			lbl5.setText("라스코 동굴 벽화는 지금까지 알려진 가장 초기의 예술 작품 중 하나가 맞을까?");
			lbl6.setText("라스코 동굴 벽화는 정밀 조사를 한 결과, 구석기 시대의 유물로 밝혀졌고 1948년 일반 대중에게 공개되었다.");
			lbl7.setText("그러나 많은 관광객들에게 노출되며 작품들이 손상돼 결국 폐쇄되었다.");
			
		} else if (que == 2) {
			lbl3.setText("2낭만주의 문예운동(1750~1850)은 대체로 신고전주의에 대한 반응으로 발생했다.");
			lbl4.setText("신고전주의 예술가들이 이성, 객관성, 질서, 과학 등 계몽주의적 가치를 강조한 반면, 낭만주의 예술가들은 환상, 직관, 주관성, 감정 등의 영역에 관심을 가졌다. ");
			lbl5.setText("가졌다. 미국 독립전쟁과 프랑스 혁명을 낳은 열정에 자극 받은 낭만주의자들은 사회적 규범보다 개인의 자유와 반항을 찬양했다.");
			lbl6.setText("낭만주의자들은 자연의 경이로움과 보다 단순하고 원시적인 문화의 순수성에서 감동을 느꼈다. 그리스/로마 미술의 뚜렷한 선과 우아함을 선호한");
			lbl7.setText("신고전주의자들과 달리 낭만주의자들은 이국적 문화의 신비로움과 고딕 겆축의 복잡성에 매료되었다.");
		} else {
			lbl3.setText("6.5피트(약 2m) 높이의 이 조각상은 고대 그리스의 파로스 섬에서 나는 백색 대리석으로 만들어졌다.");
			lbl4.setText("로마인들에게는 비너스로 알려져 있고 그리스에서는 아프로디테로 불리는 사랑과 미의 여신을 주제로 한 것이다. ");
			lbl5.setText("이 조각상이 발견된 곳 인근에서 사과를 들고있던 팔 조각이 발견되었는데, 많은 학자들은 그 팔이 원래 조각상에 붙어있던 것이라 추정하고 있다.");
			lbl6.setText("밀로의 비너스를 조각한 미술가와 만들어진 시기에 대해서는 이유가 분분하다. 루브르 박물관 측은");
			lbl7.setText("밀로의 비너스가 헬레니즘 시대에 것이라는 데에 동의했지만 여전히 작자 미상의 작품으로 전시하고 있다.");
		}
	}
	
	public static void sci_question(Monster s) {
		Random rand = new Random();
		que = rand.nextInt(3);
		
		if (que == 1) {
			lbl3.setText("1997년에 태어난 돌리는 모체와 똑같은 세포핵 DNA를 가진 복제 동물이다.");
			lbl4.setText("다시 말해 돌리와 돌리의 엄마는 동일한 유전물질을 가지고 있다. 여러 세대 떨어져서 자란 일란성 쌍둥이와 같은 둘리는 종은 쥐이다.");
			lbl5.setText(" ");
			lbl6.setText("돌리의 탄생이 그야말로 놀라운 과학적 성과인 이유는 특정 부위에서 채취한 세포로 완전한 개체를 만들어낼 수 있음을 과학계에 입증해 보였다는 것이다.");
			lbl7.setText("특정 세포를 완전히 새로운 종류의 세포로 바꾸는 리프로그래밍이 가능하다고 입증한 것이다.");
		} else if (que == 2) {
			lbl3.setText("고대 그리스의 과학자들은 세상이 둥글다고 믿었다. 그러나 그들 중 누구도 세상이 얼마나 큰지 알지 못했다.");
			lbl4.setText("그러던 중 기원전 3세기 알렉산드리아 도서관의 관장 에라토스테네스(기원전 276~194)가 지구의 크기를 측정하는 방법을 고안했다. ");
			lbl5.setText("그림자 각도를 알아내는 방법이었는데, 이를 이용해 두 도시 사이를 50회 왕복한다면 지구 한 바퀴를 걷는 것과 같다는 결론을 얻었다.");
			lbl6.setText("이를 위헤 에라코스테네스는 정확하게 일정한 보폭으로 걷도록 훈련받은 전문 보행자를 고용했다. 보행자로부터 얻은 측정치를 이용해");
			lbl7.setText("지구 둘레가 대략 2만 4700마일이라고 추정했고, 이 원리를 사용한 현대식 도구로 지구를 측정한 결과 2만 4902마일이라는 결과가 나왔다.");
		} else {
			lbl3.setText("오늘날 정신과 의사들은 최면이란 제안을 굉장히 쉽게 받아들이는 가수 상태로 이해한다.");
			lbl4.setText("그러나 그것은 마음의 통제라기보다 유도된 몽상에 더 가깝다.");
			lbl5.setText("흔히 최면에 빠지면 말이나 행동에 아무 제약을 받지 않을 것 같지만 본인의 의지에 반하는 것은 어떤 것도 하려고 하지 않는다. ");
			lbl6.setText("최면에 걸린 사람이 꼭두각시처럼 된다는 말이 아니다.");
			lbl7.setText("그들은 여전히 스스로 생각한다.");
		}
	}
	
	public static void battle1(Monster s) {
		lbl.setText(h.name + "의 공격은 빗나갔다");

		// 몹이 모두 죽으면 클리어
		if (his1.hp < 1 && lit1.hp < 1 && sci1.hp < 1 && mus1.hp < 1 && phi1.hp < 1 && rel1.hp < 1 && rel1.hp < 1 && pol1.hp < 1 && nat1.hp < 1  ) {

			JOptionPane.showMessageDialog(lbl2, "Game Clear!");
			System.exit(0);
		}
	}
	
	public static void battle2(Monster s) {
		h.attack(s);

		s.attack(h);

		// 몹이 모두 죽으면 클리어
		if (his1.hp < 1 && lit1.hp < 1 && sci1.hp < 1 && mus1.hp < 1 && phi1.hp < 1 && rel1.hp < 1 && rel1.hp < 1 && pol1.hp < 1 && nat1.hp < 1  ) {

			JOptionPane.showMessageDialog(lbl2, "Game Clear!");
			System.exit(0);
		}
	}

}
