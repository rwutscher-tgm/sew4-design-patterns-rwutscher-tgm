
public class CaramelAddOn extends AddOnDecorator{

	private Getraenk getrank;

	public CaramelAddOn(Getraenk getraenk){
	    this.getrank = getraenk;
	}

	public double cost() {
		return getrank.cost() + 0.3;
	}

}
