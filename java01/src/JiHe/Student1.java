package JiHe;


	

	public class Student1 implements Comparable<Student1> {
	//public class Student {
		String name;
		int age;

		public Student1(String name, int age) {
			super();
			this.name = name;
			this.age = age;
			// System.out.println("Student 构造函数执行：" + name);
		}

		@Override
		public boolean equals(Object obj) {
			System.out.println("Student 的比较方法被执行...");
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student1 other = (Student1) obj;

			if (age != other.age)
				return false;

			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "[name=" + name + ", age=" + age + "]";
		}

		// @Override
		public int compareTo(Student1 o) {
			if (this.age < o.age) {
				return -1;
			} else if (this.age == o.age) {
				return 0;
			} else {
				return 1;
			}
		}

	}


