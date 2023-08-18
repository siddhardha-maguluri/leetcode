import java.util.Collections;
//import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class PersonComp implements Comparable<PersonComp>{
	String name;
	int age;
	
	public PersonComp(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(PersonComp p) {
		return Integer.compare(this.age,p.getAge());
	}
}

class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

public class QueueTest {

	public static void main(String[] args) {
		
		Queue<Integer> l = new LinkedList<>();
		l.add(4);
		l.add(2);
		l.add(3);
		l.add(1);
		System.out.println("LinkedList with numbers: "+ l);
		
		Queue<Integer> q = new PriorityQueue<>();
		q.add(4);
		q.add(2);
		q.add(3);
		q.add(1);
		System.out.println("Priority Queue with Numbers: "+ q);
		
		Queue<PersonComp> pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.add(new PersonComp("siddu",50));
		pq.add(new PersonComp("venkat",60));
		pq.add(new PersonComp("abe",50));
		pq.add(new PersonComp("john",80));
		System.out.println("Priority Queue with Objects: ");
		System.out.println(pq.stream().map((p)->p.getName()).toList());
		
		
	}

}
