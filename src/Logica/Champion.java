package Logica;

public class Champion {
	
	// Level e nome do champion
	private int level=0;
	private String name;
	
	// Todos status de um champion (no atual momento)
	private double health;
	private double healthRegen;
	private double mana;
	private double manaRegen;
	private double range;
	private double attackDamage;
	private double attackSpeed;
	private double armor;
	private double magicResist;
	private double movSpeed;
	
	// Base, status que não devem ser alterados
	private double baseAttackSpeed;
	private double baseMovSpeed;
	
	// Quanto ganha por level
	private double healthLvl;
	private double healthRegenLvl;
	private double manaLvl;
	private double manaRegenLvl;
	private double attackDamageLvl;
	private double attackSpeedLvl;
	private double armorLvl;
	private double magicResistLvl;
	
	// Casos especiais
	private double rangeLvl=0;
	private double movSpeedLvl=0;
	private double lifesteal=0;
	
	public Champion() {
	
	}
	
	// Definir nome e ver nome do champion
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	// Definir level e visualizar level
	public void setLevel(int level) {
		
		if (this.level==level)
			return;
		
		while(this.level > level) {
			this.level--;
			
			this.health -= this.healthLvl;
			this.healthRegen -= this.healthRegenLvl;
			this.mana -= this.manaLvl;
			this.manaRegen -= this.manaRegenLvl;
			this.range -= this.rangeLvl;
			this.attackDamage -= this.attackDamageLvl;
			this.attackSpeed -= this.attackSpeedLvl;
			this.armor -= this.armorLvl;
			this.magicResist -= this.magicResistLvl;
			this.movSpeed -= this.movSpeedLvl;
		}
		
		while(this.level < level) {
			this.level++;
			
			this.health += this.healthLvl;
			this.healthRegen += this.healthRegenLvl;
			this.mana += this.manaLvl;
			this.manaRegen += this.manaRegenLvl;
			this.range += this.rangeLvl;
			this.attackDamage += this.attackDamageLvl;
			this.attackSpeed += this.attackSpeedLvl;
			this.armor += this.armorLvl;
			this.magicResist += this.magicResistLvl;
			this.movSpeed += this.movSpeedLvl;
		}
	}
	
	public int getLevel() {
		return this.level;
	}
	
	// Status base que não devem ser alterados
	public void setBaseMovSpeed(double baseMovSpeed) {
		this.baseMovSpeed = baseMovSpeed;
	}
	
	public double getBaseMovSpeed() {
		return this.baseMovSpeed;
	}
	
	public void setBaseAttackSpeed(double baseAttackSpeed) {
		this.baseAttackSpeed = baseAttackSpeed;
		this.attackSpeed = baseAttackSpeed;
	}
	
	public double getBaseAttackSpeed() {
		return this.baseAttackSpeed;
	}
	
	
	// Conjunto de 'set' para definir os status do champion
	public void setHealth(double health) {
		this.health = health;
	}
	
	public void setHealthRegen(double healthRegen) {
		this.healthRegen = healthRegen;
	}
	
	public void setMana(double mana) {
		this.mana = mana;
	}

	public void setManaRegen(double manaRegen) {
		this.manaRegen = manaRegen;
	}
	
	public void setRange(double range) {
		this.range = range;
	}
	
	public void setAttackDamage(double attackDamage) {
		this.attackDamage = attackDamage;
	}
	
	public void setAttackSpeed(double attackSpeed) {
		this.attackSpeed = attackSpeed;
	}
	
	public void setArmor(double armor) {
		this.armor = armor;
	}
	
	public void setMagicResist(double magicResist) {
		this.magicResist = magicResist;
	}
	
	public void setMovSpeed(double movSpeed) {
		this.movSpeed = movSpeed;
	}
	
	public void setLifesteal(double lifesteal) {
		this.lifesteal = lifesteal;
	}
	
	public void setHealthLvl(double health) {
		this.healthLvl = health;
	}
	
	public void setHealthRegenLvl(double healthRegen) {
		this.healthRegenLvl = healthRegen;
	}
	
	public void setManaLvl(double mana) {
		this.manaLvl = mana;
	}

	public void setManaRegenLvl(double manaRegen) {
		this.manaRegenLvl = manaRegen;
	}
	
	public void setRangeLvl(double range) {
		this.rangeLvl = range;
	}
	
	public void setAttackDamageLvl(double attackDamage) {
		this.attackDamageLvl = attackDamage;
	}
	
	public void setAttackSpeedLvl(double attackSpeed) {
		this.attackSpeedLvl = attackSpeed;
	}
	
	public void setArmorLvl(double armor) {
		this.armorLvl = armor;
	}
	
	public void setMagicResistLvl(double magicResist) {
		this.magicResistLvl = magicResist;
	}
	
	public void setMovSpeedLvl(double movSpeed) {
		this.movSpeedLvl = movSpeed;
	}
	
	// Conjunto de 'get' para visualizar o status do champion
	public double getHealth() {
		return this.health;
	}
	
	public double getHealthRegen() {
		return this.healthRegen;
	}
	
	public double getMana() {
		return this.mana;
	}

	public double getManaRegen() {
		return this.manaRegen;
	}
	
	public double getRange() {
		return this.range;
	}
	
	public double getAttackDamage() {
		return this.attackDamage;
	}
	
	public double getAttackSpeed() {
		return this.attackSpeed;
	}
	
	public double getArmor() {
		return this.armor;
	}
	
	public double getMagicResist() {
		return this.magicResist;
	}
	
	public double getMovSpeed() {
		return this.movSpeed;
	}
	
	public double getLifesteal() {
		return this.lifesteal;
	}
	
	public double getHealthLvl() {
		return this.healthLvl;
	}
	
	public double getHealthRegenLvl() {
		return this.healthRegenLvl;
	}
	
	public double getManaLvl() {
		return this.manaLvl;
	}

	public double getManaRegenLvl() {
		return this.manaRegenLvl;
	}
	
	public double getRangeLvl() {
		return this.rangeLvl;
	}
	
	public double getAttackDamageLvl() {
		return this.attackDamageLvl;
	}
	
	public double getAttackSpeedLvl() {
		return this.attackSpeedLvl;
	}
	
	public double getArmorLvl() {
		return this.armorLvl;
	}
	
	public double getMagicResistLvl() {
		return this.magicResistLvl;
	}

	public double getMovSpeedLvl() {
		return this.movSpeedLvl;
	}

}
