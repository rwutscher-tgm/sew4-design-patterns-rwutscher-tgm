
public class ChilliAddOn extends AddOnDecorator{

	private Getraenk getrank;

	public ChilliAddOn(Getraenk getraenk){
		this.getrank = getraenk;
	}

	public double cost() {
		return getrank.cost() + 0.3;
	}

}
