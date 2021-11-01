package interfacesegregation;

public interface ProvedorHostingNube {

	void createServer(Region region, String serverName);

	void listServers(Region region);
}
