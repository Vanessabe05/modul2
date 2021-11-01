package dependencyinversion;

public class Conexion implements Entity {
	private DataBase database;

	public Conexion() {
		//this.database = new MySQLDatabase();
       this.database = new OracleDataBase();
		database.connect("projects");
	}

	public void save() {
		database.insert(this);
	}
}
