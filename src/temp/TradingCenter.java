package temp;

public class TradingCenter {
	Floor floors[];
	
	public TradingCenter() {
		this.floors = new Floor[3];
		for (Integer i = 0; i<3; i++) {
			floors[i] = new Floor(i.toString());
			/* Floors we call by names not my numbers !!! */
		}
	}
	public void addStore(String FloorID, String storeID, String type, String name) {
		Store store = new Store(FloorID, storeID, name, type);
		floors[Integer.parseInt(FloorID)].addStore(store, storeID);
	}
	
	public void addStore(String name, String type) {
		Store store = findEmptyStore();
		if(store != null) {
			addStore(store.FloorID, store.ID, type, name);
		}
		else {
			System.out.println("store.Store are closed");
		}
	}
	
	public Store findEmptyStore() {
		for(Floor floor : floors) {
			Store store = floor.findEmptyStore();
			if (store != null) {
				return store;
			}
		}
		return null;
	}
	
	public void print() {
		for (Floor floor : floors) {
			floor.print();
		}
	}
	
	public Store searchStoreByID(String ID) {
		for (Floor floor : floors) {
			Store store = floor.searchStoreByID(ID);
			if(store != null) {
				return store;
			}
		}
		return null;
	}
	
}


