package Logica;

public class Calculator {
	
	// answer in percent(%)
	static public double multiplicatively (double x, double y) {
		return 100-(1-x/100)*(100-y);
	}

	// Damage reduction in percent(%)
	static public double reduction (double x) {
		return (1-100/(x+100))*100;
	}
	
	static public String battle1 (Champion p1, Champion p2) {
		double damage;
		double reduction;
		double lifesteal;
		
		// contar o numero de ataques necessarios pra matar
		int p1hits=0;
		int p2hits=0;
		
		 // se for maior ou igual a 1 então o champion atacou
		double nextAttackP1=0;
		double nextAttackP2=0;
		
		 // Vida maxima para q o lifesteal não acrescente mais
		double p1MaxHealth = p1.getHealth();
		double p2MaxHealth = p2.getHealth();
		
		//System.out.println("Health || " + p1.getName() + " " + p1.getHealth() + " " + p2.getName() + " " + p2.getHealth());
		
		while (p1.getHealth() >0 && p2.getHealth() > 0) {

			nextAttackP1 += p1.getAttackSpeed();
			nextAttackP2 += p2.getAttackSpeed();
			
			while (nextAttackP1 >= 1) {
				nextAttackP1--;
				p1hits++;
				
				reduction = 1-Calculator.reduction(p2.getArmor())/100;
				damage = p1.getAttackDamage()*reduction;
				
				p2.setHealth(p2.getHealth()-damage);
				
				// Lifesteal if he is not full life
				if (p1.getHealth() < p1MaxHealth) {
					lifesteal = damage*p1.getLifesteal()/100;
					p1.setHealth(p1.getHealth() + lifesteal);
					if (p1.getHealth() > p1MaxHealth)
						p1.setHealth(p1MaxHealth);
				}
			}
			
			while (nextAttackP2 >= 1) {
				nextAttackP2--;
				p2hits++;
				
				reduction = 1-Calculator.reduction(p1.getArmor())/100;
				damage = p2.getAttackDamage()*reduction;

				p1.setHealth(p1.getHealth()-damage);
				
				// Lifesteal if he is not full life
				if (p2.getHealth() < p2MaxHealth) {
					lifesteal = damage*p2.getLifesteal()/100;
					p2.setHealth(p2.getHealth() + lifesteal);
					if (p2.getHealth() > p2MaxHealth)
						p2.setHealth(p2MaxHealth);
				}
			}
			
			// Health regen if both are still alive
			if (p1.getHealth() > 0 && p2.getHealth() >0) {
				p1.setHealth(p1.getHealth()+p1.getHealthRegen()/5);
				p2.setHealth(p2.getHealth()+p2.getHealthRegen()/5);
				//System.out.println("After Health Regen || " + p1.getName() + " " + p1.getHealth() + " " + p2.getName() + " " + p2.getHealth());
			}
		}
		
		System.out.println("END || " + p1.getName() + " " + p1.getHealth() + " " + p2.getName() + " " + p2.getHealth());
		
		if (p1.getHealth() == p2.getHealth())
			return "Empate";
		else if (p1.getHealth() > p2.getHealth())
			return "Da esquerda Ganhou";
		else
			return "Da direita Ganhou";
	}
}
