package stdproj;

public class Student {

		
		int rollNo;
		String name;
		String phoneNo;
		
		
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		
		@Override
		public String toString() {
			return "rollNo=" + rollNo + ", name=" + name + ", phoneNo=" + phoneNo + "]";
		}
	

		
		
	}