package newJava;

import java.util.Comparator;
public class employee implements Comparable<employee> {
	private int eid=101;
	private String ename="Gold";
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
	public static Comparator<employee> NameComparator = new Comparator<employee>() {

		@Override
		public int compare(employee e1, employee e2) {
			//return e1.getEid() -e2.getEid();
			return e1.getEname().compareTo(e2.getEname());
		}
	
	
	};
	@Override
 public int compareTo(employee e) {
		
		return this.eid - e.eid;
	
	}

}