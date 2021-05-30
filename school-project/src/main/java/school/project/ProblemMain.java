package school.project;

import school.project.primary.IPrimary;
import school.project.primary.Maths;
import school.project.secondary.ISecondary;
import school.project.secondary.Physics;

public class ProblemMain {

	public void getGradeOfMathFromPrimary(IPrimary primary) {
		char grade = primary.getGrade();
		System.out.println("Grade from math : " + grade);

	}

	public void getGradeOfMathFromSecondary(ISecondary sec) {
		int percentage = sec.getPercentage();
		System.out.println("Percentage from Physics : " + percentage);

	}

	public static void main(String args[]) {
		ProblemMain mainObj = new ProblemMain();
		mainObj.getGradeOfMathFromPrimary(new Maths());
		mainObj.getGradeOfMathFromSecondary(new Physics());
	}

}
