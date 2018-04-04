public class ChocolateAddOn extends AddOnDecorator{

	private Getraenk getrank;

	public ChocolateAddOn(Getraenk getraenk){
		this.getrank = getraenk;
	}

	public double cost() {
		return getrank.cost() + 0.3;
	}

}
