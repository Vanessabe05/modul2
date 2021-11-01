package interfacesegregation;

public class TestProvedorNube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon amazon = new Amazon();
		ProvedorAlmacenamientoNube dropbox = new DropBox();
		Google google = new Google();

		System.out.println("Working with amazon");
		Region region = new Region("US-west-virginia");
		amazon.createServer(region, "Tezcatlipoca");
		amazon.createServer(region, "Huitzilopochtli");
		amazon.listServers(region);
		amazon.storeFile("ventas");
		System.out.println(amazon.getFile("ventas"));
		System.out.println(amazon.getCDNAddress());

		System.out.println("Working with dropbox");
		dropbox.storeFile("tarea");
		System.out.println(dropbox.getFile("tarea"));
		
		System.out.println("Working with Google");
		Region regiong = new Region("US-California");
		google.createServer(regiong, "paginas");
		google.createServer(regiong, "videos");
		google.listServers(regiong);
		google.storeFile("canciones");
		System.out.println(google.getFile("canciones"));
		System.out.println(google.getCDNAddress());
	}

}
