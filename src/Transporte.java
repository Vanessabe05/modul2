
public class Transporte {
	public Transporte(Engine engine, Driver dirver) {
		super();
		this.engine = engine;
		this.dirver = dirver;
	}

	private Engine engine;
	private Driver dirver;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Driver getDirver() {
		return dirver;
	}

	public void setDirver(Driver dirver) {
		this.dirver = dirver;
	}

	public void deliver(String cargo, String destinator) {

	}

}
