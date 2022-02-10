package temp;

public class Store {
	String ID;
	String FloorID;
	Store store;
	String name;
	String type;
	
	
	public Store(String FloorID, String ID) {
		this.ID = ID;
		this.FloorID = FloorID;
	}
	
	public Store(String FloorID, String ID, String name, String type) {
		this.ID = ID;
		this.FloorID = FloorID;
		this.name = name;
		this.type =type;
	}
	
	public void addStore(Clothes clothes, Store store) {
		this.store = store;
	}
	
	public Store findEmptyStore() {
		if(this.name == null) {
			return this;
		}
		else {
			return null;
		}
	}
	public void print() {
		if(this.name != null) {
			System.out.println(this.toString());
		}
	}
	@Override
	public String toString() {
		return "Store [ID=" + ID + ", FloorID=" + FloorID + ", store=" + store + ", name=" + name + ", type=" + type
				+ "]";
	}
	
	
	
	public Store searchStoreByID(String ID) {
		if (this.ID.equals(ID)) {
			System.out.println(this.toString());
			return this;
		}
		return null;
	}
	

		
}
