public class Supermarket
{
	private PersonQueue queue = null;

	public void addPerson(Person person)
	{
		queue.insert(person);
	}

	public void servePerson()
	{
		Person personToServe=queue.retrieve();
		personToServe.
	}
}