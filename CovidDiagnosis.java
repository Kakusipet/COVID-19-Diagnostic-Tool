import java.util.Scanner;

public class CovidDiagnosis {
	public static void main(String[] args) {
		
		Scanner str = new Scanner (System.in);
		Scanner in = new Scanner (System.in);
		
		String ans;
		
		do {
		System.out.println("Note that this tool does not substitute for a COVID-19 test. \n");
		System.out.println("Are you wondering if you have COVID-19?");
		ans = str.nextLine();
		ans = ans.toLowerCase();
		int score = 0;
		//////////////////////////////////////////////////////////
		if (ans.equals("yes")) {
			System.out.println("Do you have difficulty breathing, persistent pain in the chest, bluish lips, or an inability to stay awake?");
			String ans1 = str.nextLine();
			ans1 = ans1.toLowerCase();
			//SEVERE LEVEL5
			if (ans1.equals("yes")) {
				System.out.println("How many of these symptoms do you have?");
				int int1 = in.nextInt();
				
				if (int1 > 4) {
					int1 = 4;
				}
				else if (int1 < 1) {
					int1 = 1;
				}
				
				System.out.println("These are severe COVID-19 symptoms and you may want to visit an emergency care facility soon.");
					 score += (5 * int1);
		}
			System.out.println("Do you have a fever, cough, sore throat, congestion or difficulty breathing?");
			String ans2 = str.nextLine();
			ans2 = ans2.toLowerCase();
			//LEVEL2
			if (ans2.equals("yes")) {
				System.out.println("How many of these symptoms do you have?");
				int int2 = in.nextInt();
				
				if (int2 > 5) {
					int2 = 5;
				}
				else if (int2 < 1) {
					int2 = 1;
				}
				
				System.out.println("These are common COVID-19 symptoms, but could also be present due to other reasons.");
					 score += (2 * int2);
		}
			
			System.out.println("Do you have fatigue, body aches, or a headache?");
			String ans3 = str.nextLine();
			ans3 = ans3.toLowerCase();
			//LEVEL3
			if (ans3.equals("yes")) {
				System.out.println("How many of these symptoms do you have?");
				int int3 = in.nextInt();
				
				if (int3 > 3) {
					int3 = 3;
				}
				else if (int3 < 1) {
					int3 = 1;
				}
				
				System.out.println("These are also common COVID-19 symptoms, but could also be present due to other reasons.");
					 score += (3 * int3);
			}
			
			System.out.println("Do you have diarrhea, nausea, vomiting, or a loss in taste/smell?");
			String ans4 = str.nextLine();
			ans4 = ans4.toLowerCase();
			//LEVEL4
			if (ans4.equals("yes")) {
				System.out.println("How many of these symptoms do you have?");
				int int4 = in.nextInt();
				
				if (int4 > 4) {
					int4 = 4;
				}
				else if (int4 < 1) {
					int4 = 1;
				}
				
				System.out.println("These are serious COVID-19 symptoms, but could also be present due to other reasons. Consider visiting a doctor.");
					 score += (4 * int4);
			}
			//System.out.println("score = " + score);
			if (score == 55) {
				System.out.println("URGENT: Get tested and see a doctor or healthcare professional immediately. You have the vast majority of COVID-19 symptoms.");
			}
			else if (score > 45) {
				System.out.println("Definitely get tested for COVID-19. You present many of the symptoms and may need to see a doctor.");
			}
			else if (score > 30) {
				System.out.println("Get tested for COVID-19. You present a lot of symptoms and may need to see a doctor.");
			}
			else if (score > 15) {
				System.out.println("Consider getting tested for COVID-19. You present multiple symptoms and may need to see a doctor.");
			}
			else if (score >= 0) {
				System.out.println("You do not present many symptoms of COVID-19.");
			}
			System.out.println("Note that if you have been in contact with someone who has recently tested positive for COVID-19, it would be wise to get tested regardless of the results from this test.");

		}
		///////////////////////////////////////////////
		else if (ans.equals("no")) {
			System.out.println("Continue staying healthy!");
			System.exit(0);
		}
		else {
			ans = "redo";
			System.out.println("That is not a valid choice.");
		}
		
	} while (ans == "redo");

}
}
