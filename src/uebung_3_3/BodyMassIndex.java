package uebung_3_3;

public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int geschlecht=1;
		double alter=22;
		double gewicht=25;
		double groesse=1.65;
		double bmi;
		
		bmi = gewicht / (groesse * groesse);
		
		if (geschlecht == 1)// 1 ist weiblich
		{
			if (alter<=24)
			{
				if (bmi<19)
				{
					System.out.println("Dein BMI ist zu niedrig.");
					System.out.println(bmi);
				}
				else if (bmi>24)
				{
					System.out.println("Dein BMI ist zu hoch.");
					System.out.println(bmi);
				}
				else
				{
					System.out.println("Dein BMI ist gut.");
					System.out.println(bmi);
				}
				
			}
			else if (alter>24 && alter<=34)
			{
				if (bmi<20)
				{
					System.out.println("Dein BMI ist zu niedrig.");
					System.out.println(bmi);
				}
				else if (bmi>25)
				{
					System.out.println("Dein BMI ist zu hoch.");
					System.out.println(bmi);
				}
				else
				{
					System.out.println("Dein BMI ist gut.");
					System.out.println(bmi);
				}
				
			}
			else if (alter>34 && alter<=44)
			{
				if (bmi<21)
				{
					System.out.println("Dein BMI ist zu niedrig.");
					System.out.println(bmi);
				}
				else if (bmi>26)
				{
					System.out.println("Dein BMI ist zu hoch.");
					System.out.println(bmi);
				}
				else
				{
					System.out.println("Dein BMI ist gut.");
					System.out.println(bmi);
				}
				
			}
			if (alter>44 && alter<=54)
			{
				if (bmi<22)
				{
					System.out.println("Dein BMI ist zu niedrig.");
					System.out.println(bmi);
				}
				else if (bmi>27)
				{
					System.out.println("Dein BMI ist zu hoch.");
					System.out.println(bmi);
				}
				else
				{
					System.out.println("Dein BMI ist gut.");
					System.out.println(bmi);
				}
				
			}
			if (alter>54 && alter<=64)
			{
				if (bmi<23)
				{
					System.out.println("Dein BMI ist zu niedrig.");
					System.out.println(bmi);
				}
				else if (bmi>28)
				{
					System.out.println("Dein BMI ist zu hoch.");
					System.out.println(bmi);
				}
				else
				{
					System.out.println("Dein BMI ist gut.");
					System.out.println(bmi);
				}
				
			}
			if (alter>64)
			{
				if (bmi<24)
				{
					System.out.println("Dein BMI ist zu niedrig.");
					System.out.println(bmi);
				}
				else if (bmi>29)
				{
					System.out.println("Dein BMI ist zu hoch.");
					System.out.println(bmi);
				}
				else
				{
					System.out.println("Dein BMI ist gut.");
					System.out.println(bmi);
				}
				
			}
								
		}
		
		else if (geschlecht == 2)// 2 ist männlich
		{
			if (alter<=24)
			{
				if (bmi<20)
				{
					System.out.println("Dein BMI ist zu niedrig.");
					System.out.println(bmi);
				}
				else if (bmi>25)
				{
					System.out.println("Dein BMI ist zu hoch.");
					System.out.println(bmi);
				}
				else
				{
					System.out.println("Dein BMI ist gut.");
					System.out.println(bmi);
				}
				
			}
			else if (alter>24 && alter<=34)
			{
				if (bmi<21)
				{
					System.out.println("Dein BMI ist zu niedrig.");
					System.out.println(bmi);
				}
				else if (bmi>26)
				{
					System.out.println("Dein BMI ist zu hoch.");
					System.out.println(bmi);
				}
				else
				{
					System.out.println("Dein BMI ist gut.");
					System.out.println(bmi);
				}
				
			}
			else if (alter>34 && alter<=44)
			{
				if (bmi<22)
				{
					System.out.println("Dein BMI ist zu niedrig.");
					System.out.println(bmi);
				}
				else if (bmi>27)
				{
					System.out.println("Dein BMI ist zu hoch.");
					System.out.println(bmi);
				}
				else
				{
					System.out.println("Dein BMI ist gut.");
					System.out.println(bmi);
				}
				
			}
			if (alter>44 && alter<=54)
			{
				if (bmi<23)
				{
					System.out.println("Dein BMI ist zu niedrig.");
					System.out.println(bmi);
				}
				else if (bmi>28)
				{
					System.out.println("Dein BMI ist zu hoch.");
					System.out.println(bmi);
				}
				else
				{
					System.out.println("Dein BMI ist gut.");
					System.out.println(bmi);
				}
				
			}
			if (alter>54 && alter<=64)
			{
				if (bmi<24)
				{
					System.out.println("Dein BMI ist zu niedrig.");
					System.out.println(bmi);
				}
				else if (bmi>29)
				{
					System.out.println("Dein BMI ist zu hoch.");
					System.out.println(bmi);
				}
				else
				{
					System.out.println("Dein BMI ist gut.");
					System.out.println(bmi);
				}
				
			}
			if (alter>64)
			{
				if (bmi<25)
				{
					System.out.println("Dein BMI ist zu niedrig.");
					System.out.println(bmi);
				}
				else if (bmi>30)
				{
					System.out.println("Dein BMI ist zu hoch.");
					System.out.println(bmi);
				}
				else
				{
					System.out.println("Dein BMI ist gut.");
					System.out.println(bmi);
				}
				
			}
		}
		
		else
		{
			System.out.println("Es liegt ein Fehler vor");
		}
		
		
		
	}

}
