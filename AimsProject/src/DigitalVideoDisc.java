public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}

	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

	public void remove(DigitalVideoDisc Disc) {
		Disc.cost = 0.0f;
		Disc.title = null;
		Disc.length = 0;
		Disc.director = null;
		Disc.category = null;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public void hienThiThongTin(DigitalVideoDisc Disc) {
		System.out.println("title : " + Disc.title + "\ncategory : " + Disc.category + "\ndirector : " + Disc.director
				+ "\nlength : " + Disc.length + "\ncost : " + Disc.cost);
	}

	public void totalCost() {

	}
}