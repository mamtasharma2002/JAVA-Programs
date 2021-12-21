/*				first	second	third
input1	riya	r       iy      a
input2	mamta   ma		m 		ta
input3	aayush	aa		yu		sh

output1			rmaaa
output2					iymyu
output3							atash*/

import java.util.Scanner;
class Result {
	String first, second, third;
}
class solve {
	public static Result Split(String input) {
		Result res = new Result();
		if (input.length() % 3 == 0) {
			res.first = input.substring(0, input.length() / 3);
			res.second = input.substring(input.length() / 3, 2 * input.length() / 3);
			res.third = input.substring(2 * input.length() / 3, input.length());
		} else if (input.length() % 3 == 1) {
			res.first = input.substring(0, input.length() / 3);
			res.second = input.substring(input.length() / 3, 2 * input.length() / 3 + 1);
			res.third = input.substring(2 * input.length() / 3 + 1, input.length());
		} else {
			res.first = input.substring(0, input.length() / 3 + 1);
			res.second = input.substring(input.length() / 3 + 1, 2 * input.length() / 3);
			res.third = input.substring(2 * input.length() / 3, input.length());
		}
		return res;
	}
	public static void main(String[] args) {
		String input1, input2, input3;
		Scanner sc = new Scanner(System.in);
		input1 = sc.nextLine();
		input2 = sc.nextLine();
		input3 = sc.nextLine();
		Result input1Split = new Result();
		input1Split = Split(input1);
		Result input2Split = new Result();
		input2Split = Split(input2);
		Result input3Split = new Result();
		input3Split = Split(input3);
		Result output = new Result();
		output.first = input1Split.first + input2Split.first + input3Split.first;
		output.second = input1Split.second + input2Split.second + input3Split.second;
		output.third = input1Split.third + input2Split.third + input3Split.third;
		System.out.println(output.first + " " + output.second + " " + output.third);
		sc.close();
	}
}
