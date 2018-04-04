
public class SpinachAddOn extends AddOnDecorator{

	private Getraenk getrank;

	public SpinachAddOn(Getraenk getraenk){
		this.getrank = getraenk;
	}

	public double cost() {
		return getrank.cost() + 0.3;
	}

}
