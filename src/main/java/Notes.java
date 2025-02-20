 
class Notes {
	public static void main(String[] args) {

		//Else if

		int num;
		num = 11;

		if (num > 10) { //num > 10
			System.out.println("if");
		}
		else if (num > 8) {  //num > 8 && num <= 10
			System.out.println("else if");
		}

		else { //num <= 8
			//num <= 10 && num <= 8
			System.out.println("else");
		}
		

		//

		if (num > 10) { //num > 10
			System.out.println("if");
		}
		else if (num > 12) { //num > 12 && num <= 10
			//UNREACHABLE ELSE IF STATEMENT
			System.out.println("else if");
		}
			//could have more as many else ifs as i need
		else { //num <= 10 && num <= 12
			System.out.println("else");
		}

		//Try to order your ifs and else ifs smaller sets of data to larger ones


		//nested ifs - putting an if inside an if

		if (num > 8) {
			System.out.println("first if statement ran");
			if (num < 10) { //if num > 8 && num < 10
				System.out.println("both ifs ran");
			}
			else if (num == 15) { //num == 15 && num > 8
				System.out.println("num is 15");
			}
			else { // num >= 10 && num != 15 && num > 8
				System.out.println("if and else ran");
			}
		}

		//repeated condition - nest it
		//Step by step checks
		//code can be written between conditions

		//Avoid over nested - makes code unreadable

		// if () {
		// 	if () {
		// 		if () {
		// 			if () {
		// 				if () {
		// 					if () {

		// 					}
		// 				}
		// 			}
		// 		}
		// 	}
		// }

		//Break into functions
		//Guard clauses can be used to avoid nested ifs. look this up if you want to use it

		
	}
}
