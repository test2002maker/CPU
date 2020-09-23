package test5;

public class Score {
	String name;
	int age;
	double score;
	
//	void setName(String Name) {
//		name=Name;
//	}
//	
//	String getName() {
//		return name;
//	}
//	
//	void setAge(int Age) {
//		age=Age;
//	}
//	
//	int  getAge() {
//		return age;
//	}
//	
//	void setScore(double Score) {
//		score=Score;
//	}
//	
//	double getScore() {
//		return score;
//	}
//	
	
	Score(String Name,int Age,double Score){
		name=Name;
		score=Score;
		if(Age>0 && Age<100) {
			age=Age;
		}else {
			System.out.println("ÊäÈëÄêÁä´íÎó");
		}
	}

}
