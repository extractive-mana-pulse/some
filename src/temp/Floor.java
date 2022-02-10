package temp;

public class Floor {
	String ID;
	Store stores[];

	public  Floor(String ID) {
		this.ID = ID;
		this.stores = new Store[10];
		for (Integer i = 0; i<10; i++) {
			stores[i] = new Store(i.toString(), ID);
		}
	}
	
	
	
	public void addStore(Store store, String storeID) {
		stores[Integer.parseInt(storeID)] = store;
	}
	
	
	public Store findEmptyStore() {
		for(Store store : stores) {
			if(store.findEmptyStore() !=null) {
				return store;
			}
		}
		return null;
	}
	public void print() {
		for(Store store : stores) {
			store.print();
		}
	}
	// Book from Library equal to clothes in TradingCenter
	public Store searchStoreByID1(String ID) {
		for(Store store : stores) {
			if(store.searchStoreByID(ID) !=null) {
				return store;
			}
		}
		
	return null;
	}

	public void Floor1(String string) {
		// TODO Auto-generated constructor stub
	}
	public Store searchStoreByID(String ID) {
		// TODO Auto-generated method stub
		return null;
	}
}

