package Grafico;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Logica.Calculator;
import Logica.Champion;
import Logica.Status;

public class Menu extends JFrame {
	
	// Informações que não devem ser alteradas
	private final int largura = 500;
	private final int altura = 700;
	private final int posicaoX = 100;
	private final int posicaoY = 100;
	
	// Lista de coisas para as combobox
	private String[] levels = {"1","2","3","4","5","6","7","8","9","10","11",
			"12","13","14","15","16","17","18"};
	private String[] champions = {"CHAMPION", "Aatrox", "Ahri",
			"Akali", "Alistar", "Amumu", "Anivia", "Annie", "Ashe",
			"Blitzcrank", "Brand", "Braum", "Caitlyn", "Cassiopeia", "Cho'Gath",
			"Corki", "Darius", "Diana", "Dr.Mundo", "Draven", "Elise",
			"Evelynn", "Ezreal", "Fiddlesticks", "Fiora", "Fizz", "Galio",
			"Gangplank", "Garen", "Gragas", "Gnar Mini", "Gnar Mega", "Graves", "Hecarim", "Heimerdinger",
			"Irelia", "Janna", "Jarvan IV", "Jax", "Jayce", "Jinx", "Karma",
			"Karthus", "Kassadin", "Katarina", "Kayle", "Kennen", "Kog'Maw",
			"LeBlanc", "Lee Sin", "Leona", "Lissandra", "Lucian", "Lulu",
			"Lux", "Malphite", "Malzahar", "Maokai", "Master Yi", "Miss Fortune",
			"Mordekaiser", "Morgana", "Nami", "Nasus", "Nautilus", "Nidalee",
			"Nocturne", "Nunu", "Olaf", "Orianna", "Pantheon", "Poppy",
			"Quinn", "Rammus", "Renekton", "Rengar", "Riven", "Rumble", "Ryze",
			"Sejuani", "Shaco",  "Shen", "Shyvana", "Singed", "Sion", "Sivir",
			"Skarner", "Sona", "Soraka", "Swain", "Syndra", "Talon", "Taric",
			"Teemo", "Thresh", "Tristana", "Trundle", "Tryndamere", "Twisted Fate",
			"Twitch", "Udyr", "Urgot", "Varus", "Vayne", "Veigar", "Vel'Koz",
			"Vi", "Viktor", "Vladimir", "Volibear", "Warwick", "Wukong",
			"Xerath", "Xin Zhao", "Yasuo", "Yorick", "Zac", "Zed", "Ziggs",
			"Zilean", "Zyra", "Ancient Golem", "Elder Lizard"};
	
	// Painel, botões, textfields, combobox e tudo mais que a janela for ter
	private JPanel painel = new JPanel();
	private JButton botaoCalcular = new JButton();
	private JLabel vitoria = new JLabel("");
	// Principal
	private ImageIcon avatar;
	private JLabel avatarChampion = new JLabel(avatar);
	private JComboBox listaDeChampions = new JComboBox(champions);
	private JComboBox listaDosLevels = new JComboBox(levels);
	private JLabel textVida = new JLabel("Vida");
	private JLabel textAD = new JLabel("AD");
	private JLabel textArmor = new JLabel("Armor");
	private JLabel textLifesteal = new JLabel("Lifesteal");
	private JLabel textHealthRegen = new JLabel("HealthRegen");
	private JLabel textAtkspeed = new JLabel("Attack Speed");
	private JLabel textLevel = new JLabel("Level");
	private JTextField extraVida = new JTextField("0");
	private JTextField extraAD = new JTextField("0");
	private JTextField extraArmor = new JTextField("0");
	private JTextField extraLifesteal = new JTextField("0");
	private JTextField extraHealthRegen = new JTextField("0");
	private JTextField extraAtkspeed = new JTextField("0");
	// Oponente
	private ImageIcon avatar2;
	private JLabel avatarChampion2 = new JLabel(avatar2);
	private JComboBox listaDeChampions2 = new JComboBox(champions);
	private JComboBox listaDosLevels2 = new JComboBox(levels);
	private JLabel textVida2 = new JLabel("Vida");
	private JLabel textAD2 = new JLabel("AD");
	private JLabel textArmor2 = new JLabel("Armor");
	private JLabel textLifesteal2 = new JLabel("Lifesteal");
	private JLabel textHealthRegen2 = new JLabel("HealthRegen");
	private JLabel textAtkspeed2 = new JLabel("Attack Speed");
	private JLabel textLevel2 = new JLabel("Level");
	private JTextField extraVida2 = new JTextField("0");
	private JTextField extraAD2 = new JTextField("0");
	private JTextField extraArmor2 = new JTextField("0");
	private JTextField extraLifesteal2 = new JTextField("0");
	private JTextField extraHealthRegen2 = new JTextField("0");
	private JTextField extraAtkspeed2 = new JTextField("0");
	
	/*
	 * Fiz uma classe dentro dessa para quando o botão for clickado.
	 * N senti necessidade de outra classe só pra uma unica janela.
	 */
	
	private AoClickar clickado = new AoClickar();
	
	
	public Menu() {
		
		// Configuração da janela
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		this.setBounds(posicaoX, posicaoY, largura, altura);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Configurações do painel
		painel.setVisible(true);
		painel.setLayout(null);
		//painel.setBackground(Color.red);
		painel.setBounds(0, 0, largura, altura);
		this.getContentPane().add(painel);
		
		// Configurações dos botões
		botaoCalcular.setVisible(true);
		botaoCalcular.setText("Calcular");
		botaoCalcular.setBounds(200, 630, 100, 30);
		painel.add(botaoCalcular);
		
		// Configurações das labels
		vitoria.setVisible(true);
		vitoria.setBounds(220, 420, 150, 30);
		painel.add(vitoria);
		
		/*
		 * Um champion
		 * 
		 * 
		 * 
		 */
		
		// Configurações do avatar
		avatarChampion.setVisible(true);
		//
		avatarChampion.setLocation(10, 10);
		avatarChampion.setSize(120, 120);
		//
		painel.add(avatarChampion);
		
		// Configurações dos combobox
		listaDeChampions.setVisible(true);
		listaDosLevels.setVisible(true);
		//
		listaDeChampions.setBounds(10, 160, 120, 20);
		listaDosLevels.setBounds(120, 370, 50, 20);
		//
		painel.add(listaDeChampions);
		painel.add(listaDosLevels);
		
		// Configurações dos textfields
		extraVida.setVisible(true);
		extraAD.setVisible(true);
		extraArmor.setVisible(true);
		extraLifesteal.setVisible(true);
		extraHealthRegen.setVisible(true);
		extraAtkspeed.setVisible(true);
		//
		extraVida.setBounds(120, 190, 40, 20);
		extraAD.setBounds(120, 220, 40, 20);
		extraArmor.setBounds(120, 250, 40, 20);
		extraLifesteal.setBounds(120, 280, 40, 20);
		extraHealthRegen.setBounds(120, 310, 40, 20);
		extraAtkspeed.setBounds(120, 340, 40, 20);
		//
		painel.add(extraVida);
		painel.add(extraAD);
		painel.add(extraArmor);
		painel.add(extraLifesteal);
		painel.add(extraHealthRegen);
		painel.add(extraAtkspeed);
		
		// Configurações dos textos(label)
		textVida.setVisible(true);
		textAD.setVisible(true);
		textArmor.setVisible(true);
		textLifesteal.setVisible(true);
		textHealthRegen.setVisible(true);
		textAtkspeed.setVisible(true);
		textLevel.setVisible(true);
		//
		textVida.setBounds(10, 190, 150, 20);
		textAD.setBounds(10, 220, 150, 20);
		textArmor.setBounds(10, 250, 150, 20);
		textLifesteal.setBounds(10, 280, 150, 20);
		textHealthRegen.setBounds(10, 310, 150, 20);
		textAtkspeed.setBounds(10, 340, 150, 20);
		textLevel.setBounds(10, 370, 50, 20);
		//
		painel.add(textVida);
		painel.add(textAD);
		painel.add(textArmor);
		painel.add(textLifesteal);
		painel.add(textHealthRegen);
		painel.add(textAtkspeed);
		painel.add(textLevel);
		
		/*
		 * Tudo copiado desdas combox até o que esta acima disso, para o oponente
		 * 
		 * 
		 * 
		 */

		// Configurações do avatar
		avatarChampion2.setVisible(true);
		//
		avatarChampion2.setLocation(300, 10);
		avatarChampion2.setSize(120, 120);
		//
		painel.add(avatarChampion2);

		// Configurações dos combobox 2
		listaDeChampions2.setVisible(true);
		listaDosLevels2.setVisible(true);
		//
		listaDeChampions2.setBounds(300, 160, 120, 20);
		listaDosLevels2.setBounds(420, 370, 50, 20);
		//
		painel.add(listaDeChampions2);
		painel.add(listaDosLevels2);
		
		// Configurações dos textfields 2
		extraVida2.setVisible(true);
		extraAD2.setVisible(true);
		extraArmor2.setVisible(true);
		extraLifesteal2.setVisible(true);
		extraHealthRegen2.setVisible(true);
		extraAtkspeed2.setVisible(true);
		//
		extraVida2.setBounds(420, 190, 40, 20);
		extraAD2.setBounds(420, 220, 40, 20);
		extraArmor2.setBounds(420, 250, 40, 20);
		extraLifesteal2.setBounds(420, 280, 40, 20);
		extraHealthRegen2.setBounds(420, 310, 40, 20);
		extraAtkspeed2.setBounds(420, 340, 40, 20);
		//
		painel.add(extraVida2);
		painel.add(extraAD2);
		painel.add(extraArmor2);
		painel.add(extraLifesteal2);
		painel.add(extraHealthRegen2);
		painel.add(extraAtkspeed2);
		
		// Configurações dos textos(label) 2
		textVida2.setVisible(true);
		textAD2.setVisible(true);
		textArmor2.setVisible(true);
		textLifesteal2.setVisible(true);
		textHealthRegen2.setVisible(true);
		textAtkspeed2.setVisible(true);
		textLevel2.setVisible(true);
		//
		textVida2.setBounds(310, 190, 150, 20);
		textAD2.setBounds(310, 220, 150, 20);
		textArmor2.setBounds(310, 250, 150, 20);
		textLifesteal2.setBounds(310, 280, 150, 20);
		textHealthRegen2.setBounds(310, 310, 150, 20);
		textAtkspeed2.setBounds(310, 340, 150, 20);
		textLevel2.setBounds(310, 370, 50, 20);
		//
		painel.add(textVida2);
		painel.add(textAD2);
		painel.add(textArmor2);
		painel.add(textLifesteal2);
		painel.add(textHealthRegen2);
		painel.add(textAtkspeed2);
		painel.add(textLevel2);
		
		/*
		 * Fim das coisas do oponente
		 * 
		 * 
		 * 
		 */
		
		/*
		 *  Ao ser clickado, chama a variavel clickado
		 *  (na verdade chama o metodo actionPerformed dentro da variavel passada)
		 */
		
		listaDeChampions.addActionListener(clickado);
		listaDeChampions2.addActionListener(clickado);
		botaoCalcular.addActionListener(clickado);
	}
	
	private class AoClickar implements ActionListener {
		
		Champion hero;
		Champion hero2;
		String nome;
		double vida;
		double ad;
		double armor;
		double lifesteal;
		double healthregen;
		double atkspeed;
		int level;
		
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource() == botaoCalcular) {
				
				/*
				 * Transformar todas as informações dadas pelo usuario
				 * em informações do champion e depois enviar elas
				 * para o objeto Champion.
				 */
				
				try {
					nome = listaDeChampions.getSelectedItem().toString();
					vida = Double.parseDouble(extraVida.getText());
					ad = Double.parseDouble(extraAD.getText());
					armor = Double.parseDouble(extraArmor.getText());
					lifesteal = Double.parseDouble(extraLifesteal.getText());
					healthregen = Double.parseDouble(extraHealthRegen.getText());
					atkspeed = Double.parseDouble(extraAtkspeed.getText());
					level = listaDosLevels.getSelectedIndex() + 1;
					
					if (nome.compareTo("CHAMPION")==0)
						throw new Exception();
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Um dos valores não é válido\n(e eu tenho preguiça de dizer qual é)\n(é um do champion da esquerda)");
				}
				
				hero = Status.findChampion(nome);
				hero.setLevel(level);
				hero.setHealth(hero.getHealth() + vida);
				hero.setAttackDamage(hero.getAttackDamage() + ad);
				hero.setArmor(hero.getArmor() + armor);
				hero.setLifesteal(hero.getLifesteal() + lifesteal);
				hero.setHealthRegen(hero.getHealthRegen() + healthregen);
				hero.setAttackSpeed(hero.getAttackSpeed() + atkspeed*hero.getBaseAttackSpeed()/100);
				
				/*
				 * Fazer o mesmo para o inimigo
				 */
				
				try {
					nome = listaDeChampions2.getSelectedItem().toString();
					vida = Double.parseDouble(extraVida2.getText());
					ad = Double.parseDouble(extraAD2.getText());
					armor = Double.parseDouble(extraArmor2.getText());
					lifesteal = Double.parseDouble(extraLifesteal2.getText());
					healthregen = Double.parseDouble(extraHealthRegen2.getText());
					atkspeed = Double.parseDouble(extraAtkspeed2.getText());
					level = listaDosLevels2.getSelectedIndex() + 1;
					
					if (nome.compareTo("CHAMPION")==0)
						throw new Exception();
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Um dos valores não é válido\n(e eu tenho preguiça de dizer qual é)\n(é um do champion da direita)");
				}
				
				hero2 = Status.findChampion(nome);
				hero2.setLevel(level);
				hero2.setHealth(hero2.getHealth() + vida);
				hero2.setAttackDamage(hero2.getAttackDamage() + ad);
				hero2.setArmor(hero2.getArmor() + armor);
				hero2.setLifesteal(hero2.getLifesteal() + lifesteal);
				hero2.setHealthRegen(hero2.getHealthRegen() + healthregen);
				hero2.setAttackSpeed(hero2.getAttackSpeed() + atkspeed*hero2.getBaseAttackSpeed()/100);
				
				vitoria.setText(Calculator.battle1(hero, hero2));
				
			} else if (event.getSource() == listaDeChampions) {
				
				nome = listaDeChampions.getSelectedItem().toString();
				
				if (nome.compareTo("CHAMPION")==0) {
					//DoNothing
				} else if (nome.compareTo("Aatrox")==0) {
					avatar = new ImageIcon("src/Grafico/Aatrox.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Ahri")==0) {
					avatar = new ImageIcon("src/Grafico/Ahri.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Akali")==0) {
					avatar = new ImageIcon("src/Grafico/Akali.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Alistar")==0) {
					avatar = new ImageIcon("src/Grafico/Alistar.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Amumu")==0) {
					avatar = new ImageIcon("src/Grafico/Amumu.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Anivia")==0) {
					avatar = new ImageIcon("src/Grafico/Anivia.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Annie")==0) {
					avatar = new ImageIcon("src/Grafico/Annie.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Ashe")==0) {
					avatar = new ImageIcon("src/Grafico/Ashe.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Blitzcrank")==0) {
					avatar = new ImageIcon("src/Grafico/Blitzcrank.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Brand")==0) {
					avatar = new ImageIcon("src/Grafico/Brand.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Braum")==0) {
					avatar = new ImageIcon("src/Grafico/Braum.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Caitlyn")==0) {
					avatar = new ImageIcon("src/Grafico/Caitlyn.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Cassiopeia")==0) {
					avatar = new ImageIcon("src/Grafico/Cassiopeia.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Cho'Gath")==0) {
					avatar = new ImageIcon("src/Grafico/ChoGath.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Corki")==0) {
					avatar = new ImageIcon("src/Grafico/Corki.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Darius")==0) {
					avatar = new ImageIcon("src/Grafico/Darius.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Diana")==0) {
					avatar = new ImageIcon("src/Grafico/Diana.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Dr.Mundo")==0) {
					avatar = new ImageIcon("src/Grafico/DrMundo.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Draven")==0) {
					avatar = new ImageIcon("src/Grafico/Draven.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Elise")==0) {
					avatar = new ImageIcon("src/Grafico/Elise.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Evelynn")==0) {
					avatar = new ImageIcon("src/Grafico/Evelynn.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Ezreal")==0) {
					avatar = new ImageIcon("src/Grafico/Ezreal.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Fiddlesticks")==0) {
					avatar = new ImageIcon("src/Grafico/Fiddlesticks.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Fiora")==0) {
					avatar = new ImageIcon("src/Grafico/Fiora.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Fizz")==0) {
					avatar = new ImageIcon("src/Grafico/Fizz.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Galio")==0) {
					avatar = new ImageIcon("src/Grafico/Galio.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Gangplank")==0) {
					avatar = new ImageIcon("src/Grafico/Gangplank.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Garen")==0) {
					avatar = new ImageIcon("src/Grafico/Garen.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Gragas")==0) {
					avatar = new ImageIcon("src/Grafico/Gragas.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Gnar Mini")==0) {
					avatar = new ImageIcon("src/Grafico/GnarMini.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Gnar Mega")==0) {
					avatar = new ImageIcon("src/Grafico/GnarMega.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Graves")==0) {
					avatar = new ImageIcon("src/Grafico/Graves.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Hecarim")==0) {
					avatar = new ImageIcon("src/Grafico/Hecarim.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Heimerdinger")==0) {
					avatar = new ImageIcon("src/Grafico/Heimerdinger.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Irelia")==0) {
					avatar = new ImageIcon("src/Grafico/Irelia.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Janna")==0) {
					avatar = new ImageIcon("src/Grafico/Janna.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Jarvan IV")==0) {
					avatar = new ImageIcon("src/Grafico/JarvanIV.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Jax")==0) {
					avatar = new ImageIcon("src/Grafico/Jax.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Jayce")==0) {
					avatar = new ImageIcon("src/Grafico/Jayce.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Jinx")==0) {
					avatar = new ImageIcon("src/Grafico/Jinx.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Karma")==0) {
					avatar = new ImageIcon("src/Grafico/Karma.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Karthus")==0) {
					avatar = new ImageIcon("src/Grafico/Karthus.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Kassadin")==0) {
					avatar = new ImageIcon("src/Grafico/Kassadin.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Katarina")==0) {
					avatar = new ImageIcon("src/Grafico/Katarina.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Kayle")==0) {
					avatar = new ImageIcon("src/Grafico/Kayle.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Kennen")==0) {
					avatar = new ImageIcon("src/Grafico/Kennen.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Kha'Zix")==0) {
					avatar = new ImageIcon("src/Grafico/KhaZix.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Kog'Maw")==0) {
					avatar = new ImageIcon("src/Grafico/KogMaw.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("LeBlanc")==0) {
					avatar = new ImageIcon("src/Grafico/LeBlanc.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Lee Sin")==0) {
					avatar = new ImageIcon("src/Grafico/LeeSin.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Leona")==0) {
					avatar = new ImageIcon("src/Grafico/Leona.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Lissandra")==0) {
					avatar = new ImageIcon("src/Grafico/Lissandra.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Lucian")==0) {
					avatar = new ImageIcon("src/Grafico/Lucian.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Lulu")==0) {
					avatar = new ImageIcon("src/Grafico/Lulu.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Lux")==0) {
					avatar = new ImageIcon("src/Grafico/Lux.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Malphite")==0) {
					avatar = new ImageIcon("src/Grafico/Malphite.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Malzahar")==0) {
					avatar = new ImageIcon("src/Grafico/Malzahar.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Maokai")==0) {
					avatar = new ImageIcon("src/Grafico/Maokai.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Master Yi")==0) {
					avatar = new ImageIcon("src/Grafico/MasterYi.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Miss Fortune")==0) {
					avatar = new ImageIcon("src/Grafico/MissFortune.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Mordekaiser")==0) {
					avatar = new ImageIcon("src/Grafico/Mordekaiser.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Morgana")==0) {
					avatar = new ImageIcon("src/Grafico/Morgana.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Nami")==0) {
					avatar = new ImageIcon("src/Grafico/Nami.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Nasus")==0) {
					avatar = new ImageIcon("src/Grafico/Nasus.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Nautilus")==0) {
					avatar = new ImageIcon("src/Grafico/Nautilus.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Nidalee")==0) {
					avatar = new ImageIcon("src/Grafico/Nidalee.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Nocturne")==0) {
					avatar = new ImageIcon("src/Grafico/Nocturne.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Nunu")==0) {
					avatar = new ImageIcon("src/Grafico/Nunu.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Olaf")==0) {
					avatar = new ImageIcon("src/Grafico/Olaf.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Orianna")==0) {
					avatar = new ImageIcon("src/Grafico/Orianna.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Pantheon")==0) {
					avatar = new ImageIcon("src/Grafico/Pantheon.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Poppy")==0) {
					avatar = new ImageIcon("src/Grafico/Poppy.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Quinn")==0) {
					avatar = new ImageIcon("src/Grafico/Quinn.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Rammus")==0) {
					avatar = new ImageIcon("src/Grafico/Rammus.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Renekton")==0) {
					avatar = new ImageIcon("src/Grafico/Renekton.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Rengar")==0) {
					avatar = new ImageIcon("src/Grafico/Rengar.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Riven")==0) {
					avatar = new ImageIcon("src/Grafico/Riven.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Rumble")==0) {
					avatar = new ImageIcon("src/Grafico/Rumble.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Ryze")==0) {
					avatar = new ImageIcon("src/Grafico/Ryze.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Sejuani")==0) {
					avatar = new ImageIcon("src/Grafico/Sejuani.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Shaco")==0) {
					avatar = new ImageIcon("src/Grafico/Shaco.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Shen")==0) {
					avatar = new ImageIcon("src/Grafico/Shen.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Shyvana")==0) {
					avatar = new ImageIcon("src/Grafico/Shyvana.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Singed")==0) {
					avatar = new ImageIcon("src/Grafico/Singed.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Sion")==0) {
					avatar = new ImageIcon("src/Grafico/Sion.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Sivir")==0) {
					avatar = new ImageIcon("src/Grafico/Sivir.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Skarner")==0) {
					avatar = new ImageIcon("src/Grafico/Skarner.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Sona")==0) {
					avatar = new ImageIcon("src/Grafico/Sona.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Soraka")==0) {
					avatar = new ImageIcon("src/Grafico/Soraka.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Swain")==0) {
					avatar = new ImageIcon("src/Grafico/Swain.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Syndra")==0) {
					avatar = new ImageIcon("src/Grafico/Syndra.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Talon")==0) {
					avatar = new ImageIcon("src/Grafico/Talon.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Taric")==0) {
					avatar = new ImageIcon("src/Grafico/Taric.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Teemo")==0) {
					avatar = new ImageIcon("src/Grafico/Teemo.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Thresh")==0) {
					avatar = new ImageIcon("src/Grafico/Thresh.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Tristana")==0) {
					avatar = new ImageIcon("src/Grafico/Tristana.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Trundle")==0) {
					avatar = new ImageIcon("src/Grafico/Trundle.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Tryndamere")==0) {
					avatar = new ImageIcon("src/Grafico/Tryndamere.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Twisted Fate")==0) {
					avatar = new ImageIcon("src/Grafico/TwistedFate.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Twitch")==0) {
					avatar = new ImageIcon("src/Grafico/Twitch.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Udyr")==0) {
					avatar = new ImageIcon("src/Grafico/Udyr.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Urgot")==0) {
					avatar = new ImageIcon("src/Grafico/Urgot.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Varus")==0) {
					avatar = new ImageIcon("src/Grafico/Varus.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Vayne")==0) {
					avatar = new ImageIcon("src/Grafico/Vayne.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Veigar")==0) {
					avatar = new ImageIcon("src/Grafico/Veigar.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Vel'Koz")==0) {
					avatar = new ImageIcon("src/Grafico/VelKoz.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Vi")==0) {
					avatar = new ImageIcon("src/Grafico/Vi.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Viktor")==0) {
					avatar = new ImageIcon("src/Grafico/Viktor.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Vladimir")==0) {
					avatar = new ImageIcon("src/Grafico/Vladimir.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Volibear")==0) {
					avatar = new ImageIcon("src/Grafico/Volibear.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Warwick")==0) {
					avatar = new ImageIcon("src/Grafico/Warwick.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Wukong")==0) {
					avatar = new ImageIcon("src/Grafico/Wukong.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Xerath")==0) {
					avatar = new ImageIcon("src/Grafico/Xerath.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Xin Zhao")==0) {
					avatar = new ImageIcon("src/Grafico/XinZhao.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Yasuo")==0) {
					avatar = new ImageIcon("src/Grafico/Yasuo.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Yorick")==0) {
					avatar = new ImageIcon("src/Grafico/Yorick.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Zac")==0) {
					avatar = new ImageIcon("src/Grafico/Zac.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Zed")==0) {
					avatar = new ImageIcon("src/Grafico/Zed.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Ziggs")==0) {
					avatar = new ImageIcon("src/Grafico/Ziggs.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Zilean")==0) {
					avatar = new ImageIcon("src/Grafico/Zilean.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Zyra")==0) {
					avatar = new ImageIcon("src/Grafico/Zyra.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Ancient Golem")==0) {
					avatar = new ImageIcon("src/Grafico/AncientGolem.png");
					avatarChampion.setIcon(avatar);
				} else if (nome.compareTo("Elder Lizard")==0) {
					avatar = new ImageIcon("src/Grafico/ElderLizard.png");
					avatarChampion.setIcon(avatar);
				}
				
			} else if (event.getSource() == listaDeChampions2) {
				
				nome = listaDeChampions2.getSelectedItem().toString();
				
				if (nome.compareTo("CHAMPION")==0) {
					//DoNothing
				} else if (nome.compareTo("Aatrox")==0) {
					avatar = new ImageIcon("src/Grafico/Aatrox.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Ahri")==0) {
					avatar = new ImageIcon("src/Grafico/Ahri.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Akali")==0) {
					avatar = new ImageIcon("src/Grafico/Akali.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Alistar")==0) {
					avatar = new ImageIcon("src/Grafico/Alistar.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Amumu")==0) {
					avatar = new ImageIcon("src/Grafico/Amumu.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Anivia")==0) {
					avatar = new ImageIcon("src/Grafico/Anivia.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Annie")==0) {
					avatar = new ImageIcon("src/Grafico/Annie.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Ashe")==0) {
					avatar = new ImageIcon("src/Grafico/Ashe.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Blitzcrank")==0) {
					avatar = new ImageIcon("src/Grafico/Blitzcrank.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Brand")==0) {
					avatar = new ImageIcon("src/Grafico/Brand.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Braum")==0) {
					avatar = new ImageIcon("src/Grafico/Braum.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Caitlyn")==0) {
					avatar = new ImageIcon("src/Grafico/Caitlyn.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Cassiopeia")==0) {
					avatar = new ImageIcon("src/Grafico/Cassiopeia.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Cho'Gath")==0) {
					avatar = new ImageIcon("src/Grafico/ChoGath.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Corki")==0) {
					avatar = new ImageIcon("src/Grafico/Corki.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Darius")==0) {
					avatar = new ImageIcon("src/Grafico/Darius.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Diana")==0) {
					avatar = new ImageIcon("src/Grafico/Diana.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Dr.Mundo")==0) {
					avatar = new ImageIcon("src/Grafico/DrMundo.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Draven")==0) {
					avatar = new ImageIcon("src/Grafico/Draven.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Elise")==0) {
					avatar = new ImageIcon("src/Grafico/Elise.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Evelynn")==0) {
					avatar = new ImageIcon("src/Grafico/Evelynn.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Ezreal")==0) {
					avatar = new ImageIcon("src/Grafico/Ezreal.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Fiddlesticks")==0) {
					avatar = new ImageIcon("src/Grafico/Fiddlesticks.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Fiora")==0) {
					avatar = new ImageIcon("src/Grafico/Fiora.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Fizz")==0) {
					avatar = new ImageIcon("src/Grafico/Fizz.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Galio")==0) {
					avatar = new ImageIcon("src/Grafico/Galio.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Gangplank")==0) {
					avatar = new ImageIcon("src/Grafico/Gangplank.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Garen")==0) {
					avatar = new ImageIcon("src/Grafico/Garen.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Gragas")==0) {
					avatar = new ImageIcon("src/Grafico/Gragas.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Gnar Mini")==0) {
					avatar = new ImageIcon("src/Grafico/GnarMini.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Gnar Mega")==0) {
					avatar = new ImageIcon("src/Grafico/GnarMega.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Graves")==0) {
					avatar = new ImageIcon("src/Grafico/Graves.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Hecarim")==0) {
					avatar = new ImageIcon("src/Grafico/Hecarim.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Heimerdinger")==0) {
					avatar = new ImageIcon("src/Grafico/Heimerdinger.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Irelia")==0) {
					avatar = new ImageIcon("src/Grafico/Irelia.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Janna")==0) {
					avatar = new ImageIcon("src/Grafico/Janna.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Jarvan IV")==0) {
					avatar = new ImageIcon("src/Grafico/JarvanIV.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Jax")==0) {
					avatar = new ImageIcon("src/Grafico/Jax.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Jayce")==0) {
					avatar = new ImageIcon("src/Grafico/Jayce.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Jinx")==0) {
					avatar = new ImageIcon("src/Grafico/Jinx.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Karma")==0) {
					avatar = new ImageIcon("src/Grafico/Karma.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Karthus")==0) {
					avatar = new ImageIcon("src/Grafico/Karthus.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Kassadin")==0) {
					avatar = new ImageIcon("src/Grafico/Kassadin.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Katarina")==0) {
					avatar = new ImageIcon("src/Grafico/Katarina.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Kayle")==0) {
					avatar = new ImageIcon("src/Grafico/Kayle.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Kennen")==0) {
					avatar = new ImageIcon("src/Grafico/Kennen.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Kha'Zix")==0) {
					avatar = new ImageIcon("src/Grafico/KhaZix.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Kog'Maw")==0) {
					avatar = new ImageIcon("src/Grafico/KogMaw.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("LeBlanc")==0) {
					avatar = new ImageIcon("src/Grafico/LeBlanc.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Lee Sin")==0) {
					avatar = new ImageIcon("src/Grafico/LeeSin.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Leona")==0) {
					avatar = new ImageIcon("src/Grafico/Leona.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Lissandra")==0) {
					avatar = new ImageIcon("src/Grafico/Lissandra.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Lucian")==0) {
					avatar = new ImageIcon("src/Grafico/Lucian.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Lulu")==0) {
					avatar = new ImageIcon("src/Grafico/Lulu.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Lux")==0) {
					avatar = new ImageIcon("src/Grafico/Lux.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Malphite")==0) {
					avatar = new ImageIcon("src/Grafico/Malphite.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Malzahar")==0) {
					avatar = new ImageIcon("src/Grafico/Malzahar.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Maokai")==0) {
					avatar = new ImageIcon("src/Grafico/Maokai.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Master Yi")==0) {
					avatar = new ImageIcon("src/Grafico/MasterYi.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Miss Fortune")==0) {
					avatar = new ImageIcon("src/Grafico/MissFortune.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Mordekaiser")==0) {
					avatar = new ImageIcon("src/Grafico/Mordekaiser.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Morgana")==0) {
					avatar = new ImageIcon("src/Grafico/Morgana.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Nami")==0) {
					avatar = new ImageIcon("src/Grafico/Nami.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Nasus")==0) {
					avatar = new ImageIcon("src/Grafico/Nasus.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Nautilus")==0) {
					avatar = new ImageIcon("src/Grafico/Nautilus.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Nidalee")==0) {
					avatar = new ImageIcon("src/Grafico/Nidalee.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Nocturne")==0) {
					avatar = new ImageIcon("src/Grafico/Nocturne.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Nunu")==0) {
					avatar = new ImageIcon("src/Grafico/Nunu.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Olaf")==0) {
					avatar = new ImageIcon("src/Grafico/Olaf.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Orianna")==0) {
					avatar = new ImageIcon("src/Grafico/Orianna.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Pantheon")==0) {
					avatar = new ImageIcon("src/Grafico/Pantheon.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Poppy")==0) {
					avatar = new ImageIcon("src/Grafico/Poppy.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Quinn")==0) {
					avatar = new ImageIcon("src/Grafico/Quinn.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Rammus")==0) {
					avatar = new ImageIcon("src/Grafico/Rammus.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Renekton")==0) {
					avatar = new ImageIcon("src/Grafico/Renekton.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Rengar")==0) {
					avatar = new ImageIcon("src/Grafico/Rengar.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Riven")==0) {
					avatar = new ImageIcon("src/Grafico/Riven.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Rumble")==0) {
					avatar = new ImageIcon("src/Grafico/Rumble.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Ryze")==0) {
					avatar = new ImageIcon("src/Grafico/Ryze.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Sejuani")==0) {
					avatar = new ImageIcon("src/Grafico/Sejuani.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Shaco")==0) {
					avatar = new ImageIcon("src/Grafico/Shaco.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Shen")==0) {
					avatar = new ImageIcon("src/Grafico/Shen.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Shyvana")==0) {
					avatar = new ImageIcon("src/Grafico/Shyvana.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Singed")==0) {
					avatar = new ImageIcon("src/Grafico/Singed.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Sion")==0) {
					avatar = new ImageIcon("src/Grafico/Sion.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Sivir")==0) {
					avatar = new ImageIcon("src/Grafico/Sivir.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Skarner")==0) {
					avatar = new ImageIcon("src/Grafico/Skarner.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Sona")==0) {
					avatar = new ImageIcon("src/Grafico/Sona.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Soraka")==0) {
					avatar = new ImageIcon("src/Grafico/Soraka.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Swain")==0) {
					avatar = new ImageIcon("src/Grafico/Swain.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Syndra")==0) {
					avatar = new ImageIcon("src/Grafico/Syndra.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Talon")==0) {
					avatar = new ImageIcon("src/Grafico/Talon.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Taric")==0) {
					avatar = new ImageIcon("src/Grafico/Taric.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Teemo")==0) {
					avatar = new ImageIcon("src/Grafico/Teemo.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Thresh")==0) {
					avatar = new ImageIcon("src/Grafico/Thresh.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Tristana")==0) {
					avatar = new ImageIcon("src/Grafico/Tristana.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Trundle")==0) {
					avatar = new ImageIcon("src/Grafico/Trundle.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Tryndamere")==0) {
					avatar = new ImageIcon("src/Grafico/Tryndamere.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Twisted Fate")==0) {
					avatar = new ImageIcon("src/Grafico/TwistedFate.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Twitch")==0) {
					avatar = new ImageIcon("src/Grafico/Twitch.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Udyr")==0) {
					avatar = new ImageIcon("src/Grafico/Udyr.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Urgot")==0) {
					avatar = new ImageIcon("src/Grafico/Urgot.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Varus")==0) {
					avatar = new ImageIcon("src/Grafico/Varus.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Vayne")==0) {
					avatar = new ImageIcon("src/Grafico/Vayne.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Veigar")==0) {
					avatar = new ImageIcon("src/Grafico/Veigar.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Vel'Koz")==0) {
					avatar = new ImageIcon("src/Grafico/VelKoz.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Vi")==0) {
					avatar = new ImageIcon("src/Grafico/Vi.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Viktor")==0) {
					avatar = new ImageIcon("src/Grafico/Viktor.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Vladimir")==0) {
					avatar = new ImageIcon("src/Grafico/Vladimir.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Volibear")==0) {
					avatar = new ImageIcon("src/Grafico/Volibear.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Warwick")==0) {
					avatar = new ImageIcon("src/Grafico/Warwick.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Wukong")==0) {
					avatar = new ImageIcon("src/Grafico/Wukong.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Xerath")==0) {
					avatar = new ImageIcon("src/Grafico/Xerath.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Xin Zhao")==0) {
					avatar = new ImageIcon("src/Grafico/XinZhao.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Yasuo")==0) {
					avatar = new ImageIcon("src/Grafico/Yasuo.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Yorick")==0) {
					avatar = new ImageIcon("src/Grafico/Yorick.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Zac")==0) {
					avatar = new ImageIcon("src/Grafico/Zac.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Zed")==0) {
					avatar = new ImageIcon("src/Grafico/Zed.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Ziggs")==0) {
					avatar = new ImageIcon("src/Grafico/Ziggs.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Zilean")==0) {
					avatar = new ImageIcon("src/Grafico/Zilean.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Zyra")==0) {
					avatar = new ImageIcon("src/Grafico/Zyra.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Ancient Golem")==0) {
					avatar = new ImageIcon("src/Grafico/AncientGolem.png");
					avatarChampion2.setIcon(avatar);
				} else if (nome.compareTo("Elder Lizard")==0) {
					avatar = new ImageIcon("src/Grafico/ElderLizard.png");
					avatarChampion2.setIcon(avatar);
				}
					
			}
			
		}
		
	}

}
