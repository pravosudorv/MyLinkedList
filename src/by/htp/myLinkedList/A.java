package by.htp.myLinkedList;

public class A {
	int nombe;
	
	public A(int i) {
		this.nombe = i;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nombe;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (nombe != other.nombe)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return  "" + nombe;
	}
	
	
}
