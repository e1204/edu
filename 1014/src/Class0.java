class Song{
	
	int year;
	String country;
	String artist;
	String title;
	
	Song(int year, String country, String artist, String title){
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
	}
	
	public void show() {
		System.out.println(year + "��, " + country + " ������ " + artist + "�� �θ� " + "\"" + title + "\"");
	}
	
}


public class Class0 {

	public static void main(String[] args) {
		
		Song song = new Song(1978, "������", "ABBA", "Dancing Queen");
		song.show();
	}

}
