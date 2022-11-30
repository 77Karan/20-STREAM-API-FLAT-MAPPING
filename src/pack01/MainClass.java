package pack01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainClass
{
	public static void main(String[] args) 
	{
		List<String> javaCourses = Arrays.asList("JAVA 8", "SBMS","Data Structures","Core Java");
		List<String> UiCourses = Arrays.asList("HTML", "CSS","Angular","Java Script");
		List<String> CloudCourses = Arrays.asList("Devops", "AWS","Azur","GCP");
		
		List<List<String>> ashokItCourse = Arrays.asList(javaCourses,UiCourses,CloudCourses);
		
		Stream<List<String>> stream = ashokItCourse.stream();
		
		Stream<String> flatStream = stream.flatMap(s -> s.stream());
		
		flatStream.forEach(i -> System.err.println(i));

	}

}
