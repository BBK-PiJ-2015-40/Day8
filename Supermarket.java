public class Supermarket implements PersonQueue{
	
	private Person personQueueStart = null;
	
	public static void main(String[] args){
		Person firstPatient = new Person("John", 33);
		Person secondPatient = new Person("Ali", 23);
		Person thirdPatient = new Person("David", 34);
		Person fourthPatient = new Person("Fatma", 19);
		Person fifthPatient = new Person("Cem", 27);
		personQueueStart = firstPerson;
		personQueueStart.add(secondPerson);
		personQueueStart.add(thirdPerson);
		personQueueStart.add(fourthPerson);
		personQueueStart.add(fifthPerson);
		
		
		
		System.out.println("There are " + personQueueStart.size + " people in the queue.");
		
		personQueueStart.servePerson();
		personQueueStart.servePerson();
	
	    System.out.println("There are " + personQueueStart.size + " people in the queue.");

	}

	
	public void insert(Person person){
		 addPerson(person);
	}

	public void Person retrieve(){
		serve Person();
	}
	
	
	public void addPerson(person){
	
	}
	public void serve Person(){
	}
	
	
	
	}