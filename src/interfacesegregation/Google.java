package interfacesegregation;

import java.util.ArrayList;



public class Google implements ProvedorHostingNube, ProvedorAlmacenamientoNube, ProvedorCDN {
	 ArrayList<Region> regions;

	    public Google()
	    {
	        this.regions = new ArrayList<>();
	    }

	    @Override
	    public void storeFile(String name)
	    {
	        System.out.println("Google is storing file " + name);
	    }

	    @Override
	    public String getFile(String name)
	    {
	        return "Google file " + name;
	    }

	    @Override
	    public void createServer(Region region, String serverName)
	    {
	        region.addServer(serverName);
	    }

	    @Override
	    public void listServers(Region region)
	    {
	        System.out.println("Google region " + region.getName() + " contains the following servers: ");

	        for (String server: region.getServers()) {
	            System.out.println(server);
	        }
	    }

	    @Override
	    public String getCDNAddress()
	    {
	        return "Google CDN Address";
	    }

}
