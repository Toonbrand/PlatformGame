package nl.youngcapital.platformgame;

public class Tileset {
	int set;
	static int numberOfTileSets=2;
	Tileset(int set) {
		this.set=set;
	}
	Tile[][] getSet() {
	//Tile[][] x =new Tile[3][3];
	
	switch(set) {
	case 1:   return new Tile[][]{{new Tile("solid"),new Tile("solid"),new Tile("solid")}, {new Tile("empty"),new Tile("empty"),new Tile("empty")},{new Tile("empty"),new Tile("empty"),new Tile("empty")}};
	default: return new Tile[][]{{new Tile("solid"),new Tile("solid"),new Tile("solid")}, {new Tile("empty"),new Tile("empty"),new Tile("empty")},{new Tile("empty"),new Tile("empty"),new Tile("empty")}};
	}
	
	}
}
