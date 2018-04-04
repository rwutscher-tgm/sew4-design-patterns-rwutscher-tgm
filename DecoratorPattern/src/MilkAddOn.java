public class MilkAddOn extends AddOnDecorator{

	private Getraenk getrank;

	public MilkAddOn(Getraenk getraenk){
		this.getrank = getraenk;
	}

	public double cost() {
		return getrank.cost() + 0.3;
	}

}
