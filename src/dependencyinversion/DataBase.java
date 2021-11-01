package dependencyinversion;

public interface DataBase {

	void connect(String database);

	void insert(Entity entity);

	void update(Entity entity);

	void delete(Entity entity);

	void disconnect();
}
