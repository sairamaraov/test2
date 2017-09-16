import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		this.students = students;// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		if(index<0 || index >= students.length)
		throw new IllegalArgumentException("invalid index");
	else

		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		if(student == null || index<0 || index >= students.length)
		throw new IllegalArgumentException("invalid index");
		else
		{
			students[index] = student;
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		
		int j=-1, flag=0, n = students.length;
		Student[] stu= new Student[n];
		
		if(date==null)
			throw new IllegalArgumentException("invalid arguments");
		else
		{
			
		for(int i=0; i<n; i++)
		{
			
			if (students[i].getBirthDate().before(date) {
            	j++;
		stu[j]=students[i];		
        } else if (students[i].getBirthDate().after(date) {
           
        } else {
            j++;
		stu[j]=students[i];
        }        
		}
		
		if(j==-1)
		{
			throw new IllegalArgumentException("not found in the array");
		}
		else
			return stu;
		} 
		
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		int flag=0,j= students.length-1;
		if(student == null)
			throw new IllegalArgumentException("invalid parameter");
		else
		{
		
		for(int i = 0 ; i<j;i++)
		{
			if(students[i] == student)
			{
				flag = 1;
				j = i+1;
				break;
			}
		}
		if(flag==0)
			throw new IllegalArgumentException("do not exists");
		else
			return students[j];
			
		}
	}
}
