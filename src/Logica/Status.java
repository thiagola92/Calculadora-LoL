package Logica;

/*
 * Ajeitar para que só precise chamar o setattackspeedbase e ele já
 * chame o setattackspeed.
 */

public class Status {
	
	static public Champion findChampion(String name) {
		Champion p = new Champion();
		
		if (name.compareTo("Aatrox") == 0)
			aatrox(p);
		else if (name.compareTo("Ahri") == 0)
			ahri(p);
		else if (name.compareTo("Akali") == 0)
			akali(p);
		else if (name.compareTo("Alistar") == 0)
			alistar(p);
		else if (name.compareTo("Amumu") == 0)
			amumu(p);
		else if (name.compareTo("Anivia") == 0)
			anivia(p);
		else if (name.compareTo("Annie") == 0)
			annie(p);
		else if (name.compareTo("Ashe") == 0)
			ashe(p);
		else if (name.compareTo("Blitzcrank") == 0)
			blitzcrank(p);
		else if (name.compareTo("Brand") == 0)
			brand(p);
		else if (name.compareTo("Braum") == 0)
			braum(p);
		else if (name.compareTo("Caitlyn") == 0)
			caitlyn(p);
		else if (name.compareTo("Cassiopeia") == 0)
			cassiopeia(p);
		else if (name.compareTo("Cho'Gath") == 0)
			chogath(p);
		else if (name.compareTo("Corki") == 0)
			corki(p);
		else if (name.compareTo("Darius") == 0)
			darius(p);
		else if (name.compareTo("Diana") == 0)
			diana(p);
		else if (name.compareTo("Dr. Mundo") == 0)
			drmundo(p);
		else if (name.compareTo("Draven") == 0)
			draven(p);
		else if (name.compareTo("Elise") == 0)
			elise(p);
		else if (name.compareTo("Evelynn") == 0)
			evelynn(p);
		else if (name.compareTo("Ezreal") == 0)
			ezreal(p);
		else if (name.compareTo("Fiddlesticks") == 0)
			fiddlesticks(p);
		else if (name.compareTo("Fiora") == 0)
			fiora(p);
		else if (name.compareTo("Fizz") == 0)
			fizz(p);
		else if (name.compareTo("Galio") == 0)
			galio(p);
		else if (name.compareTo("Gangplank") == 0)
			gangplank(p);
		else if (name.compareTo("Garen") == 0)
			garen(p);
		else if (name.compareTo("Gragas") == 0)
			gragas(p);
		else if (name.compareTo("Gnar Mini") == 0)
			minignar(p);
		else if (name.compareTo("Gnar Mega") == 0)
			megagnar(p);
		else if (name.compareTo("Graves") == 0)
			graves(p);
		else if (name.compareTo("Hecarim") == 0)
			hecarim(p);
		else if (name.compareTo("Heimerdinger") == 0)
			heimerdinger(p);
		else if (name.compareTo("Irelia") == 0)
			irelia(p);
		else if (name.compareTo("Janna") == 0)
			janna(p);
		else if (name.compareTo("Jarvan IV") == 0)
			jarvaniv(p);
		else if (name.compareTo("Jax") == 0)
			jax(p);
		else if (name.compareTo("Jayce") == 0)
			jayce(p);
		else if (name.compareTo("Jinx") == 0)
			jinx(p);
		else if (name.compareTo("Karma") == 0)
			karma(p);
		else if (name.compareTo("Karthus") == 0)
			karthus(p);
		else if (name.compareTo("Kassadin") == 0)
			kassadin(p);
		else if (name.compareTo("Katarina") == 0)
			katarina(p);
		else if (name.compareTo("Kayle") == 0)
			kayle(p);
		else if (name.compareTo("Kennen") == 0)
			kennen(p);
		else if (name.compareTo("Kha'Zix") == 0)
			khazix(p);
		else if (name.compareTo("Kog'Maw") == 0)
			kogmaw(p);
		else if (name.compareTo("LeBlanc") == 0)
			leblanc(p);
		else if (name.compareTo("Lee Sin") == 0)
			leesin(p);
		else if (name.compareTo("Leona") == 0)
			leona(p);
		else if (name.compareTo("Lissandra") == 0)
			lissandra(p);
		else if (name.compareTo("Lucian") == 0)
			lucian(p);
		else if (name.compareTo("Lulu") == 0)
			lulu(p);
		else if (name.compareTo("Lux") == 0)
			lux(p);
		else if (name.compareTo("Malphite") == 0)
			malphite(p);
		else if (name.compareTo("Malzahar") == 0)
			malzahar(p);
		else if (name.compareTo("Maokai") == 0)
			maokai(p);
		else if (name.compareTo("Master Yi") == 0)
			masteryi(p);
		else if (name.compareTo("Miss Fortune") == 0)
			missfortune(p);
		else if (name.compareTo("Morderkaiser") == 0)
			morderkaiser(p);
		else if (name.compareTo("Morgana") == 0)
			morgana(p);
		else if (name.compareTo("Nami") == 0)
			nami(p);
		else if (name.compareTo("Nasus") == 0)
			nasus(p);
		else if (name.compareTo("Nautilus") == 0)
			nautilus(p);
		else if (name.compareTo("Nidalee") == 0)
			nidalee(p);
		else if (name.compareTo("Nocturne") == 0)
			nocturne(p);
		else if (name.compareTo("Nunu") == 0)
			nunu(p);
		else if (name.compareTo("Olaf") == 0)
			olaf(p);
		else if (name.compareTo("Orianna") == 0)
			orianna(p);
		else if (name.compareTo("Pantheon") == 0)
			pantheon(p);
		else if (name.compareTo("Poppy") == 0)
			poppy(p);
		else if (name.compareTo("Quinn") == 0)
			quinn(p);
		else if (name.compareTo("Rammus") == 0)
			rammus(p);
		else if (name.compareTo("Renekton") == 0)
			renekton(p);
		else if (name.compareTo("Rengar") == 0)
			rengar(p);
		else if (name.compareTo("Riven") == 0)
			riven(p);
		else if (name.compareTo("Rumble") == 0)
			rumble(p);
		else if (name.compareTo("Ryze") == 0)
			ryze(p);
		else if (name.compareTo("Sejuani") == 0)
			sejuani(p);
		else if (name.compareTo("Shaco") == 0)
			shaco(p);
		else if (name.compareTo("shen") == 0)
			shen(p);
		else if (name.compareTo("Shyvana") == 0)
			shyvana(p);
		else if (name.compareTo("Singed") == 0)
			singed(p);
		else if (name.compareTo("Sion") == 0)
			sion(p);
		else if (name.compareTo("Sivir") == 0)
			sivir(p);
		else if (name.compareTo("Skarner") == 0)
			skarner(p);
		else if (name.compareTo("Sona") == 0)
			sona(p);
		else if (name.compareTo("Soraka") == 0)
			soraka(p);
		else if (name.compareTo("Swain") == 0)
			swain(p);
		else if (name.compareTo("Syndra") == 0)
			syndra(p);
		else if (name.compareTo("Talon") == 0)
			talon(p);
		else if (name.compareTo("Taric") == 0)
			taric(p);
		else if (name.compareTo("Teemo") == 0)
			teemo(p);
		else if (name.compareTo("Thresh") == 0)
			thresh(p);
		else if (name.compareTo("Tristana") == 0)
			tristana(p);
		else if (name.compareTo("Trundle") == 0)
			trundle(p);
		else if (name.compareTo("Tryndamere") == 0)
			tryndamere(p);
		else if (name.compareTo("Twisted Fate") == 0)
			twistedfate(p);
		else if (name.compareTo("Twitch") == 0)
			twitch(p);
		else if (name.compareTo("Udyr") == 0)
			udyr(p);
		else if (name.compareTo("Urgot") == 0)
			urgot(p);
		else if (name.compareTo("Varus") == 0)
			varus(p);
		else if (name.compareTo("Vayne") == 0)
			vayne(p);
		else if (name.compareTo("Veigar") == 0)
			veigar(p);
		else if (name.compareTo("Vel'Koz") == 0)
			velkoz(p);
		else if (name.compareTo("Vi") == 0)
			vi(p);
		else if (name.compareTo("Viktor") == 0)
			viktor(p);
		else if (name.compareTo("Vladimir") == 0)
			vladimir(p);
		else if (name.compareTo("Volibear") == 0)
			volibear(p);
		else if (name.compareTo("Warwick") == 0)
			warwick(p);
		else if (name.compareTo("Wukong") == 0)
			wukong(p);
		else if (name.compareTo("Xerath") == 0)
			xerath(p);
		else if (name.compareTo("Xin Zhao") == 0)
			xinzhao(p);
		else if (name.compareTo("Yasuo") == 0)
			yasuo(p);
		else if (name.compareTo("Yorick") == 0)
			yorick(p);
		else if (name.compareTo("Zac") == 0)
			zac(p);
		else if (name.compareTo("Zed") == 0)
			zed(p);
		else if (name.compareTo("Ziggs") == 0)
			ziggs(p);
		else if (name.compareTo("Zilean") == 0)
			zilean(p);
		else if (name.compareTo("Zyra") == 0)
			zyra(p);
		else if (name.compareTo("Ancient Golem") == 0)
			ancientgolem(p);
		else if (name.compareTo("Elder Lizard") == 0)
			elderlizard(p);
		
		/*
		 * CONTINUAR UM DIA
		 */
		
		return p;
	}

	static public void aatrox(Champion p1) {
		p1.setName("Aatrox");
		
		// 4.15
		p1.setHealth(395);
		p1.setHealthRegen(5.75);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(150);
		p1.setAttackDamage(55);
		p1.setBaseAttackSpeed(0.651);
		p1.setArmor(18);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(85);
		p1.setHealthRegenLvl(0.5);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3);
		p1.setArmorLvl(3.8);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void ahri(Champion p1) {
		p1.setName("Ahri");
		
		// 4.15
		p1.setHealth(380);
		p1.setHealthRegen(5.5);
		p1.setMana(250);
		p1.setManaRegen(7);
		p1.setRange(550);
		p1.setAttackDamage(50);
		p1.setBaseAttackSpeed(0.668);
		p1.setArmor(15);
		p1.setMagicResist(30);
		p1.setMovSpeed(330);
		
		p1.setHealthLvl(80);
		p1.setHealthRegenLvl(0.6);
		p1.setManaLvl(50);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void akali(Champion p1) {
		p1.setName("Akali");
		
		// 4.15
		p1.setHealth(445);
		p1.setHealthRegen(7.25);
		p1.setMana(200);
		p1.setManaRegen(50);
		p1.setRange(125);
		p1.setAttackDamage(53);
		p1.setBaseAttackSpeed(0.694);
		p1.setArmor(20.5);
		p1.setMagicResist(30);
		p1.setMovSpeed(350);
		
		p1.setHealthLvl(85);
		p1.setHealthRegenLvl(0.65);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.1);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void alistar(Champion p1) {
		p1.setName("Alistar");
		
		// 4.15
		p1.setHealth(442);
		p1.setHealthRegen(7.25);
		p1.setMana(215);
		p1.setManaRegen(6.45);
		p1.setRange(125);
		p1.setAttackDamage(55.03);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(18.5);
		p1.setMagicResist(30);
		p1.setMovSpeed(330);
		
		p1.setHealthLvl(102);
		p1.setHealthRegenLvl(0.85);
		p1.setManaLvl(38);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(3.62);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.125);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void amumu(Champion p1) {
		p1.setName("Amumu");
		
		// 4.15
		p1.setHealth(472);
		p1.setHealthRegen(7.45);
		p1.setMana(220);
		p1.setManaRegen(6.5);
		p1.setRange(125);
		p1.setAttackDamage(47);
		p1.setBaseAttackSpeed(0.638);
		p1.setArmor(22);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(84);
		p1.setHealthRegenLvl(0.85);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.525);
		p1.setAttackDamageLvl(3.8);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.18);
		p1.setArmorLvl(3.3);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void anivia(Champion p1) {
		p1.setName("Anivia");
		
		// 4.15
		p1.setHealth(350);
		p1.setHealthRegen(4.65);
		p1.setMana(257);
		p1.setManaRegen(7);
		p1.setRange(600);
		p1.setAttackDamage(48);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(14.5);
		p1.setMagicResist(30);
		p1.setMovSpeed(325);
		
		p1.setHealthLvl(70);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(53);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(3.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.68);
		p1.setArmorLvl(4);
		p1.setMagicResistLvl(0);
	}
	
	static public void annie(Champion p1) {
		p1.setName("Annie");
		
		// 4.15
		p1.setHealth(384);
		p1.setHealthRegen(4.5);
		p1.setMana(250);
		p1.setManaRegen(6.9);
		p1.setRange(625);
		p1.setAttackDamage(48);
		p1.setBaseAttackSpeed(0.579);
		p1.setArmor(12.5);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(76);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(50);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(2.625);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.36);
		p1.setArmorLvl(4);
		p1.setMagicResistLvl(0);
	}
	
	static public void ashe(Champion p1) {
		p1.setName("Ashe");
		
		// 4.15
		p1.setHealth(395);
		p1.setHealthRegen(4.5);
		p1.setMana(173);
		p1.setManaRegen(6.3);
		p1.setRange(600);
		p1.setAttackDamage(46.3);
		p1.setBaseAttackSpeed(0.658);
		p1.setArmor(15.5);
		p1.setMagicResist(30);
		p1.setMovSpeed(325);
		
		p1.setHealthLvl(79);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(35);
		p1.setManaRegenLvl(0.4);
		p1.setAttackDamageLvl(2.85);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*4);
		p1.setArmorLvl(3.4);
		p1.setMagicResistLvl(0);
	}
	
	static public void blitzcrank(Champion p1) {
		p1.setName("Blitzcrank");
		
		// 4.15
		p1.setHealth(423);
		p1.setHealthRegen(7.25);
		p1.setMana(200);
		p1.setManaRegen(6.6);
		p1.setRange(125);
		p1.setAttackDamage(55.66);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(18.5);
		p1.setMagicResist(30);
		p1.setMovSpeed(325);
		
		p1.setHealthLvl(95);
		p1.setHealthRegenLvl(0.75);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.5);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.13);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void brand(Champion p1) {
		p1.setName("Brand");
		
		// 4.15
		p1.setHealth(380);
		p1.setHealthRegen(4.5);
		p1.setMana(250);
		p1.setManaRegen(7);
		p1.setRange(550);
		p1.setAttackDamage(52);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(16);
		p1.setMagicResist(30);
		p1.setMovSpeed(340);
		
		p1.setHealthLvl(76);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(45);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.36);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void braum(Champion p1) {
		p1.setName("Braum");
		
		// 4.15
		p1.setHealth(430);
		p1.setHealthRegen(6.5);
		p1.setMana(235);
		p1.setManaRegen(5.5);
		p1.setRange(125);
		p1.setAttackDamage(50);
		p1.setAttackSpeed(0.644);
		p1.setBaseAttackSpeed(0.644);
		p1.setArmor(20);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(87);
		p1.setHealthRegenLvl(1);
		p1.setManaLvl(45);
		p1.setManaRegenLvl(0.8);
		p1.setAttackDamageLvl(3.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.25);
		p1.setArmorLvl(4);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void caitlyn(Champion p1) {
		p1.setName("Caitlyn");
		
		// 4.15
		p1.setHealth(390);
		p1.setHealthRegen(4.75);
		p1.setMana(255);
		p1.setManaRegen(6.5);
		p1.setRange(650);
		p1.setAttackDamage(47);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(17);
		p1.setMagicResist(30);
		p1.setMovSpeed(325);
		
		p1.setHealthLvl(80);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(35);
		p1.setManaRegenLvl(0.55);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*4);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void cassiopeia(Champion p1) {
		p1.setName("Cassiopeia");
		
		// 4.15
		p1.setHealth(380);
		p1.setHealthRegen(4.85);
		p1.setMana(250);
		p1.setManaRegen(7.1);
		p1.setRange(550);
		p1.setAttackDamage(47);
		p1.setAttackSpeed(0.647);
		p1.setBaseAttackSpeed(0.647);
		p1.setArmor(15.5);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(75);
		p1.setHealthRegenLvl(0.5);
		p1.setManaLvl(50);
		p1.setManaRegenLvl(0.75);
		p1.setAttackDamageLvl(3.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.68);
		p1.setArmorLvl(4);
		p1.setMagicResistLvl(0);
	}
	
	static public void chogath(Champion p1) {
		p1.setName("Cho'Gath");
		
		// 4.15
		p1.setHealth(440);
		p1.setHealthRegen(7.5);
		p1.setMana(205);
		p1.setManaRegen(6.45);
		p1.setRange(125);
		p1.setAttackDamage(54.1);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(23);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(80);
		p1.setHealthRegenLvl(0.85);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(4.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.44);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void corki(Champion p1) {
		p1.setName("Corki");
		
		// 4.15
		p1.setHealth(375);
		p1.setHealthRegen(4.5);
		p1.setMana(243);
		p1.setManaRegen(6.5);
		p1.setRange(550);
		p1.setAttackDamage(48.2);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(17.5);
		p1.setMagicResist(30);
		p1.setMovSpeed(325);
		
		p1.setHealthLvl(82);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(37);
		p1.setManaRegenLvl(0.55);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.35);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void darius(Champion p1) {
		p1.setName("Darius");
		
		// 4.15
		p1.setHealth(426);
		p1.setHealthRegen(8.25);
		p1.setMana(200);
		p1.setManaRegen(6);
		p1.setRange(125);
		p1.setAttackDamage(50);
		p1.setAttackSpeed(0.679);
		p1.setBaseAttackSpeed(0.679);
		p1.setArmor(24);
		p1.setMagicResist(30);
		p1.setMovSpeed(340);
		
		p1.setHealthLvl(93);
		p1.setHealthRegenLvl(0.95);
		p1.setManaLvl(37.5);
		p1.setManaRegenLvl(0.35);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.65);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void diana(Champion p1) {
		p1.setName("Diana");
		
		// 4.15
		p1.setHealth(438);
		p1.setHealthRegen(6);
		p1.setMana(230);
		p1.setManaRegen(7);
		p1.setRange(150);
		p1.setAttackDamage(48);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(20);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(90);
		p1.setHealthRegenLvl(0.85);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.25);
		p1.setArmorLvl(3.6);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void drmundo(Champion p1) {
		p1.setName("Dr. Mundo");
		
		// 4.15
		p1.setHealth(433);
		p1.setHealthRegen(6.5);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(125);
		p1.setAttackDamage(56.23);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(21);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(89);
		p1.setHealthRegenLvl(0.75);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.8);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void draven(Champion p1) {
		p1.setName("Draven");
		
		// 4.15
		p1.setHealth(420);
		p1.setHealthRegen(5);
		p1.setMana(240);
		p1.setManaRegen(6.95);
		p1.setRange(550);
		p1.setAttackDamage(46.5);
		p1.setAttackSpeed(0.679);
		p1.setBaseAttackSpeed(0.679);
		p1.setArmor(20);
		p1.setMagicResist(30);
		p1.setMovSpeed(330);
		
		p1.setHealthLvl(82);
		p1.setHealthRegenLvl(0.7);
		p1.setManaLvl(42);
		p1.setManaRegenLvl(0.65);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.7);
		p1.setArmorLvl(3.3);
		p1.setMagicResistLvl(0);
	}
	
	static public void elise(Champion p1) {
		p1.setName("Elise");
		
		// 4.15
		p1.setHealth(395);
		p1.setHealthRegen(4.7);
		p1.setMana(240);
		p1.setManaRegen(6.8);
		p1.setRange(550);
		p1.setAttackDamage(47.5);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(16.5);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(80);
		p1.setHealthRegenLvl(0.6);
		p1.setManaLvl(50);
		p1.setManaRegenLvl(0.65);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.75);
		p1.setArmorLvl(3.35);
		p1.setMagicResistLvl(0);
	}
	
	static public void evelynn(Champion p1) {
		p1.setName("Evelynn");
		
		// 4.15
		p1.setHealth(380);
		p1.setHealthRegen(8.9);
		p1.setMana(190);
		p1.setManaRegen(7.1);
		p1.setRange(125);
		p1.setAttackDamage(48);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(16);
		p1.setMagicResist(30);
		p1.setMovSpeed(340);
		
		p1.setHealthLvl(90);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(45);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.6);
		p1.setArmorLvl(4);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void ezreal(Champion p1) {
		p1.setName("Ezreal");
		
		// 4.15
		p1.setHealth(350);
		p1.setHealthRegen(5.5);
		p1.setMana(235);
		p1.setManaRegen(7);
		p1.setRange(550);
		p1.setAttackDamage(47.2);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(16);
		p1.setMagicResist(30);
		p1.setMovSpeed(325);
		
		p1.setHealthLvl(80);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(45);
		p1.setManaRegenLvl(0.65);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.8);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void fiddlesticks(Champion p1) {
		p1.setName("Fiddlesticks");
		
		// 4.15
		p1.setHealth(390);
		p1.setHealthRegen(4.6);
		p1.setMana(251);
		p1.setManaRegen(6.9);
		p1.setRange(480);
		p1.setAttackDamage(45.95);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(15);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(80);
		p1.setHealthRegenLvl(0.6);
		p1.setManaLvl(59);
		p1.setManaRegenLvl(0.65);
		p1.setAttackDamageLvl(2.625);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.11);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void fiora(Champion p1) {
		p1.setName("Fiora");
		
		// 4.15
		p1.setHealth(450);
		p1.setHealthRegen(5.5);
		p1.setMana(220);
		p1.setManaRegen(6.75);
		p1.setRange(125);
		p1.setAttackDamage(54.5);
		p1.setAttackSpeed(0.672);
		p1.setBaseAttackSpeed(0.672);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(350);
		
		p1.setHealthLvl(85);
		p1.setHealthRegenLvl(0.8);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.5);
		p1.setAttackDamageLvl(3.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void fizz(Champion p1) {
		p1.setName("Fizz");
		
		// 4.15
		p1.setHealth(414);
		p1.setHealthRegen(7);
		p1.setMana(200);
		p1.setManaRegen(6.1);
		p1.setRange(175);
		p1.setAttackDamage(53);
		p1.setAttackSpeed(0.658);
		p1.setBaseAttackSpeed(0.658);
		p1.setArmor(16.7);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(86);
		p1.setHealthRegenLvl(0.7);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.1);
		p1.setArmorLvl(3.4);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void galio(Champion p1) {
		p1.setName("Galio");
		
		// 4.15
		p1.setHealth(435);
		p1.setHealthRegen(7.45);
		p1.setMana(235);
		p1.setManaRegen(7);
		p1.setRange(125);
		p1.setAttackDamage(56.3);
		p1.setAttackSpeed(0.638);
		p1.setBaseAttackSpeed(0.638);
		p1.setArmor(21);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(85);
		p1.setHealthRegenLvl(0.75);
		p1.setManaLvl(50);
		p1.setManaRegenLvl(0.7);
		p1.setAttackDamageLvl(3.375);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.2);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void gangplank(Champion p1) {
		p1.setName("Gangplank");
		
		// 4.15
		p1.setHealth(495);
		p1.setHealthRegen(4.25);
		p1.setMana(215);
		p1.setManaRegen(6.5);
		p1.setRange(125);
		p1.setAttackDamage(54);
		p1.setAttackSpeed(0.651);
		p1.setBaseAttackSpeed(0.651);
		p1.setArmor(20.5);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(81);
		p1.setHealthRegenLvl(0.75);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.7);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.75);
		p1.setArmorLvl(3.3);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void garen(Champion p1) {
		p1.setName("Garen");
		
		// 4.15
		p1.setHealth(455);
		p1.setHealthRegen(7);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(125);
		p1.setAttackDamage(52);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(23);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(96);
		p1.setHealthRegenLvl(0.5);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.9);
		p1.setArmorLvl(2.7);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void gragas(Champion p1) {
		p1.setName("Gragas");
		
		// 4.15
		p1.setHealth(434);
		p1.setHealthRegen(7.25);
		p1.setMana(221);
		p1.setManaRegen(6.45);
		p1.setRange(125);
		p1.setAttackDamage(55.5);
		p1.setAttackSpeed(0.651);
		p1.setBaseAttackSpeed(0.651);
		p1.setArmor(20);
		p1.setMagicResist(30);
		p1.setMovSpeed(330);
		
		p1.setHealthLvl(89);
		p1.setHealthRegenLvl(0.85);
		p1.setManaLvl(47);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.05);
		p1.setArmorLvl(3.6);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void minignar(Champion p1) {
		p1.setName("Mini Gnar");
		
		// 4.15
		p1.setHealth(430);
		p1.setHealthRegen(5);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(395);
		p1.setAttackDamage(45);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(65);
		p1.setHealthRegenLvl(0.5);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*5.5);
		p1.setArmorLvl(2.5);
		p1.setMagicResistLvl(0);
		p1.setMovSpeedLvl(0.8333);
		p1.setRangeLvl(5);
	}
	
	static public void megagnar(Champion p1) {
		p1.setName("Mega Gnar");
		
		// 4.15
		p1.setHealth(460);
		p1.setHealthRegen(5);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(150);
		p1.setAttackDamage(45);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(325);
		
		p1.setHealthLvl(105);
		p1.setHealthRegenLvl(2.5);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*0.5);
		p1.setArmorLvl(5.5);
		p1.setMagicResistLvl(2);
	}
	
	static public void graves(Champion p1) {
		p1.setName("Graves");
		
		// 4.15
		p1.setHealth(410);
		p1.setHealthRegen(5.5);
		p1.setMana(255);
		p1.setManaRegen(6.75);
		p1.setRange(525);
		p1.setAttackDamage(51);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(330);
		
		p1.setHealthLvl(84);
		p1.setHealthRegenLvl(0.7);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.7);
		p1.setAttackDamageLvl(3.1);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.9);
		p1.setArmorLvl(3.2);
		p1.setMagicResistLvl(0);
	}
	
	static public void hecarim(Champion p1) {
		p1.setName("Hecarim");
		
		// 4.15
		p1.setHealth(440);
		p1.setHealthRegen(8);
		p1.setMana(210);
		p1.setManaRegen(6.5);
		p1.setRange(175);
		p1.setAttackDamage(56);
		p1.setAttackSpeed(0.67);
		p1.setBaseAttackSpeed(0.67);
		p1.setArmor(20);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(95);
		p1.setHealthRegenLvl(0.75);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(3.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.5);
		p1.setArmorLvl(4);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void heimerdinger(Champion p1) {
		p1.setName("Heimerdinger");
		
		// 4.15
		p1.setHealth(350);
		p1.setHealthRegen(0);
		p1.setMana(240);
		p1.setManaRegen(6);
		p1.setRange(550);
		p1.setAttackDamage(53);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(14);
		p1.setMagicResist(30);
		p1.setMovSpeed(340);
		
		p1.setHealthLvl(75);
		p1.setHealthRegenLvl(0.6);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(2.7);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.36);
		p1.setArmorLvl(3);
		p1.setMagicResistLvl(0);
	}
	
	static public void irelia(Champion p1) {
		p1.setName("Irelia");
		
		// 4.15
		p1.setHealth(456);
		p1.setHealthRegen(7.5);
		p1.setMana(230);
		p1.setManaRegen(7);
		p1.setRange(125);
		p1.setAttackDamage(56);
		p1.setAttackSpeed(0.665);
		p1.setBaseAttackSpeed(0.665);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(90);
		p1.setHealthRegenLvl(0.65);
		p1.setManaLvl(35);
		p1.setManaRegenLvl(0.65);
		p1.setAttackDamageLvl(3.3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.2);
		p1.setArmorLvl(3.75);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void janna(Champion p1) {
		p1.setName("Janna");
		
		// 4.15
		p1.setHealth(356);
		p1.setHealthRegen(4.5);
		p1.setMana(302);
		p1.setManaRegen(6.9);
		p1.setRange(475);
		p1.setAttackDamage(49);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(13);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(78);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(64);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(2.95);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.61);
		p1.setArmorLvl(3.8);
		p1.setMagicResistLvl(0);
	}
	
	static public void jarvaniv(Champion p1) {
		p1.setName("Jarvan IV");
		
		// 4.15
		p1.setHealth(420);
		p1.setHealthRegen(7);
		p1.setMana(235);
		p1.setManaRegen(6);
		p1.setRange(175);
		p1.setAttackDamage(50);
		p1.setAttackSpeed(0.658);
		p1.setBaseAttackSpeed(0.658);
		p1.setArmor(18);
		p1.setMagicResist(30);
		p1.setMovSpeed(340);
		
		p1.setHealthLvl(90);
		p1.setHealthRegenLvl(0.7);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(3.4);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.5);
		p1.setArmorLvl(3.6);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void jax(Champion p1) {
		p1.setName("Jax");
		
		// 4.15
		p1.setHealth(450);
		p1.setHealthRegen(7.45);
		p1.setMana(230);
		p1.setManaRegen(6.4);
		p1.setRange(125);
		p1.setAttackDamage(56.3);
		p1.setAttackSpeed(0.638);
		p1.setBaseAttackSpeed(0.638);
		p1.setArmor(22);
		p1.setMagicResist(30);
		p1.setMovSpeed(350);
		
		p1.setHealthLvl(85);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(35);
		p1.setManaRegenLvl(0.7);
		p1.setAttackDamageLvl(3.375);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.4);
		p1.setArmorLvl(3);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void jayce(Champion p1) {
		p1.setName("Jayce");
		
		// 4.15
		p1.setHealth(420);
		p1.setHealthRegen(6);
		p1.setMana(240);
		p1.setManaRegen(7);
		p1.setRange(175);
		p1.setAttackDamage(46.5);
		p1.setAttackSpeed(0.658);
		p1.setBaseAttackSpeed(0.658);
		p1.setArmor(16.5);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(90);
		p1.setHealthRegenLvl(0.8);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.7);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void jinx(Champion p1) {
		p1.setName("Jinx");
		
		// 4.15
		p1.setHealth(380);
		p1.setHealthRegen(5);
		p1.setMana(170);
		p1.setManaRegen(5);
		p1.setRange(525);
		p1.setAttackDamage(50);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(17);
		p1.setMagicResist(30);
		p1.setMovSpeed(325);
		
		p1.setHealthLvl(82);
		p1.setHealthRegenLvl(0.5);
		p1.setManaLvl(45);
		p1.setManaRegenLvl(1);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void karma(Champion p1) {
		p1.setName("Karma");
		
		// 4.15
		p1.setHealth(383);
		p1.setHealthRegen(4.7);
		p1.setMana(290);
		p1.setManaRegen(6.8);
		p1.setRange(525);
		p1.setAttackDamage(50);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(14);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(83);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(50);
		p1.setManaRegenLvl(0.65);
		p1.setAttackDamageLvl(3.3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.3);
		p1.setArmorLvl(3.8);
		p1.setMagicResistLvl(0);
	}
	
	static public void karthus(Champion p1) {
		p1.setName("Karthus");
		
		// 4.15
		p1.setHealth(390);
		p1.setHealthRegen(5.5);
		p1.setMana(270);
		p1.setManaRegen(6.5);
		p1.setRange(450);
		p1.setAttackDamage(42.2);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(15);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(75);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(61);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(3.25);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.11);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void kassadin(Champion p1) {
		p1.setName("Kassadin");
		
		// 4.15
		p1.setHealth(433);
		p1.setHealthRegen(6.95);
		p1.setMana(230);
		p1.setManaRegen(6.9);
		p1.setRange(150);
		p1.setAttackDamage(52.3);
		p1.setAttackSpeed(0.64);
		p1.setBaseAttackSpeed(0.64);
		p1.setArmor(18);
		p1.setMagicResist(30);
		p1.setMovSpeed(340);
		
		p1.setHealthLvl(78);
		p1.setHealthRegenLvl(0.5);
		p1.setManaLvl(70);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(3.9);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.7);
		p1.setArmorLvl(3.2);
		p1.setMagicResistLvl(0);
	}
	
	static public void katarina(Champion p1) {
		p1.setName("Katarina");
		
		// 4.15
		p1.setHealth(425);
		p1.setHealthRegen(6.95);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(125);
		p1.setAttackDamage(53);
		p1.setAttackSpeed(0.658);
		p1.setBaseAttackSpeed(0.658);
		p1.setArmor(21);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(80);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.74);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void kayle(Champion p1) {
		p1.setName("Kayle");
		
		// 4.15
		p1.setHealth(418);
		p1.setHealthRegen(7);
		p1.setMana(255);
		p1.setManaRegen(6.9);
		p1.setRange(125);
		p1.setAttackDamage(53.3);
		p1.setBaseAttackSpeed(0.638);
		p1.setArmor(21);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(93);
		p1.setHealthRegenLvl(0.75);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.525);
		p1.setAttackDamageLvl(2.8);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.5);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void kennen(Champion p1) {
		p1.setName("Kennen");
		
		// 4.15
		p1.setHealth(403);
		p1.setHealthRegen(4.5);
		p1.setMana(200);
		p1.setManaRegen(50);
		p1.setRange(550);
		p1.setAttackDamage(47);
		p1.setAttackSpeed(0.69);
		p1.setBaseAttackSpeed(0.69);
		p1.setArmor(18);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(79);
		p1.setHealthRegenLvl(0.65);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3.3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.4);
		p1.setArmorLvl(3.75);
		p1.setMagicResistLvl(0);
	}
	
	static public void khazix(Champion p1) {
		p1.setName("Kha'Zix");
		
		// 4.15
		p1.setHealth(430);
		p1.setHealthRegen(6.25);
		p1.setMana(260);
		p1.setManaRegen(6.75);
		p1.setRange(125);
		p1.setAttackDamage(50);
		p1.setAttackSpeed(0.668);
		p1.setBaseAttackSpeed(0.668);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(350);
		
		p1.setHealthLvl(85);
		p1.setHealthRegenLvl(0.75);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.5);
		p1.setAttackDamageLvl(3.1);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.7);
		p1.setArmorLvl(3);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void kogmaw(Champion p1) {
		p1.setName("Kog'Maw");
		
		// 4.15
		p1.setHealth(400);
		p1.setHealthRegen(5);
		p1.setMana(255);
		p1.setManaRegen(7.5);
		p1.setRange(500);
		p1.setAttackDamage(46);
		p1.setAttackSpeed(0.665);
		p1.setBaseAttackSpeed(0.665);
		p1.setArmor(14);
		p1.setMagicResist(30);
		p1.setMovSpeed(325);
		
		p1.setHealthLvl(87);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.7);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.65);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void leblanc(Champion p1) {
		p1.setName("LeBlanc");
		
		// 4.15
		p1.setHealth(390);
		p1.setHealthRegen(6.5);
		p1.setMana(250);
		p1.setManaRegen(6.9);
		p1.setRange(525);
		p1.setAttackDamage(51);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(16);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(75);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(50);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.4);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void leesin(Champion p1) {
		p1.setName("Lee Sin");
		
		// 4.15
		p1.setHealth(428);
		p1.setHealthRegen(8.95);
		p1.setMana(200);
		p1.setManaRegen(50);
		p1.setRange(125);
		p1.setAttackDamage(55.8);
		p1.setAttackSpeed(0.651);
		p1.setBaseAttackSpeed(0.651);
		p1.setArmor(20);
		p1.setMagicResist(30);
		p1.setMovSpeed(350);
		
		p1.setHealthLvl(85);
		p1.setHealthRegenLvl(0.7);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3);
		p1.setArmorLvl(3.7);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void leona(Champion p1) {
		p1.setName("Leona");
		
		// 4.15
		p1.setHealth(430);
		p1.setHealthRegen(7);
		p1.setMana(235);
		p1.setManaRegen(7);
		p1.setRange(125);
		p1.setAttackDamage(55);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(22);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(87);
		p1.setHealthRegenLvl(0.85);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.7);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.9);
		p1.setArmorLvl(3.1);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void lissandra(Champion p1) {
		p1.setName("Lissandra");
		
		// 4.15
		p1.setHealth(365);
		p1.setHealthRegen(6);
		p1.setMana(220);
		p1.setManaRegen(5);
		p1.setRange(550);
		p1.setAttackDamage(48);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(14);
		p1.setMagicResist(30);
		p1.setMovSpeed(325);
		
		p1.setHealthLvl(84);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(50);
		p1.setManaRegenLvl(0.4);
		p1.setAttackDamageLvl(2.7);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.36);
		p1.setArmorLvl(3.7);
		p1.setMagicResistLvl(0);
	}
	
	static public void lucian(Champion p1) {
		p1.setName("Lucian");
		
		// 4.15
		p1.setHealth(420);
		p1.setHealthRegen(5.1);
		p1.setMana(230);
		p1.setManaRegen(7);
		p1.setRange(500);
		p1.setAttackDamage(49);
		p1.setAttackSpeed(0.638);
		p1.setBaseAttackSpeed(0.638);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(80);
		p1.setHealthRegenLvl(0.65);
		p1.setManaLvl(41);
		p1.setManaRegenLvl(0.7);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.3);
		p1.setArmorLvl(3);
		p1.setMagicResistLvl(0);
	}
	
	static public void lulu(Champion p1) {
		p1.setName("Lulu");
		
		// 4.15
		p1.setHealth(415);
		p1.setHealthRegen(5);
		p1.setMana(200);
		p1.setManaRegen(5);
		p1.setRange(550);
		p1.setAttackDamage(44);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(13);
		p1.setMagicResist(30);
		p1.setMovSpeed(325);
		
		p1.setHealthLvl(82);
		p1.setHealthRegenLvl(0.6);
		p1.setManaLvl(55);
		p1.setManaRegenLvl(0.5);
		p1.setAttackDamageLvl(2.6);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.25);
		p1.setArmorLvl(3.7);
		p1.setMagicResistLvl(0);
	}
	
	static public void lux(Champion p1) {
		p1.setName("Lux");
		
		// 4.15
		p1.setHealth(345);
		p1.setHealthRegen(4.5);
		p1.setMana(250);
		p1.setManaRegen(6);
		p1.setRange(550);
		p1.setAttackDamage(50);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(12);
		p1.setMagicResist(30);
		p1.setMovSpeed(330);
		
		p1.setHealthLvl(79);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(50);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(3.3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.36);
		p1.setArmorLvl(4);
		p1.setMagicResistLvl(0);
	}
	
	static public void malphite(Champion p1) {
		p1.setName("Malphite");
		
		// 4.15
		p1.setHealth(423);
		p1.setHealthRegen(7.45);
		p1.setMana(215);
		p1.setManaRegen(6.4);
		p1.setRange(125);
		p1.setAttackDamage(56.3);
		p1.setAttackSpeed(0.638);
		p1.setBaseAttackSpeed(0.638);
		p1.setArmor(22);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(90);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.55);
		p1.setAttackDamageLvl(3.375);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.4);
		p1.setArmorLvl(3.75);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void malzahar(Champion p1) {
		p1.setName("Malzahar");
		
		// 4.15
		p1.setHealth(380);
		p1.setHealthRegen(4.5);
		p1.setMana(250);
		p1.setManaRegen(7);
		p1.setRange(550);
		p1.setAttackDamage(51.66);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(16);
		p1.setMagicResist(30);
		p1.setMovSpeed(340);
		
		p1.setHealthLvl(80);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(45);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.36);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void maokai(Champion p1) {
		p1.setName("Maokai");
		
		// 4.15
		p1.setHealth(421);
		p1.setHealthRegen(7.25);
		p1.setMana(250);
		p1.setManaRegen(6.45);
		p1.setRange(125);
		p1.setAttackDamage(58);
		p1.setAttackSpeed(0.694);
		p1.setBaseAttackSpeed(0.694);
		p1.setArmor(22);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(90);
		p1.setHealthRegenLvl(0.85);
		p1.setManaLvl(46);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(3.3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.125);
		p1.setArmorLvl(4);
		p1.setMagicResistLvl(0);
	}
	
	static public void masteryi(Champion p1) {
		p1.setName("Master Yi");
		
		// 4.15
		p1.setHealth(444);
		p1.setHealthRegen(6.5);
		p1.setMana(180);
		p1.setManaRegen(6.5);
		p1.setRange(125);
		p1.setAttackDamage(55);
		p1.setAttackSpeed(0.679);
		p1.setBaseAttackSpeed(0.679);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(355);
		
		p1.setHealthLvl(92);
		p1.setHealthRegenLvl(0.65);
		p1.setManaLvl(42);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2);
		p1.setArmorLvl(3);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void missfortune(Champion p1) {
		p1.setName("Miss Fortune");
		
		// 4.15
		p1.setHealth(435);
		p1.setHealthRegen(5.1);
		p1.setMana(212);
		p1.setManaRegen(6.95);
		p1.setRange(550);
		p1.setAttackDamage(46.5);
		p1.setAttackSpeed(0.656);
		p1.setBaseAttackSpeed(0.656);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(325);
		
		p1.setHealthLvl(85);
		p1.setHealthRegenLvl(0.65);
		p1.setManaLvl(38);
		p1.setManaRegenLvl(0.65);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3);
		p1.setArmorLvl(3);
		p1.setMagicResistLvl(0);
	}
	
	static public void morderkaiser(Champion p1) {
		p1.setName("Morderkaiser");
		
		// 4.15
		p1.setHealth(421);
		p1.setHealthRegen(7.45);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(125);
		p1.setAttackDamage(51.7);
		p1.setAttackSpeed(0.694);
		p1.setBaseAttackSpeed(0.694);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(340);
		
		p1.setHealthLvl(80);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void morgana(Champion p1) {
		p1.setName("Morgana");
		
		// 4.15
		p1.setHealth(403);
		p1.setHealthRegen(4.7);
		p1.setMana(240);
		p1.setManaRegen(6.8);
		p1.setRange(450);
		p1.setAttackDamage(51.58);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(86);
		p1.setHealthRegenLvl(0.6);
		p1.setManaLvl(60);
		p1.setManaRegenLvl(0.65);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.53);
		p1.setArmorLvl(3.8);
		p1.setMagicResistLvl(0);
	}
	
	static public void nami(Champion p1) {
		p1.setName("Nami");
		
		// 4.15
		p1.setHealth(365);
		p1.setHealthRegen(4.5);
		p1.setMana(305);
		p1.setManaRegen(6.9);
		p1.setRange(550);
		p1.setAttackDamage(48);
		p1.setAttackSpeed(0.644);
		p1.setBaseAttackSpeed(0.644);
		p1.setArmor(13);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(74);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(43);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(3.1);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.61);
		p1.setArmorLvl(4);
		p1.setMagicResistLvl(0);
	}
	
	static public void nasus(Champion p1) {
		p1.setName("Nasus");
		
		// 4.15
		p1.setHealth(410);
		p1.setHealthRegen(7.5);
		p1.setMana(200);
		p1.setManaRegen(6.6);
		p1.setRange(125);
		p1.setAttackDamage(53.3);
		p1.setAttackSpeed(0.638);
		p1.setBaseAttackSpeed(0.638);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(350);
		
		p1.setHealthLvl(90);
		p1.setHealthRegenLvl(0.9);
		p1.setManaLvl(43);
		p1.setManaRegenLvl(0.5);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.48);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void nautilus(Champion p1) {
		p1.setName("Nautilus");
		
		// 4.15
		p1.setHealth(432);
		p1.setHealthRegen(7.45);
		p1.setMana(200);
		p1.setManaRegen(7.45);
		p1.setRange(175);
		p1.setAttackDamage(52);
		p1.setAttackSpeed(0.613);
		p1.setBaseAttackSpeed(0.613);
		p1.setArmor(20);
		p1.setMagicResist(30);
		p1.setMovSpeed(325);
		
		p1.setHealthLvl(86);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(50);
		p1.setManaRegenLvl(0.7);
		p1.setAttackDamageLvl(3.3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1);
		p1.setArmorLvl(3.25);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void nidalee(Champion p1) {
		p1.setName("Nidalee");
		
		// 4.15
		p1.setHealth(390);
		p1.setHealthRegen(5);
		p1.setMana(220);
		p1.setManaRegen(7);
		p1.setRange(525);
		p1.setAttackDamage(49);
		p1.setAttackSpeed(0.67);
		p1.setBaseAttackSpeed(0.67);
		p1.setArmor(17);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(90);
		p1.setHealthRegenLvl(0.6);
		p1.setManaLvl(45);
		p1.setManaRegenLvl(0.5);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.22);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void nocturne(Champion p1) {
		p1.setName("Nocturne");
		
		// 4.15
		p1.setHealth(440);
		p1.setHealthRegen(7);
		p1.setMana(215);
		p1.setManaRegen(6);
		p1.setRange(125);
		p1.setAttackDamage(54);
		p1.setAttackSpeed(0.668);
		p1.setBaseAttackSpeed(0.668);
		p1.setArmor(21);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(90);
		p1.setHealthRegenLvl(0.75);
		p1.setManaLvl(35);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(3.1);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.7);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void nunu(Champion p1) {
		p1.setName("Nunu");
		
		// 4.15
		p1.setHealth(437);
		p1.setHealthRegen(7.05);
		p1.setMana(213);
		p1.setManaRegen(6.6);
		p1.setRange(125);
		p1.setAttackDamage(51.06);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(20.5);
		p1.setMagicResist(30);
		p1.setMovSpeed(350);
		
		p1.setHealthLvl(96);
		p1.setHealthRegenLvl(0.8);
		p1.setManaLvl(42);
		p1.setManaRegenLvl(0.5);
		p1.setAttackDamageLvl(3.45);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.25);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void olaf(Champion p1) {
		p1.setName("Olaf");
		
		// 4.15
		p1.setHealth(441);
		p1.setHealthRegen(7);
		p1.setMana(190);
		p1.setManaRegen(6.5);
		p1.setRange(125);
		p1.setAttackDamage(54.1);
		p1.setAttackSpeed(0.694);
		p1.setBaseAttackSpeed(0.694);
		p1.setArmor(21);
		p1.setMagicResist(30);
		p1.setMovSpeed(350);
		
		p1.setHealthLvl(93);
		p1.setHealthRegenLvl(0.9);
		p1.setManaLvl(45);
		p1.setManaRegenLvl(0.575);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.7);
		p1.setArmorLvl(3);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void orianna(Champion p1) {
		p1.setName("Orianna");
		
		// 4.15
		p1.setHealth(385);
		p1.setHealthRegen(5.95);
		p1.setMana(250);
		p1.setManaRegen(7);
		p1.setRange(525);
		p1.setAttackDamage(38.4);
		p1.setAttackSpeed(0.658);
		p1.setBaseAttackSpeed(0.658);
		p1.setArmor(12);
		p1.setMagicResist(30);
		p1.setMovSpeed(325);
		
		p1.setHealthLvl(79);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(50);
		p1.setManaRegenLvl(0.5);
		p1.setAttackDamageLvl(2.6);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.5);
		p1.setArmorLvl(3);
		p1.setMagicResistLvl(0);
	}
	
	static public void pantheon(Champion p1) {
		p1.setName("Pantheon");
		
		// 4.15
		p1.setHealth(433);
		p1.setHealthRegen(6.75);
		p1.setMana(210);
		p1.setManaRegen(6.6);
		p1.setRange(150);
		p1.setAttackDamage(50.7);
		p1.setAttackSpeed(0.679);
		p1.setBaseAttackSpeed(0.679);
		p1.setArmor(21.1);
		p1.setMagicResist(30);
		p1.setMovSpeed(355);
		
		p1.setHealthLvl(87);
		p1.setHealthRegenLvl(0.65);
		p1.setManaLvl(34);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(2.9);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.95);
		p1.setArmorLvl(3.9);
		p1.setMagicResistLvl(1.25);
	}

	static public void poppy(Champion p1) {
		p1.setName("Poppy");
		
		// 4.15
		p1.setHealth(423);
		p1.setHealthRegen(7.45);
		p1.setMana(185);
		p1.setManaRegen(6.4);
		p1.setRange(125);
		p1.setAttackDamage(56.3);
		p1.setAttackSpeed(0.638);
		p1.setBaseAttackSpeed(0.638);
		p1.setArmor(22);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(81);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(30);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(3.375);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.35);
		p1.setArmorLvl(4);
		p1.setMagicResistLvl(0);
	}
	
	static public void quinn(Champion p1) {
		p1.setName("Quinn");
		
		// 4.15
		p1.setHealth(390);
		p1.setHealthRegen(4.5);
		p1.setMana(210);
		p1.setManaRegen(6.3);
		p1.setRange(525);
		p1.setAttackDamage(48);
		p1.setAttackSpeed(0.668);
		p1.setBaseAttackSpeed(0.668);
		p1.setArmor(17.5);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(85);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(35);
		p1.setManaRegenLvl(0.4);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.1);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void rammus(Champion p1) {
		p1.setName("Rammus");
		
		// 4.15
		p1.setHealth(420);
		p1.setHealthRegen(7);
		p1.setMana(255);
		p1.setManaRegen(7);
		p1.setRange(125);
		p1.setAttackDamage(50);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(25);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(86);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(33);
		p1.setManaRegenLvl(0.5);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.215);
		p1.setArmorLvl(3.8);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void renekton(Champion p1) {
		p1.setName("Renekton");
		
		// 4.15
		p1.setHealth(426);
		p1.setHealthRegen(6.7);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(125);
		p1.setAttackDamage(53.12);
		p1.setAttackSpeed(0.665);
		p1.setBaseAttackSpeed(0.665);
		p1.setArmor(19.2);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(87);
		p1.setHealthRegenLvl(0.75);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3.1);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.65);
		p1.setArmorLvl(3.8);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void rengar(Champion p1) {
		p1.setName("Rengar");
		
		// 4.15
		p1.setHealth(435);
		p1.setHealthRegen(3.6);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(125);
		p1.setAttackDamage(55);
		p1.setAttackSpeed(0.679);
		p1.setBaseAttackSpeed(0.679);
		p1.setArmor(20);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(90);
		p1.setHealthRegenLvl(0.4);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.85);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void riven(Champion p1) {
		p1.setName("Riven");
		
		// 4.15
		p1.setHealth(414);
		p1.setHealthRegen(2.5);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(125);
		p1.setAttackDamage(51);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(86);
		p1.setHealthRegenLvl(0.5);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.5);
		p1.setArmorLvl(3.2);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void rumble(Champion p1) {
		p1.setName("Rumble");
		
		// 4.15
		p1.setHealth(450);
		p1.setHealthRegen(7);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(125);
		p1.setAttackDamage(55.66);
		p1.setAttackSpeed(0.644);
		p1.setBaseAttackSpeed(0.644);
		p1.setArmor(20);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(80);
		p1.setHealthRegenLvl(0.6);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.85);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void ryze(Champion p1) {
		p1.setName("Ryze");
		
		// 4.15
		p1.setHealth(414);
		p1.setHealthRegen(4.35);
		p1.setMana(250);
		p1.setManaRegen(7);
		p1.setRange(550);
		p1.setAttackDamage(52);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(15);
		p1.setMagicResist(30);
		p1.setMovSpeed(340);
		
		p1.setHealthLvl(86);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(55);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.112);
		p1.setArmorLvl(3.9);
		p1.setMagicResistLvl(0);
	}
	
	static public void sejuani(Champion p1) {
		p1.setName("Sejuani");
		
		// 4.15
		p1.setHealth(440);
		p1.setHealthRegen(7.25);
		p1.setMana(220);
		p1.setManaRegen(6.45);
		p1.setRange(125);
		p1.setAttackDamage(52);
		p1.setAttackSpeed(0.67);
		p1.setBaseAttackSpeed(0.67);
		p1.setArmor(24.5);
		p1.setMagicResist(30);
		p1.setMovSpeed(340);
		
		p1.setHealthLvl(95);
		p1.setHealthRegenLvl(0.85);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(3.3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.44);
		p1.setArmorLvl(3);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void shaco(Champion p1) {
		p1.setName("Shaco");
		
		// 4.15
		p1.setHealth(441);
		p1.setHealthRegen(7.45);
		p1.setMana(230);
		p1.setManaRegen(0.45);
		p1.setRange(125);
		p1.setAttackDamage(51);
		p1.setAttackSpeed(0.694);
		p1.setBaseAttackSpeed(0.694);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(350);
		
		p1.setHealthLvl(84);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void shen(Champion p1) {
		p1.setName("Shen");
		
		// 4.15
		p1.setHealth(428);
		p1.setHealthRegen(7.45);
		p1.setMana(200);
		p1.setManaRegen(50);
		p1.setRange(125);
		p1.setAttackDamage(54.5);
		p1.setAttackSpeed(0.651);
		p1.setBaseAttackSpeed(0.651);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(85);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3.375);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.4);
		p1.setArmorLvl(4);
		p1.setMagicResistLvl(0);
	}
	
	static public void shyvana(Champion p1) {
		p1.setName("Shyavana");
		
		// 4.15
		p1.setHealth(435);
		p1.setHealthRegen(7.25);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(125);
		p1.setAttackDamage(55);
		p1.setAttackSpeed(0.658);
		p1.setBaseAttackSpeed(0.658);
		p1.setArmor(22);
		p1.setMagicResist(30);
		p1.setMovSpeed(350);
		
		p1.setHealthLvl(95);
		p1.setHealthRegenLvl(0.8);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3.4);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.5);
		p1.setArmorLvl(3.35);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void singed(Champion p1) {
		p1.setName("Singed");
		
		// 4.15
		p1.setHealth(405);
		p1.setHealthRegen(7.1);
		p1.setMana(215);
		p1.setManaRegen(6.6);
		p1.setRange(125);
		p1.setAttackDamage(56.65);
		p1.setAttackSpeed(0.613);
		p1.setBaseAttackSpeed(0.613);
		p1.setArmor(22);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(82);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(45);
		p1.setManaRegenLvl(0.55);
		p1.setAttackDamageLvl(3.375);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.81);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void sion(Champion p1) {
		p1.setName("Sion");
		
		// 4.15
		p1.setHealth(403);
		p1.setHealthRegen(7.9);
		p1.setMana(200);
		p1.setManaRegen(6.3);
		p1.setRange(125);
		p1.setAttackDamage(55.52);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(21.75);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(104);
		p1.setHealthRegenLvl(0.95);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.4);
		p1.setAttackDamageLvl(3.188);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.63);
		p1.setArmorLvl(3.25);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void sivir(Champion p1) {
		p1.setName("Sivir");
		
		// 4.15
		p1.setHealth(378);
		p1.setHealthRegen(4.25);
		p1.setMana(200);
		p1.setManaRegen(6.5);
		p1.setRange(500);
		p1.setAttackDamage(49);
		p1.setAttackSpeed(0.658);
		p1.setBaseAttackSpeed(0.658);
		p1.setArmor(16.75);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(82);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(50);
		p1.setManaRegenLvl(0.9);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.6);
		p1.setArmorLvl(3.25);
		p1.setMagicResistLvl(0);
	}
	
	static public void skarner(Champion p1) {
		p1.setName("Skarner");
		
		// 4.15
		p1.setHealth(440);
		p1.setHealthRegen(7.5);
		p1.setMana(205);
		p1.setManaRegen(6.45);
		p1.setRange(125);
		p1.setAttackDamage(54.1);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(23);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(96);
		p1.setHealthRegenLvl(0.85);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(4.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.1);
		p1.setArmorLvl(3.8);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void sona(Champion p1) {
		p1.setName("Sona");
		
		// 4.15
		p1.setHealth(353);
		p1.setHealthRegen(4.5);
		p1.setMana(265);
		p1.setManaRegen(7);
		p1.setRange(550);
		p1.setAttackDamage(47);
		p1.setAttackSpeed(0.644);
		p1.setBaseAttackSpeed(0.644);
		p1.setArmor(15);
		p1.setMagicResist(30);
		p1.setMovSpeed(330);
		
		p1.setHealthLvl(77);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(45);
		p1.setManaRegenLvl(0.65);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.3);
		p1.setArmorLvl(3.3);
		p1.setMagicResistLvl(0);
	}
	
	static public void soraka(Champion p1) {
		p1.setName("Soraka");
		
		// 4.15
		p1.setHealth(405);
		p1.setHealthRegen(4.5);
		p1.setMana(240);
		p1.setManaRegen(6.8);
		p1.setRange(550);
		p1.setAttackDamage(48.8);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(17);
		p1.setMagicResist(30);
		p1.setMovSpeed(340);
		
		p1.setHealthLvl(76);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(60);
		p1.setManaRegenLvl(0.65);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.14);
		p1.setArmorLvl(3.8);
		p1.setMagicResistLvl(0);
	}
	
	static public void swain(Champion p1) {
		p1.setName("Swain");
		
		// 4.15
		p1.setHealth(385);
		p1.setHealthRegen(6.75);
		p1.setMana(240);
		p1.setManaRegen(6.8);
		p1.setRange(500);
		p1.setAttackDamage(49);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(16);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(78);
		p1.setHealthRegenLvl(0.65);
		p1.setManaLvl(50);
		p1.setManaRegenLvl(0.65);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.11);
		p1.setArmorLvl(4);
		p1.setMagicResistLvl(0);
	}
	
	static public void syndra(Champion p1) {
		p1.setName("Syndra");
		
		// 4.15
		p1.setHealth(380);
		p1.setHealthRegen(5.5);
		p1.setMana(250);
		p1.setManaRegen(6.9);
		p1.setRange(550);
		p1.setAttackDamage(51);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(330);
		
		p1.setHealthLvl(78);
		p1.setHealthRegenLvl(0.6);
		p1.setManaLvl(50);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(2.9);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2);
		p1.setArmorLvl(3.4);
		p1.setMagicResistLvl(0);
	}
	
	static public void talon(Champion p1) {
		p1.setName("Talon");
		
		// 4.15
		p1.setHealth(440);
		p1.setHealthRegen(7.25);
		p1.setMana(260);
		p1.setManaRegen(6.75);
		p1.setRange(125);
		p1.setAttackDamage(50);
		p1.setAttackSpeed(0.668);
		p1.setBaseAttackSpeed(0.668);
		p1.setArmor(21);
		p1.setMagicResist(30);
		p1.setMovSpeed(350);
		
		p1.setHealthLvl(85);
		p1.setHealthRegenLvl(0.75);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.5);
		p1.setAttackDamageLvl(3.1);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.7);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void taric(Champion p1) {
		p1.setName("Taric");
		
		// 4.15
		p1.setHealth(468);
		p1.setHealthRegen(7.1);
		p1.setMana(255);
		p1.setManaRegen(4.1);
		p1.setRange(125);
		p1.setAttackDamage(52);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(20.5);
		p1.setMagicResist(30);
		p1.setMovSpeed(340);
		
		p1.setHealthLvl(90);
		p1.setHealthRegenLvl(0.5);
		p1.setManaLvl(56);
		p1.setManaRegenLvl(0.4);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.02);
		p1.setArmorLvl(3.2);
		p1.setMagicResistLvl(1.25);
	}
	

	static public void teemo(Champion p1) {
		p1.setName("Teemo");
		
		// 4.15
		p1.setHealth(378);
		p1.setHealthRegen(4.65);
		p1.setMana(200);
		p1.setManaRegen(6.45);
		p1.setRange(500);
		p1.setAttackDamage(44.5);
		p1.setAttackSpeed(0.69);
		p1.setBaseAttackSpeed(0.69);
		p1.setArmor(18);
		p1.setMagicResist(30);
		p1.setMovSpeed(330);
		
		p1.setHealthLvl(82);
		p1.setHealthRegenLvl(0.65);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.38);
		p1.setArmorLvl(3.75);
		p1.setMagicResistLvl(0);
	}
	
	static public void thresh(Champion p1) {
		p1.setName("Thresh");
		
		// 4.15
		p1.setHealth(411);
		p1.setHealthRegen(6);
		p1.setMana(200);
		p1.setManaRegen(5);
		p1.setRange(450);
		p1.setAttackDamage(46);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(16);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(89);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(44);
		p1.setManaRegenLvl(0.7);
		p1.setAttackDamageLvl(2.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.5);
		p1.setArmorLvl(0);
		p1.setMagicResistLvl(0);
	}
	
	static public void tristana(Champion p1) {
		p1.setName("Tristana");
		
		// 4.15
		p1.setHealth(415);
		p1.setHealthRegen(5.1);
		p1.setMana(193);
		p1.setManaRegen(6.45);
		p1.setRange(550);
		p1.setAttackDamage(46.5);
		p1.setAttackSpeed(0.656);
		p1.setBaseAttackSpeed(0.656);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(325);
		
		p1.setHealthLvl(82);
		p1.setHealthRegenLvl(0.65);
		p1.setManaLvl(32);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*4);
		p1.setArmorLvl(3);
		p1.setMagicResistLvl(0);
	}
	
	static public void trundle(Champion p1) {
		p1.setName("Trundle");
		
		// 4.15
		p1.setHealth(455);
		p1.setHealthRegen(8);
		p1.setMana(206);
		p1.setManaRegen(6.5);
		p1.setRange(125);
		p1.setAttackDamage(55);
		p1.setAttackSpeed(0.67);
		p1.setBaseAttackSpeed(0.67);
		p1.setArmor(23);
		p1.setMagicResist(30);
		p1.setMovSpeed(350);
		
		p1.setHealthLvl(96);
		p1.setHealthRegenLvl(0.85);
		p1.setManaLvl(45);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.9);
		p1.setArmorLvl(2.7);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void tryndamere(Champion p1) {
		p1.setName("Tryndamere");
		
		// 4.15
		p1.setHealth(461);
		p1.setHealthRegen(7);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(125);
		p1.setAttackDamage(56);
		p1.setAttackSpeed(0.67);
		p1.setBaseAttackSpeed(0.67);
		p1.setArmor(18.9);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(98);
		p1.setHealthRegenLvl(0.9);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.9);
		p1.setArmorLvl(3.1);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void twistedfate(Champion p1) {
		p1.setName("Twisted Fate");
		
		// 4.15
		p1.setHealth(384);
		p1.setHealthRegen(4.5);
		p1.setMana(202);
		p1.setManaRegen(6.5);
		p1.setRange(525);
		p1.setAttackDamage(46.41);
		p1.setAttackSpeed(0.651);
		p1.setBaseAttackSpeed(0.651);
		p1.setArmor(15.25);
		p1.setMagicResist(30);
		p1.setMovSpeed(330);
		
		p1.setHealthLvl(82);
		p1.setHealthRegenLvl(0.6);
		p1.setManaLvl(38);
		p1.setManaRegenLvl(0.5);
		p1.setAttackDamageLvl(3.3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.22);
		p1.setArmorLvl(3.15);
		p1.setMagicResistLvl(0);
	}
	
	static public void twitch(Champion p1) {
		p1.setName("Twitch");
		
		// 4.15
		p1.setHealth(389);
		p1.setHealthRegen(5);
		p1.setMana(220);
		p1.setManaRegen(6.5);
		p1.setRange(550);
		p1.setAttackDamage(46);
		p1.setAttackSpeed(0.679);
		p1.setBaseAttackSpeed(0.679);
		p1.setArmor(18);
		p1.setMagicResist(30);
		p1.setMovSpeed(330);
		
		p1.setHealthLvl(81);
		p1.setHealthRegenLvl(0.6);
		p1.setManaLvl(40);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.38);
		p1.setArmorLvl(3);
		p1.setMagicResistLvl(0);
	}
	
	static public void udyr(Champion p1) {
		p1.setName("Udyr");
		
		// 4.15
		p1.setHealth(427);
		p1.setHealthRegen(7.45);
		p1.setMana(220);
		p1.setManaRegen(6.75);
		p1.setRange(125);
		p1.setAttackDamage(52.91);
		p1.setAttackSpeed(0.658);
		p1.setBaseAttackSpeed(0.658);
		p1.setArmor(18.75);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(99);
		p1.setHealthRegenLvl(0.75);
		p1.setManaLvl(30);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(3.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.67);
		p1.setArmorLvl(4);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void urgot(Champion p1) {
		p1.setName("Urgot");
		
		// 4.15
		p1.setHealth(437);
		p1.setHealthRegen(5.5);
		p1.setMana(220);
		p1.setManaRegen(7.5);
		p1.setRange(425);
		p1.setAttackDamage(48);
		p1.setAttackSpeed(0.644);
		p1.setBaseAttackSpeed(0.644);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(89);
		p1.setHealthRegenLvl(0.6);
		p1.setManaLvl(55);
		p1.setManaRegenLvl(0.65);
		p1.setAttackDamageLvl(3.6);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.9);
		p1.setArmorLvl(3.3);
		p1.setMagicResistLvl(0);
	}
	
	static public void varus(Champion p1) {
		p1.setName("Varus");
		
		// 4.15
		p1.setHealth(400);
		p1.setHealthRegen(4.5);
		p1.setMana(250);
		p1.setManaRegen(6.5);
		p1.setRange(575);
		p1.setAttackDamage(46);
		p1.setAttackSpeed(0.658);
		p1.setBaseAttackSpeed(0.658);
		p1.setArmor(17.5);
		p1.setMagicResist(30);
		p1.setMovSpeed(330);
		
		p1.setHealthLvl(82);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(36);
		p1.setManaRegenLvl(0.5);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3);
		p1.setArmorLvl(3.4);
		p1.setMagicResistLvl(0);
	}
	
	static public void vayne(Champion p1) {
		p1.setName("Vayne");
		
		// 4.15
		p1.setHealth(359);
		p1.setHealthRegen(4.5);
		p1.setMana(173);
		p1.setManaRegen(6.3);
		p1.setRange(550);
		p1.setAttackDamage(50);
		p1.setBaseAttackSpeed(0.658);
		p1.setArmor(13.3);
		p1.setMagicResist(30);
		p1.setMovSpeed(330);
		
		p1.setHealthLvl(83);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(35);
		p1.setManaRegenLvl(0.4);
		p1.setAttackDamageLvl(3.25);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*4);
		p1.setArmorLvl(3.4);
		p1.setMagicResistLvl(0);
	}
	
	static public void veigar(Champion p1) {
		p1.setName("Veigar");
		
		// 4.15
		p1.setHealth(355);
		p1.setHealthRegen(4.5);
		p1.setMana(250);
		p1.setManaRegen(6.9);
		p1.setRange(525);
		p1.setAttackDamage(48.3);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(16.25);
		p1.setMagicResist(30);
		p1.setMovSpeed(340);
		
		p1.setHealthLvl(82);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(55);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(2.625);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.24);
		p1.setArmorLvl(3.75);
		p1.setMagicResistLvl(0);
	}
	
	static public void velkoz(Champion p1) {
		p1.setName("Vel'koz");
		
		// 4.15
		p1.setHealth(380);
		p1.setHealthRegen(4.5);
		p1.setMana(250);
		p1.setManaRegen(7);
		p1.setRange(525);
		p1.setAttackDamage(51.66);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(16);
		p1.setMagicResist(30);
		p1.setMovSpeed(340);
		
		p1.setHealthLvl(76);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(45);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(3.142);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.36);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void vi(Champion p1) {
		p1.setName("Vi");
		
		// 4.15
		p1.setHealth(440);
		p1.setHealthRegen(7.5);
		p1.setMana(220);
		p1.setManaRegen(7);
		p1.setRange(125);
		p1.setAttackDamage(50);
		p1.setAttackSpeed(0.644);
		p1.setBaseAttackSpeed(0.644);
		p1.setArmor(20);
		p1.setMagicResist(30);
		p1.setMovSpeed(350);
		
		p1.setHealthLvl(85);
		p1.setHealthRegenLvl(0.9);
		p1.setManaLvl(45);
		p1.setManaRegenLvl(0.65);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.5);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void viktor(Champion p1) {
		p1.setName("Viktor");
		
		// 4.15
		p1.setHealth(385);
		p1.setHealthRegen(6.75);
		p1.setMana(240);
		p1.setManaRegen(6.9);
		p1.setRange(525);
		p1.setAttackDamage(49);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(16);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(78);
		p1.setHealthRegenLvl(0.65);
		p1.setManaLvl(50);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.11);
		p1.setArmorLvl(4);
		p1.setMagicResistLvl(0);
	}
	
	static public void vladimir(Champion p1) {
		p1.setName("Vladimir");
		
		// 4.15
		p1.setHealth(400);
		p1.setHealthRegen(6);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(450);
		p1.setAttackDamage(45);
		p1.setAttackSpeed(0.658);
		p1.setBaseAttackSpeed(0.658);
		p1.setArmor(16);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(85);
		p1.setHealthRegenLvl(0.6);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void volibear(Champion p1) {
		p1.setName("Volibear");
		
		// 4.15
		p1.setHealth(440);
		p1.setHealthRegen(7);
		p1.setMana(220);
		p1.setManaRegen(7);
		p1.setRange(125);
		p1.setAttackDamage(54);
		p1.setAttackSpeed(0.658);
		p1.setBaseAttackSpeed(0.658);
		p1.setArmor(20.5);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(86);
		p1.setHealthRegenLvl(0.65);
		p1.setManaLvl(30);
		p1.setManaRegenLvl(0.65);
		p1.setAttackDamageLvl(3.3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.67);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void warwick(Champion p1) {
		p1.setName("Warwick");
		
		// 4.15
		p1.setHealth(428);
		p1.setHealthRegen(7.05);
		p1.setMana(190);
		p1.setManaRegen(7.1);
		p1.setRange(125);
		p1.setAttackDamage(56.76);
		p1.setAttackSpeed(0.679);
		p1.setBaseAttackSpeed(0.679);
		p1.setArmor(20);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(98);
		p1.setHealthRegenLvl(0.8);
		p1.setManaLvl(30);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(3.375);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.88);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void wukong(Champion p1) {
		p1.setName("Wukong");
		
		// 4.15
		p1.setHealth(435);
		p1.setHealthRegen(5.1);
		p1.setMana(202);
		p1.setManaRegen(6.95);
		p1.setRange(175);
		p1.setAttackDamage(54.5);
		p1.setAttackSpeed(0.658);
		p1.setBaseAttackSpeed(0.658);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(85);
		p1.setHealthRegenLvl(0.65);
		p1.setManaLvl(38);
		p1.setManaRegenLvl(0.65);
		p1.setAttackDamageLvl(3.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void xerath(Champion p1) {
		p1.setName("Xerath");
		
		// 4.15
		p1.setHealth(380);
		p1.setHealthRegen(4.5);
		p1.setMana(238);
		p1.setManaRegen(6);
		p1.setRange(525);
		p1.setAttackDamage(51.66);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(16);
		p1.setMagicResist(30);
		p1.setMovSpeed(340);
		
		p1.setHealthLvl(80);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(47);
		p1.setManaRegenLvl(0.65);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.36);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(0);
	}
	
	static public void xinzhao(Champion p1) {
		p1.setName("Xin Zhao");
		
		// 4.15
		p1.setHealth(445);
		p1.setHealthRegen(7);
		p1.setMana(215);
		p1.setManaRegen(6.5);
		p1.setRange(175);
		p1.setAttackDamage(52);
		p1.setAttackSpeed(0.672);
		p1.setBaseAttackSpeed(0.672);
		p1.setArmor(20);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(87);
		p1.setHealthRegenLvl(0.7);
		p1.setManaLvl(35);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(3.3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.6);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void yasuo(Champion p1) {
		p1.setName("Yasuo");
		
		// 4.15
		p1.setHealth(430);
		p1.setHealthRegen(5);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(175);
		p1.setAttackDamage(50);
		p1.setAttackSpeed(0.658);
		p1.setBaseAttackSpeed(0.658);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(350);
		
		p1.setHealthLvl(82);
		p1.setHealthRegenLvl(0.9);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.2);
		p1.setArmorLvl(3.4);
		p1.setMagicResistLvl(0);
	}
	
	static public void yorick(Champion p1) {
		p1.setName("Yorick");
		
		// 4.15
		p1.setHealth(421);
		p1.setHealthRegen(7);
		p1.setMana(235);
		p1.setManaRegen(6);
		p1.setRange(125);
		p1.setAttackDamage(51.7);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(19);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(85);
		p1.setHealthRegenLvl(0.7);
		p1.setManaLvl(35);
		p1.setManaRegenLvl(0.45);
		p1.setAttackDamageLvl(3.5);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3);
		p1.setArmorLvl(3.6);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void zac(Champion p1) {
		p1.setName("Zac");
		
		// 4.15
		p1.setHealth(455);
		p1.setHealthRegen(7);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(125);
		p1.setAttackDamage(54);
		p1.setAttackSpeed(0.638);
		p1.setBaseAttackSpeed(0.638);
		p1.setArmor(18);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(95);
		p1.setHealthRegenLvl(0.55);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3.375);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*1.6);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void zed(Champion p1) {
		p1.setName("Zed");
		
		// 4.15
		p1.setHealth(445);
		p1.setHealthRegen(6);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(125);
		p1.setAttackDamage(49);
		p1.setAttackSpeed(0.658);
		p1.setBaseAttackSpeed(0.658);
		p1.setArmor(21);
		p1.setMagicResist(30);
		p1.setMovSpeed(345);
		
		p1.setHealthLvl(80);
		p1.setHealthRegenLvl(0.65);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(3.4);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*3.1);
		p1.setArmorLvl(3.5);
		p1.setMagicResistLvl(1.25);
	}
	
	static public void ziggs(Champion p1) {
		p1.setName("Ziggs");
		
		// 4.15
		p1.setHealth(390);
		p1.setHealthRegen(5.25);
		p1.setMana(250);
		p1.setManaRegen(6.75);
		p1.setRange(550);
		p1.setAttackDamage(51);
		p1.setAttackSpeed(0.656);
		p1.setBaseAttackSpeed(0.656);
		p1.setArmor(16);
		p1.setMagicResist(30);
		p1.setMovSpeed(325);
		
		p1.setHealthLvl(80);
		p1.setHealthRegenLvl(0.6);
		p1.setManaLvl(50);
		p1.setManaRegenLvl(0.6);
		p1.setAttackDamageLvl(3.1);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2);
		p1.setArmorLvl(3.3);
		p1.setMagicResistLvl(0);
	}
	
	static public void zilean(Champion p1) {
		p1.setName("Zilean");
		
		// 4.15
		p1.setHealth(380);
		p1.setHealthRegen(4.6);
		p1.setMana(260);
		p1.setManaRegen(6.95);
		p1.setRange(600);
		p1.setAttackDamage(48.6);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(10.75);
		p1.setMagicResist(30);
		p1.setMovSpeed(335);
		
		p1.setHealthLvl(71);
		p1.setHealthRegenLvl(0.5);
		p1.setManaLvl(60);
		p1.setManaRegenLvl(0.65);
		p1.setAttackDamageLvl(3);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.13);
		p1.setArmorLvl(3.8);
		p1.setMagicResistLvl(0);
	}
	
	static public void zyra(Champion p1) {
		p1.setName("Zyra");
		
		// 4.15
		p1.setHealth(355);
		p1.setHealthRegen(4.85);
		p1.setMana(250);
		p1.setManaRegen(7.1);
		p1.setRange(575);
		p1.setAttackDamage(50);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(15);
		p1.setMagicResist(30);
		p1.setMovSpeed(325);
		
		p1.setHealthLvl(74);
		p1.setHealthRegenLvl(0.5);
		p1.setManaLvl(50);
		p1.setManaRegenLvl(0.75);
		p1.setAttackDamageLvl(3.2);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*2.11);
		p1.setArmorLvl(3);
		p1.setMagicResistLvl(0);
	}
	
	static public void ancientgolem(Champion p1) {
		p1.setName("Ancient Golem");
		
		// 4.15
		p1.setHealth(1500);
		p1.setHealthRegen(0);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(125);
		p1.setAttackDamage(60);
		p1.setAttackSpeed(0.613);
		p1.setBaseAttackSpeed(0.613);
		p1.setArmor(20);
		p1.setMagicResist(0);
		p1.setMovSpeed(200);
		
		p1.setHealthLvl(0);
		p1.setHealthRegenLvl(0);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(0);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*0);
		p1.setArmorLvl(0);
		p1.setMagicResistLvl(0);
	}
	
	static public void elderlizard(Champion p1) {
		p1.setName("Elder Lizard");
		
		// 4.15
		p1.setHealth(1500);
		p1.setHealthRegen(0);
		p1.setMana(0);
		p1.setManaRegen(0);
		p1.setRange(125);
		p1.setAttackDamage(60);
		p1.setAttackSpeed(0.625);
		p1.setBaseAttackSpeed(0.625);
		p1.setArmor(20);
		p1.setMagicResist(0);
		p1.setMovSpeed(330);
		
		p1.setHealthLvl(0);
		p1.setHealthRegenLvl(0);
		p1.setManaLvl(0);
		p1.setManaRegenLvl(0);
		p1.setAttackDamageLvl(0);
		p1.setAttackSpeedLvl((p1.getAttackSpeed()/100)*0);
		p1.setArmorLvl(0);
		p1.setMagicResistLvl(0);
	}
}
